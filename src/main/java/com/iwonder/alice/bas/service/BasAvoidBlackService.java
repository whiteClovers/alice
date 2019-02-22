package com.iwonder.alice.bas.service;

import java.util.List;

import com.iwonder.alice.bas.entity.BasAvoidBlack;
import com.iwonder.alice.bas.entity.BasAvoidBlackExample;

/**
 * @author mirror
 * @version 创建时间：2018年11月14日 下午3:18:53
 * 
 */
public interface BasAvoidBlackService {
	public List<BasAvoidBlack> list();

	public List<BasAvoidBlack> selectByExample(BasAvoidBlackExample example);

	public BasAvoidBlack load(String avoidBlackId);

	public int delete(String avoidBlackId);

	public void deleteRows(String[] ids);

	int insert(BasAvoidBlack record);

	int update(BasAvoidBlack record);
}
