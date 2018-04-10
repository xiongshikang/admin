/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class PluginRunningLogEntity {
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
	 * 企业编号
	 * 表字段 : plugin_running_log.company_code
	 * </pre>
	 */
	private String companyCode;

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
	 * <pre>
	 * 获取：主键
	 * 表字段：plugin_running_log.id
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
	 * 表字段：plugin_running_log.id
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
	 * 获取：错误时间
	 * 表字段：plugin_running_log.error_time
	 * </pre>
	 * 
	 * @return 错误时间 : {@link java.util.Date}
	 */
	public Date getErrorTime() {
		return errorTime;
	}

	/**
	 * <pre>
	 * 设置：错误时间
	 * 表字段：plugin_running_log.error_time
	 * </pre>
	 * 
	 * @param errorTime
	 *              错误时间 : {@link java.util.Date}
	 */
	public void setErrorTime(Date errorTime) {
		this.errorTime = errorTime;
	}

	/**
	 * <pre>
	 * 获取：解决状态(常量值：Y-已解决，N-未解决)
	 * 表字段：plugin_running_log.resolve_status
	 * </pre>
	 * 
	 * @return 解决状态(常量值：Y-已解决，N-未解决) : {@link java.lang.String}
	 */
	public String getResolveStatus() {
		return resolveStatus;
	}

	/**
	 * <pre>
	 * 设置：解决状态(常量值：Y-已解决，N-未解决)
	 * 表字段：plugin_running_log.resolve_status
	 * </pre>
	 * 
	 * @param resolveStatus
	 *              解决状态(常量值：Y-已解决，N-未解决) : {@link java.lang.String}
	 */
	public void setResolveStatus(String resolveStatus) {
		this.resolveStatus = resolveStatus == null ? null : resolveStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：插件授权身份号
	 * 表字段：plugin_running_log.plugin_idcard
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
	 * 表字段：plugin_running_log.plugin_idcard
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
	 * 表字段：plugin_running_log.shop_code
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
	 * 表字段：plugin_running_log.shop_code
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
	 * 表字段：plugin_running_log.company_code
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
	 * 表字段：plugin_running_log.company_code
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
	 * 表字段：plugin_running_log.create_time
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
	 * 表字段：plugin_running_log.create_time
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
	 * 表字段：plugin_running_log.update_time
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
	 * 表字段：plugin_running_log.update_time
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
	 * 获取：版本号
	 * 表字段：plugin_running_log.version
	 * </pre>
	 * 
	 * @return 版本号 : {@link java.lang.Long}
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * <pre>
	 * 设置：版本号
	 * 表字段：plugin_running_log.version
	 * </pre>
	 * 
	 * @param version
	 *              版本号 : {@link java.lang.Long}
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * <pre>
	 * 获取：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：plugin_running_log.data_status
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
	 * 表字段：plugin_running_log.data_status
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
	 * 表字段：plugin_running_log.disk_status
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
	 * 表字段：plugin_running_log.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}