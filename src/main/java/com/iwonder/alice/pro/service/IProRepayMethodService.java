package com.iwonder.alice.pro.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iwonder.alice.pro.entity.ProRepayMethod;
import com.iwonder.alice.pro.entity.ProRepayMethodExample;

public interface IProRepayMethodService {
	long countByExample(ProRepayMethodExample example);

    int deleteByExample(ProRepayMethodExample example);

    int deleteByPrimaryKey(String repayMethodId);

    int insert(ProRepayMethod record);

    int insertSelective(ProRepayMethod record);

    List<ProRepayMethod> selectByExample(ProRepayMethodExample example);

    ProRepayMethod selectByPrimaryKey(String repayMethodId);

    int updateByExampleSelective(@Param("record") ProRepayMethod record, @Param("example") ProRepayMethodExample example);

    int updateByExample(@Param("record") ProRepayMethod record, @Param("example") ProRepayMethodExample example);

    int updateByPrimaryKeySelective(ProRepayMethod record);

    int updateByPrimaryKey(ProRepayMethod record);
    public void deleteRows(String[] ids);
}
