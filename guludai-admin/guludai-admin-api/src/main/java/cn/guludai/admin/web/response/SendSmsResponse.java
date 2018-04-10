package cn.guludai.admin.web.response;

import java.io.Serializable;

/**
 * 短信返回接口
 *
 * @author HeQiao
 * @create 2017-11-17 10:37
 **/
public class SendSmsResponse implements Serializable {

    private static final long serialVersionUID = 7488490363391160144L;

    /**
     * 手机号码
     */
    private String phoneNumber;


    /**
     *短信发送状态
     */
    private boolean sendStatus;

    /**
     * 发送说明
     */
    private String message;

    public boolean isSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(boolean sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
