package com.iwonder.alice.pro.service.imp;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.pro.dao.auto.ProRepayMethodMapper;
import com.iwonder.alice.pro.entity.ProRepayMethod;
import com.iwonder.alice.pro.entity.ProRepayMethodExample;
import com.iwonder.alice.pro.service.IProRepayMethodService;
@Service
public class ProRepayMethodServiceImp implements IProRepayMethodService{
	@Autowired
	ProRepayMethodMapper proRepayMethodMapper;
	@Override
	public long countByExample(ProRepayMethodExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ProRepayMethodExample example) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String repayMethodId) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.deleteByPrimaryKey(repayMethodId);
	}
	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		
		for (String id : ids) {
		
			deleteByPrimaryKey(id) ;
		}
		

	}
	@Override
	public int insert(ProRepayMethod record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ProRepayMethod record) {
		// TODO Auto-generated method stub
		record.setRepayMethodId(UUID.randomUUID().toString().replace("-", ""));
		return proRepayMethodMapper.insertSelective(record);
	}

	@Override
	public List<ProRepayMethod> selectByExample(ProRepayMethodExample example) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.selectByExample(example);
	}

	@Override
	public ProRepayMethod selectByPrimaryKey(String repayMethodId) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.selectByPrimaryKey(repayMethodId);
	}

	@Override
	public int updateByExampleSelective(ProRepayMethod record, ProRepayMethodExample example) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ProRepayMethod record, ProRepayMethodExample example) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ProRepayMethod record) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProRepayMethod record) {
		// TODO Auto-generated method stub
		return proRepayMethodMapper.updateByPrimaryKey(record);
	}

}
