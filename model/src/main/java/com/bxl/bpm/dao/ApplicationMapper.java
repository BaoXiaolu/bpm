package com.bxl.bpm.dao;

import com.bxl.bpm.model.Application;
import com.bxl.bpm.model.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {
    int countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);
}