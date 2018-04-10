/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.UUID;
/**
 * Created by heqiao on 2017/10/15.
 */

/**
 * AES工具类，密钥必须是16位字符串
 */
public class AESUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(AESUtils.class);
	
    /**偏移量,必须是16位字符串*/
    private static final String IV_STRING = "16-Bytes--String";

    /**
     * 默认的密钥
     */
    public static final String DEFAULT_KEY = "1bd83b249a414036";

    /**
     * 产生随机密钥(这里产生密钥必须是16位)
     */
    public static String generateKey() {
        String key = UUID.randomUUID().toString();
        key = key.replace("-", "").substring(0, 16);// 替换掉-号
        return key;
    }
    
    	/**
    	 * 
    	 * @author: xiongshikang
    	 * @date: 2017年11月19日 上午11:16:46
    	 * @Title: encryptData 
    	 * @Description: aes加密
    	 * @param str
    	 * @param key
    	 * @return
    	 * @throws Exception
    	 *
    	 */
        public static String encryptData(String str, String key) throws Exception {
            if (str == null || key == null) return null;
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes("utf-8"), "AES"));
            byte[] bytes = cipher.doFinal(str.getBytes("utf-8"));
            return new BASE64Encoder().encode(bytes);
        }

        public static String decryptData(String str, String key) throws Exception {
            if (str == null || key == null) return null;
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes("utf-8"), "AES"));
            byte[] bytes = new BASE64Decoder().decodeBuffer(str);
            bytes = cipher.doFinal(bytes);
            return new String(bytes, "utf-8");
        }

    public static void main(String[] args) throws Exception {
    	/*String str = FileUtil.getBytes("d:/Guludai Service.zip");
        String text;
		try {
			text = AESUtils.encryptData(str,"F431E6FF9051DA07");
			System.out.println(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	String pwd = "474965564F644F7956675476";
    	String newpwd = AESUtils.encryptData(pwd, "e0cdeed3c62b4b4e");
        System.out.println(newpwd);
 
    }
}
