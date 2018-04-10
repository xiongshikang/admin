package cn.guludai.admin.web.controller;

import cn.guludai.admin.service.app.AppVersionService;
import cn.guludai.admin.web.AppVersionWeb;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.AppVersionReq;
import cn.guludai.admin.web.response.AppVersionResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import cn.guludai.container.runtime.profile.RuntimeEnvironment;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author HeQiao
 * @create 2018-01-18 10:31
 **/
@RestController
public class AppVersionCentroller implements AppVersionWeb {

    private static final Logger logger = LoggerFactory.getLogger(AppVersionCentroller.class);

    @Autowired
    AppVersionService appVersionService;

    @Override
    public TableResultResponse<AppVersionResponse> getAppVersion(@RequestBody Request<AppVersionReq> request) {
        TableResultResponse<AppVersionResponse> ls;
        try {
            ls = appVersionService.list(request.getData());
        } catch (Exception e) {
            logger.error("[系统运行错误:]" + e.getMessage(), e);
            return null;
        }
        return ls;
    }

    @Override
    public Response<AppVersionResponse> select(@RequestBody Request<String> request) {
        try {
            if (StringUtils.isBlank(request.getData())) {
                return Response.failure(AdminBaseCode.ERROR_REQ_A002, "APP版本编号不能为空");
            }
            return appVersionService.select(request.getData());
        } catch (Exception e) {
            return Response.failure(BaseCode.ERROR);
        }
    }

    @Override
    public Response<AppVersionResponse> edit(HttpServletRequest req, MultipartHttpServletRequest multiReq) {
        try {
            if (StringUtils.isBlank(req.getParameter("versionCode"))) {
                return Response.failure(AdminBaseCode.ERROR_REQ_A002, "APP版本编号不能为空");
            }
            return appVersionService.edit(req , multiReq);
        } catch (Exception e) {
            return Response.failure(BaseCode.ERROR);
        }
    }

    @Override
    public Response<String> add(HttpServletRequest req, MultipartHttpServletRequest multiReq) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        if (StringUtils.isBlank(req.getParameter("versionNumber"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, "版本号不能为空");
        }
        if (StringUtils.isBlank(req.getParameter("versionUpgrade"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, "APP是否强制升级不能为空");
        }
        if (StringUtils.isBlank(req.getParameter("versionDescription"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, "升级说明描述公告不能为空");
        }
        if (StringUtils.isBlank(req.getParameter("downloadPath"))) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, "升级包下载URL不能为空");
        }
        if (multiReq == null) {
            return Response.failure(AdminBaseCode.ERROR_REQ_A002, "升级包下载包不能为空");
        }
        Response<String> response = appVersionService.add(req, multiReq);
        return response;
    }

    @Override
    public Response<Void> delete(@RequestBody Request<String> request) {
        try {
            if (StringUtils.isBlank(request.getData())) {
                return Response.failure(AdminBaseCode.ERROR_REQ_A002, "APP版本编号不能为空");
            }
            return appVersionService.delete(request.getData());
        } catch (Exception e) {
            return Response.failure(BaseCode.ERROR);
        }
    }

    @Override
    public Response<String> physicalAddress() {
        return Response.success(AdminBaseCode.SUCCESS, RuntimeEnvironment.getPropertiesByUtf8("upload.app.path"));
    }
}
