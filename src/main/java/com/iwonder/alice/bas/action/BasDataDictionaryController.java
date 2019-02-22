package com.iwonder.alice.bas.action;

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
import com.iwonder.alice.bas.entity.BasDataDictionaryExample.Criteria;
import com.iwonder.alice.bas.entity.BasDataDictionary;
import com.iwonder.alice.bas.entity.BasDataDictionaryExample;
import com.iwonder.alice.bas.service.BasDataDictionaryService;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.framework.vo.PageViewEasyUIWrapper;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */
@Controller
@RequestMapping("/admin/bas/datadictionary/")
public class BasDataDictionaryController {
	@Autowired
	BasDataDictionaryService dataDictionaryService;

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasDataDictionary> dataDictionarylist =
		// dataDictionaryService.list();
		// request.setAttribute("dataDictionarylist", dataDictionarylist);
		return "/admin/bas/datadictionary/datadictionary_list";
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
		String dataDictionaryCode = request.getParameter("dataDictionaryCode");
		String dataDictionaryLabel = request.getParameter("dataDictionaryLabel");
		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 5;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		BasDataDictionaryExample dataDictionaryExample = new BasDataDictionaryExample();
		if (!StringUtils.isEmpty(sort)) {
			dataDictionaryExample.setOrderByClause(sort + " " + order);
		}
		Criteria criteria = dataDictionaryExample.createCriteria();

		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(dataDictionaryCode)) {
			criteria.andDataDictionaryCodeLike(dataDictionaryCode + "%");
		}
		if (!StringUtils.isEmpty(dataDictionaryLabel)) {
			criteria.andDataDictionaryLabelLike(dataDictionaryLabel + "%");
		}
		// 加搜索查询条件--------------end

		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<BasDataDictionary> listCustomer = dataDictionaryService.selectByExample(dataDictionaryExample);

		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);

		pageView.setList(listCustomer);
		pageView.setRecordCount((int) page.getTotal());

		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String dataDictionaryId = request.getParameter("dataDictionaryId");
		BasDataDictionary dataDictionary = null;
		if (!StringUtils.isEmpty(dataDictionaryId)) {
			dataDictionary = dataDictionaryService.load(dataDictionaryId);
			request.setAttribute("dataDictionary", dataDictionary);
		} else {

		}
		request.setAttribute("dataDictionary", dataDictionary);

		return "/admin/bas/datadictionary/datadictionary_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String dataDictionaryId = request.getParameter("dataDictionaryId");
			dataDictionaryService.delete(dataDictionaryId);
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
			dataDictionaryService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(BasDataDictionary dataDictionary, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(dataDictionary.getDataDictionaryId())) {
				dataDictionaryService.update(dataDictionary);
			} else {
				dataDictionaryService.insert(dataDictionary);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}

}
