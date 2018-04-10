/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.dataway;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.guludai.admin.domain.dataway.dao.BaseShopEntityMapper;
import cn.guludai.admin.domain.resource.dao.PluginMonitorDataEntityMapper;
import cn.guludai.admin.domain.resource.entity.PluginMonitorDataEntity;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.web.request.PluginMonitorDataReq;
import cn.guludai.admin.web.response.TableResultResponse;

/**
 * 
 * @ClassName: PluginMonitorDateService 
 * @Description: 插件数据监控详情表
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:13:14
 */
@Service
public class PluginMonitorDateService {
	
	@Autowired
	private PluginMonitorDataEntityMapper pluginMonitorDataEntityMapper;

	@Autowired
	BaseShopEntityMapper baseShopEntityMapper;

	public TableResultResponse<PluginMonitorDataReq> list(PluginMonitorDataReq req) throws Exception{
		TableResultResponse<PluginMonitorDataReq> table =new TableResultResponse<PluginMonitorDataReq>();
	    List<PluginMonitorDataEntity> ls = pluginMonitorDataEntityMapper.selectPluginMonitorDataList(req);
        int total =  pluginMonitorDataEntityMapper.selectPluginMonitorDataListCount(req);
       List<PluginMonitorDataReq> rows = new ArrayList<PluginMonitorDataReq>();
       for (PluginMonitorDataEntity p : ls) {
    	   PluginMonitorDataReq entity = new PluginMonitorDataReq();
    	   BeanUtils.copyProperties(entity, p);
		   Map<String , String> baseShopNameMap = baseShopEntityMapper.findBaseShopName(p.getShopCode() , p.getCompanyCode());
		   entity.setCompanyName(baseShopNameMap.get("shopName"));
		   entity.setShopName(baseShopNameMap.get("shopName"));
    	   if(p.getDataStatus().equals(BaseConstant.DATA_STATUS_Y)) {
    		   entity.setDataStatus("正常");
    	   }else {
    		   entity.setDataStatus("物理册除");
    	   }
    	   if(p.getDiskStatus().equals(BaseConstant.DISK_STATUS_Y)) {
    		   entity.setDiskStatus("正常");
    	   }else {
    		   entity.setDiskStatus("逻辑册除");
    	   }
    	   rows.add(entity) ;
       }
       table.setRows(rows);
       table.setTotal(total);
       return table;
	}
	
}
