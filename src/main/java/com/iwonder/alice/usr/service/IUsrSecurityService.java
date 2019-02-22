package com.iwonder.alice.usr.service;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.entity.UsrSecurity;
import com.iwonder.alice.usr.entity.UsrSecurityExample;
import com.iwonder.alice.usr.view.UsrSecurityView;

public interface IUsrSecurityService {
	public List<UsrSecurity> list();

	public List<UsrSecurity> selectByExample(UsrSecurityExample example);

	public UsrSecurity load(String securityId);

	public int delete(String securityId);

	public void deleteRows(String[] ids);

	int insert(UsrSecurity record);

	int update(UsrSecurity record);
	
	List<UsrSecurityView> mySelectList(HashMap<String,Object> listMapPool);
		
	List<UsrSecurityView> mySelectUserList();
}
