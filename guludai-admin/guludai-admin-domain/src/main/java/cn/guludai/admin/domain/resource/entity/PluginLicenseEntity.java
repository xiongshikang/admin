/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class PluginLicenseEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : plugin_license.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 插件注册码
	 * 表字段 : plugin_license.license_code
	 * </pre>
	 */
	private String licenseCode;

	/**
	 * <pre>
	 * 插件授权身份号
	 * 表字段 : plugin_license.license_idcard
	 * </pre>
	 */
	private String licenseIdcard;

	/**
	 * <pre>
	 * 常量值：Y-可用，N-不可用，默认值：Y
	 * 表字段 : plugin_license.license_status
	 * </pre>
	 */
	private String licenseStatus;

	/**
	 * <pre>
	 * 失效时间
	 * 表字段 : plugin_license.expire_time
	 * </pre>
	 */
	private Date expireTime;

	/**
	 * <pre>
	 * 使用次数，最多使用1次，注意乐观控制并发
	 * 表字段 : plugin_license.used_count
	 * </pre>
	 */
	private Integer usedCount;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_license.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_license.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * ERP厂商编号
	 * 表字段 : plugin_license.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryCode;

	/**
	 * <pre>
	 * ERP版本编号
	 * 表字段 : plugin_license.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_license.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_license.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : plugin_license.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_license.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_license.disk_status
	 * </pre>
	 */
	private String diskStatus;
	
	/**
	 * 客户端插件是否允许上传及接受数据，常量值：Y-可以接受数据，N-拒绝接受数据，默认值：Y
	 */
	private String licenseUpload;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：plugin_license.id
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
	 * 表字段：plugin_license.id
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
	 * 获取：插件注册码
	 * 表字段：plugin_license.license_code
	 * </pre>
	 * 
	 * @return 插件注册码 : {@link java.lang.String}
	 */
	public String getLicenseCode() {
		return licenseCode;
	}

	/**
	 * <pre>
	 * 设置：插件注册码
	 * 表字段：plugin_license.license_code
	 * </pre>
	 * 
	 * @param licenseCode
	 *              插件注册码 : {@link java.lang.String}
	 */
	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode == null ? null : licenseCode.trim();
	}

	/**
	 * <pre>
	 * 获取：插件授权身份号
	 * 表字段：plugin_license.license_idcard
	 * </pre>
	 * 
	 * @return 插件授权身份号 : {@link java.lang.String}
	 */
	public String getLicenseIdcard() {
		return licenseIdcard;
	}

	/**
	 * <pre>
	 * 设置：插件授权身份号
	 * 表字段：plugin_license.license_idcard
	 * </pre>
	 * 
	 * @param licenseIdcard
	 *              插件授权身份号 : {@link java.lang.String}
	 */
	public void setLicenseIdcard(String licenseIdcard) {
		this.licenseIdcard = licenseIdcard == null ? null : licenseIdcard.trim();
	}

	/**
	 * <pre>
	 * 获取：常量值：Y-可用，N-不可用，默认值：Y
	 * 表字段：plugin_license.license_status
	 * </pre>
	 * 
	 * @return 常量值：Y-可用，N-不可用，默认值：Y : {@link java.lang.String}
	 */
	public String getLicenseStatus() {
		return licenseStatus;
	}

	/**
	 * <pre>
	 * 设置：常量值：Y-可用，N-不可用，默认值：Y
	 * 表字段：plugin_license.license_status
	 * </pre>
	 * 
	 * @param licenseStatus
	 *              常量值：Y-可用，N-不可用，默认值：Y : {@link java.lang.String}
	 */
	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus == null ? null : licenseStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：失效时间
	 * 表字段：plugin_license.expire_time
	 * </pre>
	 * 
	 * @return 失效时间 : {@link java.util.Date}
	 */
	public Date getExpireTime() {
		return expireTime;
	}

	/**
	 * <pre>
	 * 设置：失效时间
	 * 表字段：plugin_license.expire_time
	 * </pre>
	 * 
	 * @param expireTime
	 *              失效时间 : {@link java.util.Date}
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * <pre>
	 * 获取：使用次数，最多使用1次，注意乐观控制并发
	 * 表字段：plugin_license.used_count
	 * </pre>
	 * 
	 * @return 使用次数，最多使用1次，注意乐观控制并发 : {@link java.lang.Integer}
	 */
	public Integer getUsedCount() {
		return usedCount;
	}

	/**
	 * <pre>
	 * 设置：使用次数，最多使用1次，注意乐观控制并发
	 * 表字段：plugin_license.used_count
	 * </pre>
	 * 
	 * @param usedCount
	 *              使用次数，最多使用1次，注意乐观控制并发 : {@link java.lang.Integer}
	 */
	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}

	/**
	 * <pre>
	 * 获取：门店编号
	 * 表字段：plugin_license.shop_code
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
	 * 表字段：plugin_license.shop_code
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
	 * 表字段：plugin_license.company_code
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
	 * 表字段：plugin_license.company_code
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
	 * 表字段：plugin_license.erp_factory_code
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
	 * 表字段：plugin_license.erp_factory_code
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
	 * 表字段：plugin_license.erp_version_code
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
	 * 表字段：plugin_license.erp_version_code
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
	 * 表字段：plugin_license.create_time
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
	 * 表字段：plugin_license.create_time
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
	 * 表字段：plugin_license.update_time
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
	 * 表字段：plugin_license.update_time
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
	 * 表字段：plugin_license.version
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
	 * 表字段：plugin_license.version
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
	 * 表字段：plugin_license.data_status
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
	 * 表字段：plugin_license.data_status
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
	 * 表字段：plugin_license.disk_status
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
	 * 表字段：plugin_license.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}

	public String getLicenseUpload() {
		return licenseUpload;
	}

	public void setLicenseUpload(String licenseUpload) {
		this.licenseUpload = licenseUpload;
	}
	
}