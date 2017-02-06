package com.bxl.bpm.dao;

import com.bxl.bpm.model.UserRoleRef;
import com.bxl.bpm.model.UserRoleRefExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRefMapper extends GenericDao<UserRoleRef, Integer> {
    int countByExample(UserRoleRefExample example);

    int deleteByExample(UserRoleRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleRef record);

    int insertSelective(UserRoleRef record);

    List<UserRoleRef> selectByExample(UserRoleRefExample example);

    UserRoleRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByExample(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByPrimaryKeySelective(UserRoleRef record);

    int updateByPrimaryKey(UserRoleRef record);
}