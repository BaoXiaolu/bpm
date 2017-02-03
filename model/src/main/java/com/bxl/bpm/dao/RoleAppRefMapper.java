package com.bxl.bpm.dao;

import com.bxl.bpm.model.RoleAppRef;
import com.bxl.bpm.model.RoleAppRefExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface RoleAppRefMapper extends GenericDao<RoleAppRef, Integer> {
    int countByExample(RoleAppRefExample example);

    int deleteByExample(RoleAppRefExample example);

    int insert(RoleAppRef record);

    int insertSelective(RoleAppRef record);

    List<RoleAppRef> selectByExample(RoleAppRefExample example);

    int updateByExampleSelective(@Param("record") RoleAppRef record, @Param("example") RoleAppRefExample example);

    int updateByExample(@Param("record") RoleAppRef record, @Param("example") RoleAppRefExample example);
}