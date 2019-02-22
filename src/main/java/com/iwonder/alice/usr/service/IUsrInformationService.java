package com.iwonder.alice.usr.service;

import java.util.HashMap;
import java.util.List;

import com.iwonder.alice.usr.entity.UsrInformation;
import com.iwonder.alice.usr.entity.UsrInformationExample;
import com.iwonder.alice.usr.view.UsrInformationView;

public interface IUsrInformationService {
	//根据手机号查询信息
	public UsrInformation loadTel(String userTel);
	
	public List<UsrInformation> list();

	public List<UsrInformation> selectByExample(UsrInformationExample example);
	
	public UsrInformation load(String usrInformationId);

	public int delete(String usrInformationId);

	public void deleteRows(String[] ids);

	int insert(UsrInformation record);

	int update(UsrInformation record);
	
	List<UsrInformationView> mySelectList(HashMap<String,Object> listMapPool);
	
	List<UsrInformationView> mySelectBlackList();
}
