package com.liuyuntao.mapper;

import java.util.List;
import java.util.Map;

import com.liuyuntao.beans.Hreo;

public interface HreoMapper {
	//查询所有
	public List<Hreo> selecthreo(Map<String, Object> map);
}
