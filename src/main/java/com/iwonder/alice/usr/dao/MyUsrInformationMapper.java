package com.iwonder.alice.usr.dao;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.dao.auto.UsrInformationMapper;
import com.iwonder.alice.usr.entity.UsrInformation;
import com.iwonder.alice.usr.view.UsrInformationView;

public interface MyUsrInformationMapper extends UsrInformationMapper{
	List<UsrInformationView> mySelectList(HashMap<String,Object> listMapPool);
	
	List<UsrInformationView> mySelectBlackList();
	
	UsrInformation loadTel(String userTel);
}
