/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource.response;

import java.util.Date;

/**
 * @author HeQiao
 * @create 2017-11-05 12:50
 **/
public class BaseErpFactoryResp {
    /**
     * <pre>
     * 主键
     * 表字段 : base_erp_factory.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * ERP厂商编号
     * 表字段 : base_erp_factory.erp_factory_code
     * </pre>
     */
    private String erpFactoryCode;

    /**
     * <pre>
     * ERP厂商名称
     * 表字段 : base_erp_factory.erp_factory_name
     * </pre>
     */
    private String erpFactoryName;

    /**
     * <pre>
     * 厂商联系电话
     * 表字段 : base_erp_factory.phone
     * </pre>
     */
    private String phone;

    /**
     * <pre>
     * 厂商联系邮箱
     * 表字段 : base_erp_factory.mail
     * </pre>
     */
    private String mail;

    /**
     * <pre>
     * 厂商公司地址
     * 表字段 : base_erp_factory.address
     * </pre>
     */
    private String address;

    /**
     * <pre>
     * 创建时间
     * 表字段 : base_erp_factory.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 更新时间
     * 表字段 : base_erp_factory.update_time
     * </pre>
     */
    private Date updateTime;

    /**
     * <pre>
     * 版本号(默认值：1，同步递增修改)
     * 表字段 : base_erp_factory.version
     * </pre>
     */
    private Long version;

    /**
     * <pre>
     * 获取：主键
     * 表字段：base_erp_factory.id
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
     * 表字段：base_erp_factory.id
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
     * 获取：ERP厂商编号
     * 表字段：base_erp_factory.erp_factory_code
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
     * 表字段：base_erp_factory.erp_factory_code
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
     * 获取：ERP厂商名称
     * 表字段：base_erp_factory.erp_factory_name
     * </pre>
     *
     * @return ERP厂商名称 : {@link java.lang.String}
     */
    public String getErpFactoryName() {
        return erpFactoryName;
    }

    /**
     * <pre>
     * 设置：ERP厂商名称
     * 表字段：base_erp_factory.erp_factory_name
     * </pre>
     *
     * @param erpFactoryName
     *              ERP厂商名称 : {@link java.lang.String}
     */
    public void setErpFactoryName(String erpFactoryName) {
        this.erpFactoryName = erpFactoryName == null ? null : erpFactoryName.trim();
    }

    /**
     * <pre>
     * 获取：厂商联系电话
     * 表字段：base_erp_factory.phone
     * </pre>
     *
     * @return 厂商联系电话 : {@link java.lang.String}
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <pre>
     * 设置：厂商联系电话
     * 表字段：base_erp_factory.phone
     * </pre>
     *
     * @param phone
     *              厂商联系电话 : {@link java.lang.String}
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * <pre>
     * 获取：厂商联系邮箱
     * 表字段：base_erp_factory.mail
     * </pre>
     *
     * @return 厂商联系邮箱 : {@link java.lang.String}
     */
    public String getMail() {
        return mail;
    }

    /**
     * <pre>
     * 设置：厂商联系邮箱
     * 表字段：base_erp_factory.mail
     * </pre>
     *
     * @param mail
     *              厂商联系邮箱 : {@link java.lang.String}
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * <pre>
     * 获取：厂商公司地址
     * 表字段：base_erp_factory.address
     * </pre>
     *
     * @return 厂商公司地址 : {@link java.lang.String}
     */
    public String getAddress() {
        return address;
    }

    /**
     * <pre>
     * 设置：厂商公司地址
     * 表字段：base_erp_factory.address
     * </pre>
     *
     * @param address
     *              厂商公司地址 : {@link java.lang.String}
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：base_erp_factory.create_time
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
     * 表字段：base_erp_factory.create_time
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
     * 表字段：base_erp_factory.update_time
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
     * 表字段：base_erp_factory.update_time
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
     * 表字段：base_erp_factory.version
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
     * 表字段：base_erp_factory.version
     * </pre>
     *
     * @param version
     *              版本号(默认值：1，同步递增修改) : {@link java.lang.Long}
     */
    public void setVersion(Long version) {
        this.version = version;
    }

}
