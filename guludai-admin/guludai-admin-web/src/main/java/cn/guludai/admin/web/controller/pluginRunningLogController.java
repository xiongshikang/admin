/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.JsonTool;
import cn.guludai.admin.service.dataway.PluginRunningLogService;
import cn.guludai.admin.web.pluginRunningLogWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.PluginRunningLogReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
@RestController
public class pluginRunningLogController implements pluginRunningLogWeb {

	private static final Logger logger = LoggerFactory.getLogger(pluginRunningLogController.class);
	
	@Autowired
	private PluginRunningLogService pluginRunningLogService;
	@Override
	public TableResultResponse<PluginRunningLogReq> pluginVersion(@RequestBody Request<PluginRunningLogReq> req) {
		 TableResultResponse<PluginRunningLogReq> ls;
		try {
			ls = pluginRunningLogService.list(req.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		 return ls ;
	}
	
	@Override
	public Response<String> edit(Request<String> req) {
		String param = req.getData();
		PluginRunningLogReq model = JsonTool.json2povo(param, PluginRunningLogReq.class);
		try {
			pluginRunningLogService.edit(model);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

	@Override
	public Response<PluginRunningLogReq> select(Request<String> req) {
		String param = req.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			ResultModel<PluginRunningLogReq> result = pluginRunningLogService.select(Long.valueOf(param));
			return Response.success(AdminBaseCode.SUCCESS, result.getResult());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	
}
