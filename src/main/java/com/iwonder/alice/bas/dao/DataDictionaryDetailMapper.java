package com.iwonder.alice.bas.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.bas.view.BasDataDictionaryDetailView;

/**
 * @author mirror
 * @version 创建时间：2018年11月16日 下午4:08:29
 * 
 */
public interface DataDictionaryDetailMapper {
	
	@SelectProvider(type = com.iwonder.alice.bas.dao.DataDictionaryDetailSQL.class, method = "selectWhitEmployeeSql")
	List<BasDataDictionaryDetailView> seListWithLable(BasDataDictionaryDetailView view);
}
