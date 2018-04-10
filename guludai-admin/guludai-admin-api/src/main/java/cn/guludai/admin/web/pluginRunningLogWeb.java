/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.request.PluginRunningLogReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
/**
 * 
 * @ClassName: pluginRunningLogWeb 
 * @Description: 错误日志服务类
 * @author: xiongshikang
 * @date: 2017年11月21日 上午10:15:10
 */
public interface pluginRunningLogWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginVersion 
	 * @Description: 多条件查找插件信息
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginRunningLog") 
	public  TableResultResponse<PluginRunningLogReq> pluginVersion(Request<PluginRunningLogReq> req);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 上午11:17:26
	 * @Title: edit 
	 * @Description: 解决问提
	 * @param req
	 * @return
	 *
	 */
	@GetMapping("/web/pluginRunningLog/edit") 
	public Response<String> edit(Request<String> req);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 查询错误日志
	 * @param req
	 * @return
	 *
	 */
	@GetMapping("/web/pluginRunningLog/select") 
	public Response<PluginRunningLogReq> select(Request<String> req); 
	
}
