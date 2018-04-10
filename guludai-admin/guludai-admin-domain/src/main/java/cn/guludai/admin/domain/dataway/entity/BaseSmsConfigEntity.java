/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseSmsConfigEntity {
	/**
	 * <pre>
	 * 
	 * 表字段 : base_sms_config.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 短信配置编号
	 * 表字段 : base_sms_config.sms_code
	 * </pre>
	 */
	private String smsCode;

	/**
	 * <pre>
	 * 配置类型
	 * 表字段 : base_sms_config.sms_type
	 * </pre>
	 */
	private Integer smsType;

	/**
	 * <pre>
	 * 发送周期
	 * 表字段 : base_sms_config.send_cycle
	 * </pre>
	 */
	private String sendCycle;

	/**
	 * <pre>
	 * 发送频率
	 * 表字段 : base_sms_config.send_rate
	 * </pre>
	 */
	private Integer sendRate;

	/**
	 * <pre>
	 * 是否提供验证
	 * 表字段 : base_sms_config.sms_check
	 * </pre>
	 */
	private String smsCheck;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_sms_config.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_sms_config.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : base_sms_config.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_sms_config.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_sms_config.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：
	 * 表字段：base_sms_config.id
	 * </pre>
	 * 
	 * @return : {@link Long}
	 */
	public Long getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：base_sms_config.id
	 * </pre>
	 *
	 * @param id
	 *              : {@link Long}
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：短信配置编号
	 * 表字段：base_sms_config.sms_code
	 * </pre>
	 *
	 * @return 短信配置编号 : {@link String}
	 */
	public String getSmsCode() {
		return smsCode;
	}

	/**
	 * <pre>
	 * 设置：短信配置编号
	 * 表字段：base_sms_config.sms_code
	 * </pre>
	 *
	 * @param smsCode
	 *              短信配置编号 : {@link String}
	 */
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode == null ? null : smsCode.trim();
	}

	/**
	 * <pre>
	 * 获取：配置类型
	 * 表字段：base_sms_config.sms_type
	 * </pre>
	 *
	 * @return 配置类型 : {@link Integer}
	 */
	public Integer getSmsType() {
		return smsType;
	}

	/**
	 * <pre>
	 * 设置：配置类型
	 * 表字段：base_sms_config.sms_type
	 * </pre>
	 *
	 * @param smsType
	 *              配置类型 : {@link Integer}
	 */
	public void setSmsType(Integer smsType) {
		this.smsType = smsType;
	}

	/**
	 * <pre>
	 * 获取：发送周期
	 * 表字段：base_sms_config.send_cycle
	 * </pre>
	 *
	 * @return 发送周期 : {@link String}
	 */
	public String getSendCycle() {
		return sendCycle;
	}

	/**
	 * <pre>
	 * 设置：发送周期
	 * 表字段：base_sms_config.send_cycle
	 * </pre>
	 *
	 * @param sendCycle
	 *              发送周期 : {@link String}
	 */
	public void setSendCycle(String sendCycle) {
		this.sendCycle = sendCycle == null ? null : sendCycle.trim();
	}

	/**
	 * <pre>
	 * 获取：发送频率
	 * 表字段：base_sms_config.send_rate
	 * </pre>
	 *
	 * @return 发送频率 : {@link Integer}
	 */
	public Integer getSendRate() {
		return sendRate;
	}

	/**
	 * <pre>
	 * 设置：发送频率
	 * 表字段：base_sms_config.send_rate
	 * </pre>
	 *
	 * @param sendRate
	 *              发送频率 : {@link Integer}
	 */
	public void setSendRate(Integer sendRate) {
		this.sendRate = sendRate;
	}

	/**
	 * <pre>
	 * 获取：是否提供验证
	 * 表字段：base_sms_config.sms_check
	 * </pre>
	 *
	 * @return 是否提供验证 : {@link String}
	 */
	public String getSmsCheck() {
		return smsCheck;
	}

	/**
	 * <pre>
	 * 设置：是否提供验证
	 * 表字段：base_sms_config.sms_check
	 * </pre>
	 *
	 * @param smsCheck
	 *              是否提供验证 : {@link String}
	 */
	public void setSmsCheck(String smsCheck) {
		this.smsCheck = smsCheck == null ? null : smsCheck.trim();
	}

	/**
	 * <pre>
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：base_sms_config.version
	 * </pre>
	 *
	 * @return 版本号(默认值：1，同步递增修改) : {@link Long}
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * <pre>
	 * 设置：版本号(默认值：1，同步递增修改)
	 * 表字段：base_sms_config.version
	 * </pre>
	 *
	 * @param version
	 *              版本号(默认值：1，同步递增修改) : {@link Long}
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * <pre>
	 * 获取：创建时间
	 * 表字段：base_sms_config.create_time
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
	 * 表字段：base_sms_config.create_time
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
	 * 表字段：base_sms_config.update_time
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
	 * 表字段：base_sms_config.update_time
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
	 * 表字段：base_sms_config.data_status
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
	 * 表字段：base_sms_config.data_status
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
	 * 获取：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段：base_sms_config.disk_status
	 * </pre>
	 *
	 * @return 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link String}
	 */
	public String getDiskStatus() {
		return diskStatus;
	}

	/**
	 * <pre>
	 * 设置：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段：base_sms_config.disk_status
	 * </pre>
	 *
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}