/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseAreaTownEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : base_area_town.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 地市编号
	 * 表字段 : base_area_town.city_no
	 * </pre>
	 */
	private String cityNo;

	/**
	 * <pre>
	 * 区域编号
	 * 表字段 : base_area_town.town_no
	 * </pre>
	 */
	private String townNo;

	/**
	 * <pre>
	 * 区域名称
	 * 表字段 : base_area_town.town_name
	 * </pre>
	 */
	private String townName;

	/**
	 * <pre>
	 * 排序号
	 * 表字段 : base_area_town.orders
	 * </pre>
	 */
	private Short orders;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_area_town.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_area_town.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : base_area_town.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_area_town.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_area_town.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：base_area_town.id
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
	 * 表字段：base_area_town.id
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
	 * 获取：地市编号
	 * 表字段：base_area_town.city_no
	 * </pre>
	 * 
	 * @return 地市编号 : {@link java.lang.String}
	 */
	public String getCityNo() {
		return cityNo;
	}

	/**
	 * <pre>
	 * 设置：地市编号
	 * 表字段：base_area_town.city_no
	 * </pre>
	 * 
	 * @param cityNo
	 *              地市编号 : {@link java.lang.String}
	 */
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo == null ? null : cityNo.trim();
	}

	/**
	 * <pre>
	 * 获取：区域编号
	 * 表字段：base_area_town.town_no
	 * </pre>
	 * 
	 * @return 区域编号 : {@link java.lang.String}
	 */
	public String getTownNo() {
		return townNo;
	}

	/**
	 * <pre>
	 * 设置：区域编号
	 * 表字段：base_area_town.town_no
	 * </pre>
	 * 
	 * @param townNo
	 *              区域编号 : {@link java.lang.String}
	 */
	public void setTownNo(String townNo) {
		this.townNo = townNo == null ? null : townNo.trim();
	}

	/**
	 * <pre>
	 * 获取：区域名称
	 * 表字段：base_area_town.town_name
	 * </pre>
	 * 
	 * @return 区域名称 : {@link java.lang.String}
	 */
	public String getTownName() {
		return townName;
	}

	/**
	 * <pre>
	 * 设置：区域名称
	 * 表字段：base_area_town.town_name
	 * </pre>
	 * 
	 * @param townName
	 *              区域名称 : {@link java.lang.String}
	 */
	public void setTownName(String townName) {
		this.townName = townName == null ? null : townName.trim();
	}

	/**
	 * <pre>
	 * 获取：排序号
	 * 表字段：base_area_town.orders
	 * </pre>
	 * 
	 * @return 排序号 : {@link java.lang.Short}
	 */
	public Short getOrders() {
		return orders;
	}

	/**
	 * <pre>
	 * 设置：排序号
	 * 表字段：base_area_town.orders
	 * </pre>
	 * 
	 * @param orders
	 *              排序号 : {@link java.lang.Short}
	 */
	public void setOrders(Short orders) {
		this.orders = orders;
	}

	/**
	 * <pre>
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：base_area_town.version
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
	 * 表字段：base_area_town.version
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
	 * 表字段：base_area_town.create_time
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
	 * 表字段：base_area_town.create_time
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
	 * 表字段：base_area_town.update_time
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
	 * 表字段：base_area_town.update_time
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
	 * 表字段：base_area_town.data_status
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
	 * 表字段：base_area_town.data_status
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
	 * 表字段：base_area_town.disk_status
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
	 * 表字段：base_area_town.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}