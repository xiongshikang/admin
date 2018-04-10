/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.resource;

import org.springframework.web.bind.annotation.PostMapping;

import cn.guludai.admin.web.resource.request.BaseShopCompanyReq;
import cn.guludai.admin.web.resource.response.BaseShopCompanyResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.data.Request;
import cn.guludai.api.data.Response;
/**
 * 
 * @ClassName: BaseShopCompanyWeb 
 * @Description: 公司控制类
 * @author: xiongshikang
 * @date: 2017年12月20日 上午11:23:28
 */
public interface BaseShopCompanyWeb {
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午1:13:24
	 * @Title: pluginLicense 
	 * @Description: 多条件查找厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/shopCompany") 
	public  TableResultResponse<BaseShopCompanyResp> shopCompanyList(Request<BaseShopCompanyReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月15日 下午4:03:18
	 * @Title: pluginLicense 
	 * @Description: 添加或修改厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/shopCompany/add") 
	public Response<String> shopCompanyAdd(Request<BaseShopCompanyReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:41:30
	 * @Title: edit 
	 * @Description: 修改厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/shopCompany/edit") 
	public Response<String> edit(Request<BaseShopCompanyReq> request);
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过厂商版本编号查找厂商版本信息
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/shopCompany/select") 
	public Response<BaseShopCompanyResp> select(Request<String> request); 
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午1:54:31
	 * @Title: select 
	 * @Description: 通过厂商版本编号逻辑册除
	 * @param license
	 * @return
	 *
	 */
	@PostMapping("/web/shopCompany/delete") 
	public Response<String> delete(Request<String> request);
}
