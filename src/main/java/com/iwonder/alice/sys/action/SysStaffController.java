package com.iwonder.alice.sys.action;

import java.util.Date;
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
import com.iwonder.alice.sys.entity.SysStaff;
import com.iwonder.alice.sys.entity.SysStaffExample;
import com.iwonder.alice.sys.entity.SysStaffExample.Criteria;
import com.iwonder.alice.sys.service.SysStaffService;


/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */

@Controller
@RequestMapping("/admin/sys/sysStaff/")
public class SysStaffController {
	@Autowired
	SysStaffService sysStaffService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidBlack> sysStafflist =
		// sysStaffService.list();
		// request.setAttribute("sysStafflist", sysStafflist);
		return "/admin/sys/sysStaff_list";
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
		String staffCode = request.getParameter("staffCode");
		String staffName = request.getParameter("staffName");
		String staffGender = request.getParameter("staffGender");

		// 时间转换
//		String staffBirthday = request.getParameter("staffBirthday");
//		String userRegtimeAfter = request.getParameter("userRegtimeAfter");
//		Date convertBefore = null;
//		Date convertAfter = null;
//		Date convertBirthday = null;
//		DateConverter dc = new DateConverter();
//		if (!StringUtils.isEmpty(staffBirthday)) {
//			convertBirthday = dc.convert(staffBirthday);
//		}
//		if (!StringUtils.isEmpty(userRegtimeAfter)) {
//			convertAfter = dc.convert(userRegtimeAfter);
//		}

		String staffMoblie = request.getParameter("staffMoblie");
		String staffAddress = request.getParameter("staffAddress");
		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		SysStaffExample sysStaffExample = new SysStaffExample();
		if (!StringUtils.isEmpty(sort)) {
			sysStaffExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = sysStaffExample.createCriteria();
		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(staffCode)) {
//			criteria.andUserCodeLike(staffCode + "%");
			criteria.andStaffCodeLike(staffCode + "%");
		}
		if (!StringUtils.isEmpty(staffName)) {
//			criteria.andUserNameLike(staffName + "%");
			criteria.andStaffNameLike(staffName + "%");
		}
		if (!StringUtils.isEmpty(staffGender)) {
//			criteria.andUserIdcardLike(staffGender + "%");
			criteria.andStaffGenderLike(staffGender + "%");
		}

		// 时间范围
//		if (!StringUtils.isEmpty(userRegtimeBefore) && !StringUtils.isEmpty(userRegtimeAfter)) {
//			criteria.andUserRegtimeBetween(convertBefore, convertAfter);
//		} else if (!StringUtils.isEmpty(userRegtimeBefore) && StringUtils.isEmpty(userRegtimeAfter)) {
//			criteria.andUserRegtimeGreaterThanOrEqualTo(convertBefore);
//		} else if (!StringUtils.isEmpty(userRegtimeAfter) && StringUtils.isEmpty(userRegtimeBefore)) {
//			criteria.andUserRegtimeLessThanOrEqualTo(convertAfter);
//		}

		if (!StringUtils.isEmpty(staffMoblie)) {
//			criteria.andUserAddressLike(staffMoblie + "%");
			criteria.andStaffMoblieLike(staffMoblie + "%");
		}
		if (!StringUtils.isEmpty(staffAddress)) {
//			criteria.andUserIsblacklistLike(staffAddress + "%");
			criteria.andStaffAddressLike(staffAddress + "%");
		}
		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<SysStaff> listSysStaff = sysStaffService.selectByExample(sysStaffExample);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listSysStaff);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String staffId = request.getParameter("staffId");
		SysStaff sysStaff = null;
		if (!StringUtils.isEmpty(staffId)) {
			sysStaff = sysStaffService.load(staffId);
			request.setAttribute("sysStaff", sysStaff);
		} else {

		}
		request.setAttribute("sysStaff", sysStaff);

		return "/admin/sys/sysStaff_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String staffId = request.getParameter("staffId");
			sysStaffService.delete(staffId);
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
			sysStaffService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(SysStaff sysStaff, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(sysStaff.getStaffId())) {
				sysStaffService.update(sysStaff);
			} else {

				sysStaffService.insert(sysStaff);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
