/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.domain.dataway.dao.BaseShopCompanyEntityMapper;
import cn.guludai.admin.domain.dataway.entity.BaseShopCompanyEntity;
import cn.guludai.admin.web.resource.request.BaseShopCompanyReq;
import cn.guludai.admin.web.resource.response.BaseShopCompanyResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.framework.toolkit.id.GUID;
/**
 * 
 * @ClassName: BaseShopCompanyService 
 * @Description: 门店所属公司服务类
 * @author: xiongshikang
 * @date: 2017年12月20日 上午11:29:42
 */
@Service
public class BaseShopCompanyService {
	
	@Autowired
	private BaseShopCompanyEntityMapper baseShopCompanyEntityMapper;
	
	 /**
     * 
     * @author: xiongshikang
     * @date: 2017年12月19日 下午4:22:45
     * @Title: selectErpFactoryList 
     * @Description: 分页查询厂商
     * @param record
     * @return
     * @throws Exception
     *
     */
    public TableResultResponse<BaseShopCompanyResp> selectShopCompanyList(BaseShopCompanyReq record) throws Exception{
		TableResultResponse<BaseShopCompanyResp> table =new TableResultResponse<BaseShopCompanyResp>();
	    List<BaseShopCompanyEntity> ls = baseShopCompanyEntityMapper.selectBaseShopCompanyEntityPage(record);
        long total =  baseShopCompanyEntityMapper.selectBaseShopCompanyEntityPageCount(record);
       List<BaseShopCompanyResp> rows = new ArrayList<BaseShopCompanyResp>();
       for (BaseShopCompanyEntity p : ls) {
    	   BaseShopCompanyResp entity = new BaseShopCompanyResp();
    	   BeanUtils.copyProperties(p, entity);
    	   rows.add(entity);
       }
       table.setRows(rows);
       table.setTotal(total);
       return table;
	}
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年12月19日 下午4:49:25
     * @Title: add 
     * @Description: 添加erp厂商信息
     * @param record
     * @return
     *
     */
    public ResultModel<String> add(BaseShopCompanyReq record)  {
    	ResultModel<String> result = new ResultModel<String>();
    	BaseShopCompanyEntity entity = new BaseShopCompanyEntity();
    	BeanUtils.copyProperties(record,entity);
		entity.setCompanyCode(GUID.randomGUID());
		entity.setUpdateTime(new Date());
		entity.setCreateTime(new Date());
		entity.setVersion(1L);
		entity.setDataStatus(BaseConstant.DATA_STATUS_Y);
		entity.setDiskStatus(BaseConstant.DISK_STATUS_Y);
		baseShopCompanyEntityMapper.insert(entity);
    	return result;
    }
    
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年12月19日 下午4:54:29
     * @Title: edit 
     * @Description: 修改厂商信息
     * @param record
     *
     */
    public ResultModel<String> edit(BaseShopCompanyReq record) {
    	ResultModel<String> result = new ResultModel<String>();
    	BaseShopCompanyEntity entity = new BaseShopCompanyEntity();
    	BeanUtils.copyProperties(record,entity);
    	baseShopCompanyEntityMapper.updateBaseShopCompanyEntity(entity);
    	result.setCode(BaseCode.SUCCESS.getCode());
    	return result;
    }
   
    /**
     * 
     * @author: xiongshikang
     * @date: 2017年12月19日 下午4:58:08
     * @Title: select 
     * @Description: 查询
     * @param erpFactoryCode
     * @return
     *
     */
    public ResultModel<BaseShopCompanyResp> select(String shopCompanyCode) {
    	ResultModel<BaseShopCompanyResp> result = new ResultModel<BaseShopCompanyResp>();
    	BaseShopCompanyEntity entity = baseShopCompanyEntityMapper.selectBaseShopCompanyEntityByShopCompanyCode(shopCompanyCode);
    	BaseShopCompanyResp resp = new BaseShopCompanyResp();
    	BeanUtils.copyProperties(entity,resp);
    	result.setResult(resp);
    	result.setCode(BaseCode.SUCCESS.getCode());
    	return result;
    } 
    
    /**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月17日 下午2:50:51
	 * @Title: delete 
	 * @Description: 逻辑册除
	 * @param licenseCode
	 *
	 */
	public ResultModel<String> delete(String shopCompanyCode) {
		ResultModel<String> result = new ResultModel<String>();
		baseShopCompanyEntityMapper.deleteBaseShopCompanyEntityByShopCompanyCode(shopCompanyCode);
		result.setCode(BaseCode.SUCCESS.getCode());
		return result;
	}
}
