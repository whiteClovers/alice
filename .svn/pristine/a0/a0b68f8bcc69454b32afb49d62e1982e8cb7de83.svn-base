package com.iwonder.alice.bas.dao.auto;

import com.iwonder.alice.bas.entity.BasAvoidRepeat;
import com.iwonder.alice.bas.entity.BasAvoidRepeatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasAvoidRepeatMapper {
    long countByExample(BasAvoidRepeatExample example);

    int deleteByExample(BasAvoidRepeatExample example);

    int deleteByPrimaryKey(String avoidRepeatId);

    int insert(BasAvoidRepeat record);

    int insertSelective(BasAvoidRepeat record);

    List<BasAvoidRepeat> selectByExample(BasAvoidRepeatExample example);

    BasAvoidRepeat selectByPrimaryKey(String avoidRepeatId);

    int updateByExampleSelective(@Param("record") BasAvoidRepeat record, @Param("example") BasAvoidRepeatExample example);

    int updateByExample(@Param("record") BasAvoidRepeat record, @Param("example") BasAvoidRepeatExample example);

    int updateByPrimaryKeySelective(BasAvoidRepeat record);

    int updateByPrimaryKey(BasAvoidRepeat record);
}