package cn.guludai.admin.web;

import cn.guludai.admin.web.request.AppUserReq;
import cn.guludai.admin.web.request.PluginMonitorDataReq;
import cn.guludai.admin.web.response.AppUserResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 用户短信通知控制
 *
 * @author qiao.he
 * @create 2017-12-18 14:19
 **/
public interface AppUserWeb {
    /**
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:56:26
     * @Title: noticeSms
     * @Description: 用户短信通知列表
     * @param req
     * @return
     */
    @PostMapping("/web/appUser")
    public TableResultResponse<AppUserResponse> noticeSmsList(Request<AppUserReq> req);

    /**
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:56:26
     * @Title: noticeSms
     * @Description: 批量发送短信
     * @param req
     * @return
     */
    @PostMapping("/web/appUser/batchSendSms")
    public Response<String> batchSendSms(Request<String> req);

}
