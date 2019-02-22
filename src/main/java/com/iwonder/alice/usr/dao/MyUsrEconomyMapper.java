package com.iwonder.alice.usr.dao;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.dao.auto.UsrInformationMapper;
import com.iwonder.alice.usr.view.UsrEconomyView;

public interface MyUsrEconomyMapper extends UsrInformationMapper{
	List<UsrEconomyView> mySelectList(HashMap<String,Object> listMapPool);
	
	List<UsrEconomyView> mySelectUserList();
}
