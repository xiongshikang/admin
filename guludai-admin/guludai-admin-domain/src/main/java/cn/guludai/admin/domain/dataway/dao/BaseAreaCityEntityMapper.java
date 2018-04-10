/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import cn.guludai.admin.domain.dataway.entity.BaseAreaCityEntity;
import cn.guludai.framework.datasource.bind.DataSourceMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseAreaCityEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaCityEntity}
	 */
	int insert(BaseAreaCityEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaCityEntity}
	 */
	int insertSelective(BaseAreaCityEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.String}
	 */
	BaseAreaCityEntity selectByPrimaryKey(@Param("provinceNo") String provinceNo ,
										  @Param("cityNo") String cityNo);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaCityEntity}
	 */
	int updateByPrimaryKeySelective(BaseAreaCityEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaCityEntity}
	 */
	int updateByPrimaryKey(BaseAreaCityEntity record);

    List<BaseAreaCityEntity> getCityInfo(@Param("provinceNo") String provinceNo);
}