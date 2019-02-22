package com.iwonder.alice.sys.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.sys.dao.auto.SysRoleMapper;
import com.iwonder.alice.sys.entity.SysRole;
import com.iwonder.alice.sys.entity.SysRoleExample;
import com.iwonder.alice.sys.service.SysRoleService;



/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class SysRoleServiceImp implements SysRoleService {
	@Autowired
	SysRoleMapper sysRoleMapper;

	@Override
	public List<SysRole> list() {
		List<SysRole> sysRole = sysRoleMapper.selectByExample(new SysRoleExample());
		return sysRole;
	}

	@Override
	public List<SysRole> selectByExample(SysRoleExample example) {
		return sysRoleMapper.selectByExample(example);
	}

	@Override
	public SysRole load(String roleId) {
		return sysRoleMapper.selectByPrimaryKey(roleId);
	}

	@Transactional
	@Override
	public int delete(String roleId) {
		return sysRoleMapper.deleteByPrimaryKey(roleId);
	}

	@Override
	public int insert(SysRole record) {
		record.setRoleId(UUID.randomUUID().toString().replace("-", ""));
		return sysRoleMapper.insertSelective(record);
	}

	@Override
	public int update(SysRole record) {
		return sysRoleMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
	}

}
