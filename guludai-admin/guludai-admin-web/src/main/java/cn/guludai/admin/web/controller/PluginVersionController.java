/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.JsonTool;
import cn.guludai.admin.service.dataway.PluginVersionService;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.pluginVersionWeb;
import cn.guludai.admin.web.request.PluginVersionReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import cn.guludai.container.runtime.exception.RunningException;
import cn.guludai.container.runtime.profile.RuntimeEnvironment;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PluginVersionController implements pluginVersionWeb {

    private static final Logger logger = LoggerFactory.getLogger(PluginVersionController.class);

    @Autowired
    private PluginVersionService pluginVersionService;

    @Override
    public Response<String> pluginVersionAddUpload(HttpServletRequest req,
                                                   MultipartHttpServletRequest multiReq) {

        if (StringUtils.isBlank(req.getParameter("downloadUrl"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        if (StringUtils.isBlank(req.getParameter("erpFactoryCode"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        if (StringUtils.isBlank(req.getParameter("erpVersionCode"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        if (StringUtils.isBlank(req.getParameter("pluginName"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        if (req.getParameter("pluginName").length() > 50) {
            return Response.failure(AdminBaseCode.REQ_ERROR_PLUGINNAME, AdminBaseCode.REQ_ERROR_PLUGINNAME.getMessage());
        }
        if (StringUtils.isBlank(req.getParameter("pluginStatus"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        if (StringUtils.isBlank(req.getParameter("pluginVersion"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }

        try {
            ResultModel<String> sqlResult = pluginVersionService.add(req ,multiReq);
            if (sqlResult.getCode().equals(AdminBaseCode.ERROR_UPLOAD.getCode())){
                logger.error("[系统运行错误:]" + AdminBaseCode.ERROR_UPLOAD.getMessage());
                return Response.failure(AdminBaseCode.ERROR_UPLOAD);
            }
            return Response.success(AdminBaseCode.SUCCESS, sqlResult.getResult());
        } catch (RunningException e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return Response.failure(e.getExceptionCode(), e.getMessage());
        } catch (Exception e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return Response.failure(BaseCode.ERROR);
        }
    }

    @Override
    public Response<String> physicalAddress(Request<String> req) {
        if (StringUtils.isBlank(req.getData())) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        try {
            return pluginVersionService.physicalAddress(req.getData());
        } catch (RunningException e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return Response.failure(e.getExceptionCode(), e.getMessage());
        } catch (Exception e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return Response.failure(BaseCode.ERROR);
        }
    }

    @Override
    public TableResultResponse<PluginVersionReq> pluginVersion(@RequestBody Request<PluginVersionReq> req) {
        try {
            TableResultResponse<PluginVersionReq> page = pluginVersionService.list(req.getData());
            return page;
        } catch (RunningException e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return null;
        }
    }

//    @Override
//    public Response<String> pluginVersionAdd(Request<String> req) {
//        String param = req.getData();
//        PluginVersionReq model = JsonTool.json2povo(param, PluginVersionReq.class);
//        if (StringUtils.isBlank(model.getDownloadUrl())) {
//            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
//        }
//        if (StringUtils.isBlank(model.getErpFactoryCode())) {
//            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
//        }
//        if (StringUtils.isBlank(model.getErpVersionCode())) {
//            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
//        }
//        if (StringUtils.isBlank(model.getPluginName())) {
//            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
//        }
//        if (model.getPluginName().length() > 20) {
//            return Response.failure(AdminBaseCode.REQ_ERROR_PLUGINNAME, AdminBaseCode.REQ_ERROR_PLUGINNAME.getMessage());
//        }
//        if (StringUtils.isBlank(model.getPluginStatus())) {
//            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
//        }
//        if (StringUtils.isBlank(model.getPluginVersion())) {
//            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
//        }
//        try {
//            ResultModel<String> result = pluginVersionService.add(model);
//            return Response.success(AdminBaseCode.SUCCESS, result.getResult());
//        } catch (Exception e) {
//            logger.error("[系统运行错误:]" + e.getMessage(), e);
//            return Response.failure(BaseCode.ERROR);
//        }
//    }

    @Override
    public Response<String> edit(Request<String> req) {
        String param = req.getData();
        PluginVersionReq model = JsonTool.json2povo(param, PluginVersionReq.class);
        try {
            pluginVersionService.edit(model);
            return Response.success(AdminBaseCode.SUCCESS);
        } catch (Exception e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
        }
    }

    @Override
    public Response<PluginVersionReq> select(Request<String> req) {
        String param = req.getData();
        if (StringUtils.isBlank(param)) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        try {
            ResultModel<PluginVersionReq> result = pluginVersionService.select(param);
            return Response.success(AdminBaseCode.SUCCESS, result);
        } catch (Exception e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
        }
    }

    @Override
    public Response<String> delete(@RequestBody Request<String> req) {
        String param = req.getData();
        if (StringUtils.isBlank(param)) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, AdminBaseCode.ERROR_REQ_A002.getMessage());
        }
        try {
            ResultModel<String> resultModel = pluginVersionService.delete(param);
            if (resultModel.getCode().equals(AdminBaseCode.ERROR_INVALID.getCode())) {
                return Response.failure(AdminBaseCode.ERROR_INVALID);
            }
            if (resultModel.getCode().equals(AdminBaseCode.ERROR_FILE_DEL.getCode())) {
                return Response.failure(AdminBaseCode.ERROR_FILE_DEL);
            }
            return Response.success(AdminBaseCode.SUCCESS);
        } catch (Exception e) {
            return Response.failure(AdminBaseCode.ERROR_SYS, AdminBaseCode.ERROR_SYS.getMessage());
        }
    }
}
