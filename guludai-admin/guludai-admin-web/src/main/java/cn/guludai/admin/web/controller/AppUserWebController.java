package cn.guludai.admin.web.controller;

import cn.guludai.admin.service.app.AppUserService;
import cn.guludai.admin.web.AppUserWeb;
import cn.guludai.admin.web.enums.SmsErrorCode;
import cn.guludai.admin.web.request.AppUserReq;
import cn.guludai.admin.web.response.AppUserResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author HeQiao
 * @create 2017-12-18 14:32
 **/
@RestController
public class AppUserWebController implements AppUserWeb {

    @Autowired
    AppUserService appUserService;

    @Override
    public TableResultResponse<AppUserResponse> noticeSmsList(@RequestBody Request<AppUserReq> req) {
        return appUserService.noticeSmsList(req.getData());
    }

    @Override
    public Response<String> batchSendSms(@RequestBody Request<String> req) {
        if (StringUtils.isBlank(req.getData()+"")){
            return Response.failure(SmsErrorCode.MOBILE_ERROR_PARAM);
        }
        return appUserService.batchSendSms(req.getData());
    }
}
