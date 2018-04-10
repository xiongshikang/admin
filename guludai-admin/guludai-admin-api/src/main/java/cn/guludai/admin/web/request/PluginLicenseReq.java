/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.request;

import java.util.Date;
import java.util.List;
/**
 * 
 * @ClassName: PluginLicenseReq 
 * @Description: 注册码接参类
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:25:18
 */
public class PluginLicenseReq extends BaseReq{
	
	/**
	 * @author: xiongshikang
	 * @date: 2017年11月20日 下午1:45:55
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <pre>
	 * 插件注册码
	 * 表字段 : plugin_license.license_code
	 * </pre>
	 */
	private String licenseCode;
	
	/**
	 * 客户端插件是否允许上传及接受数据，常量值：Y-可以接受数据，N-拒绝接受数据，默认值：Y
	 */
	private String licenseUpload;

	/**
	 * <pre>
	 * 插件授权身份号  
	 * 表字段 : plugin_license.license_idcard
	 * </pre>
	 */
	private String licenseIdcard;

	/**
	 * <pre>
	 * 常量值：Y-可用，N-不可用，默认值：Y
	 * 表字段 : plugin_license.license_status
	 * </pre>
	 */
	private String licenseStatus;

	/**
	 * <pre>
	 * 失效时间
	 * 表字段 : plugin_license.expire_time
	 * </pre>
	 */
	private Date expireTime;

	/**
	 * <pre>
	 * 使用次数，最多使用1次，注意乐观控制并发
	 * 表字段 : plugin_license.used_count
	 * </pre>
	 */
	private Integer usedCount;

	/**
	 * <pre>
	 * 门店编号
	 * 表字段 : plugin_license.shop_code
	 * </pre>
	 */
	private String shopCode;
	/**
	 * <pre>
	 * 门店名称
	 * 表字段 : plugin_license.shop_code
	 * </pre>
	 */
	private String shopName;
	/**
	 * <pre>
	 * 企业编号
	 * 表字段 : plugin_license.company_code
	 * </pre>
	 */
	private String companyCode;

	/**
	 * <pre>
	 * 企业名称
	 * 表字段 : plugin_license.company_code
	 * </pre>
	 */
	private String companyName;
	/**
	 * <pre>
	 * ERP厂商编号
	 * 表字段 : plugin_license.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryCode;
	/**
	 * <pre>
	 * ERP厂商名称
	 * 表字段 : plugin_license.erp_factory_code
	 * </pre>
	 */
	private String erpFactoryName;

	/**
	 * <pre>
	 * ERP版本编号
	 * 表字段 : plugin_license.erp_version_code
	 * </pre>
	 */
	private String erpVersionCode;
	/**
	 * <pre>
	 * ERP版本名称
	 * 表字段 : plugin_license.erp_version_code
	 * </pre>
	 */
	private String erpVersionName;
	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : plugin_license.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : plugin_license.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : plugin_license.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : plugin_license.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : plugin_license.disk_status
	 * </pre>
	 */
	private String diskStatus;
 
	/**
	 * 数据库信息
	 */
	private List<DatabaseModel> databaseModel;
	
	public String getLicenseUpload() {
		return licenseUpload;
	}

	public void setLicenseUpload(String licenseUpload) {
		this.licenseUpload = licenseUpload;
	}

	public List<DatabaseModel> getDatabaseModel() {
		return databaseModel;
	}

	public void setDatabaseModel(List<DatabaseModel> databaseModel) {
		this.databaseModel = databaseModel;
	}

	public String getLicenseCode() {
		return licenseCode;
	}

	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode;
	}

	public String getLicenseIdcard() {
		return licenseIdcard;
	}

	public void setLicenseIdcard(String licenseIdcard) {
		this.licenseIdcard = licenseIdcard;
	}

	public String getLicenseStatus() {
		return licenseStatus;
	}

	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getErpFactoryName() {
		return erpFactoryName;
	}

	public void setErpFactoryName(String erpFactoryName) {
		this.erpFactoryName = erpFactoryName;
	}

	public String getErpVersionName() {
		return erpVersionName;
	}

	public void setErpVersionName(String erpVersionName) {
		this.erpVersionName = erpVersionName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
