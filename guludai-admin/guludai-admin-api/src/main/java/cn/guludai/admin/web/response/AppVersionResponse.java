package cn.guludai.admin.web.response;

import java.util.Date;

/**
 * app 升级有关响应参数
 *
 * @author HeQiao
 * @create 2018-01-18 10:23
 **/
public class AppVersionResponse {
    /**
     * <pre>
     * APP版本编号
     * 表字段 : app_version.version_code
     * </pre>
     */
    private String versionCode;

    /**
     * <pre>
     * APP版本号
     * 表字段 : app_version.version_number
     * </pre>
     */
    private String versionNumber;

    /**
     * <pre>
     * app安装包保存物理地址
     * </pre>
     */
    private String downloadPath;
    /**
     * <pre>
     * APP升级排序号(默认值：1，同步递增修改)
     * 表字段 : app_version.version_order
     * </pre>
     */
    private Integer versionOrder;

    /**
     * <pre>
     * APP版本启用状态(常量值：Y-启用，N-停用，默认值：Y)
     * 表字段 : app_version.version_status
     * </pre>
     */
    private String versionStatus;

    /**
     * <pre>
     * APP是否强制升级(常量值：Y-强制升级版，N-选择升级版)
     * 表字段 : app_version.version_upgrade
     * </pre>
     */
    private String versionUpgrade;

    /**
     * <pre>
     * 升级说明描述公告
     * 表字段 : app_version.version_description
     * </pre>
     */
    private String versionDescription;

    /**
     * <pre>
     * 升级包下载URL
     * 表字段 : app_version.download_url
     * </pre>
     */
    private String downloadUrl;

    /**
     * <pre>
     * 支持手机平台(常量值：android， iphone)
     * 表字段 : app_version.download_platform
     * </pre>
     */
    private String downloadPlatform;

    /**
     * <pre>
     * 版本号(默认值：1，同步递增修改)
     * 表字段 : app_version.version
     * </pre>
     */
    private Long version;

    /**
     * <pre>
     * 创建时间
     * 表字段 : app_version.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 修改时间
     * 表字段 : app_version.update_time
     * </pre>
     */
    private Date updateTime;

    /**
     * <pre>
     * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段 : app_version.data_status
     * </pre>
     */
    private String dataStatus;

    /**
     * <pre>
     * 物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段 : app_version.disk_status
     * </pre>
     */
    private String diskStatus;

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Integer getVersionOrder() {
        return versionOrder;
    }

    public void setVersionOrder(Integer versionOrder) {
        this.versionOrder = versionOrder;
    }

    public String getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    public String getVersionUpgrade() {
        return versionUpgrade;
    }

    public void setVersionUpgrade(String versionUpgrade) {
        this.versionUpgrade = versionUpgrade;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadPlatform() {
        return downloadPlatform;
    }

    public void setDownloadPlatform(String downloadPlatform) {
        this.downloadPlatform = downloadPlatform;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getDownloadPath() {
        return downloadPath;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
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
}
