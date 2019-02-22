package com.iwonder.alice.sys.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.sys.dao.auto.SysStaffMapper;
import com.iwonder.alice.sys.entity.SysStaff;
import com.iwonder.alice.sys.entity.SysStaffExample;
import com.iwonder.alice.sys.service.SysStaffService;



/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
@Service
public class SysStaffServiceImp implements SysStaffService {
	@Autowired
	SysStaffMapper sysStaffMapper;

	@Override
	public List<SysStaff> list() {
		List<SysStaff> sysStaff = sysStaffMapper.selectByExample(new SysStaffExample());
		return sysStaff;
	}

	@Override
	public List<SysStaff> selectByExample(SysStaffExample example) {
		return sysStaffMapper.selectByExample(example);
	}

	@Override
	public SysStaff load(String staffId) {
		return sysStaffMapper.selectByPrimaryKey(staffId);
	}

	@Transactional
	@Override
	public int delete(String staffId) {
		return sysStaffMapper.deleteByPrimaryKey(staffId);
	}

	@Override
	public int insert(SysStaff record) {
//		record.setUserId(UUID.randomUUID().toString().replace("-", ""));
		record.setStaffId(UUID.randomUUID().toString().replace("-", ""));
		return sysStaffMapper.insertSelective(record);
	}

	@Override
	public int update(SysStaff record) {
		return sysStaffMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			delete(id);
		}
	}

}
