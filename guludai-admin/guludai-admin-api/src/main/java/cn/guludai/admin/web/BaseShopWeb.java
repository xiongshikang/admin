/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import cn.guludai.admin.web.request.BaseShopRequest;
import cn.guludai.admin.web.request.PluginLicenseReq;
import cn.guludai.admin.web.response.TableResultResponse;
import org.springframework.web.bind.annotation.GetMapping;

import cn.guludai.admin.web.response.BaseShopCompanyResponse;
import cn.guludai.admin.web.response.BaseShopResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * @ClassName: BaseShopWeb 
 * @Description: 公司与门店控制器
 * @author: xiongshikang
 * @date: 2017年11月16日 下午4:38:44
 */
public interface BaseShopWeb {


	 /**
	  * 
	  * @author: xiongshikang
	  * @date: 2017年11月16日 下午4:36:50
	  * @Title: deleteBaseShopErp 
	  * @Description: 
	  * @param request
	  * @return
	  *
	  */
	@GetMapping("/web/companyAll")
	public Response<BaseShopCompanyResponse> companyAll();
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月16日 下午4:44:56
	 * @Title: getShopByCompanyCode 
	 * @Description: 通过公司编号获取所有公司下的门店
	 * @param request
	 * @return
	 *
	 */
	@GetMapping("/web/shopList")
	public Response<BaseShopResponse> getShopByCompanyCode(Request<String> request);


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
	@PostMapping("/web/baseShop")
	public TableResultResponse<BaseShopResponse> getBaseShop(Request<BaseShopRequest> request);


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
	@PostMapping("/web/baseShop/select")
	public Response<BaseShopResponse> select(Request<String> request);

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
	@PostMapping("/web/baseShop/edit")
	public Response<BaseShopResponse> edit(Request<BaseShopRequest> request);

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
	@PostMapping("/web/baseShop/delete")
	public Response<Void> delete(Request<String> request);

}
