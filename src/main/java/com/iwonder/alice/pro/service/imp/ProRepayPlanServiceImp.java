package com.iwonder.alice.pro.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.pro.dao.MyProLoanMapper;
import com.iwonder.alice.pro.dao.MyProRepayPlanMapper;
import com.iwonder.alice.pro.dao.auto.ProRepayPlanMapper;
import com.iwonder.alice.pro.entity.ProRepayPlan;
import com.iwonder.alice.pro.entity.ProRepayPlanExample;

import com.iwonder.alice.pro.entity.view.ProLoanView;
import com.iwonder.alice.pro.entity.view.ProRepayPlanView;
import com.iwonder.alice.pro.service.IProLoanService;
import com.iwonder.alice.pro.service.IProRepayPlanService;
@Service
public class ProRepayPlanServiceImp implements IProRepayPlanService{
	@Autowired
	private ProRepayPlanMapper proRepayPlanMapper;
	@Autowired
	private MyProRepayPlanMapper myProRepayPlanMapper;
	@Override
	public long countByExample(ProRepayPlanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ProRepayPlanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String repayId) {
		// TODO Auto-generated method stub
		return proRepayPlanMapper.deleteByPrimaryKey(repayId);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		
		for (String id : ids) {
		
			deleteByPrimaryKey(id) ;
		}
		

	}
	
	@Override
	public int insert(ProRepayPlan record) {
		// TODO Auto-generated method stub
		record.setRepayId((UUID.randomUUID().toString().replace("-", "")));
		return proRepayPlanMapper.insert(record);
	}

	@Override
	public int insertSelective(ProRepayPlan record) {
		// TODO Auto-generated method stub
		record.setRepayId((UUID.randomUUID().toString().replace("-", "")));
		return proRepayPlanMapper.insertSelective(record);
	}

	@Override
	public List<ProRepayPlan> selectByExample(ProRepayPlanExample example) {
		// TODO Auto-generated method stub
		return proRepayPlanMapper.selectByExample(example);
	}
	public List<ProRepayPlanView> mySelectList(HashMap hCondition){
		return myProRepayPlanMapper.mySelectList(hCondition);
	}

	@Override
	public ProRepayPlanView mySelectOne(HashMap hCondition) {
	// TODO Auto-generated method stub
	return myProRepayPlanMapper.mySelectOne(hCondition);
	}
	@Override
	public ProRepayPlan selectByPrimaryKey(String repayId) {
		// TODO Auto-generated method stub
		return proRepayPlanMapper.selectByPrimaryKey(repayId);
	}

	
	@Override
	public int updateByExampleSelective(ProRepayPlan record, ProRepayPlanExample example) {
		// TODO Auto-generated method stub
		return proRepayPlanMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ProRepayPlan record, ProRepayPlanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ProRepayPlan record) {
		// TODO Auto-generated method stub
		return proRepayPlanMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProRepayPlan record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
