package com.bxl.bpm.dao;

import com.bxl.bpm.model.UserRoleRef;
import com.bxl.bpm.model.UserRoleRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRefMapper {
    int countByExample(UserRoleRefExample example);

    int deleteByExample(UserRoleRefExample example);

    int insert(UserRoleRef record);

    int insertSelective(UserRoleRef record);

    List<UserRoleRef> selectByExample(UserRoleRefExample example);

    int updateByExampleSelective(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByExample(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);
}