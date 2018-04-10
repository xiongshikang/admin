/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.guludai.admin.service.resource.BaseErpFactoryService;
import cn.guludai.admin.web.BaseErpWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.response.BaseErpFactoryResponse;
import cn.guludai.admin.web.response.BaseErpVersionResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;


/**
 * ERP基础信息接口实现
 *
 * @author HeQiao
 * @create 2017-11-03 16:00
 **/
@RestController
public class BaseErpFactroyController implements BaseErpWeb {

    @Autowired
    BaseErpFactoryService baseErpFactoryService;

    private static final Logger logger = LoggerFactory.getLogger(BaseErpFactroyController.class);

	@Override
	public Response<BaseErpFactoryResponse> BaseErpFactoryList() {
		List<BaseErpFactoryResponse> ls = baseErpFactoryService.findBaseErpFactory();
		if(null!=ls &&ls.size()>0) {
			return Response.success(AdminBaseCode.SUCCESS,ls);
		}else {
			return Response.failure(AdminBaseCode.ERROR_SYS,AdminBaseCode.ERROR_SYS.getMessage());
		}
		
	}

	@Override
	public Response<BaseErpVersionResponse> baseErpVersionList(Request<String> request) {
		String erpFactoryCode = request.getData();
		List<BaseErpVersionResponse> ls = baseErpFactoryService.findBaseErpVersion(erpFactoryCode);
		if(null!=ls &&ls.size()>0) {
			return Response.success(AdminBaseCode.SUCCESS,ls);
		}else {
			return Response.failure(AdminBaseCode.ERROR_SYS,AdminBaseCode.ERROR_SYS.getMessage());
		}
	}

    

}
