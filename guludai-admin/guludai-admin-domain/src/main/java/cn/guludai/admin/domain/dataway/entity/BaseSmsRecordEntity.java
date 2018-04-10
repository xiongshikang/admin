/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseSmsRecordEntity {
	/**
	 * <pre>
	 * 
	 * 表字段 : base_sms_record.id
	 * </pre>
	 */
	private Long id;

	/**
	 * <pre>
	 * 短信记录流水号
	 * 表字段 : base_sms_record.sms_record
	 * </pre>
	 */
	private String smsRecord;

	/**
	 * <pre>
	 * 接受手机号
	 * 表字段 : base_sms_record.sms_phone
	 * </pre>
	 */
	private String smsPhone;

	/**
	 * <pre>
	 * 发送内容
	 * 表字段 : base_sms_record.send_content
	 * </pre>
	 */
	private String sendContent;

	/**
	 * <pre>
	 * 发送状态
	 * 表字段 : base_sms_record.send_status
	 * </pre>
	 */
	private String sendStatus;

	/**
	 * <pre>
	 * 发送开始时间
	 * 表字段 : base_sms_record.send_start_time
	 * </pre>
	 */
	private Date sendStartTime;

	/**
	 * <pre>
	 * 发送结束时间
	 * 表字段 : base_sms_record.send_end_time
	 * </pre>
	 */
	private Date sendEndTime;

	/**
	 * <pre>
	 * 验证状态
	 * 表字段 : base_sms_record.check_status
	 * </pre>
	 */
	private String checkStatus;

	/**
	 * <pre>
	 * 第三方返回数据体
	 * 表字段 : base_sms_record.response_data
	 * </pre>
	 */
	private String responseData;

	/**
	 * <pre>
	 * 短信配置编号
	 * 表字段 : base_sms_record.sms_code
	 * </pre>
	 */
	private String smsCode;

	/**
	 * <pre>
	 * 版本号(默认值：1，同步递增修改)
	 * 表字段 : base_sms_record.version
	 * </pre>
	 */
	private Long version;

	/**
	 * <pre>
	 * 创建时间
	 * 表字段 : base_sms_record.create_time
	 * </pre>
	 */
	private Date createTime;

	/**
	 * <pre>
	 * 修改时间
	 * 表字段 : base_sms_record.update_time
	 * </pre>
	 */
	private Date updateTime;

	/**
	 * <pre>
	 * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
	 * 表字段 : base_sms_record.data_status
	 * </pre>
	 */
	private String dataStatus;

	/**
	 * <pre>
	 * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
	 * 表字段 : base_sms_record.disk_status
	 * </pre>
	 */
	private String diskStatus;

	/**
	 * <pre>
	 * 获取：
	 * 表字段：base_sms_record.id
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
	 * 表字段：base_sms_record.id
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
	 * 获取：短信记录流水号
	 * 表字段：base_sms_record.sms_record
	 * </pre>
	 *
	 * @return 短信记录流水号 : {@link String}
	 */
	public String getSmsRecord() {
		return smsRecord;
	}

	/**
	 * <pre>
	 * 设置：短信记录流水号
	 * 表字段：base_sms_record.sms_record
	 * </pre>
	 *
	 * @param smsRecord
	 *              短信记录流水号 : {@link String}
	 */
	public void setSmsRecord(String smsRecord) {
		this.smsRecord = smsRecord == null ? null : smsRecord.trim();
	}

	/**
	 * <pre>
	 * 获取：接受手机号
	 * 表字段：base_sms_record.sms_phone
	 * </pre>
	 *
	 * @return 接受手机号 : {@link String}
	 */
	public String getSmsPhone() {
		return smsPhone;
	}

	/**
	 * <pre>
	 * 设置：接受手机号
	 * 表字段：base_sms_record.sms_phone
	 * </pre>
	 *
	 * @param smsPhone
	 *              接受手机号 : {@link String}
	 */
	public void setSmsPhone(String smsPhone) {
		this.smsPhone = smsPhone == null ? null : smsPhone.trim();
	}

	/**
	 * <pre>
	 * 获取：发送内容
	 * 表字段：base_sms_record.send_content
	 * </pre>
	 *
	 * @return 发送内容 : {@link String}
	 */
	public String getSendContent() {
		return sendContent;
	}

	/**
	 * <pre>
	 * 设置：发送内容
	 * 表字段：base_sms_record.send_content
	 * </pre>
	 *
	 * @param sendContent
	 *              发送内容 : {@link String}
	 */
	public void setSendContent(String sendContent) {
		this.sendContent = sendContent == null ? null : sendContent.trim();
	}

	/**
	 * <pre>
	 * 获取：发送状态
	 * 表字段：base_sms_record.send_status
	 * </pre>
	 *
	 * @return 发送状态 : {@link String}
	 */
	public String getSendStatus() {
		return sendStatus;
	}

	/**
	 * <pre>
	 * 设置：发送状态
	 * 表字段：base_sms_record.send_status
	 * </pre>
	 *
	 * @param sendStatus
	 *              发送状态 : {@link String}
	 */
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus == null ? null : sendStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：发送开始时间
	 * 表字段：base_sms_record.send_start_time
	 * </pre>
	 *
	 * @return 发送开始时间 : {@link Date}
	 */
	public Date getSendStartTime() {
		return sendStartTime;
	}

	/**
	 * <pre>
	 * 设置：发送开始时间
	 * 表字段：base_sms_record.send_start_time
	 * </pre>
	 *
	 * @param sendStartTime
	 *              发送开始时间 : {@link Date}
	 */
	public void setSendStartTime(Date sendStartTime) {
		this.sendStartTime = sendStartTime;
	}

	/**
	 * <pre>
	 * 获取：发送结束时间
	 * 表字段：base_sms_record.send_end_time
	 * </pre>
	 *
	 * @return 发送结束时间 : {@link Date}
	 */
	public Date getSendEndTime() {
		return sendEndTime;
	}

	/**
	 * <pre>
	 * 设置：发送结束时间
	 * 表字段：base_sms_record.send_end_time
	 * </pre>
	 *
	 * @param sendEndTime
	 *              发送结束时间 : {@link Date}
	 */
	public void setSendEndTime(Date sendEndTime) {
		this.sendEndTime = sendEndTime;
	}

	/**
	 * <pre>
	 * 获取：验证状态
	 * 表字段：base_sms_record.check_status
	 * </pre>
	 *
	 * @return 验证状态 : {@link String}
	 */
	public String getCheckStatus() {
		return checkStatus;
	}

	/**
	 * <pre>
	 * 设置：验证状态
	 * 表字段：base_sms_record.check_status
	 * </pre>
	 *
	 * @param checkStatus
	 *              验证状态 : {@link String}
	 */
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus == null ? null : checkStatus.trim();
	}

	/**
	 * <pre>
	 * 获取：第三方返回数据体
	 * 表字段：base_sms_record.response_data
	 * </pre>
	 *
	 * @return 第三方返回数据体 : {@link String}
	 */
	public String getResponseData() {
		return responseData;
	}

	/**
	 * <pre>
	 * 设置：第三方返回数据体
	 * 表字段：base_sms_record.response_data
	 * </pre>
	 *
	 * @param responseData
	 *              第三方返回数据体 : {@link String}
	 */
	public void setResponseData(String responseData) {
		this.responseData = responseData == null ? null : responseData.trim();
	}

	/**
	 * <pre>
	 * 获取：短信配置编号
	 * 表字段：base_sms_record.sms_code
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
	 * 表字段：base_sms_record.sms_code
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
	 * 获取：版本号(默认值：1，同步递增修改)
	 * 表字段：base_sms_record.version
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
	 * 表字段：base_sms_record.version
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
	 * 表字段：base_sms_record.create_time
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
	 * 表字段：base_sms_record.create_time
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
	 * 表字段：base_sms_record.update_time
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
	 * 表字段：base_sms_record.update_time
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
	 * 表字段：base_sms_record.data_status
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
	 * 表字段：base_sms_record.data_status
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
	 * 表字段：base_sms_record.disk_status
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
	 * 表字段：base_sms_record.disk_status
	 * </pre>
	 *
	 * @param diskStatus
	 *              物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link String}
	 */
	public void setDiskStatus(String diskStatus) {
		this.diskStatus = diskStatus == null ? null : diskStatus.trim();
	}
}