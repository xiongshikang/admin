/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.GetMapping;

public interface HomeWeb {
	
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月9日 下午7:58:23
     * @Title: login 
     * @Description: from表单
     * @return
     *
     */
    @GetMapping("/pluginLicense")
    public String pluginLicense();
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月15日 下午3:56:27
     * @Title: pluginLicense 
     * @Description: 添加或编辑注册码
     * @return
     *
     */
    @GetMapping("/pluginLicense/edit")
    public String edit();
    
    @GetMapping("/pluginLicense/edit2")
    public String edit2();
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:12
     * @Title: pluginVersion 
     * @Description: 跳转到插件库页面
     * @return
     *
     */
    @GetMapping("/pluginVersion")
    public String pluginVersion();
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月19日 下午2:34:38
     * @Title: edit 编辑插件信息
     * @Description: 
     * @return
     *
     */
    @GetMapping("/pluginVersion/edit")
    public String pluginVersionEdit();

    @GetMapping("/pluginVersion/edit2")
    public String pluginVersionEdit2();
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月20日 下午2:39:14
     * @Title: pluginRunningState 
     * @Description: 插件运行环境状态页
     * @return
     *
     */
    @GetMapping("/pluginRunningState")
    public String pluginRunningState();
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月20日 下午2:40:18
     * @Title: pluginRunningStatEdit 
     * @Description: 修改插件运行环境状态
     * @return
     *
     */
    @GetMapping("/pluginRunningState/edit")
    public String pluginRunningStatEdit(); 
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月21日 上午10:08:03
     * @Title: pluginRunningLog 
     * @Description: 跳转到运行日志
     * @return
     *
     */
    @GetMapping("/pluginRunningLog")
    public String pluginRunningLog(); 
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月21日 上午11:03:06
     * @Title: pluginRunningLogEdit 
     * @Description: 跳转错误日志详情
     * @return
     *
     */
    @GetMapping("/pluginRunningLog/edit")
    public String pluginRunningLogEdit(); 
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年11月21日 下午1:53:35
     * @Title: pluginMonitorData 
     * @Description: 跳转数据监控详页
     * @return
     *
     */
    @GetMapping("/pluginMonitorData")
    public String pluginMonitorData();


    /**
     *
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:53:35
     * @Title: noticeSms
     * @Description: 用户短信通知页面
     * @return
     *
     */
    @GetMapping("/noticeSms")
    public String noticeSms();

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:53:35
     * @Title: noticeSms
     * @Description: 用户短信通知页面
     * @return
     *
     */
    @GetMapping("/baseShop")
    public String baseShop();

    /**
     *
     * @author: xiongshikang
     * @date: 2017年11月21日 上午11:03:06
     * @Title: pluginRunningLogEdit
     * @Description: 跳转错误日志详情
     * @return
     *
     */
    @GetMapping("/baseShop/edit")
    public String baseShopEdit();


    /**
     *
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:53:35
     * @Title: uploadingFiles
     * @Description: 文件上传
     * @return
     *
     */
    @GetMapping("/uploadingFiles")
    public String uploadingFiles();

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:53:35
     * @Title: appVersion
     * @Description: APP升级包文件上传
     * @return
     *
     */
    @GetMapping("/appVersion")
    public String appVersion();

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:53:35
     * @Title: appVersion
     * @Description: APP升级包文件上传
     * @return
     *
     */
    @GetMapping("/appVersion/edit")
    public String appVersionEdit();

    /**
     *
     * @author: qiao.he
     * @date: 2017年11月21日 下午1:53:35
     * @Title: appVersion
     * @Description: APP升级包文件上传
     * @return
     *
     */
    @GetMapping("/appVersion/edit2")
    public String appVersionEdit2();



}
