/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.dao;

import cn.guludai.admin.domain.resource.entity.PluginUpgradeEntity;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "plugin")
public interface PluginUpgradeEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginUpgradeEntity}
	 */
	int insert(PluginUpgradeEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginUpgradeEntity}
	 */
	int insertSelective(PluginUpgradeEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	PluginUpgradeEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginUpgradeEntity}
	 */
	int updateByPrimaryKeySelective(PluginUpgradeEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginUpgradeEntity}
	 */
	int updateByPrimaryKey(PluginUpgradeEntity record);
}