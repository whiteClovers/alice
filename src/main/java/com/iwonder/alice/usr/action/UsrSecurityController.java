package com.iwonder.alice.usr.action;

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
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.framework.vo.PageViewEasyUIWrapper;
import com.iwonder.alice.framework.web.DateConverter;
import com.iwonder.alice.usr.entity.UsrSecurity;
import com.iwonder.alice.usr.entity.UsrSecurityExample;
import com.iwonder.alice.usr.entity.UsrSecurityExample.Criteria;
import com.iwonder.alice.usr.service.IUsrInformationService;
import com.iwonder.alice.usr.service.IUsrSecurityService;
import com.iwonder.alice.usr.view.UsrSecurityView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */

@Controller
@RequestMapping("/admin/usr/usrSecurity/")
public class UsrSecurityController {
	@Autowired
	IUsrSecurityService iUsrSecurityService;
	@Autowired
	IUsrInformationService iUsrInformationService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidBlack> usrSecuritylist =
		// usrSecurityService.list();
		// request.setAttribute("usrSecuritylist", usrSecuritylist);
		request.setAttribute("listUsrSecurityView", iUsrSecurityService.mySelectUserList());
		request.setAttribute("listUsrInformation", iUsrInformationService.list());
		return "/admin/usr/usrSecurity_list";
	}

	@RequestMapping("pageAjax")
	@ResponseBody
	public PageViewEasyUIWrapper pageAj(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String,Object> listMapPool = new HashMap<String,Object>();
		
		PageView pageView = new PageView();
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		String strPage = request.getParameter("page");
		String strRows = request.getParameter("rows");
		// String strPageIndex = request.getParameter("pageIndex") ;
		// String strPageSize = request.getParameter("pageSize") ;

		// 加搜索查询条件--------------start
		String userId = request.getParameter("userId");
		String securityCode = request.getParameter("securityCode");
		String securityRelation = request.getParameter("securityRelation");
		String securityName = request.getParameter("securityName");
		
		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		UsrSecurityExample usrSecurityExample = new UsrSecurityExample();
		if (!StringUtils.isEmpty(sort)) {
			usrSecurityExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = usrSecurityExample.createCriteria();
		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(userId)) {
//			criteria.andUserIdLike(userId + "%");
			listMapPool.put("userId", userId);
		}
		if (!StringUtils.isEmpty(securityCode)) {
//			criteria.andSecurityCodeLike(securityCode + "%");
			listMapPool.put("securityCode", securityCode);
		}
		if (!StringUtils.isEmpty(securityRelation)) {
//			criteria.andSecurityRelationLike(securityRelation + "%");
			listMapPool.put("securityRelation", securityRelation);
		}
		if (!StringUtils.isEmpty(securityName)) {
//			criteria.andSecurityNameLike(securityName + "%");
			listMapPool.put("securityName", securityName);
		}
		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<UsrSecurityView> listUsrSecurity = iUsrSecurityService.mySelectList(listMapPool);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listUsrSecurity);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String securityId = request.getParameter("securityId");
		UsrSecurity usrSecurity = null;
		if (!StringUtils.isEmpty(securityId)) {
			usrSecurity = iUsrSecurityService.load(securityId);
			request.setAttribute("usrSecurity", usrSecurity);
		} else {

		}
		request.setAttribute("listUsrInformation", iUsrInformationService.list());
		request.setAttribute("usrSecurity", usrSecurity);

		return "/admin/usr/usrSecurity_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String usrSecurityId = request.getParameter("usrSecurityId");
			iUsrSecurityService.delete(usrSecurityId);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("deleteRowsAj")
	@ResponseBody
	public String deleteRowsAj(@RequestParam("ids[]") String[] ids, HttpServletRequest request,
			HttpServletResponse response) {
		String result = null;
		try {
			iUsrSecurityService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(UsrSecurity usrSecurity, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(usrSecurity.getSecurityId())) {
				iUsrSecurityService.update(usrSecurity);
			} else {

				iUsrSecurityService.insert(usrSecurity);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
