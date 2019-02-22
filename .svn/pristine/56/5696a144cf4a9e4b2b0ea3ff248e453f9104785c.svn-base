package com.iwonder.alice.pro.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.pro.dao.MyProLoanMapper;
import com.iwonder.alice.pro.dao.auto.ProLoanMapper;
import com.iwonder.alice.pro.entity.ProLoan;
import com.iwonder.alice.pro.entity.ProLoanExample;
import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.service.IProLoanService;
@Service
public class ProLoanServiceImp implements IProLoanService{
	@Autowired
	private ProLoanMapper proLoanMapper;
	@Autowired
	private MyProLoanMapper myProLoanMapper;
	@Override
	public long countByExample(ProLoanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ProLoanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		
		for (String id : ids) {
		
			deleteByPrimaryKey(id) ;
		}
		
	}

	@Override
	public int deleteByPrimaryKey(String loanId) {
		// TODO Auto-generated method stub
		return proLoanMapper.deleteByPrimaryKey(loanId);
	}

	@Override
	public int insert(ProLoan record) {
		// TODO Auto-generated method stub
		record.setLoanId(UUID.randomUUID().toString().replace("-", ""));
		proLoanMapper.insert(record);
		return 0;
	}

	@Override
	public int insertSelective(ProLoan record) {
		// TODO Auto-generated method stub
		
		record.setLoanId(UUID.randomUUID().toString().replace("-", ""));
		return proLoanMapper.insertSelective(record);
	}

	

	@Override
	public ProLoan selectByPrimaryKey(String loanId) {
		// TODO Auto-generated method stub
		return proLoanMapper.selectByPrimaryKey(loanId);
	}

	@Override
	public int updateByExampleSelective(ProLoan record, ProLoanExample example) {
		// TODO Auto-generated method stub
		return proLoanMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ProLoan record, ProLoanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ProLoan record) {
		// TODO Auto-generated method stub
		return proLoanMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProLoan record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProLoan> selectByExample(ProLoanExample example) {
		// TODO Auto-generated method stub
		return proLoanMapper.selectByExample(example);
	}
	public List<ProLoanView> mySelectList(HashMap hCondition){
		return myProLoanMapper.mySelectList(hCondition);
	}

	@Override
	public ProLoanView mySelectOne(HashMap hCondition) {
		// TODO Auto-generated method stub
		return myProLoanMapper.mySelectOne(hCondition);
	}
}
