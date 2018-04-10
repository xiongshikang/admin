/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.request.PluginRunningStateReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
/**
 * 
 * @ClassName: PluginRunningStateWeb 
 * @Description: 插件运行环境状控制器
 * @author: xiongshikang
 * @date: 2017年11月20日 下午2:13:05
 */
public interface PluginRunningStateWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginRunningState 
	 * @Description: 多条件查找插件运行环境状态信息
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginRunningState") 
	public  TableResultResponse<PluginRunningStateReq> pluginRunningState(Request<PluginRunningStateReq> req);
	
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:41:30
	 * @Title: edit 
	 * @Description: 修改插件运行环境状态信息
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginRunningState/edit") 
	public Response<String> edit(Request<PluginRunningStateReq> req);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过门店编号查找插件运行环境状态信息
	 * @param req
	 * @return
	 *
	 */
	@GetMapping("/web/pluginRunningState/select") 
	public Response<PluginRunningStateReq> select(Request<String> req); 
}


