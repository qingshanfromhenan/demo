package com.qs.property.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IWyAllPropertyMapper {
	public Map<String, Object> findall();
}
