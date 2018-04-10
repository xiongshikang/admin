package cn.guludai.admin.web.request;

import java.io.File;
import java.io.Serializable;

/**
 * @author HeQiao
 * @create 2018-01-18 10:24
 **/
public class AppVersionReq extends BaseReq implements Serializable {
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
     * 升级包下载URL
     * 表字段 : app_version.download_url
     * </pre>
     */
    private File downloadFile;

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

    public File getDownloadFile() {
        return downloadFile;
    }

    public void setDownloadFile(File downloadFile) {
        this.downloadFile = downloadFile;
    }
}
