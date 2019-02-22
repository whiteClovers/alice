package com.iwonder.alice.front.service;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.view.ProLoanView;

public interface IFrontApplicationService {

	public List<ProLoanView> list(HashMap hCondition);
	
	public int delete(String loanId);
	
	public int update(ProLoan proLoan);
}
