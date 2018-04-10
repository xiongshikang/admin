/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.service.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.guludai.admin.common.constant.BaseConstant;
import cn.guludai.admin.common.model.ResultModel;
import cn.guludai.admin.domain.dataway.dao.BaseAreaFactoryEntityMapper;
import cn.guludai.admin.domain.dataway.dao.BaseAreaVersionEntityMapper;
import cn.guludai.admin.domain.dataway.entity.BaseAreaFactoryEntity;
import cn.guludai.admin.domain.dataway.entity.BaseAreaVersionEntity;
import cn.guludai.admin.web.resource.request.BaseErpFactoryReq;
import cn.guludai.admin.web.resource.response.BaseErpFactoryResp;
import cn.guludai.admin.web.response.BaseErpFactoryResponse;
import cn.guludai.admin.web.response.BaseErpVersionResponse;
import cn.guludai.admin.web.response.TableResultResponse;
import cn.guludai.api.code.BaseCode;
import cn.guludai.framework.toolkit.id.GUID;

/**
 * @author HeQiao
 * @create 2017-11-03 16:18
 **/
@Service
public class BaseErpFactoryService {

    @Autowired
    BaseAreaFactoryEntityMapper baseErpFactoryEntityMapper ;

    @Autowired
    BaseAreaVersionEntityMapper baseErpVersionEntityMapper;
  
    private static final Logger logger = LoggerFactory.getLogger(BaseErpFactoryService.class);
 
    /**
     * @Description:查找ERP版本配置表数据 ，根据ERP版本编号 ， erpVersionCode
     * @Author: HeQiao
     * @Date:  2017/11/5 15:56
     */
    public List<BaseErpVersionResponse>  findBaseErpVersion(String erpFactoryCode) {
        List<BaseAreaVersionEntity> baseList = baseErpVersionEntityMapper.findBaseErpVersion(erpFactoryCode);
        List<BaseErpVersionResponse> ls = new ArrayList<>();
        for (BaseAreaVersionEntity entity : baseList) {
            BaseErpVersionResponse  resp = new BaseErpVersionResponse();
            BeanUtils.copyProperties(entity , resp );
            ls.add(resp);
        }
        return ls;
    }

    /**
     * @Description:向ERP厂商基础信息表删除数据 ，根据ERP版本编号 ， erpVersionCode
     * @Author: HeQiao
     * @Date:  2017/11/5 15:56
     */
    public List<BaseErpFactoryResponse> findBaseErpFactory() {
        List<BaseErpFactoryResponse> ls = new ArrayList<BaseErpFactoryResponse>();
        List<BaseAreaFactoryEntity> baseList = baseErpFactoryEntityMapper.findBaseErpFactory();
        for (BaseAreaFactoryEntity entity:baseList) {
            BaseErpFactoryResponse resp = new BaseErpFactoryResponse();
            BeanUtils.copyProperties(entity , resp);
            ls.add(resp);
        }
        return ls;
    }

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
    public TableResultResponse<BaseErpFactoryResp> selectErpFactoryList(BaseErpFactoryReq record) throws Exception{
		TableResultResponse<BaseErpFactoryResp> table =new TableResultResponse<BaseErpFactoryResp>();
	    List<BaseAreaFactoryEntity> ls = baseErpFactoryEntityMapper.selectBaseAreaFactoryEntityPage(record);
        long total =  baseErpFactoryEntityMapper.selectBaseAreaFactoryEntityPageCount(record);
       List<BaseErpFactoryResp> rows = new ArrayList<BaseErpFactoryResp>();
       for (BaseAreaFactoryEntity p : ls) {
    	   BaseErpFactoryResp entity = new BaseErpFactoryResp();
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
    public ResultModel<String> add(BaseErpFactoryReq record)  {
    	ResultModel<String> result = new ResultModel<String>();
    	BaseAreaFactoryEntity entity = new BaseAreaFactoryEntity();
    	BeanUtils.copyProperties(record,entity);
		entity.setErpFactoryCode(GUID.randomGUID());
		entity.setUpdateTime(new Date());
		entity.setCreateTime(new Date());
		entity.setVersion(1L);
		entity.setDataStatus(BaseConstant.DATA_STATUS_Y);
		entity.setDiskStatus(BaseConstant.DISK_STATUS_Y);
		baseErpFactoryEntityMapper.insert(entity);
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
    public ResultModel<String> edit(BaseErpFactoryReq record) {
    	ResultModel<String> result = new ResultModel<String>();
    	BaseAreaFactoryEntity entity = new BaseAreaFactoryEntity();
    	BeanUtils.copyProperties(record,entity);
    	baseErpFactoryEntityMapper.updateBaseErpFactoryReqByerpFactoryCode(entity);
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
    public ResultModel<BaseErpFactoryResp> select(String erpFactoryCode) {
    	ResultModel<BaseErpFactoryResp> result = new ResultModel<BaseErpFactoryResp>();
    	BaseAreaFactoryEntity entity = baseErpFactoryEntityMapper.selectErpFactoryReqByerpFactoryCode(erpFactoryCode);
    	BaseErpFactoryResp resp = new BaseErpFactoryResp();
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
	public ResultModel<String> delete(String erpFactoryCode) {
		ResultModel<String> result = new ResultModel<String>();
		baseErpFactoryEntityMapper.deleteBaseErpFactoryReqByerpFactoryCode(erpFactoryCode);
		result.setCode(BaseCode.SUCCESS.getCode());
		return result;
	}
	
}
