package com.iwonder.alice.bas.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.bas.dao.auto.BasAvoidBlackMapper;
import com.iwonder.alice.bas.entity.BasAvoidBlack;
import com.iwonder.alice.bas.entity.BasAvoidBlackExample;
import com.iwonder.alice.bas.service.BasAvoidBlackService;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class BasAvoidBlackServiceImp implements BasAvoidBlackService {
	@Autowired
	BasAvoidBlackMapper avoidBlackMapper;

	@Override
	public List<BasAvoidBlack> list() {
		List<BasAvoidBlack> avoidBlacklist = avoidBlackMapper.selectByExample(new BasAvoidBlackExample());
		return avoidBlacklist;
	}

	@Override
	public List<BasAvoidBlack> selectByExample(BasAvoidBlackExample example) {
		return avoidBlackMapper.selectByExample(example);
	}

	@Override
	public BasAvoidBlack load(String avoidBlackId) {
		return avoidBlackMapper.selectByPrimaryKey(avoidBlackId);
	}

	@Transactional
	@Override
	public int delete(String avoidBlackId) {
		return avoidBlackMapper.deleteByPrimaryKey(avoidBlackId);
	}

	@Override
	public int insert(BasAvoidBlack record) {
		record.setAvoidBlackId(UUID.randomUUID().toString().replace("-", ""));
		return avoidBlackMapper.insertSelective(record);
	}

	@Override
	public int update(BasAvoidBlack record) {
		return avoidBlackMapper.updateByPrimaryKeySelective(record);
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
