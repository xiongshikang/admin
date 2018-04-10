/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.resource.dao;

import java.util.List;

import cn.guludai.admin.domain.resource.entity.PluginLicenseEntity;
import cn.guludai.admin.web.request.PluginLicenseReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "plugin")
public interface PluginLicenseEntityMapper {
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
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginLicenseEntity}
	 */
	int insert(PluginLicenseEntity record);

	/**
	 * 插入数据库记录(仅仅插入非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginLicenseEntity}
	 */
	int insertSelective(PluginLicenseEntity record);

	/**
	 * 根据主键ID查询数据库记录
	 * 
	 * @param id
	 *              {@link java.lang.Long}
	 */
	PluginLicenseEntity selectByPrimaryKey(Long id);

	/**
	 * 根据主键ID来更新数据库记录(仅仅修改非空属性)
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginLicenseEntity}
	 */
	int updateByPrimaryKeySelective(PluginLicenseEntity record);

	/**
	 * 根据主键ID更新数据库记录
	 * 
	 * @param record
	 *              {@link cn.guludai.admin.domain.resource.entity.PluginLicenseEntity}
	 */
	int updateByPrimaryKey(PluginLicenseEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 上午11:08:26
	 * @Title: selectPluginLicense 
	 * @Description: 条件查找注册码信息 
	 * @param record
	 * @return
	 *
	 */
	List<PluginLicenseEntity> selectPluginLicense(PluginLicenseReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午2:54:28
	 * @Title: selectPluginLicenseCount 
	 * @Description: 通过多条件查找注册码数量
	 * @return
	 *
	 */
	Long selectPluginLicenseCount(PluginLicenseReq record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:33:27
	 * @Title: updateLicenseInfoByShopCode 
	 * @Description: 通过注册编号修改插件信息
	 * @param record
	 *
	 */
	int updateLicenseInfoByLicenseCode(PluginLicenseEntity record);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:52:03
	 * @Title: selectLicenseByLicenseCode 
	 * @Description: 通过注册码编号查找注册信息
	 * @param licenseCode 注册码编号
	 *
	 */
	PluginLicenseEntity selectLicenseByLicenseCode(String licenseCode);
	 
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午2:49:38
	 * @Title: deleteLicenseInfoByShopCode 
	 * @Description: 逻辑册除注册信息
	 * @param licenseCode
	 *
	 */
	void deleteLicenseInfoByShopCode(String licenseCode);
	
}