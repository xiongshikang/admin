/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import java.util.List;

import cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity;
import cn.guludai.admin.web.resource.request.BaseShopCompanyReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseShopCompanyEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity}
	 */
	int insert(BaseShopCompanyEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity}
	 */
	int insertSelective(BaseShopCompanyEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	BaseShopCompanyEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity}
	 */
	int updateByPrimaryKeySelective(BaseShopCompanyEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity}
	 */
	int updateByPrimaryKey(BaseShopCompanyEntity record);
	
	List<BaseShopCompanyEntity> selectCompanyAll();
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月20日 上午11:37:00
	 * @Title: selectBaseShopCompanyEntityPage 
	 * @Description: 分页查询公司信息
	 * @param record
	 * @return
	 *
	 */
	List<BaseShopCompanyEntity> selectBaseShopCompanyEntityPage(BaseShopCompanyReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月20日 上午11:37:29
	 * @Title: selectBaseShopCompanyEntityPageCount 
	 * @Description: 分页总数
	 * @param record
	 * @return
	 *
	 */
	Integer selectBaseShopCompanyEntityPageCount(BaseShopCompanyReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月20日 上午11:38:01
	 * @Title: updateBaseShopCompanyEntityByShopCompanyCode 
	 * @Description: 更新
	 * @param entity
	 *
	 */
	Integer updateBaseShopCompanyEntity(BaseShopCompanyEntity entity);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月20日 下午1:34:41
	 * @Title: updateBaseShopCompanyEntity 
	 * @Description: 更新
	 * @param shopCompanyCode 门 
	 * @return
	 *
	 */
	BaseShopCompanyEntity selectBaseShopCompanyEntityByShopCompanyCode(String shopCompanyCode);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年12月20日 上午11:39:22
	 * @Title: deleteBaseShopCompanyEntityByShopCompanyCode 
	 * @Description: 通过公司编号逻辑删除作公司信息
	 * @param shopCompanyCode
	 *
	 */
	Integer deleteBaseShopCompanyEntityByShopCompanyCode(String shopCompanyCode);
	
	
     
}