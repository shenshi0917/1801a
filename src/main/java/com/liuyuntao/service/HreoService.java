package com.liuyuntao.service;

import java.util.List;
import java.util.Map;

import com.liuyuntao.beans.Hreo;

public interface HreoService {
	//查询所有
	public List<Hreo> selecthreo(Map<String, Object> map);
}
