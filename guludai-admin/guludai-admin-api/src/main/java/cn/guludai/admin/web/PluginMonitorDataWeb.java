/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.request.PluginMonitorDataReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;

/**
 * 
 * @ClassName: PluginMonitorDataWeb 
 * @Description: 插件数据监控控制器
 * @author: xiongshikang
 * @date: 2017年11月21日 下午1:54:42
 */
public interface PluginMonitorDataWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 下午1:56:26
	 * @Title: pluginMonitorData 
	 * @Description: 多条件查找监控数据信息
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginMonitorData") 
	public  TableResultResponse<PluginMonitorDataReq> pluginMonitorData(Request<PluginMonitorDataReq> req);
	
}
