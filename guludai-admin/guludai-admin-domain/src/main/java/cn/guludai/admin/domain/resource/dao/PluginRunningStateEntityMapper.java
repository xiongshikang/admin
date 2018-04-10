/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity;
import cn.guludai.admin.web.request.PluginRunningStateReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "plugin")
public interface PluginRunningStateEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity}
	 */
	int insert(PluginRunningStateEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity}
	 */
	int insertSelective(PluginRunningStateEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	PluginRunningStateEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity}
	 */
	int updateByPrimaryKeySelective(PluginRunningStateEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity}
	 */
	int updateByPrimaryKey(PluginRunningStateEntity record);
	
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
	List<PluginRunningStateEntity> selectRunningStateList(PluginRunningStateReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午2:54:28
	 * @Title: selectRunningStateCount 
	 * @Description:查找插件运行数据总数
	 * @return
	 *
	 */
	Integer selectRunningStateCount(PluginRunningStateReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:33:27
	 * @Title: updateRunningStateByShopCode 
	 * @Description: 通过门店编号修改插件运行数据
	 * @param record
	 *
	 */
	int updateRunningStateByStateCode(PluginRunningStateEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月7日 上午11:47:43
	 * @Title: selectRunningStateByShopCode 
	 * @Description: 
	 * @param stateCode 编号
	 * @return
	 *
	 */
	PluginRunningStateEntity selectRunningStateByStateCode(String stateCode);
	 
}