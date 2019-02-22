package com.iwonder.alice.bas.dao.auto;

import com.iwonder.alice.bas.entity.BasDataDictionaryDetail;
import com.iwonder.alice.bas.entity.BasDataDictionaryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasDataDictionaryDetailMapper {
    long countByExample(BasDataDictionaryDetailExample example);

    int deleteByExample(BasDataDictionaryDetailExample example);

    int deleteByPrimaryKey(String dictionaryDetailId);

    int insert(BasDataDictionaryDetail record);

    int insertSelective(BasDataDictionaryDetail record);

    List<BasDataDictionaryDetail> selectByExample(BasDataDictionaryDetailExample example);

    BasDataDictionaryDetail selectByPrimaryKey(String dictionaryDetailId);

    int updateByExampleSelective(@Param("record") BasDataDictionaryDetail record, @Param("example") BasDataDictionaryDetailExample example);

    int updateByExample(@Param("record") BasDataDictionaryDetail record, @Param("example") BasDataDictionaryDetailExample example);

    int updateByPrimaryKeySelective(BasDataDictionaryDetail record);

    int updateByPrimaryKey(BasDataDictionaryDetail record);
}