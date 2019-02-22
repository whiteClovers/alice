package com.iwonder.alice.bas.dao.auto;

import com.iwonder.alice.bas.entity.BasDataDictionary;
import com.iwonder.alice.bas.entity.BasDataDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasDataDictionaryMapper {
    long countByExample(BasDataDictionaryExample example);

    int deleteByExample(BasDataDictionaryExample example);

    int deleteByPrimaryKey(String dataDictionaryId);

    int insert(BasDataDictionary record);

    int insertSelective(BasDataDictionary record);

    List<BasDataDictionary> selectByExample(BasDataDictionaryExample example);

    BasDataDictionary selectByPrimaryKey(String dataDictionaryId);

    int updateByExampleSelective(@Param("record") BasDataDictionary record, @Param("example") BasDataDictionaryExample example);

    int updateByExample(@Param("record") BasDataDictionary record, @Param("example") BasDataDictionaryExample example);

    int updateByPrimaryKeySelective(BasDataDictionary record);

    int updateByPrimaryKey(BasDataDictionary record);
}