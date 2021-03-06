package com.iwonder.alice.sys.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwonder.alice.sys.dao.auto.SysRoleMenuMapper;
import com.iwonder.alice.sys.entity.SysRoleMenu;
import com.iwonder.alice.sys.entity.SysRoleMenuExample;
import com.iwonder.alice.sys.service.ISysRoleMenuService;


@Service
public class SysRoleMenuServiceImp implements ISysRoleMenuService{

	@Autowired
	private SysRoleMenuMapper sysRoleMenuMapper;
	
	@Override
	public int delete(String roleMenuId){
		return sysRoleMenuMapper.deleteByPrimaryKey(roleMenuId);
	}
	
	public void deleteRows(String[] ids){
		for (String id : ids) {
			delete(id);
		}
	}
	
	@Override
	public int insert(SysRoleMenu sysRoleMenu){
		sysRoleMenu.setRoleMenuId(UUID.randomUUID().toString().replace("-", ""));
		return sysRoleMenuMapper.insertSelective(sysRoleMenu);
	}
	
	@Override
	public List<SysRoleMenu> selectByExample(SysRoleMenuExample example){
		return sysRoleMenuMapper.selectByExample(example);
	}
	
	@Override
	public SysRoleMenu load(String roleMenuId){
		return sysRoleMenuMapper.selectByPrimaryKey(roleMenuId);
	}
	
	@Override
	public int update(SysRoleMenu record){
		return sysRoleMenuMapper.updateByPrimaryKey(record);
	}
}
