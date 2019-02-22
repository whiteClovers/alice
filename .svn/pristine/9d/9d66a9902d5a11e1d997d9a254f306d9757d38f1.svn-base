package com.iwonder.alice.pro.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.iwonder.alice.bas.service.BasDataDictionaryService;
import com.iwonder.alice.bas.view.YxysDataDictionaryView;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.framework.vo.PageViewEasyUIWrapper;
import com.iwonder.alice.framework.web.DateConverter;
import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProLoanExample;
import com.iwonder.alice.pro.entity.ProRepayMethod;
import com.iwonder.alice.pro.entity.ProRepayMethodExample;
import com.iwonder.alice.pro.entity.ProRepayPlan;

import com.iwonder.alice.pro.entity.ProLoanExample.Criteria;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayMethodService;
import com.iwonder.alice.pro.service.IProRepayPlanService;
@Controller
@RequestMapping("/admin/pro/proRepayPlan/")
public class ProRepayPlanAdminAction {
	@Autowired
	IProRepayPlanService proRepayPlanService;
	@Autowired
	IProLoanService proLoanService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProRepayMethodService ProRepayMethodService;
	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {

		HashMap ha = new HashMap<>();
		ha.put("dataDictionaryCode","over_status" );
		HashMap ha2 = new HashMap<>();
		ha2.put("dataDictionaryCode","pay_each_status" );
		List<YxysDataDictionaryView> listOverStatus = basDataDictionaryService.mySelectList(ha);
		List<YxysDataDictionaryView> listPayEachStatus = basDataDictionaryService.mySelectList(ha2);
		request.setAttribute("listOverStatus", listOverStatus);
		request.setAttribute("listPayEachStatus", listPayEachStatus);
		return "admin/pro/proRepayPlan_list";	
	}
	
	@RequestMapping("pageAjax")
	@ResponseBody
	public PageViewEasyUIWrapper pageAj(HttpServletRequest request, HttpServletResponse response) {
		PageView pageView = new PageView() ;
		
		String sort = request.getParameter("sort") ;
		String order = request.getParameter("order") ;//前台已封装
		
		
		
		String strPage = request.getParameter("page") ;
		String strRows = request.getParameter("rows") ;//前台已封装
		
		
		
//		String strPageIndex = request.getParameter("pageIndex") ;
//		String strPageSize = request.getParameter("pageSize") ;
		
		//加查询条件
		
		String loanCode= request.getParameter("loanCode") ;
		String dictionaryDetailCodeOverStatus = request.getParameter("dictionaryDetailCodeOverStatus");
		String dictionaryDetailCodePayEachStatus = request.getParameter("dictionaryDetailCodePayEachStatus");
		String preTheoryDateTime1 = request.getParameter("preTheoryDateTime");
		String aftTheoryDateTime1 = request.getParameter("aftTheoryDateTime");
	/*	String userCode= request.getParameter("userCode") ;
		
		String dictionaryDetailCodeAuditStatus = request.getParameter("dictionaryDetailCodeAuditStatus");
		String dictionaryDetailCodePayStatus = request.getParameter("dictionaryDetailCodePayStatus");
		String repayMethodId = request.getParameter("repayMethodId");
		String preDateTime1 = request.getParameter("preDateTime");
		String aftDateTime1 = request.getParameter("aftDateTime");
		System.out.println("用户账号"+userCode);
		System.out.println("dictionaryDetailCodeAuditStatus"+dictionaryDetailCodeAuditStatus);
		System.out.println("dictionaryDetailCodePayStatus"+dictionaryDetailCodePayStatus);
		System.out.println("repayMethodId"+repayMethodId);
		System.out.println("preDateTime"+preDateTime1);
		System.out.println("aftDateTime"+aftDateTime1);*/
		int pageIndex = 0 ;
		int pageSize = 5 ;
		HashMap hCondition = new HashMap();
		if(!StringUtils.isEmpty(loanCode)){
			hCondition.put("loanCode", loanCode);
		}
		if(!StringUtils.isEmpty(dictionaryDetailCodeOverStatus)){
			hCondition.put("dictionaryDetailCodeOverStatus", dictionaryDetailCodeOverStatus);
		}
		if(!StringUtils.isEmpty(dictionaryDetailCodePayEachStatus)){
			hCondition.put("dictionaryDetailCodePayEachStatus", dictionaryDetailCodePayEachStatus);
		}
		DateConverter dateConverter = new DateConverter();
		/*
		if(!StringUtils.isEmpty(userCode)){
			hCondition.put("userCode", userCode);
		}
		
		if(!StringUtils.isEmpty(dictionaryDetailCodeAuditStatus)){
			hCondition.put("dictionaryDetailCodeAuditStatus", dictionaryDetailCodeAuditStatus);
		}
		if(!StringUtils.isEmpty(dictionaryDetailCodePayStatus)){
			hCondition.put("dictionaryDetailCodePayStatus", dictionaryDetailCodePayStatus);
		}
		if(!StringUtils.isEmpty(repayMethodId)){
			hCondition.put("repayMethodId", repayMethodId);
		}
		*/
		
		if(!StringUtils.isEmpty(strPage)){
			pageIndex = Integer.parseInt(strPage) -1 ;
		}
		
		if(!StringUtils.isEmpty(strRows)){
			pageSize = Integer.parseInt(strRows) ;
		}
		
		if(!StringUtils.isEmpty(preTheoryDateTime1)){
			Date preTheoryDateTime= dateConverter.convert(preTheoryDateTime1);
			hCondition.put("preTheoryDateTime", preTheoryDateTime);
		}if(!StringUtils.isEmpty(aftTheoryDateTime1)){
			Date aftTheoryDateTime= dateConverter.convert(aftTheoryDateTime1);
			hCondition.put("aftTheoryDateTime", aftTheoryDateTime);
		}
		
		
		
		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		
		
		//
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		//List<ProLoan> listProLoan = proLoanService.selectByExample(proLoanExample) ;
		List<ProRepayPlanView> listRepayPlan = proRepayPlanService.mySelectList(hCondition);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
	//	pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listRepayPlan);
		pageView.setRecordCount((int)page.getTotal());
		pageView.setMapCondition(hCondition);
		
		
		return new PageViewEasyUIWrapper(pageView) ;
	}
	
	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String repayId = request.getParameter("repayId");
	/*	HashMap ha = new HashMap();
		ha.put("dataDictionaryCode","audit_status" );
		HashMap ha2 = new HashMap();
		ha2.put("dataDictionaryCode","pay_status" );
		
		List<YxysDataDictionaryView> listAuditStatus = basDataDictionaryService.mySelectList(ha);
		List<YxysDataDictionaryView> listPayStatus = basDataDictionaryService.mySelectList(ha2);
		ProRepayMethodExample ProRepayMethodExample = new ProRepayMethodExample();
		List<ProRepayMethod> listProRepayMethod= ProRepayMethodService.selectByExample(ProRepayMethodExample);
		System.out.println("listAuditStatus"+listAuditStatus);
		System.out.println("listPayStatus"+listPayStatus);
		System.out.println("ListProRepayMethod"+listProRepayMethod);
		request.setAttribute("listAuditStatus", listAuditStatus);
		request.setAttribute("listPayStatus", listPayStatus);
		request.setAttribute("ListProRepayMethod", listProRepayMethod);*/
		HashMap ha = new HashMap<>();
		ha.put("dataDictionaryCode","over_status" );
		HashMap ha2 = new HashMap<>();
		ha2.put("dataDictionaryCode","pay_each_status" );
		List<YxysDataDictionaryView> listOverStatus = basDataDictionaryService.mySelectList(ha);
		List<YxysDataDictionaryView> listPayEachStatus = basDataDictionaryService.mySelectList(ha2);
		request.setAttribute("listOverStatus", listOverStatus);
		request.setAttribute("listPayEachStatus", listPayEachStatus);
			System.out.println("repayId"+repayId);
		if(!(StringUtils.isEmpty(repayId))){	
			HashMap hCondition = new HashMap();
			hCondition.put("repayId", repayId);
			// ProLoan proLoan = proLoanService.selectByPrimaryKey(loanId);
			ProRepayPlanView proRepayPlanView = proRepayPlanService.mySelectOne(hCondition);
			System.out.println("edit 方法中！ proRepayPlanView"+proRepayPlanView);
			request.setAttribute("proRepayPlanView",proRepayPlanView);
			
		}
		

		return "admin/pro/proRepayPlan_edit" ;
	}
	@RequestMapping("save")
	@ResponseBody
	public String save(ProRepayPlan proRepayPlan, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(proRepayPlan.toString());
		//customerService.insertSelective(customer);
		String  loanCode = request.getParameter("loanCode");
		ProLoanExample example = new ProLoanExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLoanCodeEqualTo(loanCode);
		List<ProLoan> selectByExample = proLoanService.selectByExample(example);
		if(selectByExample !=null){
			ProLoan proLoan2 = selectByExample.get(0);		
			proRepayPlan.setLoanId(proLoan2.getLoanId());	
		}
		System.out.println("在save方法中 proRepayPlan.getRepayId()"+proRepayPlan.getRepayId());
		String result=null;
		try{
		if(StringUtils.isEmpty(proRepayPlan.getRepayId())){
			System.out.println("进入了保存方法");
			proRepayPlanService.insertSelective(proRepayPlan);
		}else{
			System.out.println("proRepayPlan.getRepayId()"+proRepayPlan.getRepayId());
			System.out.println("进入了修改方法");
			proRepayPlanService.updateByPrimaryKeySelective(proRepayPlan);
		}
		result="操作成功";
		}catch(Exception e){
			e.printStackTrace();
			result="操作失败";	
		}
		return result ;
	}
	@RequestMapping("deleteRowsAj")
	@ResponseBody
	public String deleteRowsAj(@RequestParam("ids[]") String[] ids, HttpServletRequest request,
			HttpServletResponse response) {
		String result = null;
		try {
			proRepayPlanService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(ProRepayPlan proRepayPlan, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		System.out.println("进入了delete方法");
		System.out.println(proRepayPlan.toString());
		try{
		System.out.println("proRepayPlan.getRepayId()"+proRepayPlan.getRepayId());
		proRepayPlanService.deleteByPrimaryKey(proRepayPlan.getRepayId());
		result = "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			result = "删除失败";
		}
		return result ;
	}
}
