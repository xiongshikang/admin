/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.common.util;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @ClassName: RSAUtils 
 * @Description: 全安信息生成帮助类
 * @author: xiongshikang
 * @date: 2017年11月17日 上午10:20:10
 */
public class RSAUtils {

    private static final Logger logger = LoggerFactory.getLogger(RSAUtils.class);

   /**
    * 
    * @author: xiongshikang
    * @date: 2017年11月17日 上午10:19:35
    * @Title: getRSA 
    * @Description: 生成公钥和私钥
    * @return 返回公私钥
    * @throws Exception
    *
    */
    public static Map<String,String> getRSA() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        String publicKeyStr = getPublicKeyStr(publicKey);
        String privateKeyStr = getPrivateKeyStr(privateKey);
        Map<String,String> map = new HashMap<String,String>();
        map.put("publicKeyStr", publicKeyStr);
        map.put("privateKeyStr", privateKeyStr);
        return map;
    }
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月17日 上午10:23:00
     * @Title: generateKey 
     * @Description: 随机salt盐生成
     * @return
     *
     */
    public static String generateKey() {
        String key = UUID.randomUUID().toString();
        key = key.replace("-", "").substring(0, 16);// 替换掉-号
        return key;
    }

    
    
    
    
    private static String getPrivateKeyStr(PrivateKey privateKey)
            throws Exception {
        return new String(Base64Utils.encode(privateKey.getEncoded()));
    }

    private static String getPublicKeyStr(PublicKey publicKey) throws Exception {
        return new String(Base64Utils.encode(publicKey.getEncoded()));
    }

    public static void main(String[] args) {
        System.out.println(generateKey());
        try {
            System.out.println( AESUtils.encryptData("admin12345" ,"411c32eaa1684dfc" ));;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
