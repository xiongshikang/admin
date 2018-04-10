/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.util.Date;

/**
 * 
 * @ClassName: PluginRunningLogReq 
 * @Description: 日志参数类
 * @author: xiongshikang
 * @date: 2017年11月20日 下午5:11:44
 */
public class PluginRunningLogReq extends BaseReq{

	/**
	 * @author: xiongshikang
	 * @date: 2017年11月20日 下午5:12:05
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * <pre>
	 * 主键
	 * 表字段 : plugin_running_log.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 错误时间
	 * 表字段 : plugin_running_log.error_time
	 * </pre>
	 */
	private Date errorTime;

	/**
	 * <pre>
	 * 解决状态(常量值：Y-已解决，N-未解决)
	 * 表字段 : plugin_running_log.resolve_status
	 * </pre>
	 */
	private String resolveStatus;

	/**
	 * <pre>
	 * 插件授权身份号
	 * 表字段 : plugin_running_log.plugin_idcard
	 * </pre>
	 */
	private String pluginIdcard;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_running_log.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_running_log.shop_code
	 * </pre>
	 */
	private String shopName;
	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_running_log.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 企业名称
	 * 表字段 : plugin_running_log.company_code
	 * </pre>
	 */
	private String companyName;
	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_running_log.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_running_log.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号
	 * 表字段 : plugin_running_log.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_running_log.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_running_log.disk_status
	 * </pre>
	 */
	private String diskStatus;
	
	/**
	 * 结束时间
	 */
	private Date endTime;
	
	/**
	 * 开始时间
	 */
	private Date startTime;
	
	/**
	 * 日志详情
	 */
	private String errorDetail;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 备注
	 */
	private String resolveRemark;
	
	public String getResolveRemark() {
		return resolveRemark;
	}

	public void setResolveRemark(String resolveRemark) {
		this.resolveRemark = resolveRemark;
	}

	public String getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(Date errorTime) {
		this.errorTime = errorTime;
	}

	public String getResolveStatus() {
		return resolveStatus;
	}

	public void setResolveStatus(String resolveStatus) {
		this.resolveStatus = resolveStatus;
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
