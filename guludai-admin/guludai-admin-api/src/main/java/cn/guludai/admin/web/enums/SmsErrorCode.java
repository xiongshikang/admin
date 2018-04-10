package cn.guludai.admin.web.enums;

import cn.guludai.api.Code;

/**
 * @author qiao.he
 * @create 2017-12-18 15:31
 **/
public enum SmsErrorCode implements Code {
    MOBILE_NOT_EMPTY("A001", "电话号码不能为空!"),
    MOBILE_ERROR_PARAM("A002", "电话号码不能为空!"),
    TEMPLATE_NOT_EMPTY("A003", "短信模板不能为空!"),
    SMS_TYPE_NOT_EMPTY("A004", "发送短信类型不能为空!"),

    ERROR_INVALID("5000", "DB修改无效"),


    SEND_SMS_B001("B001" , "发送频率太快，请稍后重试"),
    SEND_SMS_B002("B002" , "短信超过次数"),
    SEND_SMS_B003("B003" , "请输入正确有效的验证码"),
    SEND_SMS_B004("B004" , "短信第三方系统异常");


    ;

    public final String code, message;

    private SmsErrorCode(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public static SmsErrorCode get(String code) {
        for (SmsErrorCode constants : SmsErrorCode.values()) {
            if (constants.getCode().equals(code))
                return constants;
        }
        throw new IllegalArgumentException("SmsErrorCode is not exist : "+ code);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getCode() {
        return code;
    }

}
