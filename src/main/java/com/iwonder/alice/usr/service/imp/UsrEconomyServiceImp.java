package com.iwonder.alice.usr.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.usr.dao.MyUsrEconomyMapper;
import com.iwonder.alice.usr.dao.auto.UsrEconomyMapper;
import com.iwonder.alice.usr.entity.UsrEconomy;
import com.iwonder.alice.usr.entity.UsrEconomyExample;
import com.iwonder.alice.usr.service.IUsrEconomyService;
import com.iwonder.alice.usr.view.UsrEconomyView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class UsrEconomyServiceImp implements IUsrEconomyService {
	@Autowired
	UsrEconomyMapper usrEconomyMapper;
	@Autowired
	MyUsrEconomyMapper myUsrEconomyMapper;

	@Override
	public List<UsrEconomy> list() {
		List<UsrEconomy> usrEconomy = usrEconomyMapper.selectByExample(new UsrEconomyExample());
		return usrEconomy;
	}

	@Override
	public List<UsrEconomy> selectByExample(UsrEconomyExample example) {
		return usrEconomyMapper.selectByExample(example);
	}

	@Override
	public UsrEconomy load(String usrEconomyId) {
		return usrEconomyMapper.selectByPrimaryKey(usrEconomyId);
	}

	@Transactional
	@Override
	public int delete(String usrEconomyId) {
		return usrEconomyMapper.deleteByPrimaryKey(usrEconomyId);
	}

	@Override
	public int insert(UsrEconomy record) {
		record.setEconomyId(UUID.randomUUID().toString().replace("-", ""));
		return usrEconomyMapper.insertSelective(record);
	}

	@Override
	public int update(UsrEconomy record) {
		return usrEconomyMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
	}

	@Override
	public List<UsrEconomyView> mySelectList(HashMap<String, Object> listMapPool) {
		// TODO Auto-generated method stub
		return myUsrEconomyMapper.mySelectList(listMapPool);
	}

	@Override
	public List<UsrEconomyView> mySelectUserList() {
		// TODO Auto-generated method stub
		return myUsrEconomyMapper.mySelectUserList();
	}

}
