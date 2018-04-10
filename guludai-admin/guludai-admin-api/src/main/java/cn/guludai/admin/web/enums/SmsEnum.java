package cn.guludai.admin.web.enums;

import cn.guludai.api.Code;

/**
 * 短信模板
 *
 * @author HeQiao
 * @create 2017-11-17 10:13
 **/
public enum SmsEnum implements Code {
    /**
     * APP注册接口（大鱼）
     */
    SMS_DY_REGISTER("SMS_111535028" , "用户注册短信模板" , new String[]{"regcode"}),
    SMS_DY_UPGRADE("SMS_117521655" , "通知用户升级APP" , new String[]{""})

    ;
    private final String code;
    private final String message;
    private final String[] smsCode;

    SmsEnum(String code, String message, String[] smsCode)
    {
        this.code = code;
        this.message = message;
        this.smsCode = smsCode;
    }
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getCode() {
        return code;
    }

    public String[] getSmsCode() {
        return smsCode;
    }

    public static boolean isSignType(String code)
    {
        for (SmsEnum s : SmsEnum.values())
        {
            if (s.getCode().equals(code))
            {
                return true;
            }
        }
        return false;
    }
}
