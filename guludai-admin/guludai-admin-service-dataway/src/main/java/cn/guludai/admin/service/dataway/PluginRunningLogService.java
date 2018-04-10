/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.dataway;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.guludai.admin.domain.dataway.dao.BaseShopEntityMapper;
import cn.guludai.admin.domain.resource.dao.PluginRunningLogEntityMapper;
import cn.guludai.admin.domain.resource.entity.PluginRunningLogEntityWithBLOBs;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.PluginRunningLogReq;
import cn.guludai.admin.web.response.TableResultResponse;

@Service
public class PluginRunningLogService {
	
	
	@Autowired
	private PluginRunningLogEntityMapper pluginRunningLogEntityMapper;

	@Autowired
	BaseShopEntityMapper baseShopEntityMapper;
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 上午10:02:17
	 * @Title: list 
	 * @Description: 
	 * @param record
	 * @return
	 * @throws Exception
	 *
	 */
	public TableResultResponse<PluginRunningLogReq> list(PluginRunningLogReq record) throws Exception{
		TableResultResponse<PluginRunningLogReq> table =new TableResultResponse<PluginRunningLogReq>();
	    List<PluginRunningLogEntityWithBLOBs> ls = pluginRunningLogEntityMapper.selectRunningLogList(record);
        long total =  pluginRunningLogEntityMapper.selectRunningLogCount(record);
       List<PluginRunningLogReq> rows = new ArrayList<PluginRunningLogReq>();
       for (PluginRunningLogEntityWithBLOBs p : ls) {
    	   PluginRunningLogReq entity = new PluginRunningLogReq();
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
    	   if(entity.getResolveStatus().equals(BaseConstant.RESOLVE_STATUS_Y)) {
    		   entity.setResolveStatus("<h5 style='color:green'>已解决</h5>");
    	   }else {
    		   entity.setResolveStatus("<h5 style='color:red'>未解决</h5>");
    	   }
    	   rows.add(entity) ;
       }
       table.setRows(rows);
       table.setTotal(total);
       return table;
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 上午11:15:01
	 * @Title: select 
	 * @Description: 
	 * @param
	 * @return
	 * @throws Exception
	 *
	 */
	public ResultModel<PluginRunningLogReq> select(Long id) throws Exception {
		ResultModel<PluginRunningLogReq> result = new ResultModel<PluginRunningLogReq>();
		PluginRunningLogReq req = new PluginRunningLogReq();
		PluginRunningLogEntityWithBLOBs entity = pluginRunningLogEntityMapper.selectByPrimaryKey(id);
		BeanUtils.copyProperties(req,entity);  
		result.setResult(req);
		result.setCode(AdminBaseCode.SUCCESS.getCode());
		return result;
	}
	
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午12:22:07
	 * @Title: edit 
	 * @Description:  解决问提
	 * @param
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 *
	 */
	public ResultModel<String> edit(PluginRunningLogReq req) throws Exception {
		ResultModel<String> result = new ResultModel<String>();
		pluginRunningLogEntityMapper.updateLongById(req);
		result.setCode(AdminBaseCode.SUCCESS.getCode());
		return result;
	}
}
