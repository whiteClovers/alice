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
import com.iwonder.alice.pro.entity.ProRepayPlan;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayPlanService;

@Controller
@RequestMapping("/front/FrontToRepaymentsController/")
public class FrontToRepaymentsController {
	
	@Autowired
	IFrontApplicationService iFrontApplicationService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProLoanService proLoanService ;
	@Autowired
	IProRepayPlanService IProRepayPlanService;
	@RequestMapping("page")
	public String page(HttpServletRequest request,HttpServletResponse response) {
		
		String repayId = request.getParameter("repayId");
		ProRepayPlanView proRepayPlan =new ProRepayPlanView();
		if(!StringUtils.isEmpty(repayId)){//当点击确认借款按钮时候 进入这个方法 
			HashMap ha = new HashMap<>();
					ha.put("repayId", repayId);
			 proRepayPlan = IProRepayPlanService.mySelectOne(ha);	
		}
		request.setAttribute("proRepayPlan", proRepayPlan);
		return "/front/yxy/to_repayments";
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
		
		String repayId= request.getParameter("repayId");
		String PpaidPrincipal1= request.getParameter("PpaidPrincipal");
		String PpaidInterest1= request.getParameter("PpaidInterest");
		String PpaidFine1= request.getParameter("PpaidFine");
		ProRepayPlan proRepayPlan = IProRepayPlanService.selectByPrimaryKey(repayId);
		BigDecimal needPrincipal = proRepayPlan.getNeedPrincipal();//需求还的本金
		BigDecimal interest = proRepayPlan.getInterest();//需求还的利息
		BigDecimal fine = proRepayPlan.getFine();//需求还的罚息
		BigDecimal paidFine = proRepayPlan.getPaidFine();//原来已还的罚息
		BigDecimal paidInterest = proRepayPlan.getPaidInterest();//原来已还的利息
		BigDecimal paidPrincipal = proRepayPlan.getPaidPrincipal();//原来已还的本金
		System.out.println();
		ProRepayPlan proRepayPlanNew = new ProRepayPlan();
		BigDecimal newPaidFine=paidFine;
		BigDecimal newPaidInterest=paidInterest;
		BigDecimal newPaidPrincipal=paidPrincipal;
		HttpSession session= request.getSession();
		if(!StringUtils.isEmpty(repayId)){
			System.out.println("repayId"+repayId);
			proRepayPlanNew.setRepayId(repayId);
		}
		if(!StringUtils.isEmpty(PpaidPrincipal1)){
			BigDecimal PpaidPrincipal = AliceUtils.parseBigDecimal(PpaidPrincipal1);
			System.out.println("PpaidPrincipal"+PpaidPrincipal);
			newPaidPrincipal=paidPrincipal.add(PpaidPrincipal);
			proRepayPlanNew.setPaidPrincipal(newPaidPrincipal);
		}
		if(!StringUtils.isEmpty(PpaidInterest1)){
			BigDecimal PpaidInterest = AliceUtils.parseBigDecimal(PpaidInterest1);
			System.out.println("PpaidInterest"+PpaidInterest);
			newPaidInterest=paidInterest.add(PpaidInterest);
			proRepayPlanNew.setPaidInterest(newPaidInterest);
		}
		if(!StringUtils.isEmpty(PpaidFine1)){
			BigDecimal PpaidFine = AliceUtils.parseBigDecimal(PpaidFine1);
			System.out.println("PpaidFine"+PpaidFine);
			newPaidFine=paidFine.add(PpaidFine);
			proRepayPlanNew.setPaidFine(newPaidFine);
		}
	//需求还款的钱
	//还款后的钱
		BigDecimal needPaid = fine.add(interest).add(needPrincipal);
		BigDecimal alreadyPaid=newPaidFine.add(newPaidInterest).add(newPaidPrincipal);
		System.out.println("needPaid"+needPaid);
		System.out.println("alreadyPaid"+alreadyPaid);
		System.out.println("alreadyPaid.compareTo(needPaid)"+alreadyPaid.compareTo(needPaid));
		if(alreadyPaid.compareTo(needPaid)==1||alreadyPaid.compareTo(needPaid)==0){
			proRepayPlanNew.setPayEachStatus("yes_pay_each");
			proRepayPlanNew.setActualRepayDate(new Date());
		}	
		Page<Object> page = PageHelper.startPage(pageIndex, pageSize);
		System.out.println("proRepayPlanNew"+proRepayPlanNew);
		IProRepayPlanService.updateByPrimaryKeySelective(proRepayPlanNew);
		//pageView.setList(listProLoanApplication);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setRecordCount((int)page.getTotal());
		System.out.println("recordCount:"+pageView.getRecordCount());
		return pageView;
	}
}
