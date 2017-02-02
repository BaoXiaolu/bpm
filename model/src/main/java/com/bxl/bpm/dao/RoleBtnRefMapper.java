package com.bxl.bpm.dao;

import com.bxl.bpm.model.RoleBtnRef;
import com.bxl.bpm.model.RoleBtnRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleBtnRefMapper {
    int countByExample(RoleBtnRefExample example);

    int deleteByExample(RoleBtnRefExample example);

    int insert(RoleBtnRef record);

    int insertSelective(RoleBtnRef record);

    List<RoleBtnRef> selectByExample(RoleBtnRefExample example);

    int updateByExampleSelective(@Param("record") RoleBtnRef record, @Param("example") RoleBtnRefExample example);

    int updateByExample(@Param("record") RoleBtnRef record, @Param("example") RoleBtnRefExample example);
}