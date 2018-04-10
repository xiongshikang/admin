/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource.request;

import java.util.Date;

import cn.guludai.admin.web.request.BaseReq;
/**
 * 
 * @ClassName: BaseErpVersionReq 
 * @Description: 版本接参类
 * @author: xiongshikang
 * @date: 2017年12月19日 下午6:29:24
 */
public class BaseErpVersionReq extends BaseReq{
	
	/**
	 * @author: xiongshikang
	 * @date: 2017年12月20日 上午10:36:00
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;

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

	public String getErpVersionCode() {
		return erpVersionCode;
	}

	public void setErpVersionCode(String erpVersionCode) {
		this.erpVersionCode = erpVersionCode;
	}

	public String getErpVersionName() {
		return erpVersionName;
	}

	public void setErpVersionName(String erpVersionName) {
		this.erpVersionName = erpVersionName;
	}

	public String getErpVersion() {
		return erpVersion;
	}

	public void setErpVersion(String erpVersion) {
		this.erpVersion = erpVersion;
	}

	public String getErpFactoryCode() {
		return erpFactoryCode;
	}

	public void setErpFactoryCode(String erpFactoryCode) {
		this.erpFactoryCode = erpFactoryCode;
	}

	public String getErpDatabase() {
		return erpDatabase;
	}

	public void setErpDatabase(String erpDatabase) {
		this.erpDatabase = erpDatabase;
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
