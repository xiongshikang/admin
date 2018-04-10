/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class PluginUpgradeEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : plugin_upgrade.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 插件授权身份号
	 * 表字段 : plugin_upgrade.plugin_idcard
	 * </pre>
	 */
	private String pluginIdcard;

	/**
	 * <pre>
	 * 插件编号
	 * 表字段 : plugin_upgrade.plugin_code
	 * </pre>
	 */
	private String pluginCode;

	/**
	 * <pre>
	 * 插件是否当前版本(常量值：Y-当前版本，N-过期版本)
	 * 表字段 : plugin_upgrade.plugin_current_status
	 * </pre>
	 */
	private String pluginCurrentStatus;

	/**
	 * <pre>
	 * 插件是否升级(常量值：Y-已升级，N-未升级，O-升级中)
	 * 表字段 : plugin_upgrade.plugin_upgrade_status
	 * </pre>
	 */
	private String pluginUpgradeStatus;

	/**
	 * <pre>
	 * 升级开始日期
	 * 表字段 : plugin_upgrade.upgrade_stime
	 * </pre>
	 */
	private Date upgradeStime;

	/**
	 * <pre>
	 * 升级完成日期
	 * 表字段 : plugin_upgrade.upgrade_etime
	 * </pre>
	 */
	private Date upgradeEtime;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_upgrade.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_upgrade.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * ERP厂商编号
	 * 表字段 : plugin_upgrade.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryCode;

	/**
	 * <pre>
	 * ERP版本编号
	 * 表字段 : plugin_upgrade.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_upgrade.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_upgrade.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : plugin_upgrade.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态 (常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_upgrade.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_upgrade.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：plugin_upgrade.id
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
	 * 表字段：plugin_upgrade.id
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
	 * 获取：插件授权身份号
	 * 表字段：plugin_upgrade.plugin_idcard
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
	 * 表字段：plugin_upgrade.plugin_idcard
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
	 * 获取：插件编号
	 * 表字段：plugin_upgrade.plugin_code
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
	 * 表字段：plugin_upgrade.plugin_code
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
	 * 获取：插件是否当前版本(常量值：Y-当前版本，N-过期版本)
	 * 表字段：plugin_upgrade.plugin_current_status
	 * </pre>
	 * 
	 * @return 插件是否当前版本(常量值：Y-当前版本，N-过期版本) : {@link java.lang.String}
	 */
	public String getPluginCurrentStatus() {
		return pluginCurrentStatus;
	}

	/**
	 * <pre>
	 * 设置：插件是否当前版本(常量值：Y-当前版本，N-过期版本)
	 * 表字段：plugin_upgrade.plugin_current_status
	 * </pre>
	 * 
	 * @param pluginCurrentStatus
	 *              插件是否当前版本(常量值：Y-当前版本，N-过期版本) : {@link java.lang.String}
	 */
	public void setPluginCurrentStatus(String pluginCurrentStatus) {
		this.pluginCurrentStatus = pluginCurrentStatus == null ? null : pluginCurrentStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：插件是否升级(常量值：Y-已升级，N-未升级，O-升级中)
	 * 表字段：plugin_upgrade.plugin_upgrade_status
	 * </pre>
	 * 
	 * @return 插件是否升级(常量值：Y-已升级，N-未升级，O-升级中) : {@link java.lang.String}
	 */
	public String getPluginUpgradeStatus() {
		return pluginUpgradeStatus;
	}

	/**
	 * <pre>
	 * 设置：插件是否升级(常量值：Y-已升级，N-未升级，O-升级中)
	 * 表字段：plugin_upgrade.plugin_upgrade_status
	 * </pre>
	 * 
	 * @param pluginUpgradeStatus
	 *              插件是否升级(常量值：Y-已升级，N-未升级，O-升级中) : {@link java.lang.String}
	 */
	public void setPluginUpgradeStatus(String pluginUpgradeStatus) {
		this.pluginUpgradeStatus = pluginUpgradeStatus == null ? null : pluginUpgradeStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：升级开始日期
	 * 表字段：plugin_upgrade.upgrade_stime
	 * </pre>
	 * 
	 * @return 升级开始日期 : {@link java.util.Date}
	 */
	public Date getUpgradeStime() {
		return upgradeStime;
	}

	/**
	 * <pre>
	 * 设置：升级开始日期
	 * 表字段：plugin_upgrade.upgrade_stime
	 * </pre>
	 * 
	 * @param upgradeStime
	 *              升级开始日期 : {@link java.util.Date}
	 */
	public void setUpgradeStime(Date upgradeStime) {
		this.upgradeStime = upgradeStime;
	}

	/**
	 * <pre>
	 * 获取：升级完成日期
	 * 表字段：plugin_upgrade.upgrade_etime
	 * </pre>
	 * 
	 * @return 升级完成日期 : {@link java.util.Date}
	 */
	public Date getUpgradeEtime() {
		return upgradeEtime;
	}

	/**
	 * <pre>
	 * 设置：升级完成日期
	 * 表字段：plugin_upgrade.upgrade_etime
	 * </pre>
	 * 
	 * @param upgradeEtime
	 *              升级完成日期 : {@link java.util.Date}
	 */
	public void setUpgradeEtime(Date upgradeEtime) {
		this.upgradeEtime = upgradeEtime;
	}

	/**
	 * <pre>
	 * 获取：门店编号
	 * 表字段：plugin_upgrade.shop_code
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
	 * 表字段：plugin_upgrade.shop_code
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
	 * 表字段：plugin_upgrade.company_code
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
	 * 表字段：plugin_upgrade.company_code
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
	 * 获取：ERP厂商编号
	 * 表字段：plugin_upgrade.erp_factory_code
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
	 * 表字段：plugin_upgrade.erp_factory_code
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
	 * 表字段：plugin_upgrade.erp_version_code
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
	 * 表字段：plugin_upgrade.erp_version_code
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
	 * 表字段：plugin_upgrade.create_time
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
	 * 表字段：plugin_upgrade.create_time
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
	 * 表字段：plugin_upgrade.update_time
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
	 * 表字段：plugin_upgrade.update_time
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
	 * 表字段：plugin_upgrade.version
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
	 * 表字段：plugin_upgrade.version
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
	 * 获取：逻辑状态 (常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：plugin_upgrade.data_status
	 * </pre>
	 * 
	 * @return 逻辑状态 (常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String}
	 */
	public String getDataStatus() {
		return dataStatus;
	}

	/**
	 * <pre>
	 * 设置：逻辑状态 (常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：plugin_upgrade.data_status
	 * </pre>
	 * 
	 * @param dataStatus
	 *              逻辑状态 (常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus == null ? null : dataStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段：plugin_upgrade.disk_status
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
	 * 表字段：plugin_upgrade.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}