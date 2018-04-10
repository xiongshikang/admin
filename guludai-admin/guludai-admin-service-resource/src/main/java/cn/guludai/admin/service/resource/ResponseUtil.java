/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.resource;

import cn.guludai.admin.web.enums.AdminBaseCode;
import cn.guludai.api.data.Response;

/**
 * 对Response类通用的方法进行封装
 * @author HeQiao
 * @create 2017-11-05 13:23
 **/
public class ResponseUtil {

    /**
        * @Description: 根据flag返回Response
        * @Author: HeQiao
        * @Date:  2017/11/5 15:51
    */
    public static Response<Void> checkState(int flag){
        Response<Void> response = new Response<>();
        if(flag<1){
            response.setCode(AdminBaseCode.ERROR_INVALID.getCode());
            response.setMessage(AdminBaseCode.ERROR_INVALID.getMessage());
            response.setStatus(false);
        }else{
            response.setCode(AdminBaseCode.SUCCESS.getCode());
            response.setMessage(AdminBaseCode.SUCCESS.getMessage());
            response.setStatus(true);
        }
        return  response;
    }

}
