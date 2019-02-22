package com.iwonder.alice.bas.service;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.bas.entity.BasDataDictionary;
import com.iwonder.alice.bas.entity.BasDataDictionaryExample;
import com.iwonder.alice.bas.view.YxysDataDictionaryView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
public interface BasDataDictionaryService {
	public List<BasDataDictionary> list();

	public List<BasDataDictionary> selectByExample(BasDataDictionaryExample example);

	public BasDataDictionary load(String dataDictonaryId);

	public int delete(String dataDictonaryId);

	public void deleteRows(String[] ids);

	int insert(BasDataDictionary record);

	int update(BasDataDictionary record);

	// yxy改的地方
	List<YxysDataDictionaryView> mySelectList(HashMap hCondition);
	// yxy改的地方

}
