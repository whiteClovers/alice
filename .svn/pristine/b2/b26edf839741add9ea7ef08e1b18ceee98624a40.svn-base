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
import com.iwonder.alice.sys.entity.SysRole;
import com.iwonder.alice.sys.entity.SysRoleExample;
import com.iwonder.alice.sys.entity.SysRoleExample.Criteria;
import com.iwonder.alice.sys.service.SysRoleService;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */

@Controller
@RequestMapping("/admin/sys/sysRole/")
public class SysRoleController {
	@Autowired
	SysRoleService sysRoleService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidBlack> sysRolelist =
		// sysRoleService.list();
		// request.setAttribute("sysRolelist", sysRolelist);
		return "/admin/sys/sysRole_list";
	}

	@RequestMapping("pageAjax")
	@ResponseBody
	public PageViewEasyUIWrapper pageAj(HttpServletRequest request, HttpServletResponse response) {
		PageView pageView = new PageView();
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		String strPage = request.getParameter("page");
		String strRows = request.getParameter("rows");
		// String strPageIndex = request.getParameter("pageIndex") ;
		// String strPageSize = request.getParameter("pageSize") ;

		// 加搜索查询条件--------------start
		String roleName = request.getParameter("roleName");
//		String userName = request.getParameter("userName");
//		String userIdcard = request.getParameter("userIdcard");

		// 时间转换
		// String userRegtimeBefore = request.getParameter("userRegtimeBefore");
		// String userRegtimeAfter = request.getParameter("userRegtimeAfter");
		// DateConverter dc = new DateConverter();
		// Date convertBefore = dc.convert(userRegtimeBefore);
		// Date convertAfter = dc.convert(userRegtimeAfter);

//		String userAddress = request.getParameter("userAddress");
//		String userIsblacklist = request.getParameter("userIsblacklist");
		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		SysRoleExample sysRoleExample = new SysRoleExample();
		if (!StringUtils.isEmpty(sort)) {
			sysRoleExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = sysRoleExample.createCriteria();
		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(roleName)) {
//			criteria.andUserCodeLike(roleName + "%");
			criteria.andRoleNameLike(roleName + "%");
		}
//		if (!StringUtils.isEmpty(userName)) {
//			criteria.andUserNameLike(userName + "%");
//		}
//		if (!StringUtils.isEmpty(userIdcard)) {
//			criteria.andUserIdcardLike(userIdcard + "%");
//		}
		// 时间范围
		// if
		// (!StringUtils.isEmpty(userRegtimeBefore)&&!StringUtils.isEmpty(userRegtimeAfter))
		// {
		// criteria.andUserRegtimeBetween(convertBefore,convertAfter);
		// }

//		if (!StringUtils.isEmpty(userAddress)) {
//			criteria.andUserAddressLike(userAddress + "%");
//		}
//		if (!StringUtils.isEmpty(userIsblacklist)) {
//			criteria.andUserIsblacklistLike(userIsblacklist + "%");
//		}
		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<SysRole> listSysRole = sysRoleService.selectByExample(sysRoleExample);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listSysRole);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String roleId = request.getParameter("roleId");
		SysRole sysRole = null;
		if (!StringUtils.isEmpty(roleId)) {
			sysRole = sysRoleService.load(roleId);
			request.setAttribute("sysRole", sysRole);
		} else {

		}
		request.setAttribute("sysRole", sysRole);

		return "/admin/sys/sysRole_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String roleId = request.getParameter("roleId");
			sysRoleService.delete(roleId);
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
			sysRoleService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(SysRole sysRole, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(sysRole.getRoleId())) {
				sysRoleService.update(sysRole);
			} else {

				sysRoleService.insert(sysRole);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
