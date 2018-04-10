package cn.guludai.admin.domain.app.entity;

import java.util.Date;

/**
 * @author HeQiao
 * @create 2018-01-18 10:49
 **/
public class AppVersionEntity {
    /**
     * <pre>
     * 默认自增主键
     * 表字段 : app_version.id
     * </pre>
     */
    private Long id;

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

    /**
     * <pre>
     * 获取：默认自增主键
     * 表字段：app_version.id
     * </pre>
     *
     * @return 默认自增主键 : {@link java.lang.Long}
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：默认自增主键
     * 表字段：app_version.id
     * </pre>
     *
     * @param id
     *              默认自增主键 : {@link java.lang.Long}
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：APP版本编号
     * 表字段：app_version.version_code
     * </pre>
     *
     * @return APP版本编号 : {@link java.lang.String}
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * <pre>
     * 设置：APP版本编号
     * 表字段：app_version.version_code
     * </pre>
     *
     * @param versionCode
     *              APP版本编号 : {@link java.lang.String}
     */
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode == null ? null : versionCode.trim();
    }

    /**
     * <pre>
     * 获取：APP版本号
     * 表字段：app_version.version_number
     * </pre>
     *
     * @return APP版本号 : {@link java.lang.String}
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * <pre>
     * 设置：APP版本号
     * 表字段：app_version.version_number
     * </pre>
     *
     * @param versionNumber
     *              APP版本号 : {@link java.lang.String}
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber == null ? null : versionNumber.trim();
    }

    /**
     * <pre>
     * 获取：APP升级排序号(默认值：1，同步递增修改)
     * 表字段：app_version.version_order
     * </pre>
     *
     * @return APP升级排序号(默认值：1，同步递增修改) : {@link java.lang.Integer}
     */
    public Integer getVersionOrder() {
        return versionOrder;
    }

    /**
     * <pre>
     * 设置：APP升级排序号(默认值：1，同步递增修改)
     * 表字段：app_version.version_order
     * </pre>
     *
     * @param versionOrder
     *              APP升级排序号(默认值：1，同步递增修改) : {@link java.lang.Integer}
     */
    public void setVersionOrder(Integer versionOrder) {
        this.versionOrder = versionOrder;
    }

    /**
     * <pre>
     * 获取：APP版本启用状态(常量值：Y-启用，N-停用，默认值：Y)
     * 表字段：app_version.version_status
     * </pre>
     *
     * @return APP版本启用状态(常量值：Y-启用，N-停用，默认值：Y) : {@link java.lang.String}
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    /**
     * <pre>
     * 设置：APP版本启用状态(常量值：Y-启用，N-停用，默认值：Y)
     * 表字段：app_version.version_status
     * </pre>
     *
     * @param versionStatus
     *              APP版本启用状态(常量值：Y-启用，N-停用，默认值：Y) : {@link java.lang.String}
     */
    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus == null ? null : versionStatus.trim();
    }

    /**
     * <pre>
     * 获取：APP是否强制升级(常量值：Y-强制升级版，N-选择升级版)
     * 表字段：app_version.version_upgrade
     * </pre>
     *
     * @return APP是否强制升级(常量值：Y-强制升级版，N-选择升级版) : {@link java.lang.String}
     */
    public String getVersionUpgrade() {
        return versionUpgrade;
    }

    /**
     * <pre>
     * 设置：APP是否强制升级(常量值：Y-强制升级版，N-选择升级版)
     * 表字段：app_version.version_upgrade
     * </pre>
     *
     * @param versionUpgrade
     *              APP是否强制升级(常量值：Y-强制升级版，N-选择升级版) : {@link java.lang.String}
     */
    public void setVersionUpgrade(String versionUpgrade) {
        this.versionUpgrade = versionUpgrade == null ? null : versionUpgrade.trim();
    }

    /**
     * <pre>
     * 获取：升级说明描述公告
     * 表字段：app_version.version_description
     * </pre>
     *
     * @return 升级说明描述公告 : {@link java.lang.String}
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <pre>
     * 设置：升级说明描述公告
     * 表字段：app_version.version_description
     * </pre>
     *
     * @param versionDescription
     *              升级说明描述公告 : {@link java.lang.String}
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription == null ? null : versionDescription.trim();
    }

    /**
     * <pre>
     * 获取：升级包下载URL
     * 表字段：app_version.download_url
     * </pre>
     *
     * @return 升级包下载URL : {@link java.lang.String}
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * <pre>
     * 设置：升级包下载URL
     * 表字段：app_version.download_url
     * </pre>
     *
     * @param downloadUrl
     *              升级包下载URL : {@link java.lang.String}
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    /**
     * <pre>
     * 获取：支持手机平台(常量值：android， iphone)
     * 表字段：app_version.download_platform
     * </pre>
     *
     * @return 支持手机平台(常量值：android， iphone) : {@link java.lang.String}
     */
    public String getDownloadPlatform() {
        return downloadPlatform;
    }

    /**
     * <pre>
     * 设置：支持手机平台(常量值：android， iphone)
     * 表字段：app_version.download_platform
     * </pre>
     *
     * @param downloadPlatform
     *              支持手机平台(常量值：android， iphone) : {@link java.lang.String}
     */
    public void setDownloadPlatform(String downloadPlatform) {
        this.downloadPlatform = downloadPlatform == null ? null : downloadPlatform.trim();
    }

    /**
     * <pre>
     * 获取：版本号(默认值：1，同步递增修改)
     * 表字段：app_version.version
     * </pre>
     *
     * @return 版本号(默认值：1，同步递增修改) : {@link java.lang.Long}
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <pre>
     * 设置：版本号(默认值：1，同步递增修改)
     * 表字段：app_version.version
     * </pre>
     *
     * @param version
     *              版本号(默认值：1，同步递增修改) : {@link java.lang.Long}
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：app_version.create_time
     * </pre>
     *
     * @return 创建时间 : {@link java.util.Date}
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：app_version.create_time
     * </pre>
     *
     * @param createTime
     *              创建时间 : {@link java.util.Date}
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：修改时间
     * 表字段：app_version.update_time
     * </pre>
     *
     * @return 修改时间 : {@link java.util.Date}
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <pre>
     * 设置：修改时间
     * 表字段：app_version.update_time
     * </pre>
     *
     * @param updateTime
     *              修改时间 : {@link java.util.Date}
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <pre>
     * 获取：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段：app_version.data_status
     * </pre>
     *
     * @return 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String}
     */
    public String getDataStatus() {
        return dataStatus;
    }

    /**
     * <pre>
     * 设置：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段：app_version.data_status
     * </pre>
     *
     * @param dataStatus
     *              逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String}
     */
    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    /**
     * <pre>
     * 获取：物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段：app_version.disk_status
     * </pre>
     *
     * @return 物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String}
     */
    public String getDiskStatus() {
        return diskStatus;
    }

    /**
     * <pre>
     * 设置：物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段：app_version.disk_status
     * </pre>
     *
     * @param diskStatus
     *              物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String}
     */
    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus == null ? null : diskStatus.trim();
    }
}
