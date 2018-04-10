/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 门店基础信息表
 *
 * @author HeQiao
 * @create 2017-11-05 17:32
 **/
public class BaseShopResponse implements Serializable {
    private static final long serialVersionUID = 8133575812955836796L;
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
     * 公司名称
     * 表字段 : base_shop.company_code
     * </pre>
     */
    private String companyName;
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
     * 省名称
     * 表字段 : base_shop.provinceName
     * </pre>
     */
    private String provinceName;
    /**
     * <pre>
     * 城市名称
     * 表字段 : base_shop.cityName
     * </pre>
     */
    private String cityName;
    /**
     * <pre>
     * 乡镇名称
     * 表字段 : base_shop.townNam
     * </pre>
     */
    private String townNam;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BigDecimal getShopLongitude() {
        return shopLongitude;
    }

    public void setShopLongitude(BigDecimal shopLongitude) {
        this.shopLongitude = shopLongitude;
    }

    public BigDecimal getShopLatitude() {
        return shopLatitude;
    }

    public void setShopLatitude(BigDecimal shopLatitude) {
        this.shopLatitude = shopLatitude;
    }

    public String getProvinceNo() {
        return provinceNo;
    }

    public void setProvinceNo(String provinceNo) {
        this.provinceNo = provinceNo;
    }

    public String getCityNo() {
        return cityNo;
    }

    public void setCityNo(String cityNo) {
        this.cityNo = cityNo;
    }

    public String getTownNo() {
        return townNo;
    }

    public void setTownNo(String townNo) {
        this.townNo = townNo;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
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

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTownNam() {
        return townNam;
    }

    public void setTownNam(String townNam) {
        this.townNam = townNam;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
