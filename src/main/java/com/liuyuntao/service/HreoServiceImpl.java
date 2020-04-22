package com.liuyuntao.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuyuntao.beans.Hreo;
import com.liuyuntao.mapper.HreoMapper;

@Service
public class HreoServiceImpl implements HreoService{
	
	@Resource
	private HreoMapper hMapper;
	
	@Override
	public List<Hreo> selecthreo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hMapper.selecthreo(map);
	}

}
