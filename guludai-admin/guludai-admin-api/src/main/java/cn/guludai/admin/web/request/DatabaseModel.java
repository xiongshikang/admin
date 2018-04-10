package cn.guludai.admin.web.request;

public class DatabaseModel {
	
	/**
	 * <pre>
	 * 数据库类型
	 * 表字段 : plugin_running_state.db_type
	 * </pre>
	 */
	private String dbType;

	/**
	 * <pre>
	 * 数据库ip
	 * 表字段 : plugin_running_state.db_ip
	 * </pre>
	 */
	private String dbIp;

	/**
	 * <pre>
	 * 数据库端口号
	 * 表字段 : plugin_running_state.db_post
	 * </pre>
	 */
	private String dbPost;

	/**
	 * <pre>
	 * 数据库名
	 * 表字段 : plugin_running_state.db_name
	 * </pre>
	 */
	private String dbName;

	/**
	 * <pre>
	 * 数据库用户名（加密存储）
	 * 表字段 : plugin_running_state.db_username
	 * </pre>
	 */
	private String dbUsername;

	/**
	 * <pre>
	 * 数据库密码（加密存储）
	 * 表字段 : plugin_running_state.db_password
	 * </pre>
	 */
	private String dbPassword;

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getDbIp() {
		return dbIp;
	}

	public void setDbIp(String dbIp) {
		this.dbIp = dbIp;
	}

	public String getDbPost() {
		return dbPost;
	}

	public void setDbPost(String dbPost) {
		this.dbPost = dbPost;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	 
	
}
