/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.dataway;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.constant.RedisConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.AESUtils;
import cn.guludai.admin.common.util.RSAUtils;
import cn.guludai.admin.common.util.RedisUtils;
import cn.guludai.admin.domain.dataway.dao.BaseShopErpEntityMapper;
import cn.guludai.admin.domain.dataway.entity.BaseShopErpEntityWithBLOBs;
import cn.guludai.admin.domain.resource.dao.PluginLicenseEntityMapper;
import cn.guludai.admin.domain.resource.dao.PluginRunningStateEntityMapper;
import cn.guludai.admin.domain.resource.entity.PluginLicenseEntity;
import cn.guludai.admin.domain.resource.entity.PluginRunningStateEntity;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.DatabaseModel;
import cn.guludai.admin.web.request.PluginLicenseReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.framework.cache.client.RedisClient;
import cn.guludai.framework.toolkit.id.GUID;
/**
 * 
 * @ClassName: PluginLicenseService 
 * @Description: 注册码信息服务类
 * @author: xiongshikang
 * @date: 2017年11月15日 上午11:56:30
 */
@Service
public class PluginLicenseService {
	
	private static final Logger logger = LoggerFactory.getLogger(PluginLicenseService.class);
	
	@Autowired
	private RedisClient client;
	@Autowired
	private PluginLicenseEntityMapper pluginLicenseEntityMapper;
	
	@Autowired
	private BaseShopErpEntityMapper baseShopErpEntityMapper;
	
	@Autowired
	private PluginRunningStateEntityMapper pluginRunningStateEntityMapper;

	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 上午11:34:12
	 * @Title: selectPluginLicenseList 
	 * @Description: 通过多种条件，查找注册码数据
	 * @param record
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 *
	 */
	public TableResultResponse<PluginLicenseReq> selectPluginLicenseList(PluginLicenseReq record) throws Exception{
		TableResultResponse<PluginLicenseReq> table =new TableResultResponse<PluginLicenseReq>();
	    List<PluginLicenseEntity> ls = pluginLicenseEntityMapper.selectPluginLicense(record);
        long total =  pluginLicenseEntityMapper.selectPluginLicenseCount(record);
       List<PluginLicenseReq> rows = new ArrayList<PluginLicenseReq>();
       for (PluginLicenseEntity p : ls) {
    	   PluginLicenseReq entity = new PluginLicenseReq();
    	   BeanUtils.copyProperties(entity, p);
		   Map baseShopErp = baseShopErpEntityMapper.getBaseShopErpNameOne(p.getLicenseIdcard());
		   entity.setCompanyName(baseShopErp.get("companyName")!=null?baseShopErp.get("companyName").toString():null);
		   entity.setShopName(baseShopErp.get("shopName")!=null?baseShopErp.get("shopName").toString():null);
		   entity.setErpFactoryName(baseShopErp.get("erpFactoryName")!=null?baseShopErp.get("erpFactoryName").toString():null);
		   entity.setErpVersionName(baseShopErp.get("erpVersionName")!=null?baseShopErp.get("erpVersionName").toString():null);
    	   if(p.getDataStatus().equals(BaseConstant.DATA_STATUS_Y)) {
    		   entity.setDataStatus("正常");
    	   }else {
    		   entity.setDataStatus("物理册除");
    	   }
    	   if(p.getDiskStatus().equals(BaseConstant.DISK_STATUS_Y)) {
    		   entity.setDiskStatus("正常");
    	   }else {
    		   entity.setDiskStatus("逻辑册除");
    	   }
    	   if(p.getLicenseStatus().equals(BaseConstant.LICENSE_STATUS_Y)) {
    		   entity.setLicenseStatus("<h5>可用</h5>"); 
    	   }else {
    		   entity.setLicenseStatus("<h5 style='color:red;'>禁用</h5>"); 
    	   }
    	   rows.add(entity) ;
       }
       table.setRows(rows);
       table.setTotal(total);
       return table;
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 上午11:55:43
	 * @Title: add 
	 * @Description: 添加注册码
	 * @param
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 *
	 */
	public ResultModel<String> add(PluginLicenseReq license)  {
		ResultModel<String> result = new ResultModel<String>();
		/** 盐值*/
		String dataSalt = RSAUtils.generateKey();

		PluginLicenseEntity entity = new PluginLicenseEntity();
		entity.setCompanyCode(license.getCompanyCode());
		entity.setErpFactoryCode(license.getErpFactoryCode());
		entity.setErpVersionCode(license.getErpVersionCode());
		entity.setShopCode(license.getShopCode());
		entity.setExpireTime(license.getExpireTime());
		entity.setUsedCount(0);
		/**
		 * 身份识别码
		 */
		String licenseIdcard = GUID.randomGUID();
		/**
		 * 写入身份识别号，后面操作需要用到
		 */
		license.setLicenseIdcard(licenseIdcard);
		entity.setLicenseIdcard(licenseIdcard);
		/**
		 * 可用状态
		 */
		entity.setLicenseStatus(BaseConstant.LICENSE_STATUS_Y);
		entity.setLicenseCode(GUID.randomGUID());
		entity.setUpdateTime(new Date());
		entity.setCreateTime(new Date());
		entity.setLicenseUpload(BaseConstant.LICENSE_UP_LOAD_Y);
		entity.setVersion(1L);
		entity.setDataStatus(BaseConstant.DATA_STATUS_Y);
		entity.setDiskStatus(BaseConstant.DISK_STATUS_Y);
		
		/**
		 * 生成插件运行环境状态信息
		 */
		try {
			createPluginRunningState(license , dataSalt);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			result.setCode(AdminBaseCode.AES_CREATE_ERROR.getCode());
			return result;
		}

		/**
		 * 创建注册码
		 */
		pluginLicenseEntityMapper.insert(entity);
		
		/**
		 * 生成安全信息
		 */
		try {
			createBaseShopErp(license , dataSalt);
		} catch (Exception e) {
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			result.setCode(AdminBaseCode.RSA_CREATE_ERROR.getCode());
			return result;
		}
		
		result.setCode(AdminBaseCode.SUCCESS.getCode());	
		return result;
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:39:23
	 * @Title: edit 
	 * @Description: 修改注册码信息
	 * @param license
	 *
	 */
	public void edit(PluginLicenseReq license) {
		Date expireTime = license.getExpireTime() ;
		Integer usedCount = license.getUsedCount() ;
		String licenseStatus = license.getLicenseStatus() ;
		String licenseCode = license.getLicenseCode() ;
		PluginLicenseEntity entity = pluginLicenseEntityMapper.selectLicenseByLicenseCode(licenseCode);
		PluginLicenseEntity param = new PluginLicenseEntity();
		param.setExpireTime(expireTime);
		param.setUsedCount(usedCount);
		param.setLicenseStatus(licenseStatus);
		param.setLicenseCode(licenseCode);
		param.setLicenseUpload(license.getLicenseUpload());
		param.setUpdateTime(new Date());
		pluginLicenseEntityMapper.updateLicenseInfoByLicenseCode(param);
		
		if(!license.getLicenseUpload().equals(entity.getLicenseUpload())) {
			/**
			 *如果更新数据下载指令有变动，册除redis中保存的注册码信息，把是否充许上传数据信息写入缓存
			 */
			RedisUtils.del(RedisConstant.PLUGIN_CURRENT+entity.getLicenseIdcard(), client);
		}
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:59:53
	 * @Title: select 
	 * @Description: 通过注册编号查找注册信息
	 * @param licenseCode
	 * @return
	 * @throws Exception
	 *
	 */
	public PluginLicenseReq select(String licenseCode) throws Exception {
		PluginLicenseEntity entity = pluginLicenseEntityMapper.selectLicenseByLicenseCode(licenseCode);
		PluginLicenseReq req = new PluginLicenseReq();
		BeanUtils.copyProperties(req , entity);
		return req;
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午2:50:51
	 * @Title: delete 
	 * @Description: 逻辑册除
	 * @param licenseCode
	 *
	 */
	public void delete(String licenseCode) {
		pluginLicenseEntityMapper.deleteLicenseInfoByShopCode(licenseCode);
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 上午9:57:50
	 * @Title: createBaseShopErp 
	 * @Description: 创建门店安全信息 
	 * @param license
	 * @throws Exception 
	 *
	 */
	private void createBaseShopErp(PluginLicenseReq license , String dataSalt) throws Exception {
		BaseShopErpEntityWithBLOBs record = new BaseShopErpEntityWithBLOBs();
		Map<String,String> param = RSAUtils.getRSA();
		record.setCompanyCode(license.getCompanyCode());
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		/**
		 * 私钥
		 */
		record.setDataPrivateKey(param.get("privateKeyStr"));
		/**
		 * 公钥
		 */
		record.setDataPublicKey(param.get("publicKeyStr")); 
		/**
		 * 盐值
		 */
		record.setDataSalt(dataSalt);
		/**
		 * 门店安装的插件授权身份号,通过授权身份号就可以与插件一一对应
		 */
		record.setPluginLicenseIdcard(license.getLicenseIdcard());
		record.setDiskStatus(BaseConstant.DISK_STATUS_Y);
		record.setDataStatus(BaseConstant.DATA_STATUS_Y);
		record.setErpFactoryCode(license.getErpFactoryCode());
		record.setErpVersionCode(license.getErpVersionCode());
		record.setShopCode(license.getShopCode());
		record.setVersion(1L);
		baseShopErpEntityMapper.insert(record);
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 上午10:52:43
	 * @Title: createPluginRunningState 
	 * @Description: 生成插件运行环境状态初始数据
	 * @param license
	 *
	 */
	private void createPluginRunningState(PluginLicenseReq license , String dataSalt) throws Exception {
		List<DatabaseModel> ls = license.getDatabaseModel();
		if(null!=ls && ls.size()>0) {
			for (DatabaseModel d : ls) {
				PluginRunningStateEntity entity = new PluginRunningStateEntity();
				entity.setCompanyCode(license.getCompanyCode());
				entity.setStateCode(GUID.randomGUID());
				entity.setPluginIdcard(license.getLicenseIdcard());
				entity.setCreateTime(new Date());
				entity.setUpdateTime(new Date());
				entity.setVersion(1L);
				entity.setDataStatus(BaseConstant.DISK_STATUS_Y);
				entity.setDiskStatus(BaseConstant.DATA_STATUS_Y);
				entity.setDbIp(d.getDbIp());
				entity.setDbName(d.getDbName());
				entity.setDbPassword(AESUtils.encryptData(d.getDbPassword() ,dataSalt ));
				entity.setDbPost(d.getDbPost());
				entity.setDbType(d.getDbType());
				entity.setDbUsername(d.getDbUsername());
				entity.setShopCode(license.getShopCode());
				pluginRunningStateEntityMapper.insert(entity);
			}
		}
	}


}
