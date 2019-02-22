package com.iwonder.alice.bas.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.bas.dao.auto.BasAvoidRepeatMapper;
import com.iwonder.alice.bas.entity.BasAvoidRepeat;
import com.iwonder.alice.bas.entity.BasAvoidRepeatExample;
import com.iwonder.alice.bas.service.BasAvoidRepeatService;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class BasAvoidRepeatServiceImp implements BasAvoidRepeatService {
	@Autowired
	BasAvoidRepeatMapper avoidRepeatDao;

	@Override
	public List<BasAvoidRepeat> list() {
		List<BasAvoidRepeat> avoidRepeatlist = avoidRepeatDao.selectByExample(new BasAvoidRepeatExample());
		return avoidRepeatlist;
	}

	@Override
	public List<BasAvoidRepeat> selectByExample(BasAvoidRepeatExample example) {
		return avoidRepeatDao.selectByExample(example);
	}

	@Override
	public BasAvoidRepeat load(String avoidRepeatId) {
		return avoidRepeatDao.selectByPrimaryKey(avoidRepeatId);
	}

	@Transactional
	@Override
	public int delete(String avoidRepeatId) {
		return avoidRepeatDao.deleteByPrimaryKey(avoidRepeatId);
	}

	@Override
	public int insert(BasAvoidRepeat record) {
		record.setAvoidRepeatId(UUID.randomUUID().toString().replace("-", ""));
		return avoidRepeatDao.insertSelective(record);
	}

	@Override
	public int update(BasAvoidRepeat record) {
		return avoidRepeatDao.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
		// for(int i = 0;i<ids.length;i++){
		// if(i==2){
		// throw new RuntimeException("出错了");
		// }
		// delete(ids[i]) ;
		//
		// }
	}

}
