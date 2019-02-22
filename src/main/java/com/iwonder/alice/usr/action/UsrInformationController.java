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
import com.iwonder.alice.bas.service.BasDataDictionaryDetailService;
import com.iwonder.alice.framework.MD5.MD5Util;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.framework.vo.PageViewEasyUIWrapper;
import com.iwonder.alice.framework.web.DateConverter;
import com.iwonder.alice.usr.entity.UsrInformation;
import com.iwonder.alice.usr.entity.UsrInformationExample;
import com.iwonder.alice.usr.entity.UsrInformationExample.Criteria;
import com.iwonder.alice.usr.service.IUsrInformationService;
import com.iwonder.alice.usr.view.UsrInformationView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */

@Controller
@RequestMapping("/admin/usr/usrInformation/")
public class UsrInformationController {
	@Autowired
	IUsrInformationService iUsrInformationService;
	@Autowired
	BasDataDictionaryDetailService basDataDictionaryDetailService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidBlack> usrInformationlist =
		// usrInformationService.list();
		// request.setAttribute("usrInformationlist", usrInformationlist);
		
		//获取防黑表和用户信息表的连表信息
//		request.setAttribute("listUsrInformationView", iUsrInformationService.mySelectList());
		
		//获取查询时的状态字
		request.setAttribute("listUsrBlackView", iUsrInformationService.mySelectBlackList());
		
		request.setAttribute("listBasDataDictionaryDetail", basDataDictionaryDetailService.list());
		return "/admin/usr/usrInformation_list";
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
		String userCode = request.getParameter("userCode");
		String userName = request.getParameter("userName");
		String userIdcard = request.getParameter("userIdcard");

		// 时间转换
		String userRegtimeBefore = request.getParameter("userRegtimeBefore");
		String userRegtimeAfter = request.getParameter("userRegtimeAfter");
		Date convertBefore = null;
		Date convertAfter = null;
		DateConverter dc = new DateConverter();
		if (!StringUtils.isEmpty(userRegtimeBefore)) {
			convertBefore = dc.convert(userRegtimeBefore);
		}
		if (!StringUtils.isEmpty(userRegtimeAfter)) {
			convertAfter = dc.convert(userRegtimeAfter);
		}

		String userAddress = request.getParameter("userAddress");
		String userIsblacklist = request.getParameter("userIsblacklist");
		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		UsrInformationExample usrInformationExample = new UsrInformationExample();
		if (!StringUtils.isEmpty(sort)) {
			usrInformationExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = usrInformationExample.createCriteria();
		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(userCode)) {
//			criteria.andUserCodeLike(userCode + "%");
			listMapPool.put("userCode", userCode);
		}
		if (!StringUtils.isEmpty(userName)) {
//			criteria.andUserNameLike(userName + "%");
			listMapPool.put("userName", userName);
		}
		if (!StringUtils.isEmpty(userIdcard)) {
//			criteria.andUserIdcardLike(userIdcard + "%");
			listMapPool.put("userIdcard", userIdcard);
		}

		// 时间范围
		if (!StringUtils.isEmpty(userRegtimeBefore) && !StringUtils.isEmpty(userRegtimeAfter)) {
//			criteria.andUserRegtimeBetween(convertBefore, convertAfter);
			listMapPool.put("convertBefore", convertBefore);
			listMapPool.put("convertAfter", convertAfter);
		} else if (!StringUtils.isEmpty(userRegtimeBefore) && StringUtils.isEmpty(userRegtimeAfter)) {
//			criteria.andUserRegtimeGreaterThanOrEqualTo(convertBefore);
			listMapPool.put("convertBefore", convertBefore);
		} else if (!StringUtils.isEmpty(userRegtimeAfter) && StringUtils.isEmpty(userRegtimeBefore)) {
//			criteria.andUserRegtimeLessThanOrEqualTo(convertAfter);
			listMapPool.put("convertAfter", convertAfter);
		}
		

		if (!StringUtils.isEmpty(userAddress)) {
//			criteria.andUserAddressLike(userAddress + "%");
			listMapPool.put("userAddress", userAddress);
		}
		if (!StringUtils.isEmpty(userIsblacklist)) {
//			criteria.andUserIsblacklistLike(userIsblacklist);
			listMapPool.put("userIsblacklist", userIsblacklist);
		}
		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		
		
		List<UsrInformationView> listUsrInformation = iUsrInformationService.mySelectList(listMapPool);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listUsrInformation);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("userId");
		UsrInformation usrInformation = null;
		if (!StringUtils.isEmpty(userId)) {
			usrInformation = iUsrInformationService.load(userId);
			request.setAttribute("usrInformation", usrInformation);
		} else {

		}
		//获取查询时的状态字
		request.setAttribute("listUsrBlackView", iUsrInformationService.mySelectBlackList());
		
		request.setAttribute("usrInformation", usrInformation);

		return "/admin/usr/usrInformation_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String usrInformationId = request.getParameter("usrInformationId");
			iUsrInformationService.delete(usrInformationId);
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
			iUsrInformationService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(UsrInformation usrInformation, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			usrInformation.setUserPwd(MD5Util.encode(usrInformation.getUserPwd()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (!StringUtils.isEmpty(usrInformation.getUserId())) {
				iUsrInformationService.update(usrInformation);
			} else {

				iUsrInformationService.insert(usrInformation);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
