package com.qs.property.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qs.property.entity.QxUserEntity;
import com.qs.property.mapper.IQxUserMapper;
import com.qs.property.service.IQxUserService;

@Service
public class QxUserServiceImpl implements IQxUserService {
	
	@Resource
	private IQxUserMapper qxUserMapper;

	@Override
	public List<String> findParentId(String orgId) {
		List<String> listData = qxUserMapper.findParentId(orgId);
		return listData;
	}

	@Override
	public List<QxUserEntity> findPerson(String id) {
		List<QxUserEntity> listPerson = qxUserMapper.findPerson(id);
		return listPerson;
	}
}
