/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.service.resource.BaseShopCompanyService;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.resource.BaseShopCompanyWeb;
import cn.guludai.admin.web.resource.request.BaseShopCompanyReq;
import cn.guludai.admin.web.resource.response.BaseShopCompanyResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;

@Controller
public class BaseShopCompanyController implements BaseShopCompanyWeb{
	
	private static final Logger logger = LoggerFactory.getLogger(BaseErpFactoryController.class);
	
	@Autowired
	private BaseShopCompanyService baseShopCompanyService;
	
	/**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:12
     * @Title: pluginVersion 
     * @Description: 跳转到厂商版本页面
     * @return
     *
     */
    @GetMapping("/shopCompany")
    public String shopCompany() {
    	return "shopCompany/list";
    }
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:38
     * @Title: edit 编辑厂商版本信息
     * @Description: 
     * @return
     *
     */
    @GetMapping("/shopCompany/edit")
    public String shopCompanyEdit() {
    	return "shopCompany/edit";
    }

	@Override
	@ResponseBody
	public TableResultResponse<BaseShopCompanyResp> shopCompanyList(@RequestBody Request<BaseShopCompanyReq> request) {
		TableResultResponse<BaseShopCompanyResp> page;
		try {
			page = baseShopCompanyService.selectShopCompanyList(request.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		return page;
	}

	@Override
	@ResponseBody
	public Response<String> shopCompanyAdd(@RequestBody Request<BaseShopCompanyReq> request) {
		BaseShopCompanyReq model = request.getData();
		if (StringUtils.isBlank(model.getCompanyName())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		baseShopCompanyService.add(model);
		return Response.success(BaseCode.SUCCESS);
	}

	@Override
	@ResponseBody
	public Response<String> edit(@RequestBody Request<BaseShopCompanyReq> request) {
		BaseShopCompanyReq req = request.getData();
		try {
			baseShopCompanyService.edit(req);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

	@Override
	@ResponseBody
	public Response<BaseShopCompanyResp> select(@RequestBody Request<String> request) {
		String param = request.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			ResultModel<BaseShopCompanyResp> result = baseShopCompanyService.select(param);
			return Response.success(AdminBaseCode.SUCCESS, result.getResult());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

	@Override
	@ResponseBody
	public Response<String> delete(@RequestBody Request<String> request) {
		String param = request.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			baseShopCompanyService.delete(param);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	
}
