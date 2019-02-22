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
import com.iwonder.alice.sys.entity.SysRoleMenu;
import com.iwonder.alice.sys.entity.SysRoleMenuExample;
import com.iwonder.alice.sys.entity.SysRoleMenuExample.Criteria;
import com.iwonder.alice.sys.service.ISysRoleMenuService;

@Controller
@RequestMapping("/admin/sys/roleMenu/")
public class SysRoleMenuAdminAction {

	@Autowired
	ISysRoleMenuService iSysRoleMenuService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		return "admin/sys/sysRoleMenu_list";
	}
	
	@RequestMapping("listAjax")
	@ResponseBody
	public PageViewEasyUIWrapper pageAj(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("*******进入pageAj");
		PageView pageView = new PageView() ;
		
		String sort = request.getParameter("sort") ;
		String order = request.getParameter("order") ;//前台已封装
		
		
		
		String strPage = request.getParameter("page") ;
		String strRows = request.getParameter("rows") ;//前台已封装
		
//		String strPageIndex = request.getParameter("pageIndex") ;
//		String strPageSize = request.getParameter("pageSize") ;
		
		//加查询条件
		String menuId= request.getParameter("menuId") ;
		String roleId = request.getParameter("roleId");
		
		System.out.println("*************"+menuId);
		
		int pageIndex = 0 ;
		int pageSize = 5 ;
		
		if(!StringUtils.isEmpty(strPage)){
			pageIndex = Integer.parseInt(strPage) -1 ;
		}
		
		if(!StringUtils.isEmpty(strRows)){
			pageSize = Integer.parseInt(strRows) ;
		}
		
		
		SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample() ;
		if(!StringUtils.isEmpty(sort)){
			sysRoleMenuExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = sysRoleMenuExample.createCriteria();
		
		//加查询条件
		if(!StringUtils.isEmpty(menuId)){
			criteria.andMenuIdLike(menuId)  ;
		}
		if(!StringUtils.isEmpty(roleId)){
			criteria.andRoleIdLike(roleId);
		}
		
//		Map mapCondition = new HashMap() ;
//		mapCondition.put("name", name) ;
		
		Page<Object> page = PageHelper.startPage(pageIndex+1, pageSize) ;
		List<SysRoleMenu> listSysRoleMenu = iSysRoleMenuService.selectByExample(sysRoleMenuExample) ;
		
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
//		pageView.setMapCondition(mapCondition);
		
		
		pageView.setList(listSysRoleMenu);
		pageView.setRecordCount((int)page.getTotal());
		
		
		
		return new PageViewEasyUIWrapper(pageView) ;
	}
	
	
	@RequestMapping("edit")
	public String edit(HttpServletRequest request,HttpServletResponse response){
		System.out.println("====进入edit");
		String roleMenuId = request.getParameter("roleMenuId");
		SysRoleMenu sysRoleMenu = null;
		if(!StringUtils.isEmpty(roleMenuId)){
			sysRoleMenu = iSysRoleMenuService.load(roleMenuId);
			request.setAttribute("sysRoleMenu", sysRoleMenu);
			System.out.println("**********************sysRoleMenu:"+sysRoleMenu.toString());
		}
		return "admin/sys/sysRoleMenu_edit";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入了delete方法");
		
		String roleMenuId = request.getParameter("roleMenuId");
		System.out.println("********"+roleMenuId);
		String result = null;
		try{
			iSysRoleMenuService.delete(roleMenuId);
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
			iSysRoleMenuService.deleteRows(ids);
		}catch(Exception e){
			result = "删除多个失败";
		}
		return result;
	}
	
	@RequestMapping("saveAjax")
	@ResponseBody
	public String save(SysRoleMenu sysRoleMenu,HttpServletRequest request,HttpServletResponse response){
		System.out.println("*****进入save");
		String result = null;
		
		try{
			if(!StringUtils.isEmpty(sysRoleMenu.getRoleMenuId())){
		
				iSysRoleMenuService.update(sysRoleMenu);
				result = "操作成功";
			}else{
				iSysRoleMenuService.insert(sysRoleMenu);
				result = "操作成功";
			}
		}catch(Exception e){
			result = "操作失败";
		}
		return result;
//		return "redirect:list.do";
	}
}
