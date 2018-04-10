/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import cn.guludai.admin.web.response.AddressResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @ClassName: AddressWeb 
 * @Description: 地区服务
 * @author: xiongshikang
 * @date: 2017年12月18日 下午4:25:48
 */
public interface AddressWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月16日 上午10:06:21
	 * @Title: BaseErpFactoryList 
	 * @Description: 
	 * @return
	 *
	 */
	@GetMapping("/web/province")
	public Response<AddressResponse>  provinceList();
	
	
	@GetMapping("/web/city")
	public Response<AddressResponse>  cityList(Request<String> request);
	
	
	@GetMapping("/web/town")
	public Response<AddressResponse>  townList(Request<String> request);
}
