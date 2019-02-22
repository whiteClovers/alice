package com.iwonder.alice.sys.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwonder.alice.sys.dao.auto.SysMenuMapper;
import com.iwonder.alice.sys.entity.SysMenu;
import com.iwonder.alice.sys.entity.SysMenuExample;
import com.iwonder.alice.sys.service.ISysMenuService;

@Service
public class SysMenuServiceImp implements ISysMenuService{

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	@Override
	public int delete(String menuId){
		 return sysMenuMapper.deleteByPrimaryKey(menuId);
	}
	
	public void deleteRows(String[] ids){
		for (String id : ids) {
			delete(id);
		}
	}
	
	@Override
	public int insert(SysMenu sysMenu){
		sysMenu.setMenuId(UUID.randomUUID().toString().replace("-", ""));
		 return sysMenuMapper.insertSelective(sysMenu);
	}
	
	@Override
	public List<SysMenu> selectByExample(SysMenuExample example){
		 return sysMenuMapper.selectByExample(example);
	}
	
	@Override
	public SysMenu load(String menuId){
		return sysMenuMapper.selectByPrimaryKey(menuId);
	}
	
	@Override
	public int update(SysMenu record){
		return sysMenuMapper.updateByPrimaryKey(record);
	}
}
