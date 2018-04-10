/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.util.Date;

/**
 * 
 * @ClassName: PluginVersionReq 
 * @Description: 插件版本参数接受类
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:18:39
 */
public class PluginVersionReq extends BaseReq{
	
	/**
	 * @author: xiongshikang
	 * @date: 2017年11月20日 下午1:47:38
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <pre>
	 * 插件编号
	 * 表字段 : plugin_version.plugin_code
	 * </pre>
	 */
	private String pluginCode;

	/**
	 * <pre>
	 * 插件名称
	 * 表字段 : plugin_version.plugin_name
	 * </pre>
	 */
	private String pluginName;

	/**
	 * <pre>
	 * 插件版本
	 * 表字段 : plugin_version.plugin_version
	 * </pre>
	 */
	private String pluginVersion;

	/**
	 * <pre>
	 * 插件版本排序号(乐观锁方式递增版本排序号，判断版本的高低)
	 * 表字段 : plugin_version.plugin_version_order
	 * </pre>
	 */
	private Integer pluginVersionOrder;

	/**
	 * <pre>
	 * 插件是否可升级(常量值：Y-可升级，N-不可升级，默认值：Y)
	 * 表字段 : plugin_version.plugin_status
	 * </pre>
	 */
	private String pluginStatus;

	/**
	 * <pre>
	 * 插件存储下载地址
	 * 表字段 : plugin_version.download_url
	 * </pre>
	 */
	private String downloadUrl;

	/**
	 * <pre>
	 * 插件版本描述
	 * 表字段 : plugin_version.description
	 * </pre>
	 */
	private String description;

	/**
	 * <pre>
	 * ERP厂商编号
	 * 表字段 : plugin_version.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryCode;

	/**
	 * <pre>
	 * ERP厂商名称
	 * 表字段 : plugin_version.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryName;
	/**
	 * <pre>
	 * ERP版本编号
	 * 表字段 : plugin_version.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;

	/**
	 * <pre>
	 * ERP版本编号
	 * 表字段 : plugin_version.erp_version_code
	 * </pre>
	 */
	private String erpVersionName;
	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_version.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_version.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : plugin_version.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_version.data_status
	 * </pre>
	 */

	private String dataStatus;

	/**
	 * <pre>
	 * 插件编号
	 * 表字段 : plugin_version.type
	 * </pre>
	 */
	private Integer type;

	/**
	 * <pre>
	 * 插件编号
	 * 表字段 : plugin_version.plugin_code
	 * </pre>
	 */
	private String typeDescription;
	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_version.disk_status
	 * </pre>
	 */
	private String diskStatus;
	
	public String getPluginCode() {
		return pluginCode;
	}

	public void setPluginCode(String pluginCode) {
		this.pluginCode = pluginCode;
	}

	public String getPluginName() {
		return pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public String getPluginVersion() {
		return pluginVersion;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	public Integer getPluginVersionOrder() {
		return pluginVersionOrder;
	}

	public void setPluginVersionOrder(Integer pluginVersionOrder) {
		this.pluginVersionOrder = pluginVersionOrder;
	}

	public String getPluginStatus() {
		return pluginStatus;
	}

	public void setPluginStatus(String pluginStatus) {
		this.pluginStatus = pluginStatus;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getErpFactoryCode() {
		return erpFactoryCode;
	}

	public void setErpFactoryCode(String erpFactoryCode) {
		this.erpFactoryCode = erpFactoryCode;
	}

	public String getErpVersionCode() {
		return erpVersionCode;
	}

	public void setErpVersionCode(String erpVersionCode) {
		this.erpVersionCode = erpVersionCode;
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

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
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

	public String getErpFactoryName() {
		return erpFactoryName;
	}

	public void setErpFactoryName(String erpFactoryName) {
		this.erpFactoryName = erpFactoryName;
	}

	public String getErpVersionName() {
		return erpVersionName;
	}

	public void setErpVersionName(String erpVersionName) {
		this.erpVersionName = erpVersionName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}
}
