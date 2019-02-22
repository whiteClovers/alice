package com.iwonder.alice.usr.dao.auto;

import com.iwonder.alice.usr.entity.UsrEconomy;
import com.iwonder.alice.usr.entity.UsrEconomyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrEconomyMapper {
    long countByExample(UsrEconomyExample example);

    int deleteByExample(UsrEconomyExample example);

    int deleteByPrimaryKey(String economyId);

    int insert(UsrEconomy record);

    int insertSelective(UsrEconomy record);

    List<UsrEconomy> selectByExample(UsrEconomyExample example);

    UsrEconomy selectByPrimaryKey(String economyId);

    int updateByExampleSelective(@Param("record") UsrEconomy record, @Param("example") UsrEconomyExample example);

    int updateByExample(@Param("record") UsrEconomy record, @Param("example") UsrEconomyExample example);

    int updateByPrimaryKeySelective(UsrEconomy record);

    int updateByPrimaryKey(UsrEconomy record);
}