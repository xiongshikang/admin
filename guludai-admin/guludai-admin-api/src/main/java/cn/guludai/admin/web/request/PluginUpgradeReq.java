/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.util.Date;

/**
 * 
 * @ClassName: PluginUpgradeReq 
 * @Description: 插件安装及升级记录接参类
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:25:59
 */
public class PluginUpgradeReq extends BaseReq {
	
	/**
	 * @author: xiongshikang
	 * @date: 2017年11月20日 下午1:43:54
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;

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

	public String getPluginIdcard() {
		return pluginIdcard;
	}

	public void setPluginIdcard(String pluginIdcard) {
		this.pluginIdcard = pluginIdcard;
	}

	public String getPluginCode() {
		return pluginCode;
	}

	public void setPluginCode(String pluginCode) {
		this.pluginCode = pluginCode;
	}

	public String getPluginCurrentStatus() {
		return pluginCurrentStatus;
	}

	public void setPluginCurrentStatus(String pluginCurrentStatus) {
		this.pluginCurrentStatus = pluginCurrentStatus;
	}

	public String getPluginUpgradeStatus() {
		return pluginUpgradeStatus;
	}

	public void setPluginUpgradeStatus(String pluginUpgradeStatus) {
		this.pluginUpgradeStatus = pluginUpgradeStatus;
	}

	public Date getUpgradeStime() {
		return upgradeStime;
	}

	public void setUpgradeStime(Date upgradeStime) {
		this.upgradeStime = upgradeStime;
	}

	public Date getUpgradeEtime() {
		return upgradeEtime;
	}

	public void setUpgradeEtime(Date upgradeEtime) {
		this.upgradeEtime = upgradeEtime;
	}

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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
	
}
