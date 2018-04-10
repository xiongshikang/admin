package cn.guludai.admin.domain.resource.dao;

import cn.guludai.admin.domain.resource.entity.PluginSecurityUserEntity;

public interface PluginSecurityUserEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PluginSecurityUserEntity record);

    int insertSelective(PluginSecurityUserEntity record);

    PluginSecurityUserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PluginSecurityUserEntity record);

    int updateByPrimaryKey(PluginSecurityUserEntity record);
}