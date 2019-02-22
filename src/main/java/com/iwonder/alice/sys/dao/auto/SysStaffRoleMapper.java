package com.iwonder.alice.sys.dao.auto;

import com.iwonder.alice.sys.entity.SysStaffRole;
import com.iwonder.alice.sys.entity.SysStaffRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffRoleMapper {
    long countByExample(SysStaffRoleExample example);

    int deleteByExample(SysStaffRoleExample example);

    int deleteByPrimaryKey(String staffRoleId);

    int insert(SysStaffRole record);

    int insertSelective(SysStaffRole record);

    List<SysStaffRole> selectByExample(SysStaffRoleExample example);

    SysStaffRole selectByPrimaryKey(String staffRoleId);

    int updateByExampleSelective(@Param("record") SysStaffRole record, @Param("example") SysStaffRoleExample example);

    int updateByExample(@Param("record") SysStaffRole record, @Param("example") SysStaffRoleExample example);

    int updateByPrimaryKeySelective(SysStaffRole record);

    int updateByPrimaryKey(SysStaffRole record);
}