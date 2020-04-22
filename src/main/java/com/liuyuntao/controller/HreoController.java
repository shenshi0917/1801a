package com.liuyuntao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liuyuntao.beans.Hreo;
import com.liuyuntao.service.HreoService;

@Controller
public class HreoController {
	
	@Resource
	private HreoService hService;
	
	@RequestMapping("queryAll")
	public String select(Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Hreo> list = hService.selecthreo(map );
		model.addAttribute("list", list);
		return "list";
	}
}
