package com.iwonder.alice.usr.dao.auto;

import com.iwonder.alice.usr.entity.UsrSecurity;
import com.iwonder.alice.usr.entity.UsrSecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrSecurityMapper {
    long countByExample(UsrSecurityExample example);

    int deleteByExample(UsrSecurityExample example);

    int deleteByPrimaryKey(String securityId);

    int insert(UsrSecurity record);

    int insertSelective(UsrSecurity record);

    List<UsrSecurity> selectByExample(UsrSecurityExample example);

    UsrSecurity selectByPrimaryKey(String securityId);

    int updateByExampleSelective(@Param("record") UsrSecurity record, @Param("example") UsrSecurityExample example);

    int updateByExample(@Param("record") UsrSecurity record, @Param("example") UsrSecurityExample example);

    int updateByPrimaryKeySelective(UsrSecurity record);

    int updateByPrimaryKey(UsrSecurity record);
}