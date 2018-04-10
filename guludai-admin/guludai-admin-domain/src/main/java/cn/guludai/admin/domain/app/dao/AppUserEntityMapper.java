/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.app.dao;

import cn.guludai.admin.domain.app.entity.AppUserEntity;
import cn.guludai.admin.web.request.AppUserReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;
import java.util.List;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "app")
public interface AppUserEntityMapper {
	/**
	 * 根据主键ID删除数据库的记录
	 * 
	 * @param id
	 *              {@link Long}
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * 插入数据库记录
	 *
	 * @param record
	 */
	int insert(AppUserEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 *
	 * @param record
	 */
	int insertSelective(AppUserEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 *
	 * @param accountId
	 *              {@link Long}
	 */
	AppUserEntity selectByPrimaryKey(String accountId);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 */
	int updateByPrimaryKeySelective(AppUserEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 */
	int updateByPrimaryKey(AppUserEntity record);

	/**
	 * 参数查询
	 *
	 */
	List<AppUserEntity> selectByCondition(AppUserEntity appUserEntity);

	/**
	 * 参数查询
	 *
	 */
	List<AppUserEntity> selectByConditionByPing(AppUserReq appUserReq);

	Integer selectByConditionNumByPing(AppUserReq appUserReq);
}