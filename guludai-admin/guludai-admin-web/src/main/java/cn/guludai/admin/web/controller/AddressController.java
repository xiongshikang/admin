/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import cn.guludai.admin.service.resource.impl.AddressService;
import cn.guludai.admin.web.AddressWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.response.AddressResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController implements AddressWeb{
	
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	private AddressService addressService;
	
	@Override
	public Response<AddressResponse> provinceList() {
		List<AddressResponse> ls;
		try {
			ls = addressService.getProvince();
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
		return Response.success(BaseCode.SUCCESS, ls);
	}

	@Override
	public Response<AddressResponse> cityList(Request<String> request) {
		List<AddressResponse> ls;
		String code = request.getData();
		try {
			ls = addressService.getCity(code);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
		return Response.success(BaseCode.SUCCESS, ls);
	}

	@Override
	public Response<AddressResponse> townList(Request<String> request) {
		List<AddressResponse> ls;
		String code = request.getData();
		try {
			ls = addressService.getTown(code);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
		return Response.success(BaseCode.SUCCESS, ls);
	}
	
 
}
