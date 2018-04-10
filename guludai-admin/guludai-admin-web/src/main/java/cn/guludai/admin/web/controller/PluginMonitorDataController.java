/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.guludai.admin.service.dataway.PluginMonitorDateService;
import cn.guludai.admin.web.PluginMonitorDataWeb;
import cn.guludai.admin.web.request.PluginMonitorDataReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;

@RestController
public class PluginMonitorDataController implements PluginMonitorDataWeb{

	private static final Logger logger = LoggerFactory.getLogger(PluginMonitorDataController.class);
	
	@Autowired
	private PluginMonitorDateService pluginMonitorDateService;
	
	@Override
	public TableResultResponse<PluginMonitorDataReq> pluginMonitorData(@RequestBody Request<PluginMonitorDataReq> req) {
		 TableResultResponse<PluginMonitorDataReq> ls;
		try {
			ls = pluginMonitorDateService.list(req.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		 return ls ;
	}
	
	
	
}
