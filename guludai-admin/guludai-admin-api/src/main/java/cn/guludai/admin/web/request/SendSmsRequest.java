package cn.guludai.admin.web.request;

import java.io.Serializable;

/**
 * 发送短信请求对象
 *
 * @author HeQiao
 * @create 2017-11-17 10:23
 **/
public class SendSmsRequest implements Serializable{
    private static final long serialVersionUID = 653265678240935005L;

    /**
     * 手机号
     */
    private String phoneNumbers;

    /**
     * 短息模板(发送短信时候使用)
     */
    private String templateCode;

    /**
     * 配置类型
     */
    private String smsType;

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }
}
