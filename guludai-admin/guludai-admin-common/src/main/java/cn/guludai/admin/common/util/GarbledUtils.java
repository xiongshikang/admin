package cn.guludai.admin.common.util;

import java.io.UnsupportedEncodingException;

/**
 * @author HeQiao
 * @create 2018-01-23 11:27
 **/
public class GarbledUtils {

    /*乱码处理*/
    public static String conversion(String para) throws UnsupportedEncodingException {
        if (para.getBytes("ISO-8859-1") == null){
            return null;
        }
       return new String(para.getBytes("ISO-8859-1"),"UTF-8");
    }
}
