/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.request.PluginLicenseReq;
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
public interface PluginLicenseWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginLicense 
	 * @Description: 多条件查找插件信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/pluginLicense") 
	public  TableResultResponse<PluginLicenseReq> pluginLicense(Request<PluginLicenseReq> license);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午4:03:18
	 * @Title: pluginLicense 
	 * @Description: 添加或修改注册码信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/pluginLicense/add") 
	public Response<String> pluginLicenseAdd(Request<PluginLicenseReq> license);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:41:30
	 * @Title: edit 
	 * @Description: 修改注册信息
	 * @param license
	 * @return
	 *
	 */
	@GetMapping("/web/pluginLicense/edit") 
	public Response<String> edit(Request<String> license);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过注册码编号查找册注码信息
	 * @param license
	 * @return
	 *
	 */
	@GetMapping("/web/pluginLicense/select") 
	public Response<PluginLicenseReq> select(Request<String> license); 
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过注册码编号逻辑册除
	 * @param license
	 * @return
	 *
	 */
	@GetMapping("/web/pluginLicense/delete") 
	public Response<String> delete(Request<String> license); 
	
	
	 
}
