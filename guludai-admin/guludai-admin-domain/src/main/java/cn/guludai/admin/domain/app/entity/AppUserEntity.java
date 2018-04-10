/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.app.entity;

import java.util.Date;
import java.util.List;

/**
 * @author gaopeng
 */
public class AppUserEntity {
	/**
	 * <pre>
	 * 默认主键自增
	 * 表字段 : app_user.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 用户账户(自动生成)
	 * 表字段 : app_user.account
	 * </pre>
	 */
	private String account;

	/**
	 * <pre>
	 * 手机号
	 * 表字段 : app_user.mobile
	 * </pre>
	 */
	private String mobile;

	/**
	 * <pre>
	 * 密码 (结合盐值存储)
	 * 表字段 : app_user.password
	 * </pre>
	 */
	private String password;

	/**
	 * <pre>
	 * 账户盐值
	 * 表字段 : app_user.salt
	 * </pre>
	 */
	private String salt;

	/**
	 * <pre>
	 * 账户状态(常量值：Y-激活，N-冻结，默认值：Y)
	 * 表字段 : app_user.status
	 * </pre>
	 */
	private String status;

	/**
	 * <pre>
	 * 账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人)
	 * 表字段 : app_user.category
	 * </pre>
	 */
	private String category;

	/**
	 * <pre>
	 * 邮箱
	 * 表字段 : app_user.email
	 * </pre>
	 */
	private String email;

	/**
	 * <pre>
	 * 姓名
	 * 表字段 : app_user.name
	 * </pre>
	 */
	private String name;

	/**
	 * <pre>
	 * 微信号
	 * 表字段 : app_user.wechat
	 * </pre>
	 */
	private String wechat;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : app_user.version
	 * </pre>
	 */
	private String version;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : app_user.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : app_user.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : app_user.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : app_user.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * Description:多个用户id
	 */
	private List<String> accountIds;

	/**
	 * <pre>
	 * 获取：默认主键自增
	 * 表字段：app_user.id
	 * </pre>
	 * 
	 * @return 默认主键自增 : {@link Long}
	 */
	public Long getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：默认主键自增
	 * 表字段：app_user.id
	 * </pre>
	 *
	 * @param id
	 *              默认主键自增 : {@link Long}
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：用户账户(自动生成)
	 * 表字段：app_user.account
	 * </pre>
	 *
	 * @return 用户账户(自动生成) : {@link String}
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * <pre>
	 * 设置：用户账户(自动生成)
	 * 表字段：app_user.account
	 * </pre>
	 *
	 * @param account
	 *              用户账户(自动生成) : {@link String}
	 */
	public void setAccount(String account) {
		this.account = account == null ? null : account.trim();
	}

	/**
	 * <pre>
	 * 获取：手机号
	 * 表字段：app_user.mobile
	 * </pre>
	 *
	 * @return 手机号 : {@link String}
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * <pre>
	 * 设置：手机号
	 * 表字段：app_user.mobile
	 * </pre>
	 *
	 * @param mobile
	 *              手机号 : {@link String}
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * <pre>
	 * 获取：密码 (结合盐值存储)
	 * 表字段：app_user.password
	 * </pre>
	 *
	 * @return 密码 (结合盐值存储) : {@link String}
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <pre>
	 * 设置：密码 (结合盐值存储)
	 * 表字段：app_user.password
	 * </pre>
	 *
	 * @param password
	 *              密码 (结合盐值存储) : {@link String}
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * <pre>
	 * 获取：账户盐值
	 * 表字段：app_user.salt
	 * </pre>
	 *
	 * @return 账户盐值 : {@link String}
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * <pre>
	 * 设置：账户盐值
	 * 表字段：app_user.salt
	 * </pre>
	 *
	 * @param salt
	 *              账户盐值 : {@link String}
	 */
	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	/**
	 * <pre>
	 * 获取：账户状态(常量值：Y-激活，N-冻结，默认值：Y)
	 * 表字段：app_user.status
	 * </pre>
	 *
	 * @return 账户状态(常量值：Y-激活，N-冻结，默认值：Y) : {@link String}
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <pre>
	 * 设置：账户状态(常量值：Y-激活，N-冻结，默认值：Y)
	 * 表字段：app_user.status
	 * </pre>
	 *
	 * @param status
	 *              账户状态(常量值：Y-激活，N-冻结，默认值：Y) : {@link String}
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * <pre>
	 * 获取：账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人)
	 * 表字段：app_user.category
	 * </pre>
	 *
	 * @return 账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人) : {@link String}
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <pre>
	 * 设置：账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人)
	 * 表字段：app_user.category
	 * </pre>
	 *
	 * @param category
	 *              账户类型(常量值：1=谨微官方，2=合作企业，3=合作个人) : {@link String}
	 */
	public void setCategory(String category) {
		this.category = category == null ? null : category.trim();
	}

	/**
	 * <pre>
	 * 获取：邮箱
	 * 表字段：app_user.email
	 * </pre>
	 *
	 * @return 邮箱 : {@link String}
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <pre>
	 * 设置：邮箱
	 * 表字段：app_user.email
	 * </pre>
	 *
	 * @param email
	 *              邮箱 : {@link String}
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * <pre>
	 * 获取：姓名
	 * 表字段：app_user.name
	 * </pre>
	 *
	 * @return 姓名 : {@link String}
	 */
	public String getName() {
		return name;
	}

	/**
	 * <pre>
	 * 设置：姓名
	 * 表字段：app_user.name
	 * </pre>
	 *
	 * @param name
	 *              姓名 : {@link String}
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * <pre>
	 * 获取：微信号
	 * 表字段：app_user.wechat
	 * </pre>
	 *
	 * @return 微信号 : {@link String}
	 */
	public String getWechat() {
		return wechat;
	}

	/**
	 * <pre>
	 * 设置：微信号
	 * 表字段：app_user.wechat
	 * </pre>
	 *
	 * @param wechat
	 *              微信号 : {@link String}
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat == null ? null : wechat.trim();
	}

	/**
	 * <pre>
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：app_user.version
	 * </pre>
	 *
	 * @return 版本号(默认值：1，同步递增修改) : {@link String}
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <pre>
	 * 设置：版本号(默认值：1，同步递增修改)
	 * 表字段：app_user.version
	 * </pre>
	 *
	 * @param version
	 *              版本号(默认值：1，同步递增修改) : {@link String}
	 */
	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：app_user.create_time
	 * </pre>
	 *
	 * @return 创建时间 : {@link Date}
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * <pre>
	 * 设置：创建时间
	 * 表字段：app_user.create_time
	 * </pre>
	 *
	 * @param createTime
	 *              创建时间 : {@link Date}
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * <pre>
	 * 获取：修改时间
	 * 表字段：app_user.update_time
	 * </pre>
	 *
	 * @return 修改时间 : {@link Date}
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * <pre>
	 * 设置：修改时间
	 * 表字段：app_user.update_time
	 * </pre>
	 *
	 * @param updateTime
	 *              修改时间 : {@link Date}
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * <pre>
	 * 获取：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：app_user.data_status
	 * </pre>
	 *
	 * @return 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link String}
	 */
	public String getDataStatus() {
		return dataStatus;
	}

	/**
	 * <pre>
	 * 设置：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：app_user.data_status
	 * </pre>
	 *
	 * @param dataStatus
	 *              逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link String}
	 */
	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus == null ? null : dataStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：app_user.disk_status
	 * </pre>
	 *
	 * @return 物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link String}
	 */
	public String getDiskStatus() {
		return diskStatus;
	}

	/**
	 * <pre>
	 * 设置：物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段：app_user.disk_status
	 * </pre>
	 *
	 * @param diskStatus
	 *              物理状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}

	public List<String> getAccountIds() {
		return accountIds;
	}

	public void setAccountIds(List<String> accountIds) {
		this.accountIds = accountIds;
	}
}