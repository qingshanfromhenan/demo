package com.qs.property.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qs.property.entity.QxUserEntity;
@Mapper
public interface IQxUserMapper {
	/**
	 * 查询当前登录人管辖部门id
	 * 
	 * @param orgId
	 * @return
	 */
	public List<String> findParentId(String orgId);
	

	//查-接收人信息(我的消息模块)
	public List<QxUserEntity> findPerson(String id);
}
