package com.iwonder.alice.usr.service;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.entity.UsrEconomy;
import com.iwonder.alice.usr.entity.UsrEconomyExample;
import com.iwonder.alice.usr.view.UsrEconomyView;

public interface IUsrEconomyService {
	public List<UsrEconomy> list();

	public List<UsrEconomy> selectByExample(UsrEconomyExample example);

	public UsrEconomy load(String usrEconomyId);

	public int delete(String usrEconomyId);

	public void deleteRows(String[] ids);

	int insert(UsrEconomy record);

	int update(UsrEconomy record);
	
	List<UsrEconomyView> mySelectList(HashMap<String,Object> listMapPool);
		
	List<UsrEconomyView> mySelectUserList();
}
