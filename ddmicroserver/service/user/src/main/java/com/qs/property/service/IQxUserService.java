package com.qs.property.service;

import java.util.List;

import com.qs.property.entity.QxUserEntity;

public interface IQxUserService {
	/**
	 * 查询当前登录人管辖部门id
	 * 
	 * @param orgrId
	 * @return
	 */
	public List<String> findParentId(String orgId);
	

	//查-接收人信息(我的消息模块)
	public List<QxUserEntity> findPerson(String id);
}
