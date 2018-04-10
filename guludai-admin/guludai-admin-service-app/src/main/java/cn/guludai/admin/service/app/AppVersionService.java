package cn.guludai.admin.service.app;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.common.util.FileUtils;
import cn.guludai.admin.common.util.GarbledUtils;
import cn.guludai.admin.domain.app.dao.AppVersionEntityMapper;
import cn.guludai.admin.domain.app.entity.AppVersionEntity;
import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.admin.web.request.AppVersionReq;
import cn.guludai.admin.web.request.PluginVersionReq;
import cn.guludai.admin.web.response.AppVersionResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.api.data.Response;
import cn.guludai.container.runtime.profile.RuntimeEnvironment;
import cn.guludai.framework.toolkit.id.GUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author HeQiao
 * @create 2018-01-18 10:45
 **/
@Service
public class AppVersionService {

    private static final Logger logger = LoggerFactory.getLogger(AppVersionService.class);

    @Autowired
    AppVersionEntityMapper appVersionEntityMapper;

    public TableResultResponse<AppVersionResponse> list(AppVersionReq appVersionReq) {
        TableResultResponse<AppVersionResponse> tableResultResponse = new TableResultResponse<>();
        List<AppVersionEntity> orilist = appVersionEntityMapper.selectByConditionByPing(appVersionReq);
        List<AppVersionResponse> trgetList = new ArrayList<>();
        for (AppVersionEntity entity : orilist) {
            AppVersionResponse appVersionResponse = new AppVersionResponse();
            BeanUtils.copyProperties(entity , appVersionResponse);

            if(entity.getVersionUpgrade().equals(BaseConstant.VERSION_UPGRADE_Y)) {
                appVersionResponse.setVersionUpgrade("强制升级");
            }else {
                appVersionResponse.setVersionUpgrade("选择性升级");
            }
            if(entity.getVersionStatus().equals(BaseConstant.VERSION_STATUS_Y)) {
                appVersionResponse.setVersionStatus("启用");
            }else {
                appVersionResponse.setVersionStatus("停用");
            }

            if(entity.getDataStatus().equals(BaseConstant.DATA_STATUS_Y)) {
                appVersionResponse.setDataStatus("正常");
            }else {
                appVersionResponse.setDataStatus("物理册除");
            }
            if(entity.getDiskStatus().equals(BaseConstant.DISK_STATUS_Y)) {
                appVersionResponse.setDiskStatus("正常");
            }else {
                appVersionResponse.setDiskStatus("逻辑册除");
            }


            trgetList.add(appVersionResponse);
        }
        tableResultResponse.setRows(trgetList);
        tableResultResponse.setTotal(appVersionEntityMapper.selectByConditionNumByPing(appVersionReq));
        return tableResultResponse;
    }

    public Response<String> add(HttpServletRequest req, MultipartHttpServletRequest multiReq) throws UnsupportedEncodingException {
        int maxOrder = appVersionEntityMapper.selectMaxVersionOrder();
        AppVersionEntity appVersionEntity = new AppVersionEntity();
        appVersionEntity.setVersionCode(GUID.randomGUID());
        appVersionEntity.setVersionNumber(req.getParameter("versionNumber"));
        appVersionEntity.setVersionStatus(req.getParameter("versionStatus"));
        appVersionEntity.setVersionUpgrade(req.getParameter("versionUpgrade"));
        appVersionEntity.setVersionDescription(GarbledUtils.conversion(req.getParameter("versionDescription")));
        appVersionEntity.setDownloadPlatform(req.getParameter("downloadPlatform"));
        appVersionEntity.setVersionOrder(maxOrder+1);
        appVersionEntity.setVersion(1L);
        appVersionEntity.setCreateTime(new Date());
        appVersionEntity.setUpdateTime(new Date());
        appVersionEntity.setDataStatus(BaseConstant.DATA_STATUS_Y);
        appVersionEntity.setDiskStatus(BaseConstant.DISK_STATUS_Y);
        try {
            FileUtils.upload(multiReq , req.getParameter("downloadPath"));
        } catch (Exception e) {
            e.printStackTrace();
            return Response.failure(AdminBaseCode.ERROR_UPLOAD);
        }
        String downloadUrl = RuntimeEnvironment.getPropertiesByUtf8("upload.app.download") + multiReq.getFile("downloadFile").getOriginalFilename();
        appVersionEntity.setDownloadUrl(downloadUrl);
        appVersionEntityMapper.insert(appVersionEntity);
        return Response.success(BaseCode.SUCCESS);
    }


    public ResultModel<String> upload(MultipartHttpServletRequest multiReq , AppVersionEntity model) {
        ResultModel<String> resultModel = new ResultModel();
        try{
            FileOutputStream fos=new FileOutputStream(new File(model.getDownloadUrl()));
            FileInputStream fs=(FileInputStream) multiReq.getFile("downloadFile").getInputStream();
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



    public Response<AppVersionResponse> select(String versionCode) {
        Response<AppVersionResponse> response = new Response<>();
        AppVersionEntity appVersionEntity = appVersionEntityMapper.selectByPrimaryKey(versionCode);
        AppVersionResponse appVersionResponse = new AppVersionResponse();
        BeanUtils.copyProperties(appVersionEntity ,appVersionResponse );
        String downloadUrl = appVersionEntity.getDownloadUrl();
        String downloadPath = RuntimeEnvironment.getPropertiesByUtf8("upload.app.path") +  downloadUrl.substring(downloadUrl.lastIndexOf("/")+1, downloadUrl.length());
        appVersionResponse.setDownloadPath(downloadPath);
        response.setData(appVersionResponse);
        response.setCode(BaseCode.SUCCESS.getCode());
        response.setStatus(true);
        return response;
    }

    public Response<AppVersionResponse> edit(HttpServletRequest req , MultipartHttpServletRequest multiReq ) throws UnsupportedEncodingException {
        AppVersionEntity entity = new AppVersionEntity();
        entity.setVersionCode(req.getParameter("versionCode"));
        entity.setVersionNumber(req.getParameter("versionNumber"));
        entity.setVersionStatus(req.getParameter("versionStatus"));
        entity.setVersionUpgrade(req.getParameter("versionUpgrade"));
        entity.setVersionDescription(GarbledUtils.conversion(req.getParameter("versionDescription")));
        entity.setDownloadUrl(GarbledUtils.conversion(req.getParameter("downloadUrl")));
        entity.setDownloadPlatform(req.getParameter("downloadPlatform"));
        entity.setUpdateTime(new Date());
        if (multiReq.getMultiFileMap().size()!=0){
            try {
                FileUtils.upload(multiReq , req.getParameter("downloadPath"));
            } catch (Exception e) {
                return Response.failure(AdminBaseCode.ERROR_UPLOAD);
            }
        }
        String downloadUrl = RuntimeEnvironment.getPropertiesByUtf8("upload.app.download") + multiReq.getFile("downloadFile").getOriginalFilename();
        entity.setDownloadUrl(downloadUrl);
        if (appVersionEntityMapper.updateByPrimaryKeySelective(entity)<1){
            return Response.failure(AdminBaseCode.ERROR_INVALID);
        }

        return Response.success(BaseCode.SUCCESS);
    }

    public Response<Void> delete(String versionCode) {
        AppVersionEntity appVersionEntity = appVersionEntityMapper.selectByPrimaryKey(versionCode);
        if (!FileUtils.deleteFile(appVersionEntity.getDownloadUrl())){
            return Response.failure(AdminBaseCode.ERROR_FILE_DEL);
        }
        AppVersionEntity entity = new AppVersionEntity();
        entity.setVersionCode(versionCode);
        entity.setDiskStatus(BaseConstant.DISK_STATUS_N);
        entity.setDataStatus(BaseConstant.DATA_STATUS_N);
        if (appVersionEntityMapper.updateByPrimaryKeySelective(entity)<1){
            return Response.failure(AdminBaseCode.ERROR_INVALID);
        }
        return Response.success(BaseCode.SUCCESS);
    }
}
