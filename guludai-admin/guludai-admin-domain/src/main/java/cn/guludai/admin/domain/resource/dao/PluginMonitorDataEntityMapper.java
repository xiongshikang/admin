/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.dao;

import java.util.List;

import cn.guludai.admin.domain.resource.entity.PluginMonitorDataEntity;
import cn.guludai.admin.web.request.PluginMonitorDataReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "plugin")
public interface PluginMonitorDataEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginMonitorDataEntity}
	 */
	int insert(PluginMonitorDataEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginMonitorDataEntity}
	 */
	int insertSelective(PluginMonitorDataEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	PluginMonitorDataEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginMonitorDataEntity}
	 */
	int updateByPrimaryKeySelective(PluginMonitorDataEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginMonitorDataEntity}
	 */
	int updateByPrimaryKey(PluginMonitorDataEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 下午1:48:49
	 * @Title: selectPluginMonitorDataList 
	 * @Description: 查询插件数据监控数据
	 * @param req
	 * @return
	 *
	 */
	List<PluginMonitorDataEntity> selectPluginMonitorDataList(PluginMonitorDataReq req);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月21日 下午1:49:29
	 * @Title: selectPluginMonitorDataListCount 
	 * @Description: 查询插件数据监控数据总数
	 * @param req
	 * @return
	 *
	 */
	Integer selectPluginMonitorDataListCount(PluginMonitorDataReq req);
	
}