/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class PluginMonitorDataEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : plugin_monitor_data.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 监控数据表名
	 * 表字段 : plugin_monitor_data.monitor_table
	 * </pre>
	 */
	private String monitorTable;

	/**
	 * <pre>
	 * 监控统计日期(每天统计门店昨天的日期（t+1）)
	 * 表字段 : plugin_monitor_data.monitor_time
	 * </pre>
	 */
	private Date monitorTime;

	/**
	 * <pre>
	 * 插件上传数据总量(默认值：0，插件昨天上传数据总量)
	 * 表字段 : plugin_monitor_data.plugin_count
	 * </pre>
	 */
	private Long pluginCount;

	/**
	 * <pre>
	 * 数据平台接受数据总量(默认值：0，数据平台昨天接受数据总量)
	 * 表字段 : plugin_monitor_data.platform_count
	 * </pre>
	 */
	private Long platformCount;

	/**
	 * <pre>
	 * 插件授权身份号
	 * 表字段 : plugin_monitor_data.plugin_idcard
	 * </pre>
	 */
	private String pluginIdcard;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_monitor_data.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_monitor_data.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_monitor_data.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_monitor_data.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : plugin_monitor_data.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_monitor_data.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_monitor_data.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：plugin_monitor_data.id
	 * </pre>
	 * 
	 * @return 主键 : {@link java.lang.Long}
	 */
	public Long getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：主键
	 * 表字段：plugin_monitor_data.id
	 * </pre>
	 * 
	 * @param id
	 *              主键 : {@link java.lang.Long}
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：监控数据表名
	 * 表字段：plugin_monitor_data.monitor_table
	 * </pre>
	 * 
	 * @return 监控数据表名 : {@link java.lang.String}
	 */
	public String getMonitorTable() {
		return monitorTable;
	}

	/**
	 * <pre>
	 * 设置：监控数据表名
	 * 表字段：plugin_monitor_data.monitor_table
	 * </pre>
	 * 
	 * @param monitorTable
	 *              监控数据表名 : {@link java.lang.String}
	 */
	public void setMonitorTable(String monitorTable) {
		this.monitorTable = monitorTable == null ? null : monitorTable.trim();
	}

	/**
	 * <pre>
	 * 获取：监控统计日期(每天统计门店昨天的日期（t+1）)
	 * 表字段：plugin_monitor_data.monitor_time
	 * </pre>
	 * 
	 * @return 监控统计日期(每天统计门店昨天的日期（t+1）) : {@link java.util.Date}
	 */
	public Date getMonitorTime() {
		return monitorTime;
	}

	/**
	 * <pre>
	 * 设置：监控统计日期(每天统计门店昨天的日期（t+1）)
	 * 表字段：plugin_monitor_data.monitor_time
	 * </pre>
	 * 
	 * @param monitorTime
	 *              监控统计日期(每天统计门店昨天的日期（t+1）) : {@link java.util.Date}
	 */
	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	/**
	 * <pre>
	 * 获取：插件上传数据总量(默认值：0，插件昨天上传数据总量)
	 * 表字段：plugin_monitor_data.plugin_count
	 * </pre>
	 * 
	 * @return 插件上传数据总量(默认值：0，插件昨天上传数据总量) : {@link java.lang.Long}
	 */
	public Long getPluginCount() {
		return pluginCount;
	}

	/**
	 * <pre>
	 * 设置：插件上传数据总量(默认值：0，插件昨天上传数据总量)
	 * 表字段：plugin_monitor_data.plugin_count
	 * </pre>
	 * 
	 * @param pluginCount
	 *              插件上传数据总量(默认值：0，插件昨天上传数据总量) : {@link java.lang.Long}
	 */
	public void setPluginCount(Long pluginCount) {
		this.pluginCount = pluginCount;
	}

	/**
	 * <pre>
	 * 获取：数据平台接受数据总量(默认值：0，数据平台昨天接受数据总量)
	 * 表字段：plugin_monitor_data.platform_count
	 * </pre>
	 * 
	 * @return 数据平台接受数据总量(默认值：0，数据平台昨天接受数据总量) : {@link java.lang.Long}
	 */
	public Long getPlatformCount() {
		return platformCount;
	}

	/**
	 * <pre>
	 * 设置：数据平台接受数据总量(默认值：0，数据平台昨天接受数据总量)
	 * 表字段：plugin_monitor_data.platform_count
	 * </pre>
	 * 
	 * @param platformCount
	 *              数据平台接受数据总量(默认值：0，数据平台昨天接受数据总量) : {@link java.lang.Long}
	 */
	public void setPlatformCount(Long platformCount) {
		this.platformCount = platformCount;
	}

	/**
	 * <pre>
	 * 获取：插件授权身份号
	 * 表字段：plugin_monitor_data.plugin_idcard
	 * </pre>
	 * 
	 * @return 插件授权身份号 : {@link java.lang.String}
	 */
	public String getPluginIdcard() {
		return pluginIdcard;
	}

	/**
	 * <pre>
	 * 设置：插件授权身份号
	 * 表字段：plugin_monitor_data.plugin_idcard
	 * </pre>
	 * 
	 * @param pluginIdcard
	 *              插件授权身份号 : {@link java.lang.String}
	 */
	public void setPluginIdcard(String pluginIdcard) {
		this.pluginIdcard = pluginIdcard == null ? null : pluginIdcard.trim();
	}

	/**
	 * <pre>
	 * 获取：门店编号
	 * 表字段：plugin_monitor_data.shop_code
	 * </pre>
	 * 
	 * @return 门店编号 : {@link java.lang.String}
	 */
	public String getShopCode() {
		return shopCode;
	}

	/**
	 * <pre>
	 * 设置：门店编号
	 * 表字段：plugin_monitor_data.shop_code
	 * </pre>
	 * 
	 * @param shopCode
	 *              门店编号 : {@link java.lang.String}
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode == null ? null : shopCode.trim();
	}

	/**
	 * <pre>
	 * 获取：企业编号
	 * 表字段：plugin_monitor_data.company_code
	 * </pre>
	 * 
	 * @return 企业编号 : {@link java.lang.String}
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * <pre>
	 * 设置：企业编号
	 * 表字段：plugin_monitor_data.company_code
	 * </pre>
	 * 
	 * @param companyCode
	 *              企业编号 : {@link java.lang.String}
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode == null ? null : companyCode.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：plugin_monitor_data.create_time
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
	 * 表字段：plugin_monitor_data.create_time
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
	 * 表字段：plugin_monitor_data.update_time
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
	 * 表字段：plugin_monitor_data.update_time
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
	 * 表字段：plugin_monitor_data.version
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
	 * 表字段：plugin_monitor_data.version
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
	 * 表字段：plugin_monitor_data.data_status
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
	 * 表字段：plugin_monitor_data.data_status
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
	 * 表字段：plugin_monitor_data.disk_status
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
	 * 表字段：plugin_monitor_data.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}