/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseAreaBankEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : base_bank.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 银行编号
	 * 表字段 : base_bank.bank_no
	 * </pre>
	 */
	private String bankNo;

	/**
	 * <pre>
	 * 银行简称
	 * 表字段 : base_bank.bank_nick
	 * </pre>
	 */
	private String bankNick;

	/**
	 * <pre>
	 * 银行全称
	 * 表字段 : base_bank.bank_name
	 * </pre>
	 */
	private String bankName;

	/**
	 * <pre>
	 * 是否支持(常量值：Y-支持，N-不支持，默认值：Y)
	 * 表字段 : base_bank.bank_suport
	 * </pre>
	 */
	private String bankSuport;

	/**
	 * <pre>
	 * 银行图标地址
	 * 表字段 : base_bank.bank_picture
	 * </pre>
	 */
	private String bankPicture;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_bank.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_bank.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : base_bank.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_bank.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_bank.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：base_bank.id
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
	 * 表字段：base_bank.id
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
	 * 获取：银行编号
	 * 表字段：base_bank.bank_no
	 * </pre>
	 * 
	 * @return 银行编号 : {@link java.lang.String}
	 */
	public String getBankNo() {
		return bankNo;
	}

	/**
	 * <pre>
	 * 设置：银行编号
	 * 表字段：base_bank.bank_no
	 * </pre>
	 * 
	 * @param bankNo
	 *              银行编号 : {@link java.lang.String}
	 */
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo == null ? null : bankNo.trim();
	}

	/**
	 * <pre>
	 * 获取：银行简称
	 * 表字段：base_bank.bank_nick
	 * </pre>
	 * 
	 * @return 银行简称 : {@link java.lang.String}
	 */
	public String getBankNick() {
		return bankNick;
	}

	/**
	 * <pre>
	 * 设置：银行简称
	 * 表字段：base_bank.bank_nick
	 * </pre>
	 * 
	 * @param bankNick
	 *              银行简称 : {@link java.lang.String}
	 */
	public void setBankNick(String bankNick) {
		this.bankNick = bankNick == null ? null : bankNick.trim();
	}

	/**
	 * <pre>
	 * 获取：银行全称
	 * 表字段：base_bank.bank_name
	 * </pre>
	 * 
	 * @return 银行全称 : {@link java.lang.String}
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * <pre>
	 * 设置：银行全称
	 * 表字段：base_bank.bank_name
	 * </pre>
	 * 
	 * @param bankName
	 *              银行全称 : {@link java.lang.String}
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName == null ? null : bankName.trim();
	}

	/**
	 * <pre>
	 * 获取：是否支持(常量值：Y-支持，N-不支持，默认值：Y)
	 * 表字段：base_bank.bank_suport
	 * </pre>
	 * 
	 * @return 是否支持(常量值：Y-支持，N-不支持，默认值：Y) : {@link java.lang.String}
	 */
	public String getBankSuport() {
		return bankSuport;
	}

	/**
	 * <pre>
	 * 设置：是否支持(常量值：Y-支持，N-不支持，默认值：Y)
	 * 表字段：base_bank.bank_suport
	 * </pre>
	 * 
	 * @param bankSuport
	 *              是否支持(常量值：Y-支持，N-不支持，默认值：Y) : {@link java.lang.String}
	 */
	public void setBankSuport(String bankSuport) {
		this.bankSuport = bankSuport == null ? null : bankSuport.trim();
	}

	/**
	 * <pre>
	 * 获取：银行图标地址
	 * 表字段：base_bank.bank_picture
	 * </pre>
	 * 
	 * @return 银行图标地址 : {@link java.lang.String}
	 */
	public String getBankPicture() {
		return bankPicture;
	}

	/**
	 * <pre>
	 * 设置：银行图标地址
	 * 表字段：base_bank.bank_picture
	 * </pre>
	 * 
	 * @param bankPicture
	 *              银行图标地址 : {@link java.lang.String}
	 */
	public void setBankPicture(String bankPicture) {
		this.bankPicture = bankPicture == null ? null : bankPicture.trim();
	}

	/**
	 * <pre>
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：base_bank.version
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
	 * 表字段：base_bank.version
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
	 * 获取：创建时间
	 * 表字段：base_bank.create_time
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
	 * 表字段：base_bank.create_time
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
	 * 表字段：base_bank.update_time
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
	 * 表字段：base_bank.update_time
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
	 * 获取：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：base_bank.data_status
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
	 * 表字段：base_bank.data_status
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
	 * 表字段：base_bank.disk_status
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
	 * 表字段：base_bank.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}