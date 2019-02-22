package com.iwonder.alice.pro.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProLoanExample;
import com.iwonder.alice.pro.entity.view.ProLoanView;

public interface IProLoanService {
	long countByExample(ProLoanExample example);

    int deleteByExample(ProLoanExample example);

    int deleteByPrimaryKey(String loanId);

    int insert(ProLoan record);

    int insertSelective(ProLoan record);

    List<ProLoan> selectByExample(ProLoanExample example);

    ProLoan selectByPrimaryKey(String loanId);

    int updateByExampleSelective(@Param("record") ProLoan record, @Param("example") ProLoanExample example);

    int updateByExample(@Param("record") ProLoan record, @Param("example") ProLoanExample example);

    int updateByPrimaryKeySelective(ProLoan record);

    int updateByPrimaryKey(ProLoan record);
    public void deleteRows(String[] ids);
    List<ProLoanView> mySelectList(HashMap hCondition);
    ProLoanView  mySelectOne(HashMap hCondition);
}
