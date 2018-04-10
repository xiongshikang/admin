/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseAreaVersionEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : base_erp_version.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * erp版本编号
	 * 表字段 : base_erp_version.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;

	/**
	 * <pre>
	 * ERP版本号名称
	 * 表字段 : base_erp_version.erp_version_name
	 * </pre>
	 */
	private String erpVersionName;

	/**
	 * <pre>
	 * ERP版本号
	 * 表字段 : base_erp_version.erp_version
	 * </pre>
	 */
	private String erpVersion;

	/**
	 * <pre>
	 * ERP厂商编号
	 * 表字段 : base_erp_version.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryCode;

	/**
	 * <pre>
	 * ERP数据存放库名
	 * 表字段 : base_erp_version.erp_database
	 * </pre>
	 */
	private String erpDatabase;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_erp_version.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : base_erp_version.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_erp_version.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_erp_version.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_erp_version.disk_status
	 * </pre>
	 */
	private String diskStatus;
	
	/**
	 * 1=基础包，0=业务包
	 */
	private Integer type;
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：base_erp_version.id
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
	 * 表字段：base_erp_version.id
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
	 * 获取：erp版本编号
	 * 表字段：base_erp_version.erp_version_code
	 * </pre>
	 * 
	 * @return erp版本编号 : {@link java.lang.String}
	 */
	public String getErpVersionCode() {
		return erpVersionCode;
	}

	/**
	 * <pre>
	 * 设置：erp版本编号
	 * 表字段：base_erp_version.erp_version_code
	 * </pre>
	 * 
	 * @param erpVersionCode
	 *              erp版本编号 : {@link java.lang.String}
	 */
	public void setErpVersionCode(String erpVersionCode) {
		this.erpVersionCode = erpVersionCode == null ? null : erpVersionCode.trim();
	}

	/**
	 * <pre>
	 * 获取：ERP版本号名称
	 * 表字段：base_erp_version.erp_version_name
	 * </pre>
	 * 
	 * @return ERP版本号名称 : {@link java.lang.String}
	 */
	public String getErpVersionName() {
		return erpVersionName;
	}

	/**
	 * <pre>
	 * 设置：ERP版本号名称
	 * 表字段：base_erp_version.erp_version_name
	 * </pre>
	 * 
	 * @param erpVersionName
	 *              ERP版本号名称 : {@link java.lang.String}
	 */
	public void setErpVersionName(String erpVersionName) {
		this.erpVersionName = erpVersionName == null ? null : erpVersionName.trim();
	}
 
	public String getErpVersion() {
		return erpVersion;
	}

	public void setErpVersion(String erpVersion) {
		this.erpVersion = erpVersion;
	}

	/**
	 * <pre>
	 * 获取：ERP厂商编号
	 * 表字段：base_erp_version.erp_factory_code
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
	 * 表字段：base_erp_version.erp_factory_code
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
	 * 获取：ERP数据存放库名
	 * 表字段：base_erp_version.erp_database
	 * </pre>
	 * 
	 * @return ERP数据存放库名 : {@link java.lang.String}
	 */
	public String getErpDatabase() {
		return erpDatabase;
	}

	/**
	 * <pre>
	 * 设置：ERP数据存放库名
	 * 表字段：base_erp_version.erp_database
	 * </pre>
	 * 
	 * @param erpDatabase
	 *              ERP数据存放库名 : {@link java.lang.String}
	 */
	public void setErpDatabase(String erpDatabase) {
		this.erpDatabase = erpDatabase == null ? null : erpDatabase.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：base_erp_version.create_time
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
	 * 表字段：base_erp_version.create_time
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
	 * 表字段：base_erp_version.update_time
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
	 * 表字段：base_erp_version.update_time
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
	 * 表字段：base_erp_version.version
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
	 * 表字段：base_erp_version.version
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
	 * 表字段：base_erp_version.data_status
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
	 * 表字段：base_erp_version.data_status
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
	 * 表字段：base_erp_version.disk_status
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
	 * 表字段：base_erp_version.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}