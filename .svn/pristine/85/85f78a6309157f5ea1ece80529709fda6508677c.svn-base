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
import com.iwonder.alice.usr.entity.UsrBankcard;
import com.iwonder.alice.usr.entity.UsrBankcardExample;
import com.iwonder.alice.usr.entity.UsrBankcardExample.Criteria;
import com.iwonder.alice.usr.service.IUsrBankcardService;
import com.iwonder.alice.usr.service.IUsrInformationService;
import com.iwonder.alice.usr.view.UsrBankcardView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */

@Controller
@RequestMapping("/admin/usr/usrBankcard/")
public class UsrBankcardController {
	@Autowired
	IUsrBankcardService iUsrBankcardService;
	@Autowired
	IUsrInformationService iUsrInformationService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidBlack> usrBankcardlist =
		// usrBankcardService.list();
		// request.setAttribute("usrBankcardlist", usrBankcardlist);
		
		request.setAttribute("listUsrBankcardView", iUsrBankcardService.mySelectUserList());
		return "/admin/usr/usrBankcard_list";
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
		String bankcardCode = request.getParameter("bankcardCode");
		String bankcardNumber = request.getParameter("bankcardNumber");
		String bankcardName = request.getParameter("bankcardName");

		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		UsrBankcardExample usrBankcardExample = new UsrBankcardExample();
		if (!StringUtils.isEmpty(sort)) {
			usrBankcardExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = usrBankcardExample.createCriteria();
		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(userId)) {
//			criteria.andBankcardCodeLike(bankcardCode + "%");
			listMapPool.put("userId", userId);
		}
		if (!StringUtils.isEmpty(bankcardCode)) {
//			criteria.andBankcardCodeLike(bankcardCode + "%");
			listMapPool.put("bankcardCode", bankcardCode);
		}
		if (!StringUtils.isEmpty(bankcardNumber)) {
//			criteria.andBankcardNumberLike(bankcardNumber + "%");
			listMapPool.put("bankcardNumber", bankcardNumber);
		}
		if (!StringUtils.isEmpty(bankcardName)) {
//			criteria.andBankcardNameLike(bankcardName + "%");
			listMapPool.put("bankcardName", bankcardName);
		}

		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<UsrBankcardView> listUsrBankcard = iUsrBankcardService.mySelectList(listMapPool);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listUsrBankcard);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String bankcardId = request.getParameter("bankcardId");
		UsrBankcard usrBankcard = null;
		if (!StringUtils.isEmpty(bankcardId)) {
			usrBankcard = iUsrBankcardService.load(bankcardId);
			request.setAttribute("usrBankcard", usrBankcard);
		} else {

		}
		request.setAttribute("usrInformation", iUsrInformationService.list());
		request.setAttribute("usrBankcard", usrBankcard);

		return "/admin/usr/usrBankcard_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String usrBankcardId = request.getParameter("usrBankcardId");
			iUsrBankcardService.delete(usrBankcardId);
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
			iUsrBankcardService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(UsrBankcard usrBankcard, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(usrBankcard.getBankcardId())) {
				iUsrBankcardService.update(usrBankcard);
			} else {

				iUsrBankcardService.insert(usrBankcard);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
