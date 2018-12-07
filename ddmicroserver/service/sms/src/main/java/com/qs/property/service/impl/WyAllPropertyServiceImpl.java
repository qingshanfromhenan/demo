package com.qs.property.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qs.property.mapper.IWyAllPropertyMapper;
import com.qs.property.service.IWyAllPropertyService;

@Service
public class WyAllPropertyServiceImpl implements IWyAllPropertyService{
	
	@Resource
	IWyAllPropertyMapper mp;
	
	@Override
	public Map<String, Object> findall() {
		return mp.findall();
	}

}
