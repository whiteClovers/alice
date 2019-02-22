package com.iwonder.alice.pro.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.iwonder.alice.pro.entity.ProRepayMethodExample.Criteria;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayMethodService;
@Controller
@RequestMapping("/admin/pro/proRepayMethod/")
public class ProRepayMethodAdminAction {
	@Autowired
	IProLoanService proLoanService;
	@Autowired
	BasDataDictionaryService basDataDictionaryService;
	@Autowired
	IProRepayMethodService ProRepayMethodService;
	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {

		
		return "admin/pro/proRepayMethod_list";	
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
		
		String repayMethod= request.getParameter("repayMethod") ;
		System.out.println("repayMethod"+repayMethod);

		int pageIndex = 0 ;
		int pageSize = 5 ;
		
		

		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		
		
		//
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		//List<ProLoan> listProLoan = proLoanService.selectByExample(proLoanExample) ;
		ProRepayMethodExample example = new ProRepayMethodExample();
		Criteria createCriteria = example.createCriteria();
		Map hCondition = new HashMap() ;
		if(!StringUtils.isEmpty(repayMethod)){
			hCondition.put("repayMethod", repayMethod);
			createCriteria.andRepayMethodLike(repayMethod);
		}
		List<ProRepayMethod> listProRepayMethod = ProRepayMethodService.selectByExample(example);
		System.out.println("listProRepayMethod"+listProRepayMethod);
		request.setAttribute("listProRepayMethod", listProRepayMethod);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
	//	pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listProRepayMethod);
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
		String repayMethodId = request.getParameter("repayMethodId");					
		if(!(StringUtils.isEmpty(repayMethodId))){	
			
			// ProLoan proLoan = proLoanService.selectByPrimaryKey(loanId);
			ProRepayMethod ProRepayMethod = ProRepayMethodService.selectByPrimaryKey(repayMethodId);
			request.setAttribute("ProRepayMethod",ProRepayMethod);
			
		}
		
	
		return "admin/pro/proRepayMethod_edit" ;
	}
	@RequestMapping("save")
	@ResponseBody
	public String save(ProRepayMethod proRepayMethod, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(proRepayMethod.toString());
		//customerService.insertSelective(customer);
		System.out.println("在save方法中 proRepayMethod.getRepayMethodId()"+proRepayMethod.getRepayMethodId());
		String result=null;
		try{
		if(StringUtils.isEmpty(proRepayMethod.getRepayMethodId())){
			System.out.println("进入了保存方法");
			ProRepayMethodService.insertSelective(proRepayMethod);
		}else{
			System.out.println("proRepayMethod.getRepayMethodId()"+proRepayMethod.getRepayMethodId());
			System.out.println("进入了修改方法");
			ProRepayMethodService.updateByPrimaryKeySelective(proRepayMethod);
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
			ProRepayMethodService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(ProRepayMethod proRepayMethod, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		System.out.println("进入了delete方法");
		System.out.println(proRepayMethod.toString());
		try{
		System.out.println("proRepayMethod.getRepayMethodId()"+proRepayMethod.getRepayMethodId());
		ProRepayMethodService.deleteByPrimaryKey(proRepayMethod.getRepayMethodId());
		result = "删除成功";
		}catch(Exception e){
			e.printStackTrace();
			result = "删除失败";
		}
		return result ;
	}
}
