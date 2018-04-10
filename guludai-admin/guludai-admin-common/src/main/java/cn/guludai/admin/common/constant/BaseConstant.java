/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.common.constant;
/**
 * 
 * @ClassName: BaseConstant 
 * @Description: 定义常量类
 * @author: xiongshikang
 * @date: 2017年11月2日 下午9:17:25
 */
public class BaseConstant {
	
	/**
	 * Y-逻辑保留
	 */
	public static final String DATA_STATUS_Y = "Y";
	
	/**
	 * N-逻辑删除
	 */
	public static final String DATA_STATUS_N = "N";
	
	/**
	 * Y-物理保留
	 */
	public static final String DISK_STATUS_Y = "Y";
	
	/**
	 * N-物理删除
	 */
	public static final String DISK_STATUS_N = "N";
	
	/**
	 * 插件是否升级(常量值：Y-已升级，N-未升级，O-升级中)
	 */
	public static final String UPGRADE_Y = "Y";
	
	public static final String UPGRADE_N = "N";
	
	public static final String UPGRADE_O = "O";
	
	/**
	 * Y-已解决
	 */
	public static final String 	RESOLVE_STATUS_Y = "Y"; 
	
	/**
	 * N-未解决
	 */
	public static final String 	RESOLVE_STATUS_N = "N"; 
	/**
	 * 注册码状态
	 */
	public static final String 	LICENSE_STATUS_Y = "Y";  
	
	public static final String 	LICENSE_STATUS_N = "N";
	
	/**
	 * 插件是否可升级(常量值：Y-可升级，N-不可升级，默认值：Y)
	 */
	public static final String PLUGIN_STATUS_Y = "Y" ;
	
	public static final String PLUGIN_STATUS_N = "N" ;
	 

	/**
	 * 客户端插件是否允许上传及接受数据，常量值：Y-可以接受数据，N-拒绝接受数据，默认值：Y'
	 */
	public static final String 	LICENSE_UP_LOAD_Y = "Y";  
	
	public static final String 	LICENSE_UP_LOAD_N = "N";

	/**APP版本启用状态 Y启用 , N 停用*/
	public static final String VERSION_STATUS_Y = "Y";
	public static final String VERSION_STATUS_N = "N" ;

	/**APP是否强制升级*/
	public static final String VERSION_UPGRADE_Y = "Y";
	public static final String VERSION_UPGRADE_N = "N";

}
