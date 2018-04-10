/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import java.util.List;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.web.request.BaseShopRequest;
import cn.guludai.admin.web.request.PluginRunningLogReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.guludai.admin.service.resource.BaseShopApiService;
import cn.guludai.admin.web.BaseShopWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.response.BaseShopCompanyResponse;
import cn.guludai.admin.web.response.BaseShopResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;

@RestController
public class ShopController implements BaseShopWeb{

	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);

	@Autowired
	private BaseShopApiService baseShopApiService;
	 
	@Override
	public Response<BaseShopCompanyResponse> companyAll() {
		List<BaseShopCompanyResponse> ls = baseShopApiService.selectBaseShopCompany();
		if(null!=ls && ls.size()>0) {
			return Response.success(AdminBaseCode.SUCCESS,ls);
		}else {
			return Response.failure(AdminBaseCode.ERROR_SYS,AdminBaseCode.ERROR_SYS.getMessage());
		}
		
	}

	@Override
	public Response<BaseShopResponse> getShopByCompanyCode(Request<String> request) {
		 String companyCode = request.getData();
		 List<BaseShopResponse> ls = baseShopApiService.selectShopByCompanyCode(companyCode);
		 if(null!=ls && ls.size()>0) {
				return Response.success(AdminBaseCode.SUCCESS,ls);
			}else {
				return Response.failure(AdminBaseCode.ERROR_SYS,AdminBaseCode.ERROR_SYS.getMessage());
			}
	}

	@Override
	public TableResultResponse<BaseShopResponse> getBaseShop(@RequestBody Request<BaseShopRequest> request) {
		try{
			return baseShopApiService.getBaseShop(request.getData());
		}catch (Exception e){
			logger.error(e.getMessage());
			return null;
		}
	}

	@Override
	public Response<BaseShopResponse> select(@RequestBody Request<String> request) {
		if (StringUtils.isBlank(request.getData())){
			return Response.failure(AdminBaseCode.ERROR_REQ_A002);
		}
		Response<BaseShopResponse> response = new Response<>();
		response.setData(baseShopApiService.select(request.getData()));
		response.setCode(BaseCode.SUCCESS.getCode());
		response.setStatus(true);
		return response;
	}

	@Override
	public Response<BaseShopResponse> edit(@RequestBody Request<BaseShopRequest> request) {
		try {
			ResultModel<String> resultModel = baseShopApiService.edit(request.getData());
			if (resultModel.getCode().equals(AdminBaseCode.ERROR_SNAME_NAME.getCode())){
				return Response.failure(AdminBaseCode.ERROR_SNAME_NAME);
			}
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

	@Override
	public Response<Void> delete(@RequestBody Request<String> request) {
		try {
			if (baseShopApiService.delete(request.getData())<1){
				return Response.failure(AdminBaseCode.INVALID_SQL);
			}
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}


}
