package com.iwonder.alice.sys.action;

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
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.framework.vo.PageViewEasyUIWrapper;
import com.iwonder.alice.sys.entity.SysModule;
import com.iwonder.alice.sys.entity.SysModuleExample;
import com.iwonder.alice.sys.entity.SysModuleExample.Criteria;
import com.iwonder.alice.sys.service.ISysModuleService;

@Controller
@RequestMapping("/admin/sys/module/")
public class SysModuleAdminAction {

	@Autowired
	ISysModuleService iSysModuleService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		return "admin/sys/sysModule_list";
	}
	
	@RequestMapping("listAjax")
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
		String name= request.getParameter("moduleName") ;
		
		int pageIndex = 0 ;
		int pageSize = 5 ;
		
		if(!StringUtils.isEmpty(strPage)){
			pageIndex = Integer.parseInt(strPage) -1 ;
		}
		
		if(!StringUtils.isEmpty(strRows)){
			pageSize = Integer.parseInt(strRows) ;
		}
		
		
		SysModuleExample sysModuleExample = new SysModuleExample() ;
		if(!StringUtils.isEmpty(sort)){
			sysModuleExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = sysModuleExample.createCriteria();
		
		//加查询条件
		/*if(!StringUtils.isEmpty(name)){
			criteria.andModuleNameLike(name + "%")  ;
		}*/
		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		List<SysModule> listSysModule = iSysModuleService.selectByExample(sysModuleExample) ;
		
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
//		pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listSysModule);
		pageView.setRecordCount((int)page.getTotal());
		
		
		
		return new PageViewEasyUIWrapper(pageView) ;
	}
	
	
	@RequestMapping("edit")
	public String edit(HttpServletRequest request,HttpServletResponse response){
		System.out.println("**************");
		System.out.println("====进入edit");
		System.out.println("**************");
		String moduleId = request.getParameter("moduleId");
		System.out.println("**************");
		System.out.println("+++++moduleId:"+moduleId);
		SysModule sysModule = null;
		if(!StringUtils.isEmpty(moduleId)){
			sysModule = iSysModuleService.load(moduleId);
			request.setAttribute("sysModule", sysModule);
			System.out.println("**********************sysModule:"+sysModule.toString());
		}
		return "admin/sys/sysModule_edit";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入了delete方法");
		
		String moduleId = request.getParameter("moduleId");
		System.out.println("********"+moduleId);
		String result = null;
		try{
			iSysModuleService.delete(moduleId);
			result = "删除成功";
		}catch(Exception e){
			result = "删除单个失败";
		}
		
		return result;
	}
	
	@RequestMapping("deleteRowsAjax")
	@ResponseBody
	public String deleteRows(@RequestParam("ids[]") String[] ids,HttpServletRequest request,HttpServletResponse response){
		System.out.println("**********进入deleteRows");
//		String[] ids = request.getParameterValues("ids");
		String result = null;
		try{
			iSysModuleService.deleteRows(ids);
		}catch(Exception e){
			result = "删除多个失败";
		}
		return result;
	}
	
	@RequestMapping("saveAjax")
	@ResponseBody
	public String save(SysModule sysModule,HttpServletRequest request,HttpServletResponse response){
		System.out.println("*****进入save");
		String result = null;
		
		try{
			if(!StringUtils.isEmpty(sysModule.getModuleId())){
		
				iSysModuleService.update(sysModule);
				result = "操作成功";
			}else{
				iSysModuleService.insert(sysModule);
				result = "操作成功";
			}
		}catch(Exception e){
			result = "操作失败";
		}
		return result;
//		return "redirect:list.do";
	}
}
