/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.resource;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.domain.dataway.dao.*;
import cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity;
import cn.guludai.admin.domain.dataway.entity.BaseShopEntity;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.BaseShopRequest;
import cn.guludai.admin.web.request.PluginRunningLogReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.web.response.BaseErpVersionResponse;
import cn.guludai.admin.web.response.BaseShopCompanyResponse;
import cn.guludai.admin.web.response.BaseShopResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author HeQiao
 * @create 2017-11-05 17:57
 **/
@Service
public class BaseShopApiService {

    @Autowired
    BaseShopCompanyEntityMapper baseShopCompanyEntityMapper;

    @Autowired
    BaseShopEntityMapper baseShopEntityMapper;

    @Autowired
    BaseAreaCityEntityMapper baseAreaCityEntityMapper;

    @Autowired
    BaseAreaProvinceEntityMapper baseAreaProvinceEntityMapper;

    @Autowired
    BaseAreaTownEntityMapper baseAreaTownEntityMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseShopApiService.class);
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月16日 下午4:33:56
     * @Title: selectBaseShopCompany 
     * @Description: 查询所有公司
     * @param
     * @return
     *
     */
    public List<BaseShopCompanyResponse> selectBaseShopCompany() {
    	List<BaseShopCompanyEntity> result = baseShopCompanyEntityMapper.selectCompanyAll();
    	List<BaseShopCompanyResponse> ls = new ArrayList<BaseShopCompanyResponse>();
    	  for (BaseShopCompanyEntity entity : result) {
    		  BaseShopCompanyResponse model = new BaseShopCompanyResponse();
              BaseErpVersionResponse  resp = new BaseErpVersionResponse();
              BeanUtils.copyProperties(entity , model );
              ls.add(model);
          }
    	return ls;
    }
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月16日 下午4:33:51
     * @Title: selectShopByCompanyCode 
     * @Description: 通过公司编号查询公司下的所有门店
     * @param companyCode
     * @return
     *
     */
    public List<BaseShopResponse> selectShopByCompanyCode(String companyCode){
    	List<BaseShopEntity> result = baseShopEntityMapper.selectShopByCompanyCode(companyCode);
    	List<BaseShopResponse> ls = new ArrayList<>();
    	  for (BaseShopEntity entity : result) {
    		  BaseShopResponse model = new BaseShopResponse();
              BeanUtils.copyProperties(entity , model );
              ls.add(model);
          }
    	 return ls;
    }

    public TableResultResponse<BaseShopResponse> getBaseShop( BaseShopRequest data) {
        TableResultResponse<BaseShopResponse> tableResultResponse = new TableResultResponse<>();
        List<BaseShopResponse> result = baseShopEntityMapper.selectByConditionPaging(data);
        tableResultResponse.setRows(result);
        tableResultResponse.setTotal(baseShopEntityMapper.selectByConditionNum(data));
        return tableResultResponse;
    }

    public BaseShopResponse select(String shopCode) {
        BaseShopEntity baseShopEntity = baseShopEntityMapper.selectByPrimaryKey(shopCode);
        BaseShopResponse baseShopResponse = new BaseShopResponse();
        BeanUtils.copyProperties(baseShopEntity , baseShopResponse);
        return baseShopResponse;
    }

    public ResultModel<String> edit(BaseShopRequest data) {
        ResultModel<String> resultModel = new ResultModel();
        /**查询店铺名称是否重复*/
        if (baseShopEntityMapper.isDuplicationName(data.getShopName() , data.getShopCode())>0){
            resultModel.setCode(AdminBaseCode.ERROR_SNAME_NAME.getCode());
            return resultModel;
        }

        BaseShopEntity baseShopEntity = new BaseShopEntity();
        BeanUtils.copyProperties(data , baseShopEntity);
        baseShopEntity.setVersion(data.getVersion()+1);
        baseShopEntity.setUpdateTime(new Date());
        baseShopEntityMapper.updateByPrimaryKeySelective(baseShopEntity);
        resultModel.setCode(BaseCode.SUCCESS.getCode());
        return resultModel;
    }

    public int delete(String shopCode) {
        return baseShopEntityMapper.deleteByPrimaryKey(shopCode);
    }
}
