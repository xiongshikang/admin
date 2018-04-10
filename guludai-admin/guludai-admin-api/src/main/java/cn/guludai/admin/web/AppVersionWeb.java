package cn.guludai.admin.web;

import cn.guludai.admin.web.request.AppVersionReq;
import cn.guludai.admin.web.response.AppVersionResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author HeQiao
 * @create 2018-01-18 10:21
 **/
public interface AppVersionWeb {

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:44:56
     * @Title:
     * @Description:
     * @param request
     * @return
     *
     */
    @PostMapping("/web/appVersion")
    public TableResultResponse<AppVersionResponse> getAppVersion(Request<AppVersionReq> request);


    /**
     *
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:44:56
     * @Title:
     * @Description:
     * @param request
     * @return
     *
     */
    @PostMapping("/web/appVersion/select")
    public Response<AppVersionResponse> select(Request<String> request);

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:44:56
     * @Title:
     * @Description:
     * @param req
     * @param multiReq
     * @return
     *
     */
    @PostMapping("/web/appVersion/edit")
    public Response<AppVersionResponse> edit(HttpServletRequest req, MultipartHttpServletRequest multiReq);

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:44:56
     * @Title:
     * @Description:
     * @param
     * @return
     *
     */
    @PostMapping("/web/appVersion/add")
    public  Response<String>  add(HttpServletRequest req , MultipartHttpServletRequest multiReq) throws UnsupportedEncodingException;
    /**
     *
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:44:56
     * @Title:
     * @Description:
     * @param request
     * @return
     *
     */
    @PostMapping("/web/appVersion/delete")
    public Response<Void> delete(Request<String> request);


    /**
     *
     * @author: qiao.he
     * @date: 2017年11月15日 下午1:13:24
     * @Title: pluginVersion
     * @Description: 获取插件的物理地址
     * @param
     * @return
     *
     */
    @GetMapping("/web/appVersion/physicalAddress")
    public  Response<String>  physicalAddress();
}
