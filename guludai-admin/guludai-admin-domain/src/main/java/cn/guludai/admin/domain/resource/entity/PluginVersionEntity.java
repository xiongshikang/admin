/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class PluginVersionEntity {
	/**
	 * <pre>
	 * 默认自增主键
	 * 表字段 : plugin_version.id
	 * </pre>
	 */
	private Long id;

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
	 * ERP版本编号
	 * 表字段 : plugin_version.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;

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
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_version.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：默认自增主键
	 * 表字段：plugin_version.id
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
	 * 表字段：plugin_version.id
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
	 * 获取：插件编号
	 * 表字段：plugin_version.plugin_code
	 * </pre>
	 * 
	 * @return 插件编号 : {@link java.lang.String}
	 */
	public String getPluginCode() {
		return pluginCode;
	}

	/**
	 * <pre>
	 * 设置：插件编号
	 * 表字段：plugin_version.plugin_code
	 * </pre>
	 * 
	 * @param pluginCode
	 *              插件编号 : {@link java.lang.String}
	 */
	public void setPluginCode(String pluginCode) {
		this.pluginCode = pluginCode == null ? null : pluginCode.trim();
	}

	/**
	 * <pre>
	 * 获取：插件名称
	 * 表字段：plugin_version.plugin_name
	 * </pre>
	 * 
	 * @return 插件名称 : {@link java.lang.String}
	 */
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * <pre>
	 * 设置：插件名称
	 * 表字段：plugin_version.plugin_name
	 * </pre>
	 * 
	 * @param pluginName
	 *              插件名称 : {@link java.lang.String}
	 */
	public void setPluginName(String pluginName) {
		this.pluginName = pluginName == null ? null : pluginName.trim();
	}

	/**
	 * <pre>
	 * 获取：插件版本
	 * 表字段：plugin_version.plugin_version
	 * </pre>
	 * 
	 * @return 插件版本 : {@link java.lang.String}
	 */
	public String getPluginVersion() {
		return pluginVersion;
	}

	/**
	 * <pre>
	 * 设置：插件版本
	 * 表字段：plugin_version.plugin_version
	 * </pre>
	 * 
	 * @param pluginVersion
	 *              插件版本 : {@link java.lang.String}
	 */
	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion == null ? null : pluginVersion.trim();
	}

	/**
	 * <pre>
	 * 获取：插件版本排序号(乐观锁方式递增版本排序号，判断版本的高低)
	 * 表字段：plugin_version.plugin_version_order
	 * </pre>
	 * 
	 * @return 插件版本排序号(乐观锁方式递增版本排序号，判断版本的高低) : {@link java.lang.Integer}
	 */
	public Integer getPluginVersionOrder() {
		return pluginVersionOrder;
	}

	/**
	 * <pre>
	 * 设置：插件版本排序号(乐观锁方式递增版本排序号，判断版本的高低)
	 * 表字段：plugin_version.plugin_version_order
	 * </pre>
	 * 
	 * @param pluginVersionOrder
	 *              插件版本排序号(乐观锁方式递增版本排序号，判断版本的高低) : {@link java.lang.Integer}
	 */
	public void setPluginVersionOrder(Integer pluginVersionOrder) {
		this.pluginVersionOrder = pluginVersionOrder;
	}

	/**
	 * <pre>
	 * 获取：插件是否可升级(常量值：Y-可升级，N-不可升级，默认值：Y)
	 * 表字段：plugin_version.plugin_status
	 * </pre>
	 * 
	 * @return 插件是否可升级(常量值：Y-可升级，N-不可升级，默认值：Y) : {@link java.lang.String}
	 */
	public String getPluginStatus() {
		return pluginStatus;
	}

	/**
	 * <pre>
	 * 设置：插件是否可升级(常量值：Y-可升级，N-不可升级，默认值：Y)
	 * 表字段：plugin_version.plugin_status
	 * </pre>
	 * 
	 * @param pluginStatus
	 *              插件是否可升级(常量值：Y-可升级，N-不可升级，默认值：Y) : {@link java.lang.String}
	 */
	public void setPluginStatus(String pluginStatus) {
		this.pluginStatus = pluginStatus == null ? null : pluginStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：插件存储下载地址
	 * 表字段：plugin_version.download_url
	 * </pre>
	 * 
	 * @return 插件存储下载地址 : {@link java.lang.String}
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * <pre>
	 * 设置：插件存储下载地址
	 * 表字段：plugin_version.download_url
	 * </pre>
	 * 
	 * @param downloadUrl
	 *              插件存储下载地址 : {@link java.lang.String}
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
	}

	/**
	 * <pre>
	 * 获取：插件版本描述
	 * 表字段：plugin_version.description
	 * </pre>
	 * 
	 * @return 插件版本描述 : {@link java.lang.String}
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <pre>
	 * 设置：插件版本描述
	 * 表字段：plugin_version.description
	 * </pre>
	 * 
	 * @param description
	 *              插件版本描述 : {@link java.lang.String}
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * <pre>
	 * 获取：ERP厂商编号
	 * 表字段：plugin_version.erp_factory_code
	 * </pre>
	 * 
	 * @return ERP厂商编号 : {@link java.lang.String}
	 */
	public String getErpFactoryCode() {
		return erpFactoryCode;
	}

	/**
	 * <pre>
	 * 设置：ERP厂商编号
	 * 表字段：plugin_version.erp_factory_code
	 * </pre>
	 * 
	 * @param erpFactoryCode
	 *              ERP厂商编号 : {@link java.lang.String}
	 */
	public void setErpFactoryCode(String erpFactoryCode) {
		this.erpFactoryCode = erpFactoryCode == null ? null : erpFactoryCode.trim();
	}

	/**
	 * <pre>
	 * 获取：ERP版本编号
	 * 表字段：plugin_version.erp_version_code
	 * </pre>
	 * 
	 * @return ERP版本编号 : {@link java.lang.String}
	 */
	public String getErpVersionCode() {
		return erpVersionCode;
	}

	/**
	 * <pre>
	 * 设置：ERP版本编号
	 * 表字段：plugin_version.erp_version_code
	 * </pre>
	 * 
	 * @param erpVersionCode
	 *              ERP版本编号 : {@link java.lang.String}
	 */
	public void setErpVersionCode(String erpVersionCode) {
		this.erpVersionCode = erpVersionCode == null ? null : erpVersionCode.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：plugin_version.create_time
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
	 * 表字段：plugin_version.create_time
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
	 * 表字段：plugin_version.update_time
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
	 * 表字段：plugin_version.update_time
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
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：plugin_version.version
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
	 * 表字段：plugin_version.version
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
	 * 获取：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：plugin_version.data_status
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
	 * 表字段：plugin_version.data_status
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
	 * 获取：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段：plugin_version.disk_status
	 * </pre>
	 * 
	 * @return 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public String getDiskStatus() {
		return diskStatus;
	}

	/**
	 * <pre>
	 * 设置：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段：plugin_version.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}