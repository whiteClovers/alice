package com.iwonder.alice.bas.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.iwonder.alice.bas.dao.DataDictionaryDetailMapper;
import com.iwonder.alice.bas.entity.BasDataDictionaryDetail;
import com.iwonder.alice.bas.service.BasDataDictionaryDetailService;
import com.iwonder.alice.bas.service.BasDataDictionaryService;
import com.iwonder.alice.bas.view.BasDataDictionaryDetailView;
import com.iwonder.alice.framework.vo.PageView;
import com.iwonder.alice.framework.vo.PageViewEasyUIWrapper;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:14:21
 * 
 */
@Controller
@RequestMapping("/admin/bas/datadictionarydetail/")
public class BasDataDictionaryDetailController {
	@Autowired
	BasDataDictionaryDetailService dataDictionaryDetailService;
	@Autowired
	BasDataDictionaryService dataDictionaryService;
	@Autowired
	DataDictionaryDetailMapper detailMapper;

	// List<BasDataDictionaryDetailView> seListWithLable =
	// basDao.seListWithLable();

	@RequestMapping("page")
	public String toList(HttpServletRequest request) {
		// List<BasAvoidRepeat> avoidRepeatlist =
		// dataDictionaryDetailService.list();
		// request.setAttribute("avoidRepeatlist", avoidRepeatlist);
		request.setAttribute("listDataDictionary", dataDictionaryService.list());
		return "/admin/bas/datadictionarydetail/datadictionarydetail_list";
	}

	// @RequestMapping("pageAjax")
	// @ResponseBody
	// public PageViewEasyUIWrapper pageAj(HttpServletRequest request,
	// HttpServletResponse response) {
	// PageView pageView = new PageView();
	// String sort = request.getParameter("sort");
	// String order = request.getParameter("order");
	// String strPage = request.getParameter("page");
	// String strRows = request.getParameter("rows");
	// // String strPageIndex = request.getParameter("pageIndex") ;
	// // String strPageSize = request.getParameter("pageSize") ;
	//
	// // 加搜索查询条件--------------start
	// String dataDictionaryId = request.getParameter("dataDictionaryId");
	// String dictionaryDetailCode =
	// request.getParameter("dictionaryDetailCode");
	// String dictionaryDetailLabel =
	// request.getParameter("dictionaryDetailLabel");
	// String dictionaryDetailNumber =
	// request.getParameter("dictionaryDetailNumber");
	// // 加搜索查询条件--------------end
	//
	// int pageIndex = 0;
	// int pageSize = 5;
	// if (!StringUtils.isEmpty(strPage)) {
	// pageIndex = Integer.parseInt(strPage) - 1;
	// }
	// if (!StringUtils.isEmpty(strRows)) {
	// pageSize = Integer.parseInt(strRows);
	// }
	// BasDataDictionaryDetailExample detailExample = new
	// BasDataDictionaryDetailExample();
	// if (!StringUtils.isEmpty(sort)) {
	// detailExample.setOrderByClause(sort + " " + order);
	// }
	// Criteria criteria = detailExample.createCriteria();
	//
	// // 加搜索查询条件--------------start
	// if (!StringUtils.isEmpty(dataDictionaryId)) {
	// criteria.andDataDictionaryIdEqualTo(dataDictionaryId);
	// }
	// if (!StringUtils.isEmpty(dictionaryDetailCode)) {
	// criteria.andDictionaryDetailCodeLike(dictionaryDetailCode + "%");
	// }
	// if (!StringUtils.isEmpty(dictionaryDetailLabel)) {
	// criteria.andDictionaryDetailLabelLike(dictionaryDetailLabel + "%");
	// }
	// if (!StringUtils.isEmpty(dictionaryDetailNumber)) {
	// criteria.andDictionaryDetailNumberLike(dictionaryDetailNumber + "%");
	// }
	// // 加搜索查询条件--------------end
	//
	// Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
	// List<BasDataDictionaryDetail> listCustomer =
	// dataDictionaryDetailService.selectByExample(detailExample);
	// pageView.setPageIndex(pageIndex);
	// pageView.setPageSize(pageSize);
	// pageView.setList(listCustomer);
	// pageView.setRecordCount((int) page.getTotal());
	// return new PageViewEasyUIWrapper(pageView);
	// }

	@RequestMapping("pageAjax")
	@ResponseBody
	@Transactional
	public PageViewEasyUIWrapper pageAj(HttpServletRequest request, HttpServletResponse response) {
		PageView pageView = new PageView();
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		String strPage = request.getParameter("page");
		String strRows = request.getParameter("rows");
		// String strPageIndex = request.getParameter("pageIndex") ;
		// String strPageSize = request.getParameter("pageSize") ;

		// 加搜索查询条件--------------start
		String dataDictionaryId = request.getParameter("dataDictionaryId");
		String dictionaryDetailCode = request.getParameter("dictionaryDetailCode");
		String dictionaryDetailLabel = request.getParameter("dictionaryDetailLabel");
		String dictionaryDetailNumber = request.getParameter("dictionaryDetailNumber");
		// 加搜索查询条件--------------end

		int pageIndex = 0;
		int pageSize = 10;
		if (!StringUtils.isEmpty(strPage)) {
			pageIndex = Integer.parseInt(strPage) - 1;
		}
		if (!StringUtils.isEmpty(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		BasDataDictionaryDetailView detailExample = new BasDataDictionaryDetailView();
		// if (!StringUtils.isEmpty(sort)) {
		// detailExample.setOrderByClause(sort + " " + order);
		// }
		// Criteria criteria = detailExample.createCriteria();

		// 加搜索查询条件--------------start
		if (!StringUtils.isEmpty(dataDictionaryId)) {
			detailExample.setDataDictionaryId(dataDictionaryId);
		}
		if (!StringUtils.isEmpty(dictionaryDetailCode)) {
			detailExample.setDictionaryDetailCode(dictionaryDetailCode);
		}
		if (!StringUtils.isEmpty(dictionaryDetailLabel)) {
			detailExample.setDictionaryDetailLabel(dictionaryDetailLabel);
		}
		if (!StringUtils.isEmpty(dictionaryDetailNumber)) {
			detailExample.setDictionaryDetailNumber(dictionaryDetailNumber);
		}
		// 加搜索查询条件--------------end
		
		Page<Object> page = PageHelper.startPage(pageIndex + 1, pageSize);
		List<BasDataDictionaryDetailView> listCustomer = detailMapper.seListWithLable(detailExample);
		pageView.setPageIndex(pageIndex);
		pageView.setPageSize(pageSize);
		pageView.setList(listCustomer);
		pageView.setRecordCount((int) page.getTotal());
		return new PageViewEasyUIWrapper(pageView);
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String dictionaryDetailId = request.getParameter("dictionaryDetailId");
		BasDataDictionaryDetail bddd = null;
		if (!StringUtils.isEmpty(dictionaryDetailId)) {
			bddd = dataDictionaryDetailService.load(dictionaryDetailId);
			request.setAttribute("dataDictionaryDetail", bddd);
		} else {

		}
		request.setAttribute("listDataDictionary", dataDictionaryService.list());
		request.setAttribute("dataDictionaryDetail", bddd);
		return "/admin/bas/datadictionarydetail/datadictionarydetail_edit";
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String avoidRepeatId = request.getParameter("avoidRepeatId");
			dataDictionaryDetailService.delete(avoidRepeatId);
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
			dataDictionaryDetailService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("saveAj")
	@ResponseBody
	public String saveAj(BasDataDictionaryDetail bddd, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(bddd.getDictionaryDetailId())) {
				dataDictionaryDetailService.update(bddd);
			} else {
				dataDictionaryDetailService.insert(bddd);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}
}
