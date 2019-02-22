package com.iwonder.alice.usr.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.usr.dao.MyUsrSecurityMapper;
import com.iwonder.alice.usr.dao.auto.UsrSecurityMapper;
import com.iwonder.alice.usr.entity.UsrSecurity;
import com.iwonder.alice.usr.entity.UsrSecurityExample;
import com.iwonder.alice.usr.service.IUsrSecurityService;
import com.iwonder.alice.usr.view.UsrSecurityView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class UsrSecurityServiceImp implements IUsrSecurityService {
	@Autowired
	UsrSecurityMapper usrSecurityMapper;
	@Autowired
	MyUsrSecurityMapper myUsrSecurityMapper;

	@Override
	public List<UsrSecurity> list() {
		List<UsrSecurity> usrSecurity = usrSecurityMapper.selectByExample(new UsrSecurityExample());
		return usrSecurity;
	}

	@Override
	public List<UsrSecurity> selectByExample(UsrSecurityExample example) {
		return usrSecurityMapper.selectByExample(example);
	}

	@Override
	public UsrSecurity load(String usrSecurityId) {
		return usrSecurityMapper.selectByPrimaryKey(usrSecurityId);
	}

	@Transactional
	@Override
	public int delete(String usrSecurityId) {
		return usrSecurityMapper.deleteByPrimaryKey(usrSecurityId);
	}

	@Override
	public int insert(UsrSecurity record) {
		record.setSecurityId(UUID.randomUUID().toString().replace("-", ""));
		return usrSecurityMapper.insertSelective(record);
	}

	@Override
	public int update(UsrSecurity record) {
		return usrSecurityMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
	}

	@Override
	public List<UsrSecurityView> mySelectList(HashMap<String, Object> listMapPool) {
		// TODO Auto-generated method stub
		return myUsrSecurityMapper.mySelectList(listMapPool);
	}

	@Override
	public List<UsrSecurityView> mySelectUserList() {
		// TODO Auto-generated method stub
		return myUsrSecurityMapper.mySelectUserList();
	}

}
