package com.iwonder.alice.usr.action;

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
import com.iwonder.alice.usr.entity.UsrEconomy;
import com.iwonder.alice.usr.entity.UsrEconomyExample;
import com.iwonder.alice.usr.entity.UsrEconomyExample.Criteria;
import com.iwonder.alice.usr.service.IUsrEconomyService;
import com.iwonder.alice.usr.service.IUsrInformationService;
import com.iwonder.alice.usr.view.UsrEconomyView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */

@Controller
@RequestMapping("/admin/usr/usrEconomy/")
public class UsrEconomyController {
	@Autowired
	IUsrEconomyService iUsrEconomyService;
	@Autowired
	IUsrInformationService iUsrInformationService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidBlack> usrEconomylist =
		// usrEconomyService.list();
		// request.setAttribute("usrEconomylist", usrEconomylist);
		
		request.setAttribute("listUsrEconomyView", iUsrEconomyService.mySelectUserList());
		request.setAttribute("listUsrInformation", iUsrInformationService.list());
		return "/admin/usr/usrEconomy_list";
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
		String economyWork = request.getParameter("economyWork");
		String economyHouse = request.getParameter("economyHouse");
		String economyCar = request.getParameter("economyCar");

		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		UsrEconomyExample usrEconomyExample = new UsrEconomyExample();
		if (!StringUtils.isEmpty(sort)) {
			usrEconomyExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = usrEconomyExample.createCriteria();
		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(userId)) {
//			criteria.andUserIdLike(userId + "%");
			listMapPool.put("userId", userId);
		}
		if (!StringUtils.isEmpty(economyWork)) {
//			criteria.andEconomyHouseLike(economyWork + "%");
			listMapPool.put("economyWork", economyWork);
		}
		if (!StringUtils.isEmpty(economyHouse)) {
//			criteria.andEconomyHouseLike(economyHouse + "%");
			listMapPool.put("economyHouse", economyHouse);
		}
		if (!StringUtils.isEmpty(economyCar)) {
//			criteria.andEconomyCarLike(economyCar + "%");
			listMapPool.put("economyCar", economyCar);
		}

		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<UsrEconomyView> listUsrEconomy = iUsrEconomyService.mySelectList(listMapPool);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listUsrEconomy);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String economyId = request.getParameter("economyId");
		UsrEconomy usrEconomy = null;
		if (!StringUtils.isEmpty(economyId)) {
			usrEconomy = iUsrEconomyService.load(economyId);
			request.setAttribute("usrEconomy", usrEconomy);
		} else {

		}
		request.setAttribute("listUsrInformation", iUsrInformationService.list());
		request.setAttribute("usrEconomy", usrEconomy);

		return "/admin/usr/usrEconomy_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String usrEconomyId = request.getParameter("usrEconomyId");
			iUsrEconomyService.delete(usrEconomyId);
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
			iUsrEconomyService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(UsrEconomy usrEconomy, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(usrEconomy.getEconomyId())) {
				iUsrEconomyService.update(usrEconomy);
			} else {

				iUsrEconomyService.insert(usrEconomy);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
