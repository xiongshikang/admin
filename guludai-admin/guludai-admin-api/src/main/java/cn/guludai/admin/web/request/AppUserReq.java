package cn.guludai.admin.web.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author qiao.he
 * @create 2017-12-18 14:21
 **/
public class AppUserReq extends BaseReq implements Serializable {

    private static final long serialVersionUID = -1152938705568697236L;
    /**
     * <pre>
     * 默认主键自增
     * 表字段 : app_user.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 用户账户(自动生成)
     * 表字段 : app_user.account
     * </pre>
     */
    private String account;

    /**
     * <pre>
     * 手机号
     * 表字段 : app_user.mobile
     * </pre>
     */
    private String mobile;

    /**
     * <pre>
     * 密码 (结合盐值存储)
     * 表字段 : app_user.password
     * </pre>
     */
    private String password;

    /**
     * <pre>
     * 账户盐值
     * 表字段 : app_user.salt
     * </pre>
     */
    private String salt;

    /**
     * <pre>
     * 账户状态(常量值：Y-激活，N-冻结，默认值：Y)
     * 表字段 : app_user.status
     * </pre>
     */
    private String status;

    /**
     * <pre>
     * 账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人)
     * 表字段 : app_user.category
     * </pre>
     */
    private String category;

    /**
     * <pre>
     * 邮箱
     * 表字段 : app_user.email
     * </pre>
     */
    private String email;

    /**
     * <pre>
     * 姓名
     * 表字段 : app_user.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 微信号
     * 表字段 : app_user.wechat
     * </pre>
     */
    private String wechat;

    /**
     * <pre>
     * 版本号(默认值：1，同步递增修改)
     * 表字段 : app_user.version
     * </pre>
     */
    private String version;

    /**
     * <pre>
     * 创建时间
     * 表字段 : app_user.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 修改时间
     * 表字段 : app_user.update_time
     * </pre>
     */
    private Date updateTime;

    /**
     * <pre>
     * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段 : app_user.data_status
     * </pre>
     */
    private String dataStatus;

    /**
     * <pre>
     * 物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段 : app_user.disk_status
     * </pre>
     */
    private String diskStatus;

    /**
     * Description:多个用户id
     */
    private List<String> accountIds;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public List<String> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }
}
