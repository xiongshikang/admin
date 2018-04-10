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
import cn.guludai.admin.service.resource.BaseErpVersionService;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.resource.BaseErpVersionWeb;
import cn.guludai.admin.web.resource.request.BaseErpVersionReq;
import cn.guludai.admin.web.resource.response.BaseErpVersionResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;

/**
 * 
 * @ClassName: BaseErpVersionController 
 * @Description: erp版本控制器
 * @author: xiongshikang
 * @date: 2017年12月19日 下午6:32:02
 */
@Controller
public class BaseErpVersionController implements BaseErpVersionWeb{

	private static final Logger logger = LoggerFactory.getLogger(BaseErpFactoryController.class);
	
	@Autowired
	private BaseErpVersionService baseErpVersionService;
	
	/**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:12
     * @Title: pluginVersion 
     * @Description: 跳转到厂商版本页面
     * @return
     *
     */
    @GetMapping("/erpVersion")
    public String erpVersion() {
    	return "erpVersion/list";
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
    @GetMapping("/erpVersion/edit")
    public String erpVersionEdit() {
    	return "erpVersion/edit";
    }
	
	@Override
	@ResponseBody
	public TableResultResponse<BaseErpVersionResp> erpVersionList(@RequestBody Request<BaseErpVersionReq> request) {
		TableResultResponse<BaseErpVersionResp> page;
		try {
			page = baseErpVersionService.selectErpVersionList(request.getData());
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return null;
		}
		return page;
	}

	@Override
	@ResponseBody
	public Response<String> erpFactoryAdd(@RequestBody Request<BaseErpVersionReq> request) {
		BaseErpVersionReq model = request.getData();
		if (StringUtils.isBlank(model.getErpFactoryCode())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		if (StringUtils.isBlank(model.getErpVersionName())) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		baseErpVersionService.add(model);
		return Response.success(BaseCode.SUCCESS);
	}

	@Override
	@ResponseBody
	public Response<String> edit(@RequestBody Request<BaseErpVersionReq> request) {
		BaseErpVersionReq req = request.getData();
		try {
			baseErpVersionService.edit(req);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

	@Override
	@ResponseBody
	public Response<BaseErpVersionResp> select(@RequestBody Request<String> request) {
		String param = request.getData();
		if (StringUtils.isBlank(param)) {
			return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
		}
		try {
			ResultModel<BaseErpVersionResp> result = baseErpVersionService.select(param);
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
			baseErpVersionService.delete(param);
			return Response.success(AdminBaseCode.SUCCESS);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
		}
	}
	
}
