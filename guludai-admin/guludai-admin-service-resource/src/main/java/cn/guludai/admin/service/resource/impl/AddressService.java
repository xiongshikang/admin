/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.resource.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.domain.dataway.dao.BaseAreaCityEntityMapper;
import cn.guludai.admin.domain.dataway.dao.BaseAreaProvinceEntityMapper;
import cn.guludai.admin.domain.dataway.dao.BaseAreaTownEntityMapper;
import cn.guludai.admin.domain.dataway.entity.BaseAreaCityEntity;
import cn.guludai.admin.domain.dataway.entity.BaseAreaProvinceEntity;
import cn.guludai.admin.domain.dataway.entity.BaseAreaTownEntity;
import cn.guludai.admin.web.response.AddressResponse;

@Service
public class AddressService {

    private static final Logger logger = LoggerFactory.getLogger(AddressService.class);
    @Autowired
    private BaseAreaProvinceEntityMapper baseAreaProvinceEntityMapper;

    @Autowired
    private BaseAreaCityEntityMapper baseAreaCityEntityMapper;

    @Autowired
    private BaseAreaTownEntityMapper baseAreaTownEntityMapper;

    public List<AddressResponse> getProvince() throws Exception {
        List<AddressResponse> ls = new ArrayList<>();
        List<BaseAreaProvinceEntity> baseAreaList = baseAreaProvinceEntityMapper.getProvinceInfo();
        for (BaseAreaProvinceEntity entity : baseAreaList) {
            AddressResponse addressResponse = new AddressResponse();
            addressResponse.setCode(entity.getProvinceNo());
            addressResponse.setName(entity.getProvinceName());
            ls.add(addressResponse);
        }
        return ls;
    }

    public List<AddressResponse> getCity(String provinceNo) throws Exception {
        List<BaseAreaCityEntity> baseAreaList = baseAreaCityEntityMapper.getCityInfo(provinceNo);
        List<AddressResponse> ls = new ArrayList<AddressResponse>();
        for (BaseAreaCityEntity entity : baseAreaList) {
            AddressResponse addressResponse = new AddressResponse();
            addressResponse.setCode(entity.getCityNo());
            addressResponse.setName(entity.getCityName());
            ls.add(addressResponse);
        }
        return ls;
    }

    public List<AddressResponse> getTown(String cityNo) throws Exception {
        List<BaseAreaTownEntity> baseAreaList = baseAreaTownEntityMapper.getTown(cityNo);
        List<AddressResponse> ls = new ArrayList<AddressResponse>();
        for (BaseAreaTownEntity entity : baseAreaList) {
            AddressResponse addressResponse = new AddressResponse();
            addressResponse.setCode(entity.getTownNo());
            addressResponse.setName(entity.getTownName());
            ls.add(addressResponse);
        }
        return ls;
    }


}
