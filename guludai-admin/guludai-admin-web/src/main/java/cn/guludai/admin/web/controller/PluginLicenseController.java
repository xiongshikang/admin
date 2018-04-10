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
import cn.guludai.admin.service.dataway.PluginLicenseService;
import cn.guludai.admin.web.PluginLicenseWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.PluginLicenseReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;

/**
 * @ClassName: PluginLicenseController
 * @Description: 插件注册码控制器
 * @author: xiongshikang
 * @date: 2017年11月15日 下午12:03:46
 */
@RestController
public class PluginLicenseController implements PluginLicenseWeb {
	private static final Logger logger = LoggerFactory.getLogger(PluginLicenseController.class);
	@Autowired
	private PluginLicenseService pluginLicenseService;

	@Override
	public TableResultResponse<PluginLicenseReq> pluginLicense(@RequestBody Request<PluginLicenseReq> license) {
		TableResultResponse<PluginLicenseReq> page;
		try {
			page = pluginLicenseService.selectPluginLicenseList(license.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		return page;
	}
	@Override
	public Response<String> pluginLicenseAdd(@RequestBody Request<PluginLicenseReq> license) {
		PluginLicenseReq model = license.getData();
		if (StringUtils.isBlank(model.getErpFactoryCode())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		if (StringUtils.isBlank(model.getCompanyCode())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		if (StringUtils.isBlank(model.getErpVersionCode())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		if (StringUtils.isBlank(model.getShopCode())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		ResultModel<String> result = pluginLicenseService.add(model);
		if (result.getCode().equals(AdminBaseCode.BASE_SHOP_ERP_NOT_EMPTY.getCode())) {
			logger.error("[" + AdminBaseCode.BASE_SHOP_ERP_NOT_EMPTY.getMessage() + "]");
			return Response.failure(AdminBaseCode.BASE_SHOP_ERP_NOT_EMPTY,
					AdminBaseCode.BASE_SHOP_ERP_NOT_EMPTY.getMessage());
		}else if (result.getCode().equals(AdminBaseCode.RSA_CREATE_ERROR.getCode())) {
			logger.error("[" + AdminBaseCode.RSA_CREATE_ERROR.getMessage() + "]");
			return Response.failure(AdminBaseCode.RSA_CREATE_ERROR, AdminBaseCode.RSA_CREATE_ERROR.getMessage());
		}else if (result.getCode().equals(AdminBaseCode.AES_CREATE_ERROR.getCode())) {
			logger.error("[" + AdminBaseCode.AES_CREATE_ERROR.getMessage() + "]");
			return Response.failure(AdminBaseCode.RSA_CREATE_ERROR, AdminBaseCode.RSA_CREATE_ERROR.getMessage());
		}else {
			return Response.success(BaseCode.SUCCESS);
		}
	}
	
	@Override
	public Response<String> edit(Request<String> license) {
		String param = license.getData();
		PluginLicenseReq model = JsonTool.json2povo(param, PluginLicenseReq.class);
		try {
			pluginLicenseService.edit(model);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	@Override
	public Response<PluginLicenseReq> select(Request<String> license) {
		String param = license.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			PluginLicenseReq result = pluginLicenseService.select(param);
			return Response.success(AdminBaseCode.SUCCESS, result);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	@Override
	public Response<String> delete(Request<String> license) {
		String param = license.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			pluginLicenseService.delete(param);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	 
}
