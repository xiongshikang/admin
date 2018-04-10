/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseShopErpEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : base_shop_erp.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 公司编号
	 * 表字段 : base_shop_erp.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : base_shop_erp.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * ERP厂商编号
	 * 表字段 : base_shop_erp.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryCode;

	/**
	 * <pre>
	 * ERP版本编号
	 * 表字段 : base_shop_erp.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;

	/**
	 * <pre>
	 * 数据签名盐值
	 * 表字段 : base_shop_erp.data_salt
	 * </pre>
	 */
	private String dataSalt;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_shop_erp.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 更新时间
	 * 表字段 : base_shop_erp.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_shop_erp.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_shop_erp.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_shop_erp.disk_status
	 * </pre>
	 */
	private String diskStatus;
	
	/**
	 * 门店安装的插件授权身份号（引用：glud_plugin.plugin_license.license_idcard）
	 */
	private String pluginLicenseIdcard;
	

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：base_shop_erp.id
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
	 * 表字段：base_shop_erp.id
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
	 * 获取：公司编号
	 * 表字段：base_shop_erp.company_code
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
	 * 表字段：base_shop_erp.company_code
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
	 * 获取：门店编号
	 * 表字段：base_shop_erp.shop_code
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
	 * 表字段：base_shop_erp.shop_code
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
	 * 获取：ERP厂商编号
	 * 表字段：base_shop_erp.erp_factory_code
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
	 * 表字段：base_shop_erp.erp_factory_code
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
	 * 表字段：base_shop_erp.erp_version_code
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
	 * 表字段：base_shop_erp.erp_version_code
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
	 * 获取：数据签名盐值
	 * 表字段：base_shop_erp.data_salt
	 * </pre>
	 * 
	 * @return 数据签名盐值 : {@link java.lang.String}
	 */
	public String getDataSalt() {
		return dataSalt;
	}

	/**
	 * <pre>
	 * 设置：数据签名盐值
	 * 表字段：base_shop_erp.data_salt
	 * </pre>
	 * 
	 * @param dataSalt
	 *              数据签名盐值 : {@link java.lang.String}
	 */
	public void setDataSalt(String dataSalt) {
		this.dataSalt = dataSalt == null ? null : dataSalt.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：base_shop_erp.create_time
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
	 * 表字段：base_shop_erp.create_time
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
	 * 获取：更新时间
	 * 表字段：base_shop_erp.update_time
	 * </pre>
	 * 
	 * @return 更新时间 : {@link java.util.Date}
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * <pre>
	 * 设置：更新时间
	 * 表字段：base_shop_erp.update_time
	 * </pre>
	 * 
	 * @param updateTime
	 *              更新时间 : {@link java.util.Date}
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * <pre>
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：base_shop_erp.version
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
	 * 表字段：base_shop_erp.version
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
	 * 表字段：base_shop_erp.data_status
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
	 * 表字段：base_shop_erp.data_status
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
	 * 表字段：base_shop_erp.disk_status
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
	 * 表字段：base_shop_erp.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}

	public String getPluginLicenseIdcard() {
		return pluginLicenseIdcard;
	}

	public void setPluginLicenseIdcard(String pluginLicenseIdcard) {
		this.pluginLicenseIdcard = pluginLicenseIdcard;
	}
 
}