/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import java.util.List;

import cn.guludai.admin.domain.dataway.entity.BaseAreaFactoryEntity;
import cn.guludai.admin.web.resource.request.BaseErpFactoryReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseAreaFactoryEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaFactoryEntity}
	 */
	int insert(BaseAreaFactoryEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaFactoryEntity}
	 */
	int insertSelective(BaseAreaFactoryEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	BaseAreaFactoryEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaFactoryEntity}
	 */
	int updateByPrimaryKeySelective(BaseAreaFactoryEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaFactoryEntity}
	 */
 
	List<BaseAreaFactoryEntity> findBaseErpFactory();
 
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午4:18:30
	 * @Title: selectBaseAreaFactoryEntityPage 
	 * @Description: 分页厂商列表
	 * @param req
	 * @return
	 *
	 */
	List<BaseAreaFactoryEntity> selectBaseAreaFactoryEntityPage(BaseErpFactoryReq req);
	
	/**
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午4:19:22
	 * @Title: selectBaseAreaFactoryEntityPageCount 
	 * @Description: 厂商总数
	 * @param req
	 * @return
	 */
	Integer selectBaseAreaFactoryEntityPageCount(BaseErpFactoryReq req);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午5:02:55
	 * @Title: deleteBaseErpFactoryReqByerpFactoryCode 
	 * @Description: 逻辑册除
	 * @param erpFactoryCode
	 * @return
	 *
	 */
	Integer deleteBaseErpFactoryReqByerpFactoryCode(String erpFactoryCode);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午5:03:36
	 * @Title: selectErpFactoryReqByerpFactoryCode 
	 * @Description: 查询单个厂商信息
	 * @param erpFactoryCode
	 *
	 */
	BaseAreaFactoryEntity selectErpFactoryReqByerpFactoryCode(String erpFactoryCode);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月19日 下午5:04:59
	 * @Title: updateBaseErpFactoryReqByerpFactoryCode 
	 * @Description: 更新厂商信息
	 * @param record
	 * @return
	 *
	 */
	Integer updateBaseErpFactoryReqByerpFactoryCode(BaseAreaFactoryEntity record);
	
	
}