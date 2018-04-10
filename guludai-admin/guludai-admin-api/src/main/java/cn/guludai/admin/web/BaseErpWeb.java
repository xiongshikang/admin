/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.guludai.admin.web.response.BaseErpFactoryResponse;
import cn.guludai.admin.web.response.BaseErpVersionResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;

/**
  * 
  * @ClassName: BaseErpApi 
  * @Description: erp厂商控制器
  * @author: xiongshikang
  * @date: 2017年11月16日 上午10:05:55
  */
public interface BaseErpWeb {

	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月16日 上午10:06:21
	 * @Title: BaseErpFactoryList 
	 * @Description: 
	 * @return
	 *
	 */
	@GetMapping("/web/baseErpFactoryList")
	public Response<BaseErpFactoryResponse>  BaseErpFactoryList();
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月16日 上午10:10:56
	 * @Title: baseErpVersionList 
	 * @Description: erp版本
	 * @return
	 *
	 */
	@GetMapping("/web/baseErpVersionList")
	public Response<BaseErpVersionResponse> baseErpVersionList(@RequestBody Request<String> request);
  
}
