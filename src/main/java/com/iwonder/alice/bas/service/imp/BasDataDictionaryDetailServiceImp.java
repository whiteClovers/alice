package com.iwonder.alice.bas.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.bas.dao.auto.BasDataDictionaryDetailMapper;
import com.iwonder.alice.bas.entity.BasDataDictionaryDetail;
import com.iwonder.alice.bas.entity.BasDataDictionaryDetailExample;
import com.iwonder.alice.bas.service.BasDataDictionaryDetailService;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class BasDataDictionaryDetailServiceImp implements BasDataDictionaryDetailService {
	@Autowired
	BasDataDictionaryDetailMapper dataDictionaryDetailMapper;

	@Override
	public List<BasDataDictionaryDetail> list() {
		List<BasDataDictionaryDetail> avoidRepeatlist = dataDictionaryDetailMapper
				.selectByExample(new BasDataDictionaryDetailExample());
		return avoidRepeatlist;
	}

	@Override
	public List<BasDataDictionaryDetail> selectByExample(BasDataDictionaryDetailExample example) {
		return dataDictionaryDetailMapper.selectByExample(example);
	}

	@Override
	public BasDataDictionaryDetail load(String avoidRepeatId) {
		return dataDictionaryDetailMapper.selectByPrimaryKey(avoidRepeatId);
	}

	@Transactional
	@Override
	public int delete(String avoidRepeatId) {
		return dataDictionaryDetailMapper.deleteByPrimaryKey(avoidRepeatId);
	}

	@Override
	public int insert(BasDataDictionaryDetail record) {
		record.setDictionaryDetailId(UUID.randomUUID().toString().replace("-", ""));
		return dataDictionaryDetailMapper.insertSelective(record);
	}

	@Override
	public int update(BasDataDictionaryDetail record) {
		return dataDictionaryDetailMapper.updateByPrimaryKeySelective(record);
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
