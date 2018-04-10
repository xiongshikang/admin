/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.response;

import java.io.Serializable;

/**
 * 门店基础信息表
 *
 * @author HeQiao
 * @create 2017-11-05 17:11
 **/
public class BaseShopCompanyResponse implements Serializable {
    private static final long serialVersionUID = 2202030288296859024L;
    //企业编号
    private String companyCode;
    //企业名
    private String companyName;
    //企业地址
    private String address;
    //联系电话
    private String phone;
    //企业邮箱
    private String mail;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
