/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.dataway;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.AESUtils;
import cn.guludai.admin.domain.dataway.dao.BaseShopEntityMapper;
import cn.guludai.admin.domain.dataway.dao.BaseShopErpEntityMapper;
import cn.guludai.admin.domain.resource.dao.PluginLicenseEntityMapper;
import cn.guludai.admin.domain.resource.dao.PluginRunningStateEntityMapper;
import cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.PluginRunningStateReq;
import cn.guludai.admin.web.response.TableResultResponse;

/**
 * @ClassName: PluginRunningStateService
 * @Description: 插件安装及升级记录服务类
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:27:27
 */
@Service
public class PluginRunningStateService {

    @Autowired
    private PluginRunningStateEntityMapper pluginRunningStateEntityMapper;

    @Autowired
    BaseShopEntityMapper baseShopEntityMapper;

    @Autowired
    PluginLicenseEntityMapper pluginLicenseEntityMapper;

    @Autowired
    BaseShopErpEntityMapper baseShopErpEntityMapper;

    /**
     * @param record
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @author: xiongshikang
     * @date: 2017年11月19日 下午12:22:30
     * @Title: list
     * @Description: 插件安装及升级记录例表
     */
    public TableResultResponse<PluginRunningStateReq> list(PluginRunningStateReq record) throws Exception {
        TableResultResponse<PluginRunningStateReq> table = new TableResultResponse<PluginRunningStateReq>();
        List<PluginRunningStateEntity> ls = pluginRunningStateEntityMapper.selectRunningStateList(record);
        long total = pluginRunningStateEntityMapper.selectRunningStateCount(record);
        List<PluginRunningStateReq> rows = new ArrayList<PluginRunningStateReq>();
        for (PluginRunningStateEntity p : ls) {
            PluginRunningStateReq entity = new PluginRunningStateReq();
            BeanUtils.copyProperties(entity, p);
            Map<String, String> baseShopNameMap = baseShopEntityMapper.findBaseShopName(p.getShopCode(), null);

            entity.setShopName(baseShopNameMap == null ? null : baseShopNameMap.get("shopName"));
            if (p.getDataStatus().equals(BaseConstant.DATA_STATUS_Y)) {
                entity.setDataStatus("正常");
            } else {
                entity.setDataStatus("物理册除");
            }
            if (p.getDiskStatus().equals(BaseConstant.DISK_STATUS_Y)) {
                entity.setDiskStatus("正常");
            } else {
                entity.setDiskStatus("逻辑册除");
            }
            rows.add(entity);
        }
        table.setRows(rows);
        table.setTotal(total);
        return table;
    }

    /**
     * @param
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @author: qiao.he
     * @date: 2017年11月19日 下午12:22:07
     * @Title: edit
     * @Description: 插件安装及升级记录修改
     */
    public ResultModel<String> edit(PluginRunningStateReq req) throws Exception {
        ResultModel<String> result = new ResultModel<String>();
        PluginRunningStateEntity entity = new PluginRunningStateEntity();
        BeanUtils.copyProperties(entity, req);
        /**
         * 插件运行环境状态信息
         */
        PluginRunningStateEntity entityOri = pluginRunningStateEntityMapper.selectRunningStateByStateCode(req.getStateCode());
        if (entityOri.getDbPassword().equals(req.getDbPassword())) {
            entity.setDbPassword(null);
        } else {
            String dataSalt = getDataSalt(req.getPluginIdcard());
            if (dataSalt.equals("")) {
                result.setCode(AdminBaseCode.AES_CREATE_ERROR.getCode());
                return result;
            }
            entity.setDbPassword(AESUtils.encryptData(req.getDbPassword(), dataSalt));
        }
        pluginRunningStateEntityMapper.updateRunningStateByStateCode(entity);
        result.setCode(AdminBaseCode.SUCCESS.getCode());
        return result;
    }

    /**
     * @param
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @author: xiongshikang
     * @date: 2017年11月19日 下午12:22:15
     * @Title: select
     * @Description: 查询插件安装及升级记录
     */
    public ResultModel<PluginRunningStateReq> select(String stateCode) throws Exception {
        ResultModel<PluginRunningStateReq> result = new ResultModel<PluginRunningStateReq>();
        PluginRunningStateReq req = new PluginRunningStateReq();
        PluginRunningStateEntity entity = pluginRunningStateEntityMapper.selectRunningStateByStateCode(stateCode);
        BeanUtils.copyProperties(req, entity);
        result.setResult(req);
        result.setCode(AdminBaseCode.SUCCESS.getCode());
        return result;
    }

    private String getDataSalt(String pluginLicenseIdcard) {
        String dataSalt = "";
        Map<String, String> map = baseShopErpEntityMapper.getBaseShopErpNameOne(pluginLicenseIdcard);
        if (map != null) {
            dataSalt = map.get("dataSalt");
        }
        return dataSalt;
    }
}
