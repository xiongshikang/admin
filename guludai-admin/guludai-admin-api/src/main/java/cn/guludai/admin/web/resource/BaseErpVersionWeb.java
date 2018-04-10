/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource;

import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.resource.request.BaseErpVersionReq;
import cn.guludai.admin.web.resource.response.BaseErpVersionResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
/**
 * 
 * @ClassName: BaseErpVersionWeb 
 * @Description: erp版本控制器
 * @author: xiongshikang
 * @date: 2017年12月19日 下午6:33:50
 */
public interface BaseErpVersionWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginLicense 
	 * @Description: 多条件查找厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpVersion") 
	public  TableResultResponse<BaseErpVersionResp> erpVersionList(Request<BaseErpVersionReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午4:03:18
	 * @Title: pluginLicense 
	 * @Description: 添加或修改厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpVersion/add") 
	public Response<String> erpFactoryAdd(Request<BaseErpVersionReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:41:30
	 * @Title: edit 
	 * @Description: 修改厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpVersion/edit") 
	public Response<String> edit(Request<BaseErpVersionReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过厂商版本编号查找厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpVersion/select") 
	public Response<BaseErpVersionResp> select(Request<String> request); 
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过厂商版本编号逻辑册除
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/erpVersion/delete") 
	public Response<String> delete(Request<String> request); 
}
