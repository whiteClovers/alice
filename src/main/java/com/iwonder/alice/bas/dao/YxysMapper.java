package com.iwonder.alice.bas.dao;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.bas.view.YxysDataDictionaryView;

public interface YxysMapper {
	List<YxysDataDictionaryView> mySelectList(HashMap hCondition);
	
}
