package com.yee.carebank.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yee.carebank.model.biz.ScheduleBiz;
import com.yee.carebank.model.dto.ScheduleDto;

@Controller
public class testcontroller {

	@Autowired
	private ScheduleBiz biz;
	
	private Logger logger = LoggerFactory.getLogger(testcontroller.class);
	
	@RequestMapping("/diary.do")
	public String diary(Model model) {
		logger.info("mypage_diary");
		return "mypage_diary";
	}
	
	@RequestMapping("/schedulePopup.do")
	public String schedule() {
		logger.info("mypage_schedulePopup");
		return "schedulePopup";
	}
	
	@ResponseBody
	@RequestMapping(value="/addschedule.do", method=RequestMethod.POST) 
	public Map<Object, Object> insert(@RequestBody ScheduleDto dto){
		logger.info("insert");
		Map<Object, Object>map = new HashMap<Object, Object>();
		 
		biz.insert(dto);
		
		return map;
	}
	
	
}
