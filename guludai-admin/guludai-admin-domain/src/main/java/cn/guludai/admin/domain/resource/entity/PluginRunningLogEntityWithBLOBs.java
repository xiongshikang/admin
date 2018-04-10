/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.entity;

/**
 * @author gaopeng
 */
public class PluginRunningLogEntityWithBLOBs extends PluginRunningLogEntity {
	/**
	 * <pre>
	 * 日志详情(json格式数据详情)
	 * 表字段 : plugin_running_log.error_detail
	 * </pre>
	 */
	private String errorDetail;

	/**
	 * <pre>
	 * 解决备注
	 * 表字段 : plugin_running_log.resolve_remark
	 * </pre>
	 */
	private String resolveRemark;

	/**
	 * <pre>
	 * 获取：日志详情(json格式数据详情)
	 * 表字段：plugin_running_log.error_detail
	 * </pre>
	 * 
	 * @return 日志详情(json格式数据详情) : {@link java.lang.String}
	 */
	public String getErrorDetail() {
		return errorDetail;
	}

	/**
	 * <pre>
	 * 设置：日志详情(json格式数据详情)
	 * 表字段：plugin_running_log.error_detail
	 * </pre>
	 * 
	 * @param errorDetail
	 *              日志详情(json格式数据详情) : {@link java.lang.String}
	 */
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail == null ? null : errorDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：解决备注
	 * 表字段：plugin_running_log.resolve_remark
	 * </pre>
	 * 
	 * @return 解决备注 : {@link java.lang.String}
	 */
	public String getResolveRemark() {
		return resolveRemark;
	}

	/**
	 * <pre>
	 * 设置：解决备注
	 * 表字段：plugin_running_log.resolve_remark
	 * </pre>
	 * 
	 * @param resolveRemark
	 *              解决备注 : {@link java.lang.String}
	 */
	public void setResolveRemark(String resolveRemark) {
		this.resolveRemark = resolveRemark == null ? null : resolveRemark.trim();
	}
}