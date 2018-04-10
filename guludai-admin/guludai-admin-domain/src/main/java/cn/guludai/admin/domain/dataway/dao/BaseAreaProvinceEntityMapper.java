/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import cn.guludai.admin.domain.dataway.entity.BaseAreaProvinceEntity;
import cn.guludai.framework.datasource.bind.DataSourceMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseAreaProvinceEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaProvinceEntity}
	 */
	int insert(BaseAreaProvinceEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaProvinceEntity}
	 */
	int insertSelective(BaseAreaProvinceEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param provinceNo
	 *              {@link java.lang.String}
	 */
	BaseAreaProvinceEntity selectByPrimaryKey(@Param("provinceNo") String provinceNo);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaProvinceEntity}
	 */
	int updateByPrimaryKeySelective(BaseAreaProvinceEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseAreaProvinceEntity}
	 */
	int updateByPrimaryKey(BaseAreaProvinceEntity record);

	/**
	 * //获取所有的省的信息
	 */
	List<BaseAreaProvinceEntity> getProvinceInfo();
}