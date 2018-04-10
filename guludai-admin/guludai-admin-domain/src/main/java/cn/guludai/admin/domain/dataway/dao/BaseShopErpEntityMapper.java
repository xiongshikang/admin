/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.guludai.admin.domain.dataway.entity.BaseShopErpEntity;
import cn.guludai.admin.domain.dataway.entity.BaseShopErpEntityWithBLOBs;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseShopErpEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopErpEntityWithBLOBs}
	 */
	int insert(BaseShopErpEntityWithBLOBs record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopErpEntityWithBLOBs}
	 */
	int insertSelective(BaseShopErpEntityWithBLOBs record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	BaseShopErpEntityWithBLOBs selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopErpEntityWithBLOBs}
	 */
	int updateByPrimaryKeySelective(BaseShopErpEntityWithBLOBs record);

	/**
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopErpEntityWithBLOBs}
	 */
	int updateByPrimaryKeyWithBLOBs(BaseShopErpEntityWithBLOBs record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.dataway.entity.BaseShopErpEntity}
	 */
	int updateByPrimaryKey(BaseShopErpEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午4:20:40
	 * @Title: selectBaseShopErpCountByShopCode 
	 * @Description: 通过门店编号查找全安信息数量
	 * @param shopCode
	 * @return
	 *
	 */
	int selectBaseShopErpCountByShopCode(String shopCode);

	/**
	 * @author: 根据店铺id ， 公司id， Erp产商， Erp版本 查询插件
	 * @param erpFactoryCode 厂商编号
	 * @param erpVersionCode 版本编号
	 * @param shopCode 门店编号
	 * @param companyCode 公司编号
	 * @param pluginLicenseIdcard 门店安装的插件授权身份号
	 * @return
	 */
	Map getBaseShopErpNameOne(@Param("pluginLicenseIdcard")String pluginLicenseIdcard);
}