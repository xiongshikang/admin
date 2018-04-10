/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseShopEntity {
	/**
	 * <pre>
	 * 主键
	 * 表字段 : base_shop.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : base_shop.shop_code
	 * </pre>
	 */
	private String shopCode;

	/**
	 * <pre>
	 * 门店名称
	 * 表字段 : base_shop.shop_name
	 * </pre>
	 */
	private String shopName;

	/**
	 * <pre>
	 * 经度
	 * 表字段 : base_shop.shop_longitude
	 * </pre>
	 */
	private BigDecimal shopLongitude;

	/**
	 * <pre>
	 * 纬度
	 * 表字段 : base_shop.shop_latitude
	 * </pre>
	 */
	private BigDecimal shopLatitude;

	/**
	 * <pre>
	 * 省份编号
	 * 表字段 : base_shop.province_no
	 * </pre>
	 */
	private String provinceNo;

	/**
	 * <pre>
	 * 城市编号
	 * 表字段 : base_shop.city_no
	 * </pre>
	 */
	private String cityNo;

	/**
	 * <pre>
	 * 地区编号
	 * 表字段 : base_shop.town_no
	 * </pre>
	 */
	private String townNo;

	/**
	 * <pre>
	 * 公司id
	 * 表字段 : base_shop.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 联系人
	 * 表字段 : base_shop.contacts
	 * </pre>
	 */
	private String contacts;

	/**
	 * <pre>
	 * 联系电话
	 * 表字段 : base_shop.phone
	 * </pre>
	 */
	private String phone;

	/**
	 * <pre>
	 * 商铺地址
	 * 表字段 : base_shop.shop_address
	 * </pre>
	 */
	private String shopAddress;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_shop.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 更新时间
	 * 表字段 : base_shop.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_shop.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_shop.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_shop.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：主键
	 * 表字段：base_shop.id
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
	 * 表字段：base_shop.id
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
	 * 获取：门店编号
	 * 表字段：base_shop.shop_code
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
	 * 表字段：base_shop.shop_code
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
	 * 获取：门店名称
	 * 表字段：base_shop.shop_name
	 * </pre>
	 * 
	 * @return 门店名称 : {@link java.lang.String}
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * <pre>
	 * 设置：门店名称
	 * 表字段：base_shop.shop_name
	 * </pre>
	 * 
	 * @param shopName
	 *              门店名称 : {@link java.lang.String}
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName == null ? null : shopName.trim();
	}

	/**
	 * <pre>
	 * 获取：经度
	 * 表字段：base_shop.shop_longitude
	 * </pre>
	 * 
	 * @return 经度 : {@link java.math.BigDecimal}
	 */
	public BigDecimal getShopLongitude() {
		return shopLongitude;
	}

	/**
	 * <pre>
	 * 设置：经度
	 * 表字段：base_shop.shop_longitude
	 * </pre>
	 * 
	 * @param shopLongitude
	 *              经度 : {@link java.math.BigDecimal}
	 */
	public void setShopLongitude(BigDecimal shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	/**
	 * <pre>
	 * 获取：纬度
	 * 表字段：base_shop.shop_latitude
	 * </pre>
	 * 
	 * @return 纬度 : {@link java.math.BigDecimal}
	 */
	public BigDecimal getShopLatitude() {
		return shopLatitude;
	}

	/**
	 * <pre>
	 * 设置：纬度
	 * 表字段：base_shop.shop_latitude
	 * </pre>
	 * 
	 * @param shopLatitude
	 *              纬度 : {@link java.math.BigDecimal}
	 */
	public void setShopLatitude(BigDecimal shopLatitude) {
		this.shopLatitude = shopLatitude;
	}

	/**
	 * <pre>
	 * 获取：省份编号
	 * 表字段：base_shop.province_no
	 * </pre>
	 * 
	 * @return 省份编号 : {@link java.lang.String}
	 */
	public String getProvinceNo() {
		return provinceNo;
	}

	/**
	 * <pre>
	 * 设置：省份编号
	 * 表字段：base_shop.province_no
	 * </pre>
	 * 
	 * @param provinceNo
	 *              省份编号 : {@link java.lang.String}
	 */
	public void setProvinceNo(String provinceNo) {
		this.provinceNo = provinceNo == null ? null : provinceNo.trim();
	}

	/**
	 * <pre>
	 * 获取：城市编号
	 * 表字段：base_shop.city_no
	 * </pre>
	 * 
	 * @return 城市编号 : {@link java.lang.String}
	 */
	public String getCityNo() {
		return cityNo;
	}

	/**
	 * <pre>
	 * 设置：城市编号
	 * 表字段：base_shop.city_no
	 * </pre>
	 * 
	 * @param cityNo
	 *              城市编号 : {@link java.lang.String}
	 */
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo == null ? null : cityNo.trim();
	}

	/**
	 * <pre>
	 * 获取：地区编号
	 * 表字段：base_shop.town_no
	 * </pre>
	 * 
	 * @return 地区编号 : {@link java.lang.String}
	 */
	public String getTownNo() {
		return townNo;
	}

	/**
	 * <pre>
	 * 设置：地区编号
	 * 表字段：base_shop.town_no
	 * </pre>
	 * 
	 * @param townNo
	 *              地区编号 : {@link java.lang.String}
	 */
	public void setTownNo(String townNo) {
		this.townNo = townNo == null ? null : townNo.trim();
	}

	/**
	 * <pre>
	 * 获取：公司id
	 * 表字段：base_shop.company_code
	 * </pre>
	 * 
	 * @return 公司id : {@link java.lang.String}
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * <pre>
	 * 设置：公司id
	 * 表字段：base_shop.company_code
	 * </pre>
	 * 
	 * @param companyCode
	 *              公司id : {@link java.lang.String}
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode == null ? null : companyCode.trim();
	}

	/**
	 * <pre>
	 * 获取：联系人
	 * 表字段：base_shop.contacts
	 * </pre>
	 * 
	 * @return 联系人 : {@link java.lang.String}
	 */
	public String getContacts() {
		return contacts;
	}

	/**
	 * <pre>
	 * 设置：联系人
	 * 表字段：base_shop.contacts
	 * </pre>
	 * 
	 * @param contacts
	 *              联系人 : {@link java.lang.String}
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts == null ? null : contacts.trim();
	}

	/**
	 * <pre>
	 * 获取：联系电话
	 * 表字段：base_shop.phone
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
	 * 表字段：base_shop.phone
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
	 * 获取：商铺地址
	 * 表字段：base_shop.shop_address
	 * </pre>
	 * 
	 * @return 商铺地址 : {@link java.lang.String}
	 */
	public String getShopAddress() {
		return shopAddress;
	}

	/**
	 * <pre>
	 * 设置：商铺地址
	 * 表字段：base_shop.shop_address
	 * </pre>
	 * 
	 * @param shopAddress
	 *              商铺地址 : {@link java.lang.String}
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress == null ? null : shopAddress.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：base_shop.create_time
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
	 * 表字段：base_shop.create_time
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
	 * 表字段：base_shop.update_time
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
	 * 表字段：base_shop.update_time
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
	 * 表字段：base_shop.version
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
	 * 表字段：base_shop.version
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
	 * 表字段：base_shop.data_status
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
	 * 表字段：base_shop.data_status
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
	 * 表字段：base_shop.disk_status
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
	 * 表字段：base_shop.disk_status
	 * </pre>
	 * 
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}