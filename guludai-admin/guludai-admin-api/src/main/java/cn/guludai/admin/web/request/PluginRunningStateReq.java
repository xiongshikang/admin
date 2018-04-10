/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.util.Date;
/**
 * 
 * @ClassName: PluginRunningStateReq 
 * @Description: 插件运行环境状态参数类
 * @author: xiongshikang
 * @date: 2017年11月20日 下午1:44:53
 */
public class PluginRunningStateReq  extends BaseReq{
	
	/**
	 * @author: xiongshikang
	 * @date: 2017年11月20日 下午1:44:48
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号
	 */
	private String stateCode;

	/**
	 * 身份识别号
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
	 * 门店编号
	 * 表字段 : plugin_running_state.shop_code
	 * </pre>
	 */
	private String shopName;
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
	
	public String getPluginIdcard() {
		return pluginIdcard;
	}

	public void setPluginIdcard(String pluginIdcard) {
		this.pluginIdcard = pluginIdcard;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Date getReportTime() {
		return reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getReportIp() {
		return reportIp;
	}

	public void setReportIp(String reportIp) {
		this.reportIp = reportIp;
	}

	public String getReportImac() {
		return reportImac;
	}

	public void setReportImac(String reportImac) {
		this.reportImac = reportImac;
	}

	public String getReportIdisk() {
		return reportIdisk;
	}

	public void setReportIdisk(String reportIdisk) {
		this.reportIdisk = reportIdisk;
	}

	public String getReportIcpu() {
		return reportIcpu;
	}

	public void setReportIcpu(String reportIcpu) {
		this.reportIcpu = reportIcpu;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getDbIp() {
		return dbIp;
	}

	public void setDbIp(String dbIp) {
		this.dbIp = dbIp;
	}

	public String getDbPost() {
		return dbPost;
	}

	public void setDbPost(String dbPost) {
		this.dbPost = dbPost;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
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
}
