/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class PluginRunningStateEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : plugin_running_state.id
	 * </pre>
	 */
	private Long id;
	
	/**
	 * 编号
	 */
	private String stateCode;
	
	/**
	 * 插件授权身份号（引用：glud_plugin.plugin_license.license_idcard）
	 */
	private String pluginIdcard;

	/**
	 * <pre>
	 * 上报时间
	 * 表字段 : plugin_running_state.report_time
	 * </pre>
	 */
	private Date reportTime;

	/**
	 * <pre>
	 * 上报IP地址
	 * 表字段 : plugin_running_state.report_ip
	 * </pre>
	 */
	private String reportIp;

	/**
	 * <pre>
	 * 上报机器mac
	 * 表字段 : plugin_running_state.report_imac
	 * </pre>
	 */
	private String reportImac;

	/**
	 * <pre>
	 * 上报硬盘信息
	 * 表字段 : plugin_running_state.report_idisk
	 * </pre>
	 */
	private String reportIdisk;

	/**
	 * <pre>
	 * 上报cpu型号
	 * 表字段 : plugin_running_state.report_icpu
	 * </pre>
	 */
	private String reportIcpu;

	/**
	 * <pre>
	 * 数据库类型
	 * 表字段 : plugin_running_state.db_type
	 * </pre>
	 */
	private String dbType;

	/**
	 * <pre>
	 * 数据库ip
	 * 表字段 : plugin_running_state.db_ip
	 * </pre>
	 */
	private String dbIp;

	/**
	 * <pre>
	 * 数据库端口号
	 * 表字段 : plugin_running_state.db_post
	 * </pre>
	 */
	private String dbPost;

	/**
	 * <pre>
	 * 数据库名
	 * 表字段 : plugin_running_state.db_name
	 * </pre>
	 */
	private String dbName;

	/**
	 * <pre>
	 * 数据库用户名（加密存储）
	 * 表字段 : plugin_running_state.db_username
	 * </pre>
	 */
	private String dbUsername;

	/**
	 * <pre>
	 * 数据库密码（加密存储）
	 * 表字段 : plugin_running_state.db_password
	 * </pre>
	 */
	private String dbPassword;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_running_state.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * 公司编号
	 * 表字段 : plugin_running_state.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_running_state.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_running_state.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : plugin_running_state.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态 (常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_running_state.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_running_state.disk_status
	 * </pre>
	 */
	private String diskStatus;
	
	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：plugin_running_state.id
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
	 * 表字段：plugin_running_state.id
	 * </pre>
	 * 
	 * @param id
	 *              主键 : {@link java.lang.Long}
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPluginIdcard() {
		return pluginIdcard;
	}

	public void setPluginIdcard(String pluginIdcard) {
		this.pluginIdcard = pluginIdcard;
	}

	/**
	 * <pre>
	 * 获取：上报时间
	 * 表字段：plugin_running_state.report_time
	 * </pre>
	 * 
	 * @return 上报时间 : {@link java.util.Date}
	 */
	public Date getReportTime() {
		return reportTime;
	}

	/**
	 * <pre>
	 * 设置：上报时间
	 * 表字段：plugin_running_state.report_time
	 * </pre>
	 * 
	 * @param reportTime
	 *              上报时间 : {@link java.util.Date}
	 */
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	/**
	 * <pre>
	 * 获取：上报IP地址
	 * 表字段：plugin_running_state.report_ip
	 * </pre>
	 * 
	 * @return 上报IP地址 : {@link java.lang.String}
	 */
	public String getReportIp() {
		return reportIp;
	}

	/**
	 * <pre>
	 * 设置：上报IP地址
	 * 表字段：plugin_running_state.report_ip
	 * </pre>
	 * 
	 * @param reportIp
	 *              上报IP地址 : {@link java.lang.String}
	 */
	public void setReportIp(String reportIp) {
		this.reportIp = reportIp == null ? null : reportIp.trim();
	}

	/**
	 * <pre>
	 * 获取：上报机器mac
	 * 表字段：plugin_running_state.report_imac
	 * </pre>
	 * 
	 * @return 上报机器mac : {@link java.lang.String}
	 */
	public String getReportImac() {
		return reportImac;
	}

	/**
	 * <pre>
	 * 设置：上报机器mac
	 * 表字段：plugin_running_state.report_imac
	 * </pre>
	 * 
	 * @param reportImac
	 *              上报机器mac : {@link java.lang.String}
	 */
	public void setReportImac(String reportImac) {
		this.reportImac = reportImac == null ? null : reportImac.trim();
	}

	/**
	 * <pre>
	 * 获取：上报硬盘信息
	 * 表字段：plugin_running_state.report_idisk
	 * </pre>
	 * 
	 * @return 上报硬盘信息 : {@link java.lang.String}
	 */
	public String getReportIdisk() {
		return reportIdisk;
	}

	/**
	 * <pre>
	 * 设置：上报硬盘信息
	 * 表字段：plugin_running_state.report_idisk
	 * </pre>
	 * 
	 * @param reportIdisk
	 *              上报硬盘信息 : {@link java.lang.String}
	 */
	public void setReportIdisk(String reportIdisk) {
		this.reportIdisk = reportIdisk == null ? null : reportIdisk.trim();
	}

	/**
	 * <pre>
	 * 获取：上报cpu型号
	 * 表字段：plugin_running_state.report_icpu
	 * </pre>
	 * 
	 * @return 上报cpu型号 : {@link java.lang.String}
	 */
	public String getReportIcpu() {
		return reportIcpu;
	}

	/**
	 * <pre>
	 * 设置：上报cpu型号
	 * 表字段：plugin_running_state.report_icpu
	 * </pre>
	 * 
	 * @param reportIcpu
	 *              上报cpu型号 : {@link java.lang.String}
	 */
	public void setReportIcpu(String reportIcpu) {
		this.reportIcpu = reportIcpu == null ? null : reportIcpu.trim();
	}

	/**
	 * <pre>
	 * 获取：数据库类型
	 * 表字段：plugin_running_state.db_type
	 * </pre>
	 * 
	 * @return 数据库类型 : {@link java.lang.String}
	 */
	public String getDbType() {
		return dbType;
	}

	/**
	 * <pre>
	 * 设置：数据库类型
	 * 表字段：plugin_running_state.db_type
	 * </pre>
	 * 
	 * @param dbType
	 *              数据库类型 : {@link java.lang.String}
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType == null ? null : dbType.trim();
	}

	/**
	 * <pre>
	 * 获取：数据库ip
	 * 表字段：plugin_running_state.db_ip
	 * </pre>
	 * 
	 * @return 数据库ip : {@link java.lang.String}
	 */
	public String getDbIp() {
		return dbIp;
	}

	/**
	 * <pre>
	 * 设置：数据库ip
	 * 表字段：plugin_running_state.db_ip
	 * </pre>
	 * 
	 * @param dbIp
	 *              数据库ip : {@link java.lang.String}
	 */
	public void setDbIp(String dbIp) {
		this.dbIp = dbIp == null ? null : dbIp.trim();
	}

	/**
	 * <pre>
	 * 获取：数据库端口号
	 * 表字段：plugin_running_state.db_post
	 * </pre>
	 * 
	 * @return 数据库端口号 : {@link java.lang.String}
	 */
	public String getDbPost() {
		return dbPost;
	}

	/**
	 * <pre>
	 * 设置：数据库端口号
	 * 表字段：plugin_running_state.db_post
	 * </pre>
	 * 
	 * @param dbPost
	 *              数据库端口号 : {@link java.lang.String}
	 */
	public void setDbPost(String dbPost) {
		this.dbPost = dbPost == null ? null : dbPost.trim();
	}

	/**
	 * <pre>
	 * 获取：数据库名
	 * 表字段：plugin_running_state.db_name
	 * </pre>
	 * 
	 * @return 数据库名 : {@link java.lang.String}
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * <pre>
	 * 设置：数据库名
	 * 表字段：plugin_running_state.db_name
	 * </pre>
	 * 
	 * @param dbName
	 *              数据库名 : {@link java.lang.String}
	 */
	public void setDbName(String dbName) {
		this.dbName = dbName == null ? null : dbName.trim();
	}

	/**
	 * <pre>
	 * 获取：数据库用户名（加密存储）
	 * 表字段：plugin_running_state.db_username
	 * </pre>
	 * 
	 * @return 数据库用户名（加密存储） : {@link java.lang.String}
	 */
	public String getDbUsername() {
		return dbUsername;
	}

	/**
	 * <pre>
	 * 设置：数据库用户名（加密存储）
	 * 表字段：plugin_running_state.db_username
	 * </pre>
	 * 
	 * @param dbUsername
	 *              数据库用户名（加密存储） : {@link java.lang.String}
	 */
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername == null ? null : dbUsername.trim();
	}

	/**
	 * <pre>
	 * 获取：数据库密码（加密存储）
	 * 表字段：plugin_running_state.db_password
	 * </pre>
	 * 
	 * @return 数据库密码（加密存储） : {@link java.lang.String}
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * <pre>
	 * 设置：数据库密码（加密存储）
	 * 表字段：plugin_running_state.db_password
	 * </pre>
	 * 
	 * @param dbPassword
	 *              数据库密码（加密存储） : {@link java.lang.String}
	 */
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword == null ? null : dbPassword.trim();
	}

	/**
	 * <pre>
	 * 获取：门店编号
	 * 表字段：plugin_running_state.shop_code
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
	 * 表字段：plugin_running_state.shop_code
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
	 * 获取：公司编号
	 * 表字段：plugin_running_state.company_code
	 * </pre>
	 * 
	 * @return 公司编号 : {@link java.lang.String}
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * <pre>
	 * 设置：公司编号
	 * 表字段：plugin_running_state.company_code
	 * </pre>
	 * 
	 * @param companyCode
	 *              公司编号 : {@link java.lang.String}
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode == null ? null : companyCode.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：plugin_running_state.create_time
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
	 * 表字段：plugin_running_state.create_time
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
	 * 表字段：plugin_running_state.update_time
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
	 * 表字段：plugin_running_state.update_time
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
	 * 表字段：plugin_running_state.version
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
	 * 表字段：plugin_running_state.version
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
	 * 表字段：plugin_running_state.data_status
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
	 * 表字段：plugin_running_state.data_status
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
	 * 表字段：plugin_running_state.disk_status
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
	 * 表字段：plugin_running_state.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}