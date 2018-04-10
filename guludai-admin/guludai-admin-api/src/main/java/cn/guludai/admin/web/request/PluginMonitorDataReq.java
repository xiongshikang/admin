/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.util.Date;

/**
 * 
 * @ClassName: PluginMonitorDataReq 
 * @Description: 插件数据监控详情接参类
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:28:45
 */
public class PluginMonitorDataReq extends BaseReq {

	/**
	 * @author: xiongshikang
	 * @date: 2017年11月20日 下午1:46:06
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * 门店编号
	 * 表字段 : plugin_monitor_data.shop_code
	 * </pre>
	 */
	private String shopName;

	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_monitor_data.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_monitor_data.company_code
	 * </pre>
	 */
	private String companyName;
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

	public String getMonitorTable() {
		return monitorTable;
	}

	public void setMonitorTable(String monitorTable) {
		this.monitorTable = monitorTable;
	}

	public Date getMonitorTime() {
		return monitorTime;
	}

	public void setMonitorTime(Date monitorTime) {
		this.monitorTime = monitorTime;
	}

	public Long getPluginCount() {
		return pluginCount;
	}

	public void setPluginCount(Long pluginCount) {
		this.pluginCount = pluginCount;
	}

	public Long getPlatformCount() {
		return platformCount;
	}

	public void setPlatformCount(Long platformCount) {
		this.platformCount = platformCount;
	}

	public String getPluginIdcard() {
		return pluginIdcard;
	}

	public void setPluginIdcard(String pluginIdcard) {
		this.pluginIdcard = pluginIdcard;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
