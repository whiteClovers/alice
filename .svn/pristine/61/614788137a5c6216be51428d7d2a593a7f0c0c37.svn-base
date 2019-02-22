package com.iwonder.alice.sys.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwonder.alice.sys.dao.auto.SysModuleMapper;
import com.iwonder.alice.sys.entity.SysModule;
import com.iwonder.alice.sys.entity.SysModuleExample;
import com.iwonder.alice.sys.service.ISysModuleService;

@Service
public class SysModuleServiceImp implements ISysModuleService{

	@Autowired
	private SysModuleMapper sysModuleMapper;
	
	@Override
	public int delete(String moduleId){
		 return sysModuleMapper.deleteByPrimaryKey(moduleId);
	}
	
	public void deleteRows(String[] ids){
		for (String id : ids) {
			delete(id);
		}
	}
	
	@Override
	public int insert(SysModule sysModule){
		sysModule.setModuleId(UUID.randomUUID().toString().replace("-", ""));
		 return sysModuleMapper.insertSelective(sysModule);
	}
	
	@Override
	public List<SysModule> selectByExample(SysModuleExample example){
		 return sysModuleMapper.selectByExample(example);
	}
	
	@Override
	public SysModule load(String moduleId){
		return sysModuleMapper.selectByPrimaryKey(moduleId);
	}
	
	@Override
	public int update(SysModule record){
		return sysModuleMapper.updateByPrimaryKey(record);
	}
}
