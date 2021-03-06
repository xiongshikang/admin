/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseShopCompanyEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : base_shop_company.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : base_shop_company.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 企业名
	 * 表字段 : base_shop_company.company_name
	 * </pre>
	 */
	private String companyName;

	/**
	 * <pre>
	 * 企业地址
	 * 表字段 : base_shop_company.address
	 * </pre>
	 */
	private String address;

	/**
	 * <pre>
	 * 联系电话
	 * 表字段 : base_shop_company.phone
	 * </pre>
	 */
	private String phone;

	/**
	 * <pre>
	 * 企业邮箱
	 * 表字段 : base_shop_company.mail
	 * </pre>
	 */
	private String mail;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_shop_company.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 更新时间
	 * 表字段 : base_shop_company.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_shop_company.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_shop_company.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_shop_company.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：base_shop_company.id
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
	 * 表字段：base_shop_company.id
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
	 * 获取：企业编号
	 * 表字段：base_shop_company.company_code
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
	 * 表字段：base_shop_company.company_code
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
	 * 获取：企业名
	 * 表字段：base_shop_company.company_name
	 * </pre>
	 * 
	 * @return 企业名 : {@link java.lang.String}
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <pre>
	 * 设置：企业名
	 * 表字段：base_shop_company.company_name
	 * </pre>
	 * 
	 * @param companyName
	 *              企业名 : {@link java.lang.String}
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName == null ? null : companyName.trim();
	}

	/**
	 * <pre>
	 * 获取：企业地址
	 * 表字段：base_shop_company.address
	 * </pre>
	 * 
	 * @return 企业地址 : {@link java.lang.String}
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <pre>
	 * 设置：企业地址
	 * 表字段：base_shop_company.address
	 * </pre>
	 * 
	 * @param address
	 *              企业地址 : {@link java.lang.String}
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	/**
	 * <pre>
	 * 获取：联系电话
	 * 表字段：base_shop_company.phone
	 * </pre>
	 * 
	 * @return 联系电话 : {@link java.lang.String}
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <pre>
	 * 设置：联系电话
	 * 表字段：base_shop_company.phone
	 * </pre>
	 * 
	 * @param phone
	 *              联系电话 : {@link java.lang.String}
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * <pre>
	 * 获取：企业邮箱
	 * 表字段：base_shop_company.mail
	 * </pre>
	 * 
	 * @return 企业邮箱 : {@link java.lang.String}
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <pre>
	 * 设置：企业邮箱
	 * 表字段：base_shop_company.mail
	 * </pre>
	 * 
	 * @param mail
	 *              企业邮箱 : {@link java.lang.String}
	 */
	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：base_shop_company.create_time
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
	 * 表字段：base_shop_company.create_time
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
	 * 表字段：base_shop_company.update_time
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
	 * 表字段：base_shop_company.update_time
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
	 * 表字段：base_shop_company.version
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
	 * 表字段：base_shop_company.version
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
	 * 表字段：base_shop_company.data_status
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
	 * 表字段：base_shop_company.data_status
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
	 * 表字段：base_shop_company.disk_status
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
	 * 表字段：base_shop_company.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}