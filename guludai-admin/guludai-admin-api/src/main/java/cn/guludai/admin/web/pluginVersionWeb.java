/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.request.PluginVersionReq;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: pluginVersionWeb 
 * @Description: 插件库控制器
 * @author: xiongshikang
 * @date: 2017年11月19日 下午2:41:01
 */
public interface pluginVersionWeb {
	
	/**
	 *
	 * @author: qiao.he
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginVersion
	 * @Description: 插件升级
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginVersion/upload")
	public  Response<String>  pluginVersionAddUpload(HttpServletRequest req,MultipartHttpServletRequest multiReq);

	/**
	 *
	 * @author: qiao.he
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginVersion
	 * @Description: 获取插件的物理地址
	 * @param req
	 * @return
	 *
	 */
	@GetMapping("/web/pluginVersion/physicalAddress")
	public  Response<String>  physicalAddress(Request<String> req);


	/**
	 *
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginVersion
	 * @Description: 多条件查找插件信息
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginVersion")
	public  TableResultResponse<PluginVersionReq> pluginVersion(Request<PluginVersionReq> req);

//	/**
//	 *
//	 * @author: xiongshikang
//	 * @date: 2017年11月15日 下午4:03:18
//	 * @Title: pluginVersion
//	 * @Description: 添加或修改注册码信息
//	 * @param req
//	 * @return
//	 *
//	 */
//	@GetMapping("/web/pluginVersion/add")
//	public Response<String> pluginVersionAdd(Request<String> req);
//
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:41:30
	 * @Title: edit 
	 * @Description: 修改注册信息
	 * @param req
	 * @return
	 *
	 */
	@GetMapping("/web/pluginVersion/edit") 
	public Response<String> edit(Request<String> req);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过注册码编号查找册注码信息
	 * @param req
	 * @return
	 *
	 */
	@GetMapping("/web/pluginVersion/select") 
	public Response<PluginVersionReq> select(Request<String> req); 
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过注册码编号逻辑册除
	 * @param req
	 * @return
	 *
	 */
	@PostMapping("/web/pluginVersion/delete")
	public Response<String> delete(Request<String> req);
	
}
