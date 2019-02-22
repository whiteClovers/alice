package com.iwonder.alice.pro.dao;

import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProLoanExample;
import com.iwonder.alice.pro.entity.view.ProLoanView;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MyProLoanMapper {

    List<ProLoanView> mySelectList(HashMap hCondition);
    ProLoanView  mySelectOne(HashMap hCondition);
}