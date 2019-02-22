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
@RequestMapping("/front/FrontAlreadyReimbursementController/")
public class FrontAlreadyReimbursementController {
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
		
		return "/front/yxy/already_reimbursement";
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

			HashMap hCondition = new HashMap();		
			hCondition.put("dictionaryDetailCodeAuditStatus", "already_audit");	
			hCondition.put("dictionaryDetailCodePayStatus", "already_pay");
			hCondition.put("dictionaryDetailCodeReleaseStatus", "yes_release");
		 
		List<ProLoanView> listProLoanApplication1 = proLoanService.mySelectList(hCondition);
		List<ProLoanView> listProLoanApplication = new ArrayList();
		for(ProLoanView ProLoanApplication:listProLoanApplication1){
			HashMap ha = new HashMap<>();
			ha.put("repayMethodId", ProLoanApplication.getRepayMethodId());
			List<YxysDataDictionaryView> listRepayMethod = basDataDictionaryService.mySelectList(ha);
			for(YxysDataDictionaryView repayMethod:listRepayMethod){
				if(repayMethod.getDictionaryDetailCode().equals(ProLoanApplication.getRepayMethod())){
					ProLoanApplication.setRepayMethod(repayMethod.getDictionaryDetailLabel());
					listProLoanApplication.add(ProLoanApplication);
				}
			}
		}
		System.out.println("listProLoanApplication"+listProLoanApplication+"==========");
		System.out.println(listProLoanApplication.toString());
		pageView.setList(listProLoanApplication);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setRecordCount((int)page.getTotal());
		System.out.println("recordCount:"+pageView.getRecordCount());
		return pageView;
	}
}
