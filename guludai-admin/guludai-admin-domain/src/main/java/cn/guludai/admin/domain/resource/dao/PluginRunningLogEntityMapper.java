/**
g * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.dao;

import java.util.List;

import cn.guludai.admin.domain.resource.entity.PluginRunningLogEntity;
import cn.guludai.admin.domain.resource.entity.PluginRunningLogEntityWithBLOBs;
import cn.guludai.admin.web.request.PluginRunningLogReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "plugin")
public interface PluginRunningLogEntityMapper {
	/**
	 * 根据主键ID删除数据库的记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * 插入数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningLogEntityWithBLOBs}
	 */
	int insert(PluginRunningLogEntityWithBLOBs record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningLogEntityWithBLOBs}
	 */
	int insertSelective(PluginRunningLogEntityWithBLOBs record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	PluginRunningLogEntityWithBLOBs selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningLogEntityWithBLOBs}
	 */
	int updateByPrimaryKeySelective(PluginRunningLogEntityWithBLOBs record);

	/**
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningLogEntityWithBLOBs}
	 */
	int updateByPrimaryKeyWithBLOBs(PluginRunningLogEntityWithBLOBs record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningLogEntity}
	 */
	int updateByPrimaryKey(PluginRunningLogEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 上午11:08:26
	 * @Title: selectRunningState 
	 * @Description: 分页查找插件运行数据
	 * @param record running_state
	 * @return
	 *
	 */
	List<PluginRunningLogEntityWithBLOBs> selectRunningLogList(PluginRunningLogReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午2:54:28
	 * @Title: selectRunningStateCount 
	 * @Description:查找插件运行数据总数
	 * @return
	 *
	 */
	Integer selectRunningLogCount(PluginRunningLogReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 上午11:48:42
	 * @Title: updateLongById 
	 * @Description: 处理错误日志
	 * @param record
	 *
	 */
	void updateLongById(PluginRunningLogReq record);
	
 
}