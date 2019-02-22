package com.iwonder.alice.sys.dao.auto;

import com.iwonder.alice.sys.entity.SysStaff;
import com.iwonder.alice.sys.entity.SysStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffMapper {
    long countByExample(SysStaffExample example);

    int deleteByExample(SysStaffExample example);

    int deleteByPrimaryKey(String staffId);

    int insert(SysStaff record);

    int insertSelective(SysStaff record);

    List<SysStaff> selectByExample(SysStaffExample example);

    SysStaff selectByPrimaryKey(String staffId);

    int updateByExampleSelective(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByExample(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByPrimaryKeySelective(SysStaff record);

    int updateByPrimaryKey(SysStaff record);
}