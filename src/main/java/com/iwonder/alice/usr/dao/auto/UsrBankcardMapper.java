package com.iwonder.alice.usr.dao.auto;

import com.iwonder.alice.usr.entity.UsrBankcard;
import com.iwonder.alice.usr.entity.UsrBankcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrBankcardMapper {
    long countByExample(UsrBankcardExample example);

    int deleteByExample(UsrBankcardExample example);

    int deleteByPrimaryKey(String bankcardId);

    int insert(UsrBankcard record);

    int insertSelective(UsrBankcard record);

    List<UsrBankcard> selectByExample(UsrBankcardExample example);

    UsrBankcard selectByPrimaryKey(String bankcardId);

    int updateByExampleSelective(@Param("record") UsrBankcard record, @Param("example") UsrBankcardExample example);

    int updateByExample(@Param("record") UsrBankcard record, @Param("example") UsrBankcardExample example);

    int updateByPrimaryKeySelective(UsrBankcard record);

    int updateByPrimaryKey(UsrBankcard record);
}