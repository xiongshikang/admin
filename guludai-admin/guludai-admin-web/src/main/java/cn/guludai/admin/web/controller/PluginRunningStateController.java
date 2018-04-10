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
import cn.guludai.admin.service.dataway.PluginRunningStateService;
import cn.guludai.admin.web.PluginRunningStateWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.PluginRunningStateReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
@RestController
public class PluginRunningStateController implements PluginRunningStateWeb {
	
	private static final Logger logger = LoggerFactory.getLogger(PluginRunningStateController.class);
	
	@Autowired
	private PluginRunningStateService pluginRunningStateService;

	@Override
	public TableResultResponse<PluginRunningStateReq> pluginRunningState(@RequestBody Request<PluginRunningStateReq> req) {
		TableResultResponse<PluginRunningStateReq> ls;
		try {
			ls = pluginRunningStateService.list(req.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		 return ls ;
	}

	 
	@Override
	public Response<String> edit(@RequestBody Request<PluginRunningStateReq> req) {
		PluginRunningStateReq model = req.getData();
		try {
			pluginRunningStateService.edit(model);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

	@Override
	public Response<PluginRunningStateReq> select(Request<String> req) {
		String param = req.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			ResultModel<PluginRunningStateReq> result = pluginRunningStateService.select(param);
			return Response.success(AdminBaseCode.SUCCESS, result.getResult());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
}
