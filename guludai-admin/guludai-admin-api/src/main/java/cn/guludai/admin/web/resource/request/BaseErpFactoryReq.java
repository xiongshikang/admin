/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource.request;

import java.util.Date;

import cn.guludai.admin.web.request.BaseReq;
/**
 * 
 * @ClassName: BaseErpFactoryReq 
 * @Description: erp厂商接参类
 * @author: xiongshikang
 * @date: 2017年12月19日 下午4:17:32
 */
public class BaseErpFactoryReq extends BaseReq{
	
	 /**
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午4:23:19
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;

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

	public String getErpFactoryCode() {
		return erpFactoryCode;
	}

	public void setErpFactoryCode(String erpFactoryCode) {
		this.erpFactoryCode = erpFactoryCode;
	}

	public String getErpFactoryName() {
		return erpFactoryName;
	}

	public void setErpFactoryName(String erpFactoryName) {
		this.erpFactoryName = erpFactoryName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
    
    
}
