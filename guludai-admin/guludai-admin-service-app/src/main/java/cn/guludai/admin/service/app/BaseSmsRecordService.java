package cn.guludai.admin.service.app;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.AlicomMnsUtils;
import cn.guludai.admin.domain.dataway.dao.BaseSmsConfigEntityMapper;
import cn.guludai.admin.domain.dataway.dao.BaseSmsRecordEntityMapper;
import cn.guludai.admin.domain.dataway.entity.BaseSmsConfigEntity;
import cn.guludai.admin.domain.dataway.entity.BaseSmsRecordEntity;
import cn.guludai.admin.web.enums.SmsErrorCode;
import cn.guludai.admin.web.request.SendSmsRequest;
import cn.guludai.api.code.BaseCode;
import cn.guludai.framework.toolkit.id.GUID;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 短信service
 *
 * @author qiao.he
 * @create 2017-12-18 15:19
 **/
@Service
public class BaseSmsRecordService {

    private static final Logger logger = LoggerFactory.getLogger(BaseSmsRecordService.class);

    @Autowired
    BaseSmsRecordEntityMapper baseSmsRecordEntityMapper;

    @Autowired
    BaseSmsConfigEntityMapper baseSmsConfigEntityMapper;
    /**
     * @Description: 发送短信
     * @Author: HeQiao
     * @Date:  2017/11/17 18:34
     */
    public ResultModel sendDySms(SendSmsRequest sendSmsRequest , JSONObject json){
        ResultModel resultModel = new ResultModel();
        /** * 电话号码验证 */
        String phone = sendSmsRequest.getPhoneNumbers();
        String templateCode = sendSmsRequest.getTemplateCode();
        String smsType = sendSmsRequest.getSmsType();
        if(!verifyPhone(phone)){
            logger.error("[*******<<<" + SmsErrorCode.MOBILE_ERROR_PARAM.getMessage() + ">>>*******]");
            resultModel.setCode(SmsErrorCode.MOBILE_ERROR_PARAM.getCode());
            return resultModel;
        }
        /**短信网关配置表*/
        BaseSmsConfigEntity baseSmsConfigEntity = baseSmsConfigEntityMapper.selectByCode(templateCode,smsType);

        /**最大发送短信条数 */
        int maxNum = baseSmsRecordEntityMapper.selectSmsMaxNum(phone , baseSmsConfigEntity.getSendCycle());
        if(maxNum > baseSmsConfigEntity.getSendRate()){
            logger.error("[*******<<<" + SmsErrorCode.SEND_SMS_B002.getMessage() + ">>>*******]");
            resultModel.setCode(SmsErrorCode.SEND_SMS_B002.getCode());
            return resultModel;
        }
        /** * 发送短信 */
        ResultModel<com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse> smsMode = smsMode(phone , templateCode ,json);
        if(!smsMode.getCode().equals(BaseCode.SUCCESS.getCode())){
            return smsMode;
        }

        resultModel.setCode(BaseCode.SUCCESS.getCode());
        return resultModel ;
    }


    /**
     * @Description:验证手机号码是否正确
     * @Author: HeQiao
     * @Date:  2017/11/17 16:08
     */
    private static boolean verifyPhone(String phone){
        String regex = "^[1][3,4,5,7,8][0-9]{9}$";
        if(phone.length() != 11){
            return false;
        }else{
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if(!isMatch){
                return false;
            }
        }
        return true;
    }


    /**
     * 向第三方请求发送数据
     * @param phoneNumber 电话号码
     * @param templateCode 短信模板
     * @return
     */
    private ResultModel<com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse> smsMode(String phoneNumber , String templateCode , JSONObject josn ){
        Date start = new Date();

        ResultModel resultModel = new ResultModel();
        com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse sendSmsResponse = AlicomMnsUtils.sendSms(
                phoneNumber ,
                templateCode ,
                 josn);
        if(sendSmsResponse == null){
            resultModel.setCode(SmsErrorCode.SEND_SMS_B004.getCode());
            return resultModel;
        }
        if(sendSmsResponse.getCode() == null || !sendSmsResponse.getCode().equals("OK")) {
            /**  * 发送短频率太快或者其他*/
            resultModel.setCode(SmsErrorCode.SEND_SMS_B001.getCode());
            return resultModel;
        }
        /** * 向数据库插入数据  */
        ResultModel resultDB = addEntity(phoneNumber , templateCode , josn.toJSONString()  , start , sendSmsResponse);
        if (!resultDB.getCode().equals(BaseCode.SUCCESS.getCode())){
            return resultDB;
        }
        resultModel.setCode(BaseCode.SUCCESS.getCode());
        resultModel.setResult(sendSmsResponse);
        return resultModel;
    }


    /**
     * 向数据库插入数据
     * @param phoneNumber 电话号码
     * @param templateCode 短信模板
     * @param smsCode 短信验证码
     * @param start 开始时间
     * @param sendSmsResp 第三方返回数据体
     * @return
     */
    private ResultModel addEntity(String phoneNumber ,String templateCode , String smsCode , Date start , com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse sendSmsResp){
        ResultModel resultModel = new ResultModel();
        BaseSmsRecordEntity baseSmsRecordEntity = new BaseSmsRecordEntity();
        //短信记录流水号
        baseSmsRecordEntity.setSmsRecord(GUID.randomGUID());
        //接受手机号
        baseSmsRecordEntity.setSmsPhone(phoneNumber);
        //发送内容
        baseSmsRecordEntity.setSendContent(smsCode);
        //发送状态
        baseSmsRecordEntity.setSendStatus("OK");
        //发送开始时间
        baseSmsRecordEntity.setSendStartTime(start);
        //发送结束时间
        baseSmsRecordEntity.setSendEndTime(new Date());
        //验证状态
        baseSmsRecordEntity.setCheckStatus("Y");
        //第三方返回数据体
        baseSmsRecordEntity.setResponseData(JSONObject.toJSONString(sendSmsResp));
        //短信配置编号
        baseSmsRecordEntity.setSmsCode(templateCode);
        baseSmsRecordEntity.setVersion(new Long(1));
        baseSmsRecordEntity.setUpdateTime(new Date());
        baseSmsRecordEntity.setCreateTime(new Date());
        baseSmsRecordEntity.setDataStatus("Y");
        baseSmsRecordEntity.setDiskStatus("Y");
        if(baseSmsRecordEntityMapper.insert(baseSmsRecordEntity)<1){
            /**
             * 数据插入无数据
             */
            resultModel.setCode(SmsErrorCode.ERROR_INVALID.getCode());
            return resultModel;
        }
        resultModel.setCode(BaseCode.SUCCESS.getCode());
        return resultModel;
    }
}
