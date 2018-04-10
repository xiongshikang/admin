/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author qiao.he
 * @create 2017-11-05 17:08
 **/
public class BaseShopRequest extends BaseReq implements Serializable {
    private static final long serialVersionUID = 4752372408222268998L;
    //门店编号
    private String shopCode;
    //门店名称
    private String shopName;
    //经度
    private BigDecimal shopLongitude;
    //纬度
    private BigDecimal shopLatitude;
    //联系人
    private String contacts;
    //联系电话
    private String phone;
    //商铺地址
    private String shopAddress;
    //省份编号
    private String provinceNo;
    //城市编号
    private String cityNo;
    //镇区编号
    private String townNo;
    //企业编号
    private String companyCode;

    //版本号
    private Long version;

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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
