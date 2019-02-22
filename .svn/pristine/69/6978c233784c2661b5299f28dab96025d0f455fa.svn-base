package com.iwonder.alice.pro.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iwonder.alice.pro.entity.ProRepayPlan;
import com.iwonder.alice.pro.entity.ProRepayPlanExample;

import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;

public interface IProRepayPlanService {
	 long countByExample(ProRepayPlanExample example);

	    int deleteByExample(ProRepayPlanExample example);

	    int deleteByPrimaryKey(String repayId);

	    int insert(ProRepayPlan record);

	    int insertSelective(ProRepayPlan record);

	    List<ProRepayPlan> selectByExample(ProRepayPlanExample example);

	    ProRepayPlan selectByPrimaryKey(String repayId);

	    int updateByExampleSelective(@Param("record") ProRepayPlan record, @Param("example") ProRepayPlanExample example);

	    int updateByExample(@Param("record") ProRepayPlan record, @Param("example") ProRepayPlanExample example);

	    int updateByPrimaryKeySelective(ProRepayPlan record);

	    int updateByPrimaryKey(ProRepayPlan record);
	    public void deleteRows(String[] ids);
	    List<ProRepayPlanView> mySelectList(HashMap hCondition);
	    ProRepayPlanView  mySelectOne(HashMap hCondition);
}
