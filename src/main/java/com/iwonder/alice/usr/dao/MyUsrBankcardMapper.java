package com.iwonder.alice.usr.dao;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.dao.auto.UsrInformationMapper;
import com.iwonder.alice.usr.view.UsrBankcardView;

public interface MyUsrBankcardMapper extends UsrInformationMapper{
	List<UsrBankcardView> mySelectList(HashMap<String,Object> listMapPool);
	
	List<UsrBankcardView> mySelectUserList();
}
