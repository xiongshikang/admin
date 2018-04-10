/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource.request;

import java.util.Date;

import cn.guludai.admin.web.request.BaseReq;
/**
 * 
 * @ClassName: BaseShopCompanyReq 
 * @Description: 公司接参类
 * @author: xiongshikang
 * @date: 2017年12月20日 上午11:14:40
 */
public class BaseShopCompanyReq  extends BaseReq {
	
	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : base_shop_company.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 企业名
	 * 表字段 : base_shop_company.company_name
	 * </pre>
	 */
	private String companyName;

	/**
	 * <pre>
	 * 企业地址
	 * 表字段 : base_shop_company.address
	 * </pre>
	 */
	private String address;

	/**
	 * <pre>
	 * 联系电话
	 * 表字段 : base_shop_company.phone
	 * </pre>
	 */
	private String phone;

	/**
	 * <pre>
	 * 企业邮箱
	 * 表字段 : base_shop_company.mail
	 * </pre>
	 */
	private String mail;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_shop_company.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 更新时间
	 * 表字段 : base_shop_company.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_shop_company.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_shop_company.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_shop_company.disk_status
	 * </pre>
	 */
	private String diskStatus;

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
 
}
