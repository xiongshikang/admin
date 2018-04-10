/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity;
import cn.guludai.admin.web.resource.request.BaseErpVersionReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseAreaVersionEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity}
	 */
	int insert(BaseAreaVersionEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity}
	 */
	int insertSelective(BaseAreaVersionEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	BaseAreaVersionEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity}
	 */
	int updateByPrimaryKeySelective(BaseAreaVersionEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity}
	 */

	List<BaseAreaVersionEntity> findBaseErpVersion(String erpFactoryCode);


	Map<String , String >  findBaseErpName(@Param("erpVersionCode")String erpVersionCode,
						 @Param("erpFactoryCode")  String erpFactoryCode );
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午6:51:59
	 * @Title: selectBaseAreaVersionEntityPage 
	 * @Description: 分页查询erp版本信息列表
	 * @param record
	 * @return
	 *
	 */
	List<BaseAreaVersionEntity> selectBaseAreaVersionEntityPage(BaseErpVersionReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午6:52:36
	 * @Title: selectBaseAreaVersionEntityPageCount 
	 * @Description: 分页总数
	 * @param record
	 *
	 */
	Integer selectBaseAreaVersionEntityPageCount(BaseErpVersionReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午6:53:12
	 * @Title: updateBaseAreaVersionEntityByerpFactoryCode 
	 * @Description: 更新
	 * @param entity
	 *
	 */
	Integer updateBaseAreaVersionEntityByerpVersionCode(BaseAreaVersionEntity entity);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午6:54:00
	 * @Title: selectBaseAreaVersionEntityByerpFactoryCode 
	 * @Description: 查询
	 * @param erpVersionCode 版本编号
	 * @return
	 *
	 */
	BaseAreaVersionEntity selectBaseAreaVersionEntityByerpVersionCode(String erpVersionCode);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月20日 上午9:43:51
	 * @Title: deleteBaseAreaVersionEntityByerpVersionCode 
	 * @Description: 册除
	 * @param erpVersionCode 版本编号
	 * @return
	 *
	 */
	Integer deleteBaseAreaVersionEntityByerpVersionCode(String erpVersionCode);
}