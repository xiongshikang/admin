/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.dataway;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.guludai.admin.common.util.FileUtils;
import cn.guludai.admin.common.util.GarbledUtils;
import cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Response;
import cn.guludai.container.runtime.profile.RuntimeEnvironment;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.domain.dataway.dao.BaseAreaVersionEntityMapper;
import cn.guludai.admin.domain.resource.dao.PluginVersionEntityMapper;
import cn.guludai.admin.domain.resource.entity.PluginVersionEntity;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.PluginVersionReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.framework.toolkit.id.GUID;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @ClassName: PluginVersionService
 * @Description: 插件库服务类
 * @author: xiongshikang
 * @date: 2017年11月19日 下午12:16:19
 */
@Service
public class PluginVersionService {

	private static final Logger logger = LoggerFactory.getLogger(PluginVersionService.class);

	@Autowired
	private PluginVersionEntityMapper pluginVersionEntityMapper;

	@Autowired
	private BaseAreaVersionEntityMapper baseAreaVersionEntityMapper;
	/**
	 *
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午12:21:55
	 * @Title: add 插件添加
	 * @Description:
	 * @param req
	 *
	 */
	public ResultModel<String> add(HttpServletRequest req , MultipartHttpServletRequest multiReq) throws UnsupportedEncodingException {
		ResultModel<String> result = new ResultModel<String>();
		PluginVersionEntity entity = new PluginVersionEntity();
		entity.setUpdateTime(new Date());
		entity.setCreateTime(new Date());
		entity.setVersion(1L);
		entity.setDataStatus(BaseConstant.DATA_STATUS_Y);
		entity.setDiskStatus(BaseConstant.DISK_STATUS_Y);
		entity.setPluginCode(GUID.randomGUID());
		entity.setDownloadUrl(GarbledUtils.conversion(req.getParameter("downloadUrl")));
		entity.setDescription(GarbledUtils.conversion(req.getParameter("description")));
		entity.setErpFactoryCode(req.getParameter("erpFactoryCode"));
		entity.setErpVersionCode(req.getParameter("erpVersionCode"));
		entity.setPluginName(GarbledUtils.conversion(req.getParameter("pluginName")));
		entity.setPluginStatus(BaseConstant.PLUGIN_STATUS_Y);
		entity.setPluginVersion(req.getParameter("pluginVersion"));
		if (multiReq.getMultiFileMap().size()!=0){
			try {
				FileUtils.upload(multiReq , req.getParameter("downloadUrl"));
			} catch (Exception e) {
				result.setCode(AdminBaseCode.ERROR_UPLOAD.getCode());
				return result;
			}
		}

		PluginVersionEntity model = pluginVersionEntityMapper.selectPluginVersionFor(req.getParameter("erpFactoryCode"),req.getParameter("erpVersionCode"));
		if(null==model) {
			entity.setPluginVersionOrder(1);
		}else {
			entity.setPluginVersionOrder(model.getPluginVersionOrder()+1);
		}
		pluginVersionEntityMapper.insert(entity);
		result.setCode(AdminBaseCode.SUCCESS.getCode());
		return result;
	}

	/**
	 *
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午12:22:07
	 * @Title: edit
	 * @Description: 插件修改
	 * @param
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 *
	 */
	public ResultModel<String> edit(PluginVersionReq req) throws Exception {
		ResultModel<String> result = new ResultModel<String>();
		PluginVersionEntity entity = new PluginVersionEntity();
		BeanUtils.copyProperties(entity,req);
		pluginVersionEntityMapper.updateByPluginCode(entity);
		result.setCode(AdminBaseCode.SUCCESS.getCode());
		return result;
	}

	/**
	 *
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午12:22:15
	 * @Title: select
	 * @Description: 查询插件
	 * @param
	 * @return
	 *
	 */
	public ResultModel<PluginVersionReq> select(String pluginCode) {
		PluginVersionReq req = new PluginVersionReq();
		ResultModel<PluginVersionReq> result = new ResultModel<PluginVersionReq>();
		PluginVersionEntity entity = pluginVersionEntityMapper.selectPluginVersionByPluginCode(pluginCode);
		try {
			BeanUtils.copyProperties(req,entity);
		} catch (Exception e) {
			result.setCode(AdminBaseCode.COPY_PROPERTIES_ERROR.getCode());
			return result;
		}
		result.setResult(req);
		result.setCode(AdminBaseCode.SUCCESS.getCode());
		return result;

	}

	/**
	 *
	 * @author: xiongshikang
	 * @date: 2017年11月19日 下午12:22:30
	 * @Title: list
	 * @Description: 插件例表
	 * @param record
	 * @return
	 *
	 */
	public TableResultResponse<PluginVersionReq> list(PluginVersionReq record){
		TableResultResponse<PluginVersionReq> table =new TableResultResponse<PluginVersionReq>();
		PluginVersionEntity entity  = new PluginVersionEntity();
		List<PluginVersionEntity> ls = pluginVersionEntityMapper.selectPluginVersionList(record);
		Integer total = pluginVersionEntityMapper.selectPluginVersionListCount(entity);
		List<PluginVersionReq> reqLs = new ArrayList<PluginVersionReq>();
		for (PluginVersionEntity p : ls) {
			PluginVersionReq req = new PluginVersionReq();
			try {
				BeanUtils.copyProperties(req,p);
				Map<String , String > baseNameMap = baseAreaVersionEntityMapper.findBaseErpName(p.getErpVersionCode() , p.getErpFactoryCode());
				req.setErpVersionName(baseNameMap.get("erpVersionName"));
				req.setErpFactoryName(baseNameMap.get("erpFactoryName"));

			} catch (Exception e) {
				logger.error("["+AdminBaseCode.COPY_PROPERTIES_ERROR.getMessage()+"]");
			}
			reqLs.add(req);
		}
		table.setRows(reqLs);
		table.setTotal(total);
		return table ;

	}


	public ResultModel<String>  delete(String pluginCode) {
		ResultModel<String> resultModel = new ResultModel();
		/**文件保留*/
		/*
		PluginVersionEntity pluginVersionEntity = pluginVersionEntityMapper.selectPluginVersionByPluginCode(pluginCode);
		if (!FileUtils.deleteFile(pluginVersionEntity.getDownloadUrl())){
			resultModel.setCode(AdminBaseCode.ERROR_FILE_DEL.getCode());
			return resultModel;
		}*/
		int count = pluginVersionEntityMapper.deleteByPrimaryKey(pluginCode);
		if (count<1){
			resultModel.setCode(AdminBaseCode.ERROR_INVALID.getCode());
			return resultModel;
		}
		resultModel.setCode(BaseCode.SUCCESS.getCode());
		return resultModel;

	}

	public ResultModel<String> upload(MultipartHttpServletRequest multiReq ,PluginVersionReq model) {
		ResultModel<String> resultModel = new ResultModel();

		try{
			String headPathStr = model.getDownloadUrl();
			File  headPath = new File(headPathStr.substring(0 ,headPathStr.lastIndexOf("/")));
			if(!headPath.exists()){//判断文件夹是否创建，没有创建则创建新文件夹
				headPath.mkdirs();
			}
			FileOutputStream fos=new FileOutputStream(model.getDownloadUrl());
			FileInputStream fs=(FileInputStream) multiReq.getFile("pluginfile").getInputStream();
			byte[] buffer=new byte[1024];
			int len=0;
			while((len=fs.read(buffer))!=-1){
				fos.write(buffer, 0, len);
			}
			fos.close();
			fs.close();
		}catch (Exception e){
			logger.error("[系统运行错误:]" + e.getMessage(), e);
			resultModel.setCode(AdminBaseCode.ERROR_UPLOAD.getCode());
			return resultModel;
		}
		resultModel.setCode(BaseCode.SUCCESS.getCode());
		return resultModel;
	}

	/*获取插件的物理地址*/
	public Response<String> physicalAddress(String erpVersionCode) {
		BaseAreaVersionEntity baseAreaVersionEntity = baseAreaVersionEntityMapper.selectBaseAreaVersionEntityByerpVersionCode(erpVersionCode);
		if(baseAreaVersionEntity == null){
			return Response.failure(AdminBaseCode.ERROR_SQL);
		}
		String root = RuntimeEnvironment.getPropertiesByUtf8("upload.plugin.path");
		String erpDatabase = baseAreaVersionEntity.getErpDatabase();
		if (!StringUtils.isBlank(erpDatabase)){
			root = root +  erpDatabase +"/";
		}
		String erpVersion = baseAreaVersionEntity.getErpVersion();
		if (!StringUtils.isBlank(erpVersion)){
			root = root + erpVersion  +"/";
		}
		return Response.success(BaseCode.SUCCESS , root);
	}
}
