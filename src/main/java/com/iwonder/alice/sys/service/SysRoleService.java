package com.iwonder.alice.sys.service;

import java.util.List;

import com.iwonder.alice.sys.entity.SysRole;
import com.iwonder.alice.sys.entity.SysRoleExample;



public interface SysRoleService {
	public List<SysRole> list();

	public List<SysRole> selectByExample(SysRoleExample example);

	public SysRole load(String roleId);

	public int delete(String roleId);

	public void deleteRows(String[] ids);

	int insert(SysRole record);

	int update(SysRole record);
}
