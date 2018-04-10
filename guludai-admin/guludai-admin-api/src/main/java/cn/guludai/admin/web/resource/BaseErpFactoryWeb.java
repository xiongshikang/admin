/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.guludai.admin.web.resource.request.BaseErpFactoryReq;
import cn.guludai.admin.web.resource.response.BaseErpFactoryResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
/**
 * 
 * @ClassName: PluginLicenseWeb 
 * @Description: 注册码控制器
 * @author: xiongshikang
 * @date: 2017年11月19日 下午2:40:33
 */
public interface BaseErpFactoryWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginLicense 
	 * @Description: 多条件查找厂商信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpFactory") 
	public  TableResultResponse<BaseErpFactoryResp> erpFactoryList(Request<BaseErpFactoryReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午4:03:18
	 * @Title: pluginLicense 
	 * @Description: 添加或修改厂商信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpFactory/add") 
	public Response<String> erpFactoryAdd(Request<BaseErpFactoryReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:41:30
	 * @Title: edit 
	 * @Description: 修改厂商信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpFactory/edit") 
	public Response<String> edit(Request<BaseErpFactoryReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过厂商编号查找厂商信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpFactory/select") 
	public Response<BaseErpFactoryResp> select(Request<String> request); 
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过厂商编号逻辑册除
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpFactory/delete") 
	public Response<String> delete(Request<String> request); 
 
}
