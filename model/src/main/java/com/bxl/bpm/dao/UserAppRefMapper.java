package com.bxl.bpm.dao;

import com.bxl.bpm.model.UserAppRef;
import com.bxl.bpm.model.UserAppRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAppRefMapper {
    int countByExample(UserAppRefExample example);

    int deleteByExample(UserAppRefExample example);

    int insert(UserAppRef record);

    int insertSelective(UserAppRef record);

    List<UserAppRef> selectByExample(UserAppRefExample example);

    int updateByExampleSelective(@Param("record") UserAppRef record, @Param("example") UserAppRefExample example);

    int updateByExample(@Param("record") UserAppRef record, @Param("example") UserAppRefExample example);
}