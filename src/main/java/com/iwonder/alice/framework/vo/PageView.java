package com.iwonder.alice.framework.vo;

import java.util.List;
import java.util.Map;

public class PageView {

	private int pageIndex;
	private int pageSize;
	private Map mapCondition;

	private List list;
	private int recordCount;
	private int pageCount;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMapCondition() {
		return mapCondition;
	}

	public void setMapCondition(Map mapCondition) {
		this.mapCondition = mapCondition;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
