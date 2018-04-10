/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.io.Serializable;

/**
 * 门店及厂商ERP关联安全表
 *
 * @author HeQiao
 * @create 2017-11-05 17:12
 **/
public class BaseShopErpRequest implements Serializable {
    private static final long serialVersionUID = 6546412721793702950L;
    //公司编号
    private String companyCode;
    //门店编号
    private String shopCode;
    //ERP厂商编号
    private String erpFactoryCode;
    //ERP版本编号
    private String erpVersionCode;
    //数据签名盐值
    private String dataSalt;
    //数据公钥串
    private String dataPublicKey;
    //数据公钥串
    private String dataPrivateKey;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getErpFactoryCode() {
        return erpFactoryCode;
    }

    public void setErpFactoryCode(String erpFactoryCode) {
        this.erpFactoryCode = erpFactoryCode;
    }

    public String getErpVersionCode() {
        return erpVersionCode;
    }

    public void setErpVersionCode(String erpVersionCode) {
        this.erpVersionCode = erpVersionCode;
    }

    public String getDataSalt() {
        return dataSalt;
    }

    public void setDataSalt(String dataSalt) {
        this.dataSalt = dataSalt;
    }

    public String getDataPublicKey() {
        return dataPublicKey;
    }

    public void setDataPublicKey(String dataPublicKey) {
        this.dataPublicKey = dataPublicKey;
    }

    public String getDataPrivateKey() {
        return dataPrivateKey;
    }

    public void setDataPrivateKey(String dataPrivateKey) {
        this.dataPrivateKey = dataPrivateKey;
    }
}
