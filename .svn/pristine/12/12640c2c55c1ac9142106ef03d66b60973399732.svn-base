package com.iwonder.alice.sys.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.sys.dao.auto.SysStaffRoleMapper;
import com.iwonder.alice.sys.entity.SysStaffRole;
import com.iwonder.alice.sys.entity.SysStaffRoleExample;
import com.iwonder.alice.sys.service.SysStaffRoleService;



/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class SysStaffRoleServiceImp implements SysStaffRoleService {
	@Autowired
	SysStaffRoleMapper sysStaffRoleMapper;

	@Override
	public List<SysStaffRole> list() {
		List<SysStaffRole> sysStaffRole = sysStaffRoleMapper.selectByExample(new SysStaffRoleExample());
		return sysStaffRole;
	}

	@Override
	public List<SysStaffRole> selectByExample(SysStaffRoleExample example) {
		return sysStaffRoleMapper.selectByExample(example);
	}

	@Override
	public SysStaffRole load(String staffRoleId) {
		return sysStaffRoleMapper.selectByPrimaryKey(staffRoleId);
	}

	@Transactional
	@Override
	public int delete(String staffRoleId) {
		return sysStaffRoleMapper.deleteByPrimaryKey(staffRoleId);
	}

	@Override
	public int insert(SysStaffRole record) {
		record.setStaffRoleId(UUID.randomUUID().toString().replace("-", ""));
		return sysStaffRoleMapper.insertSelective(record);
	}

	@Override
	public int update(SysStaffRole record) {
		return sysStaffRoleMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
	}

}
