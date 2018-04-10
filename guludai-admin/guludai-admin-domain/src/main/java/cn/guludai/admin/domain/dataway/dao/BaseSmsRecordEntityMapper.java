/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import cn.guludai.admin.domain.dataway.entity.BaseSmsRecordEntity;
import cn.guludai.framework.datasource.bind.DataSourceMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseSmsRecordEntityMapper {
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
	int insert(BaseSmsRecordEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 *
	 * @param record
	 */
	int insertSelective(BaseSmsRecordEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 *
	 * @param id
	 *              {@link Long}
	 */
	BaseSmsRecordEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(BaseSmsRecordEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(BaseSmsRecordEntity record);

	List<BaseSmsRecordEntity> selectSmsRecord(BaseSmsRecordEntity baseSmsRecordEntity);
	/**
	 * 校验验证码是否有效
	 * @param baseSmsRecordEntity
	 */
    int verifySms(BaseSmsRecordEntity baseSmsRecordEntity);

	void updateBySmsRecord(@Param("smsRecord") String smsRecord);

	int selectSmsMaxNum(@Param("smsPhone") String smsPhone,
						@Param("type") String type);
}