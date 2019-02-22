package com.iwonder.alice.front.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import com.iwonder.alice.framework.util.AliceUtils;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.front.service.IFrontApplicationService;
import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProLoanExample;

import com.iwonder.alice.pro.entity.ProRepayPlan;
import com.iwonder.alice.pro.entity.ProRepayPlanExample;
import com.iwonder.alice.pro.entity.ProRepayPlanExample.Criteria;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayPlanService;

@Controller
@RequestMapping("/front/FrontNotRepaymentsController/")
public class FrontNotRepaymentsController {
	
	@Autowired
	IFrontApplicationService iFrontApplicationService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProLoanService proLoanService ;
	@Autowired
	IProRepayPlanService proRepayPlanService;
	@RequestMapping("page")
	public String List(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("进入了FrontNotRepaymentsController 的 page方法");
		ProLoanExample example= new ProLoanExample();
		java.util.List<ProLoan> proLoans = proLoanService.selectByExample(example);
		for(ProLoan proLoan:proLoans){
			String loanId = proLoan.getLoanId();
			ProRepayPlanExample example2 = new ProRepayPlanExample();
			Criteria createCriteria = example2.createCriteria();
			createCriteria.andLoanIdEqualTo(loanId);
			java.util.List<ProRepayPlan> proRepayPlans = proRepayPlanService.selectByExample(example2 );
			boolean check = true;
			
			for(ProRepayPlan proRepayPlan:proRepayPlans){
				String payEachStatus = proRepayPlan.getPayEachStatus();
				System.out.println("payEachStatus"+payEachStatus);
				if(payEachStatus.equals("no_pay_each")){
					check=false;
				}
			}
			if(proRepayPlans.size()==0){
				check=false;
			}
			if(check){
				ProLoan record = new ProLoan();
				record.setLoanId(loanId);
				record.setPayStatus("already_pay");
				
				proLoanService.updateByPrimaryKeySelective(record);
			}
		}
		
		
		return "/front/yxy/not_Repayments";
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
			ha.put("payEachStatus", "no_pay_each");
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
		
		System.out.println("***进入delete方法:");
		
		String result = null;
		String loanId = request.getParameter("loanId");
		System.out.println("****loanId:"+loanId);
		try{
			proLoanService.deleteByPrimaryKey(loanId);
			result = "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			result = "删除失败";
		}
		System.out.println("******result:"+result);
		return result;
	}
	
}
