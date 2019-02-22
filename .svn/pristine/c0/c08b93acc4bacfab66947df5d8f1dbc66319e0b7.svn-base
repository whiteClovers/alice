package com.iwonder.alice.front.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.iwonder.alice.bas.service.BasDataDictionaryService;
import com.iwonder.alice.bas.view.YxysDataDictionaryView;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.front.service.IFrontApplicationService;
import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProLoanExample;
import com.iwonder.alice.pro.entity.ProRepayPlanExample;
import com.iwonder.alice.pro.entity.ProRepayPlanExample.Criteria;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayPlanService;

@Controller
@RequestMapping("/front/FrontReimbursementController/")
public class FrontReimbursementController {
	@Autowired
	IFrontApplicationService iFrontApplicationService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProLoanService proLoanService ;
	@Autowired
	IProRepayPlanService proRepayPlanService;
	@RequestMapping("page")
	public String List(HttpServletRequest request) {
		
		return "/front/yxy/Reimbursement";
	}
	@RequestMapping("pageAjax")
	@ResponseBody
	public PageView pageAjax(HttpServletRequest request,HttpServletResponse response){
		System.out.println("===========");
	
		
		PageView pageView = new PageView();
		String strPageIndex = request.getParameter("pageIndex");
		String strPageSize = request.getParameter("pageSize");

		
		int pageIndex = 0;
		int pageSize = 5;
		
		if(!StringUtils.isEmpty(strPageSize)){
			pageIndex = Integer.parseInt(strPageIndex);
		}
		
		if(!StringUtils.isEmpty(strPageSize)){
			pageSize = Integer.parseInt(strPageSize);
		}
		

		HttpSession session= request.getSession();
		String loginUserId = (String) session.getAttribute("loginUserId");
		Page<Object> page = PageHelper.startPage(pageIndex, pageSize);
		ProLoanExample example = new ProLoanExample();
		com.iwonder.alice.pro.entity.ProLoanExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andUserIdEqualTo(loginUserId);
		ArrayList<List<ProRepayPlanView>> arraylist = new ArrayList<>();
		List<ProLoan> ListProLoans = proLoanService.selectByExample(example);
		for(ProLoan ListProLoan:ListProLoans){
			String loanId = ListProLoan.getLoanId();
			ProRepayPlanExample example2= new ProRepayPlanExample();
			Criteria createCriteria2=	example2.createCriteria();
			createCriteria2.andLoanIdEqualTo(loanId);
			HashMap ha = new HashMap<>();
			ha.put("loanId", loanId);
			ha.put("payEachStatus", "yes_pay_each");
			java.util.List<ProRepayPlanView> ProRepayPlanView = proRepayPlanService.mySelectList(ha);
			arraylist.add(ProRepayPlanView);
		}
	/*	ProRepayPlan proRepayPlan = new ProRepayPlan();
		proRepayPlanService.selectByExample(example)
		*/
		pageView.setList(arraylist);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setRecordCount((int)page.getTotal());
		System.out.println("recordCount:"+pageView.getRecordCount());
		return pageView;
	}
	@RequestMapping("delete")
	@ResponseBody
	public String delete(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("***进入FrontReimbursementController的delete方法:");
		
		String result = null;
		String repayId = request.getParameter("repayId");
		System.out.println("****repayId:"+repayId);
		try{
			proRepayPlanService.deleteByPrimaryKey(repayId);
			result = "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			result = "删除失败";
		}
		System.out.println("******result:"+result);
		return result;
	}
}
