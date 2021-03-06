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
import com.iwonder.alice.pro.entity.ProRepayMethod;
import com.iwonder.alice.pro.entity.ProRepayMethodExample;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayMethodService;
@Controller
@RequestMapping("/admin/pro/proLoan/")
public class ProLoanAdminAction {
	@Autowired
	IProLoanService proLoanService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProRepayMethodService ProRepayMethodService;
	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {

		HashMap ha = new HashMap<>();
		ha.put("dataDictionaryCode","audit_status" );
		List<YxysDataDictionaryView> listAuditStatus = basDataDictionaryService.mySelectList(ha);
		HashMap ha2 = new HashMap<>();
		ha2.put("dataDictionaryCode","pay_status" );
		List<YxysDataDictionaryView> listPayStatus = basDataDictionaryService.mySelectList(ha2);
		HashMap ha3 = new HashMap<>();
		ha3.put("dataDictionaryCode","release_status" );
		List<YxysDataDictionaryView> listReleaseStatus = basDataDictionaryService.mySelectList(ha3);
		ProRepayMethodExample ProRepayMethodExample = new ProRepayMethodExample();
		List<ProRepayMethod> listProRepayMethod= ProRepayMethodService.selectByExample(ProRepayMethodExample);
		request.setAttribute("listAuditStatus", listAuditStatus);
		request.setAttribute("listPayStatus", listPayStatus);
		request.setAttribute("listProRepayMethod", listProRepayMethod);
		request.setAttribute("listReleaseStatus", listReleaseStatus);
		System.out.println("listReleaseStatus"+listReleaseStatus);
		return "admin/pro/proLoan_list";	
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
		
		String userCode= request.getParameter("userCode") ;
		
		String dictionaryDetailCodeAuditStatus = request.getParameter("dictionaryDetailCodeAuditStatus");
		String dictionaryDetailCodePayStatus = request.getParameter("dictionaryDetailCodePayStatus");
		String dictionaryDetailCodeReleaseStatus = request.getParameter("dictionaryDetailCodeReleaseStatus");
		String repayMethodId = request.getParameter("repayMethodId");
		String preDateTime1 = request.getParameter("preDateTime");
		String aftDateTime1 = request.getParameter("aftDateTime");
		System.out.println("用户账号"+userCode);
		System.out.println("dictionaryDetailCodeAuditStatus"+dictionaryDetailCodeAuditStatus);
		System.out.println("dictionaryDetailCodePayStatus"+dictionaryDetailCodePayStatus);
		System.out.println("dictionaryDetailCodeReleaseStatus"+dictionaryDetailCodeReleaseStatus);
		System.out.println("repayMethodId"+repayMethodId);
		System.out.println("preDateTime"+preDateTime1);
		System.out.println("aftDateTime"+aftDateTime1);
		int pageIndex = 0 ;
		int pageSize = 5 ;
		HashMap hCondition = new HashMap();


		DateConverter dateConverter = new DateConverter();
		if(!StringUtils.isEmpty(userCode)){
			hCondition.put("userCode", userCode);
		}
		
		if(!StringUtils.isEmpty(dictionaryDetailCodeAuditStatus)){
			hCondition.put("dictionaryDetailCodeAuditStatus", dictionaryDetailCodeAuditStatus);
		}
		if(!StringUtils.isEmpty(dictionaryDetailCodePayStatus)){
			hCondition.put("dictionaryDetailCodePayStatus", dictionaryDetailCodePayStatus);
		}
		if(!StringUtils.isEmpty(dictionaryDetailCodeReleaseStatus)){
			hCondition.put("dictionaryDetailCodeReleaseStatus", dictionaryDetailCodeReleaseStatus);
		}
		if(!StringUtils.isEmpty(repayMethodId)){
			hCondition.put("repayMethodId", repayMethodId);
		}
		if(!StringUtils.isEmpty(preDateTime1)){
			Date preDateTime= dateConverter.convert(preDateTime1);
			hCondition.put("preDateTime", preDateTime);
		}if(!StringUtils.isEmpty(aftDateTime1)){
			Date aftDateTime= dateConverter.convert(aftDateTime1);
			hCondition.put("aftDateTime", aftDateTime);
		}
		
		
		if(!StringUtils.isEmpty(strPage)){
			pageIndex = Integer.parseInt(strPage) -1 ;
		}
		
		if(!StringUtils.isEmpty(strRows)){
			pageSize = Integer.parseInt(strRows) ;
		}
		
		
		
		
		
		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		
		
		//
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		//List<ProLoan> listProLoan = proLoanService.selectByExample(proLoanExample) ;
		List<ProLoanView> listProLoan = proLoanService.mySelectList(hCondition);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
	//	pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listProLoan);
		pageView.setRecordCount((int)page.getTotal());
		pageView.setMapCondition(hCondition);
		
		
		return new PageViewEasyUIWrapper(pageView) ;
	}
	/*@RequestMapping("pageAjax")
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
		String userCode= request.getParameter("userCode") ;
		System.out.println("用户账号"+userCode);
		
		int pageIndex = 0 ;
		int pageSize = 5 ;
		
		if(!StringUtils.isEmpty(strPage)){
			pageIndex = Integer.parseInt(strPage) -1 ;
		}
		
		if(!StringUtils.isEmpty(strRows)){
			pageSize = Integer.parseInt(strRows) ;
		}
		
		
		ProLoanExample proLoanExample = new ProLoanExample() ;
		if(!StringUtils.isEmpty(sort)){
			proLoanExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = proLoanExample.createCriteria();
		
		//加查询条件
		if(!StringUtils.isEmpty(name)){
			criteria.andNameLike(name + "%")  ;
		}
		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		//List<ProLoan> listProLoan = proLoanService.selectByExample(proLoanExample) ;
		List<ProLoanView> listProLoan = proLoanService.mySelectList();
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
//		pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listProLoan);
		pageView.setRecordCount((int)page.getTotal());
		
		
		
		return new PageViewEasyUIWrapper(pageView) ;
	}*/
	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String loanId = request.getParameter("loanId");
		HashMap ha = new HashMap();
		ha.put("dataDictionaryCode","audit_status" );
		HashMap ha2 = new HashMap();
		ha2.put("dataDictionaryCode","pay_status" );
		HashMap ha3 = new HashMap<>();
		ha3.put("dataDictionaryCode","release_status" );
		List<YxysDataDictionaryView> listReleaseStatus = basDataDictionaryService.mySelectList(ha3);
		List<YxysDataDictionaryView> listAuditStatus = basDataDictionaryService.mySelectList(ha);
		List<YxysDataDictionaryView> listPayStatus = basDataDictionaryService.mySelectList(ha2);
		ProRepayMethodExample ProRepayMethodExample = new ProRepayMethodExample();
		List<ProRepayMethod> listProRepayMethod= ProRepayMethodService.selectByExample(ProRepayMethodExample);
		System.out.println("listAuditStatus"+listAuditStatus);
		System.out.println("listPayStatus"+listPayStatus);
		System.out.println("ListProRepayMethod"+listProRepayMethod);
		System.out.println("listReleaseStatus"+listReleaseStatus);
		request.setAttribute("listAuditStatus", listAuditStatus);
		request.setAttribute("listPayStatus", listPayStatus);
		request.setAttribute("ListProRepayMethod", listProRepayMethod);
		request.setAttribute("listReleaseStatus", listReleaseStatus);
	
		
			
		if(!(StringUtils.isEmpty(loanId))){	
			HashMap hCondition = new HashMap();
			hCondition.put("loanId", loanId);
			// ProLoan proLoan = proLoanService.selectByPrimaryKey(loanId);
			ProLoanView proLoanView = proLoanService.mySelectOne(hCondition);
			request.setAttribute("proLoanView",proLoanView);
			
		}System.out.println("进入了edit方法loanId为"+loanId);
		

		return "admin/pro/proLoan_edit" ;
	}
	@RequestMapping("save")
	@ResponseBody
	public String save(ProLoan proLoan, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(proLoan.toString());
		//customerService.insertSelective(customer);
		System.out.println("在save方法中 proLoan.getLoanId()"+proLoan.getLoanId());
		String result=null;
		try{
		if(StringUtils.isEmpty(proLoan.getLoanId())){
			System.out.println("进入了保存方法");
			proLoanService.insertSelective(proLoan);
		}else{
			System.out.println("proLoan.getLoanId()"+proLoan.getLoanId());
			System.out.println("进入了修改方法");
			proLoanService.updateByPrimaryKeySelective(proLoan);
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
			proLoanService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(ProLoan proLoan, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		System.out.println("进入了delete方法");
		System.out.println(proLoan.toString());
		try{
		System.out.println("customer.getCustomerId()"+proLoan.getLoanId());
		proLoanService.deleteByPrimaryKey(proLoan.getLoanId());
		result = "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			result = "删除失败";
		}
		return result ;
	}
}
