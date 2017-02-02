package com.bxl.bpm.dao;

import com.bxl.bpm.model.Dic;
import com.bxl.bpm.model.DicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicMapper {
    int countByExample(DicExample example);

    int deleteByExample(DicExample example);

    int insert(Dic record);

    int insertSelective(Dic record);

    List<Dic> selectByExample(DicExample example);

    int updateByExampleSelective(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByExample(@Param("record") Dic record, @Param("example") DicExample example);
}