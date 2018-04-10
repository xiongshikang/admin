/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cn.guludai.admin.web.HomeWeb;

/**
 * 
 * @ClassName: HomeController 
 * @Description: 跳转控制器
 * @author: xiongshikang
 * @date: 2017年11月10日 下午5:00:38
 */
@Controller
public class HomeController implements HomeWeb{
	
	 
    @GetMapping("/pluginLicense")
    public String pluginLicense() {
    	 return "pluginLicense/list";
    }
    
    
    @GetMapping("/pluginLicense/edit")
    public String edit() {
    	 return "pluginLicense/edit";
    }


	@Override
	public String edit2() {
		 return "pluginLicense/edit2";
	}


	@Override
	public String pluginVersion() {
		return "pluginVersion/list";
	}


	@Override
	public String pluginVersionEdit() {
		return "pluginVersion/edit";
	}

	@Override
	public String pluginVersionEdit2() {
		return "pluginVersion/edit2";
	}

 

	@Override
	public String pluginRunningState() {
		return "runningState/list";
	}


	@Override
	public String pluginRunningStatEdit() {
		return "runningState/edit";
	}


	@Override
	public String pluginRunningLog() {
		return "pluginRunningLog/list";
	}


	@Override
	public String pluginRunningLogEdit() {
		return "pluginRunningLog/edit";
	}


	@Override
	public String pluginMonitorData() {
		return "pluginMonitorData/list";
	}

	@Override
	public String noticeSms() {
		return "noticeSms/list";
	}

	@Override
	public String baseShop() {
		return "baseShop/list";
	}

	@Override
	public String baseShopEdit() {
		return "baseShop/edit";
	}

	@Override
	public String uploadingFiles() {
		return "uploading/uploadingFiles";
	}

	@Override
	public String appVersion() {
		return "appVersion/list";
	}

	@Override
	public String appVersionEdit() {
		return "appVersion/edit";
	}

	@Override
	public String appVersionEdit2() {
		return "appVersion/edit2";
	}
}
