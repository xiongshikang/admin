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
import cn.guludai.admin.domain.dataway.dao.BaseAreaVersionEntityMapper;
import cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity;
import cn.guludai.admin.web.resource.request.BaseErpVersionReq;
import cn.guludai.admin.web.resource.response.BaseErpVersionResp;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.framework.toolkit.id.GUID;
/**
 * 
 * @ClassName: BaseErpVersionService 
 * @Description: erp版本服务类
 * @author: xiongshikang
 * @date: 2017年12月19日 下午6:40:37
 */
@Service
public class BaseErpVersionService {
	

    @Autowired
    BaseAreaVersionEntityMapper baseErpVersionEntityMapper;
 
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
    public TableResultResponse<BaseErpVersionResp> selectErpVersionList(BaseErpVersionReq record) throws Exception{
		TableResultResponse<BaseErpVersionResp> table =new TableResultResponse<BaseErpVersionResp>();
	    List<BaseAreaVersionEntity> ls = baseErpVersionEntityMapper.selectBaseAreaVersionEntityPage(record);
        long total =  baseErpVersionEntityMapper.selectBaseAreaVersionEntityPageCount(record);
       List<BaseErpVersionResp> rows = new ArrayList<BaseErpVersionResp>();
       for (BaseAreaVersionEntity p : ls) {
    	   BaseErpVersionResp entity = new BaseErpVersionResp();
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
    public ResultModel<String> add(BaseErpVersionReq record)  {
    	ResultModel<String> result = new ResultModel<String>();
    	BaseAreaVersionEntity entity = new BaseAreaVersionEntity();
    	BeanUtils.copyProperties(record,entity);
		entity.setErpVersionCode(GUID.randomGUID());
		entity.setUpdateTime(new Date());
		entity.setCreateTime(new Date());
		entity.setVersion(1L);
		entity.setDataStatus(BaseConstant.DATA_STATUS_Y);
		entity.setDiskStatus(BaseConstant.DISK_STATUS_Y);
		baseErpVersionEntityMapper.insert(entity);
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
    public ResultModel<String> edit(BaseErpVersionReq record) {
    	ResultModel<String> result = new ResultModel<String>();
    	BaseAreaVersionEntity entity = new BaseAreaVersionEntity();
    	BeanUtils.copyProperties(record,entity);
    	baseErpVersionEntityMapper.updateBaseAreaVersionEntityByerpVersionCode(entity);
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
    public ResultModel<BaseErpVersionResp> select(String erpVersionCode) {
    	ResultModel<BaseErpVersionResp> result = new ResultModel<BaseErpVersionResp>();
    	BaseAreaVersionEntity entity = baseErpVersionEntityMapper.selectBaseAreaVersionEntityByerpVersionCode(erpVersionCode);
    	BaseErpVersionResp resp = new BaseErpVersionResp();
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
	public ResultModel<String> delete(String erpVersionCode) {
		ResultModel<String> result = new ResultModel<String>();
		baseErpVersionEntityMapper.deleteBaseAreaVersionEntityByerpVersionCode(erpVersionCode);
		result.setCode(BaseCode.SUCCESS.getCode());
		return result;
	}
}
