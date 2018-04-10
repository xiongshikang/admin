/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.guludai.admin.domain.resource.entity.PluginSecurityUserEntity;

/**
 * 
 * @ClassName: LoginController 
 * @Description: 登录控制器
 * @author: xiongshikang
 * @date: 2017年11月9日 下午7:58:05
 */
@Controller
public class LoginController {

    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月9日 下午7:58:23
     * @Title: login 
     * @Description: 登录页
     * @return
     *
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月9日 下午7:58:32
     * @Title: index 
     * @Description: 跳转首页
     * @return
     *
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String main() {
        return "main";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(HttpServletRequest request, PluginSecurityUserEntity user){
        if (StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword())) {
            request.setAttribute("msg", "用户名或密码不能为空！");
            return "login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try {
            subject.login(token);
            return "redirect:index";
        }catch (AuthenticationException e) {
            token.clear();
            request.setAttribute("msg", "用户或密码不正确！");
            return "login";
        }
    }
}
