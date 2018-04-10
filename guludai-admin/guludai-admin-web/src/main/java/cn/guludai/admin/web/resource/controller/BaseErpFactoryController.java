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
import cn.guludai.admin.service.resource.BaseErpFactoryService;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.resource.BaseErpFactoryWeb;
import cn.guludai.admin.web.resource.request.BaseErpFactoryReq;
import cn.guludai.admin.web.resource.response.BaseErpFactoryResp;
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
@Controller
public class BaseErpFactoryController implements BaseErpFactoryWeb {
	private static final Logger logger = LoggerFactory.getLogger(BaseErpFactoryController.class);
	@Autowired
	private BaseErpFactoryService baseErpFactoryService;
	
	/**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:12
     * @Title: pluginVersion 
     * @Description: 跳转到厂商页面
     * @return
     *
     */
    @GetMapping("/erpFactory")
    public String erpFactory() {
    	return "erpFactory/list";
    }
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:38
     * @Title: edit 编辑厂商信息
     * @Description: 
     * @return
     *
     */
    @GetMapping("/erpFactory/edit")
    public String erpFactoryEdit() {
    	return "erpFactory/edit";
    }

	@Override
	@ResponseBody
	public TableResultResponse<BaseErpFactoryResp> erpFactoryList(@RequestBody Request<BaseErpFactoryReq> request) {
		TableResultResponse<BaseErpFactoryResp> page;
		try {
			page = baseErpFactoryService.selectErpFactoryList(request.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		return page;
	}
	@Override
	@ResponseBody
	public Response<String> erpFactoryAdd(@RequestBody Request<BaseErpFactoryReq> request) {
		BaseErpFactoryReq model = request.getData();
		if (StringUtils.isBlank(model.getErpFactoryName())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		 baseErpFactoryService.add(model);
		return Response.success(BaseCode.SUCCESS);
	}
	
	@Override
	@ResponseBody
	public Response<String> edit(@RequestBody Request<BaseErpFactoryReq> request) {
		BaseErpFactoryReq req = request.getData();
		try {
			baseErpFactoryService.edit(req);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	@Override
	@ResponseBody
	public Response<BaseErpFactoryResp> select(@RequestBody Request<String> request) {
		String param = request.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			ResultModel<BaseErpFactoryResp> result = baseErpFactoryService.select(param);
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
			baseErpFactoryService.delete(param);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
}
