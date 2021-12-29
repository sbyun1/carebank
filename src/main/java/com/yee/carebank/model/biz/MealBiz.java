package com.yee.carebank.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yee.carebank.model.dao.MealDao;
import com.yee.carebank.model.dto.MealDto;

@Service
public class MealBiz {

	@Autowired
	MealDao dao;

	public List<MealDto> selectGallery(int subcat_id) {
		return dao.selectGallery(subcat_id);
	}

	public List<String> selectFood(int subcat_id) {
		return dao.selectFood(subcat_id);
	}

	public String selectCategory(int subcat_id) {
		return dao.selectCategory(subcat_id);
	}
}
