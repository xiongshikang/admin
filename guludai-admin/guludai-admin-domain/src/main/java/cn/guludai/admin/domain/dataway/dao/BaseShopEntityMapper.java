/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.dao;

import java.util.List;
import java.util.Map;

import cn.guludai.admin.domain.dataway.entity.BaseShopEntity;
import cn.guludai.admin.web.request.BaseShopRequest;
import cn.guludai.admin.web.response.BaseShopResponse;
import org.apache.ibatis.annotations.Param;

import cn.guludai.framework.datasource.bind.DataSourceMapper;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "base")
public interface BaseShopEntityMapper {
    /**
     * 根据主键ID删除数据库的记录
     *
     * @param id {@link java.lang.String}
     */
    int deleteByPrimaryKey(@Param("shopCode") String shopCode);

    /**
     * 插入数据库记录
     *
     * @param record {@link cn.guludai.admin.domain.dataway.entity.BaseShopEntity}
     */
    int insert(BaseShopEntity record);

    /**
     * 插入数据库记录(仅仅插入非空属性)
     *
     * @param record {@link cn.guludai.admin.domain.dataway.entity.BaseShopEntity}
     */
    int insertSelective(BaseShopEntity record);

    /**
     * 根据主键ID查询数据库记录
     *
     * @param id {@link java.lang.Long}
     */
    BaseShopEntity selectByPrimaryKey(String id);

    /**
     * 根据主键ID来更新数据库记录(仅仅修改非空属性)
     *
     * @param record {@link cn.guludai.admin.domain.dataway.entity.BaseShopEntity}
     */
    int updateByPrimaryKeySelective(BaseShopEntity record);

    /**
     * 根据主键ID更新数据库记录
     *
     * @param record {@link cn.guludai.admin.domain.dataway.entity.BaseShopEntity}
     */
    int updateByPrimaryKey(BaseShopEntity record);

    /**
     * @return
     * @author: xiongshikang
     * @date: 2017年11月16日 下午4:28:00
     * @Title: selectShopByCompanyCode
     * @Description: 通过公司编号查找门店
     */
    List<BaseShopEntity> selectShopByCompanyCode(String companyCode);


    Map<String, String> findBaseShopName(@Param("shopCode") String shopCode,
                                         @Param("companyCode") String companyCode);

    /**
     * @return
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:28:00
     * @Title: selectByCondition
     * @Description: 根据条件查询
     */
    List<BaseShopResponse> selectByConditionPaging(BaseShopRequest baseShopRequest);

    /**
     * @return
     * @author: qiao.he
     * @date: 2017年11月16日 下午4:28:00
     * @Title: selectByCondition
     * @Description: 根据条件查询
     */
    int selectByConditionNum(BaseShopRequest baseShopRequest);

    int isDuplicationName(@Param("shopName") String shopName, @Param("shopCode")  String shopCode);
}