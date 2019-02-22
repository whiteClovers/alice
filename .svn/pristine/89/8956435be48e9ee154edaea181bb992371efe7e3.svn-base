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
import com.iwonder.alice.sys.entity.SysMenu;
import com.iwonder.alice.sys.entity.SysMenuExample;
import com.iwonder.alice.sys.entity.SysMenuExample.Criteria;
import com.iwonder.alice.sys.service.ISysMenuService;

@Controller
@RequestMapping("/admin/sys/menu/")
public class SysMenuAdminAction {

	@Autowired
	ISysMenuService iSysMenuService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		return "admin/sys/sysMenu_list";
	}
	
	/*@RequestMapping("listAjax")
	@ResponseBody
	public PageView listAjax(HttpServletRequest request,HttpServletResponse response){
		System.out.println("===========");
		PageView pageView = new PageView();
		
		String strPageIndex = request.getParameter("pageIndex");
		String strPageSize = request.getParameter("pageSize");
		String name = request.getParameter("name");
		
		int pageIndex = 0;
		int pageSize = 5;
		
		if(!StringUtils.isEmpty(strPageSize)){
			pageIndex = Integer.parseInt(strPageIndex);
		}
		
		if(!StringUtils.isEmpty(strPageSize)){
			pageSize = Integer.parseInt(strPageSize);
		}
		
		SysMenuExample customerExample = new SysMenuExample();
		Criteria criteria = customerExample.createCriteria();
		
		if(!StringUtils.isEmpty(name)){
			criteria.andMenuNameLike(name + "%");
		}
		
		Map mapCondition = new HashMap();
		mapCondition.put("name",name);
		
		Page<Object> page = PageHelper.startPage(pageIndex, pageSize);
		List<SysMenu> listMenu = iSysMenuService.selectByExample(customerExample);
		
		pageView.setList(listMenu);
		pageView.setMapCondition(mapCondition);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setRecordCount((int)page.getTotal());
		System.out.println("===============pageView"+pageView.toString());
		System.out.println("recordCount:"+pageView.getRecordCount());
		
		return pageView;
	}*/
	
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
		String name= request.getParameter("menuName") ;
		
		int pageIndex = 0 ;
		int pageSize = 5 ;
		
		if(!StringUtils.isEmpty(strPage)){
			pageIndex = Integer.parseInt(strPage) -1 ;
		}
		
		if(!StringUtils.isEmpty(strRows)){
			pageSize = Integer.parseInt(strRows) ;
		}
		
		
		SysMenuExample sysMenuExample = new SysMenuExample() ;
		if(!StringUtils.isEmpty(sort)){
			sysMenuExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = sysMenuExample.createCriteria();
		
		//加查询条件
		if(!StringUtils.isEmpty(name)){
			criteria.andMenuNameLike(name + "%")  ;
		}
		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		List<SysMenu> listSysMenu = iSysMenuService.selectByExample(sysMenuExample) ;
		
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
//		pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listSysMenu);
		pageView.setRecordCount((int)page.getTotal());
		
		
		
		return new PageViewEasyUIWrapper(pageView) ;
	}
	
	
	@RequestMapping("edit")
	public String edit(HttpServletRequest request,HttpServletResponse response){
		System.out.println("====进入edit");
		String menuId = request.getParameter("menuId");
		System.out.println("+++++menuId:"+menuId);
		SysMenu sysMenu = null;
		if(!StringUtils.isEmpty(menuId)){
			sysMenu = iSysMenuService.load(menuId);
			request.setAttribute("sysMenu", sysMenu);
			System.out.println("**********************sysMenu:"+sysMenu.toString());
		}
		return "admin/sys/sysMenu_edit";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入了delete方法");
		
		String menuId = request.getParameter("menuId");
		String result = null;
		try{
			iSysMenuService.delete(menuId);
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
			iSysMenuService.deleteRows(ids);
		}catch(Exception e){
			result = "删除多个失败";
		}
		return result;
	}
	
	@RequestMapping("saveAjax")
	@ResponseBody
	public String save(SysMenu sysMenu,HttpServletRequest request,HttpServletResponse response){
		System.out.println("*****进入save");
		String result = null;
		
		try{
			if(!StringUtils.isEmpty(sysMenu.getMenuId())){
		
				iSysMenuService.update(sysMenu);
				result = "操作成功";
			}else{
				iSysMenuService.insert(sysMenu);
				result = "操作成功";
			}
		}catch(Exception e){
			result = "操作失败";
		}
		return result;
//		return "redirect:list.do";
	}
}
