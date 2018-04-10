package cn.guludai.admin.web.response;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HeQiao
 * @create 2017-12-18 14:21
 **/
public class AppUserResponse implements Serializable {

    /**'(自动生成)'*/
    private String account;

    /**'手机号'*/
    private String mobile;

    /**'密码 (结合盐值存储)'*/
    private String password;

    /**'账户盐值'*/
    private String salt;

    /**'账户状态(常量值：Y-激活，N-冻结，默认值：Y)'*/
    private String status;

    /**'账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人)'*/
    private String category;

    /**'邮箱'*/
    private String email;

    /**'姓名'*/
    private String name;

    /**'微信号'*/
    private String wechat;

    /**'版本号(默认值：1，同步递增修改)'*/
    private String version;

    /**'创建时间'*/
    private Date createTime;

    /**'修改时间'*/
    private Date updateTime;

    /**'逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)'*/
    private String dataStatus;

    /**'物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)'*/
    private String diskStatus;

    /** 短信发送状态*/
    private String smsStatus;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getDiskStatus() {
        return diskStatus;
    }

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }
}
