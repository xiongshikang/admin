package cn.guludai.admin.service.app;

import cn.guludai.admin.common.constant.RedisConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.RedisUtils;
import cn.guludai.admin.domain.app.dao.AppUserEntityMapper;
import cn.guludai.admin.domain.app.entity.AppUserEntity;
import cn.guludai.admin.service.app.BaseSmsRecordService;
import cn.guludai.admin.web.enums.SmsEnum;
import cn.guludai.admin.web.enums.SmsErrorCode;
import cn.guludai.admin.web.request.AppUserReq;
import cn.guludai.admin.web.request.SendSmsRequest;
import cn.guludai.admin.web.response.AppUserResponse;
import cn.guludai.admin.web.response.SendSmsResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import cn.guludai.framework.cache.client.RedisClient;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiao.he
 * @create 2017-12-18 14:34
 **/
@Service
public class AppUserService {
    @Autowired
    AppUserEntityMapper appUserEntityMapper;

    @Autowired
    BaseSmsRecordService baseSmsRecordService;

    @Autowired
    protected RedisClient client;

    public TableResultResponse<AppUserResponse> noticeSmsList(AppUserReq req) {
        TableResultResponse<AppUserResponse> tableResultResponse = new TableResultResponse();
        List<AppUserEntity> appUserList = appUserEntityMapper.selectByConditionByPing(req);
        List<AppUserResponse> appUserResponseList = new ArrayList<>();
        for (AppUserEntity entity : appUserList ) {
            AppUserResponse appUserResponse = new AppUserResponse();
            BeanUtils.copyProperties(entity ,appUserResponse );
            /** 这里再Redis里面去 */
            String smsStatus  = client.get(RedisConstant.SMS_PHONEN_UMBER + entity.getMobile());
            appUserResponse.setSmsStatus(smsStatus==null?"NIL":smsStatus);
            appUserResponseList.add(appUserResponse);
        }
        tableResultResponse.setRows(appUserResponseList);
        tableResultResponse.setTotal(appUserEntityMapper.selectByConditionNumByPing(req));
        return tableResultResponse;
    }

    public Response<String> batchSendSms(String mobileStr) {
        String[] mobiles =  mobileStr.split(",");
        for (String mobile:mobiles){
            if (StringUtils.isBlank(mobile)){
                continue;
            }

            ResultModel<SendSmsResponse> sendSmsResponse = sendUrlSms(mobile);
            if (sendSmsResponse.getCode().equals(BaseCode.SUCCESS.getCode())){
                client.setEx(RedisConstant.SMS_PHONEN_UMBER + mobile ,604800 ,"发送成功" );
            }else{
                client.setEx(RedisConstant.SMS_PHONEN_UMBER + mobile ,604800 ,"发送失败" );
                return Response.success(BaseCode.ERROR);
            }
        }
        return Response.success(BaseCode.SUCCESS);
    }

    public ResultModel<SendSmsResponse> sendUrlSms(String mobile) {
        JSONObject json = new JSONObject();
        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        sendSmsRequest.setTemplateCode(SmsEnum.SMS_DY_UPGRADE.getCode());
        sendSmsRequest.setSmsType("1");
        sendSmsRequest.setPhoneNumbers(mobile);
        return baseSmsRecordService.sendDySms(sendSmsRequest , json);
    }
}
