package com.iwonder.alice.usr.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.usr.dao.MyUsrBankcardMapper;
import com.iwonder.alice.usr.dao.auto.UsrBankcardMapper;
import com.iwonder.alice.usr.entity.UsrBankcard;
import com.iwonder.alice.usr.entity.UsrBankcardExample;
import com.iwonder.alice.usr.service.IUsrBankcardService;
import com.iwonder.alice.usr.view.UsrBankcardView;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class UsrBankcardServiceImp implements IUsrBankcardService {
	@Autowired
	UsrBankcardMapper usrBankcardMapper;
	@Autowired
	MyUsrBankcardMapper myUsrBankcardMapper;

	@Override
	public List<UsrBankcard> list() {
		List<UsrBankcard> usrBankcard = usrBankcardMapper.selectByExample(new UsrBankcardExample());
		return usrBankcard;
	}

	@Override
	public List<UsrBankcard> selectByExample(UsrBankcardExample example) {
		return usrBankcardMapper.selectByExample(example);
	}

	@Override
	public UsrBankcard load(String usrBankcardId) {
		return usrBankcardMapper.selectByPrimaryKey(usrBankcardId);
	}

	@Transactional
	@Override
	public int delete(String usrBankcardId) {
		return usrBankcardMapper.deleteByPrimaryKey(usrBankcardId);
	}

	@Override
	public int insert(UsrBankcard record) {
		record.setBankcardId(UUID.randomUUID().toString().replace("-", ""));
		return usrBankcardMapper.insertSelective(record);
	}

	@Override
	public int update(UsrBankcard record) {
		return usrBankcardMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
	}

	@Override
	public List<UsrBankcardView> mySelectList(HashMap<String, Object> listMapPool) {
		// TODO Auto-generated method stub
		return myUsrBankcardMapper.mySelectList(listMapPool);
	}

	@Override
	public List<UsrBankcardView> mySelectUserList() {
		// TODO Auto-generated method stub
		return myUsrBankcardMapper.mySelectUserList();
	}

}
