package com.bxl.bpm.dao;

import com.bxl.bpm.model.LogDetail;
import com.bxl.bpm.model.LogDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogDetailMapper {
    int countByExample(LogDetailExample example);

    int deleteByExample(LogDetailExample example);

    int insert(LogDetail record);

    int insertSelective(LogDetail record);

    List<LogDetail> selectByExample(LogDetailExample example);

    int updateByExampleSelective(@Param("record") LogDetail record, @Param("example") LogDetailExample example);

    int updateByExample(@Param("record") LogDetail record, @Param("example") LogDetailExample example);
}