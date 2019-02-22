package com.iwonder.alice.sys.service;

import java.util.List;

import com.iwonder.alice.sys.entity.SysMenu;
import com.iwonder.alice.sys.entity.SysMenuExample;

public interface ISysMenuService {

	 int delete(String menuId);
	 
	 void deleteRows(String[] ids);

	 int insert(SysMenu sysMenu);

	 List<SysMenu> selectByExample(SysMenuExample example);

	 SysMenu load(String menuId);

	 int update(SysMenu sysMenu);
}
