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
import com.iwonder.alice.pro.entity.ProLoanExample.Criteria;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.usr.entity.UsrInformation;

@Controller
@RequestMapping("/front/FrontApprovalApplicationController/")
public class FrontApprovalApplicationController {
	
	@Autowired
	IFrontApplicationService iFrontApplicationService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProLoanService proLoanService ;
	@RequestMapping("page")
	public String list(HttpServletRequest request,HttpServletResponse response) {
		
		return "/front/yxy/approval_application";
	}
	
	@RequestMapping("pageAjax")
	@ResponseBody
	public PageView listAjax(HttpServletRequest request,HttpServletResponse response){
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
			hCondition.put("dictionaryDetailCodePayStatus", "no_pay");
			hCondition.put("dictionaryDetailCodeReleaseStatus", "not_release");
		 
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
//		pageView.setMapCondition(mapCondition);
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
	
	@RequestMapping("edit")
	@ResponseBody
	public String edit(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("*****进入edit方法");
		
		String result = null;
		String loanId = request.getParameter("loanId");
		ProLoan proLoan = new ProLoan();
		proLoan.setLoanId(loanId);
		proLoan.setReleaseStatus("yes_release");
		try{
			iFrontApplicationService.update(proLoan);
		}catch(Exception e){
			result = "贷款失败";
		}
		return result;
	}
}
