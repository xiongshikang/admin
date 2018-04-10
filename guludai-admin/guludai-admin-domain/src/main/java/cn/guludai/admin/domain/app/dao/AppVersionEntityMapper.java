/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.app.dao;

import cn.guludai.admin.domain.app.entity.AppVersionEntity;
import cn.guludai.admin.web.request.AppVersionReq;
import cn.guludai.framework.datasource.bind.DataSourceMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gaopeng
 */
@DataSourceMapper(database = "app")
public interface AppVersionEntityMapper {
    /**
     * 根据主键ID删除数据库的记录
     *
     * @param versionCode {@link String}
     */
    int deleteByPrimaryKey(String versionCode);

    /**
     * 插入数据库记录
     *
     * @param record {@link cn.guludai.admin.domain.app.entity.AppVersionEntity}
     */
    int insert(AppVersionEntity record);

    /**
     * 插入数据库记录(仅仅插入非空属性)
     *
     * @param record {@link cn.guludai.admin.domain.app.entity.AppVersionEntity}
     */
    int insertSelective(AppVersionEntity record);

    /**
     * 根据主键ID查询数据库记录
     *
     * @param versionCode {@link String}
     */
    AppVersionEntity selectByPrimaryKey(String versionCode);

    /**
     * 根据主键ID来更新数据库记录(仅仅修改非空属性)
     *
     * @param record {@link cn.guludai.admin.domain.app.entity.AppVersionEntity}
     */
    int updateByPrimaryKeySelective(AppVersionEntity record);

    /**
     * 根据主键ID更新数据库记录
     *
     * @param record {@link cn.guludai.admin.domain.app.entity.AppVersionEntity}
     */
    int updateByPrimaryKey(AppVersionEntity record);


    List<AppVersionEntity> selectByConditionByPing(AppVersionReq req);

    Integer selectByConditionNumByPing(AppVersionReq req);

    Integer selectMaxVersionOrder();
}