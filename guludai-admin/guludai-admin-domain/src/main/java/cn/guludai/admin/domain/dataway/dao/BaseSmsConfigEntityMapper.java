/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import cn.guludai.admin.domain.dataway.entity.BaseSmsConfigEntity;
import cn.guludai.framework.datasource.bind.DataSourceMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseSmsConfigEntityMapper {
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
	 *
	 */
	int insert(BaseSmsConfigEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 *
	 * @param record
	 *
	 */
	int insertSelective(BaseSmsConfigEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 *
	 * @param id
	 *              {@link Long}
	 */
	BaseSmsConfigEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 *
	 * @param record
	 *
	 */
	int updateByPrimaryKeySelective(BaseSmsConfigEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 *
	 * @param record
	 *
	 */
	int updateByPrimaryKey(BaseSmsConfigEntity record);

	/**
	 * 根据短信模板查询
	 * @param smsCode
	 * @return
	 */
	BaseSmsConfigEntity selectByCode(@Param("smsCode") String smsCode,
									 @Param("smsType") String smsType);
}