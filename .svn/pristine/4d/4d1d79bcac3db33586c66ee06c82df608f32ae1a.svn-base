package com.iwonder.alice.usr.service;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.entity.UsrBankcard;
import com.iwonder.alice.usr.entity.UsrBankcardExample;
import com.iwonder.alice.usr.view.UsrBankcardView;

public interface IUsrBankcardService {
	public List<UsrBankcard> list();

	public List<UsrBankcard> selectByExample(UsrBankcardExample example);

	public UsrBankcard load(String bankcardIdId);

	public int delete(String bankcardId);

	public void deleteRows(String[] ids);

	int insert(UsrBankcard record);

	int update(UsrBankcard record);
	
	List<UsrBankcardView> mySelectList(HashMap<String,Object> listMapPool);
	
	List<UsrBankcardView> mySelectUserList();
}
