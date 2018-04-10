/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.guludai.admin.domain.resource.entity.PluginVersionEntity;
import cn.guludai.admin.web.request.PluginVersionReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "plugin")
public interface PluginVersionEntityMapper {
	/**
	 * 根据主键ID删除数据库的记录
	 * 
	 * @param pluginCode
	 *              {@link java.lang.Long}
	 */
	int deleteByPrimaryKey(@Param("pluginCode") String pluginCode);

	/**
	 * 插入数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginVersionEntity}
	 */
	int insert(PluginVersionEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginVersionEntity}
	 */
	int insertSelective(PluginVersionEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	PluginVersionEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginVersionEntity}
	 */
	int updateByPrimaryKeySelective(PluginVersionEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginVersionEntity}
	 */
	int updateByPrimaryKey(PluginVersionEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午1:29:49
	 * @Title: PluginVersionEntity s
	 * @Description: 查找出插件顺序号最大的插件信息
	 * @param record
	 *
	 */
	PluginVersionEntity selectPluginVersionFor (@Param("erpFactoryCode")String erpFactoryCode,@Param("erpVersionCode")String erpVersionCode);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午1:46:53
	 * @Title: updateByPluginCode 
	 * @Description: 更新插件信息
	 * @param record
	 *
	 */
	void updateByPluginCode(PluginVersionEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午1:57:04
	 * @Title: selectPluginVersionByPluginCode 
	 * @Description: 通过插件编号查找未被册除的任件
	 * @param pluginCode 插件编号
	 * @return
	 *
	 */
	PluginVersionEntity selectPluginVersionByPluginCode(String pluginCode);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午2:18:36
	 * @Title: selectPluginVersionList 
	 * @Description: 通过插件多条件分页查询
	 * @param record
	 * @return
	 *
	 */
	List<PluginVersionEntity> selectPluginVersionList(PluginVersionReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午2:49:16
	 * @Title: selectPluginVersionListCount 
	 * @Description: 通过插件多条件查询总数
	 * @return
	 *
	 */
	Integer selectPluginVersionListCount(PluginVersionEntity record);
}