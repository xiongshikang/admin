package cn.guludai.admin.common.util;

import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.api.code.BaseCode;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件或者文件夹有关操作
 *
 * @author qiao.he
 * @create 2018-01-17 17:11
 **/
public class FileUtils {
    /**
     * 上传文件
     */
    public static void upload(MultipartHttpServletRequest multiReq, String path) throws Exception {
        ResultModel<String> resultModel = new ResultModel();
        File  headPath = new File(path.substring(0 ,path.lastIndexOf("/")));
        if(!headPath.exists()){//判断文件夹是否创建，没有创建则创建新文件夹
            headPath.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(new File(path));
        FileInputStream fs = (FileInputStream) multiReq.getFile("downloadFile").getInputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fs.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        fs.close();
        resultModel.setCode(BaseCode.SUCCESS.getCode());
    }

    /**创建文件夹*/
    public static boolean createDir(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    /**创建文件*/
    /**
     * 创建新文件
     *
     * @param path 目录
     * @param fileName 文件名
     * @throws IOException
     */
    public static boolean createFile(String path, String fileName) throws IOException {
        File file = new File(path + "\\" + fileName);
        if (!file.exists()) {
            file.getParentFile().mkdirs();// 建立上层文件夹
            return file.createNewFile();
        }
        return true;
    }

    /**删除文件*/
    public static boolean deleteFile(String file){
        File f = new File(file);
        if(f.exists() && f.isFile()){
            return f.delete();
        }
        return true;
    }

    /**删除文件夹*/
    public static boolean deleteDir(String file){
        File f = new File(file);
        if(f.exists() && f.isDirectory()){
            return f.delete();
        }
        return true;
    }

    /**删除文件夹或者文件*/
    public static boolean deleteFileOrDir(String file){
        File f = new File(file);
        if(f.exists()){
            return f.delete();
        }
        return true;
    }
}
