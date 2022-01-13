package com.yee.carebank.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yee.carebank.model.dao.AdminDao;
import com.yee.carebank.model.dto.CategoryDto;
import com.yee.carebank.model.dto.FoodDto;
import com.yee.carebank.model.dto.MealDto;

@Service
public class AdminBiz {

	@Autowired
	AdminDao dao;

	public List<MealDto> selectMList(int pageNo) {
		int start = 1, end = 20;

		start = (20 * (pageNo - 1)) + 1;
		end = start + 19;

		return dao.selectMList(start, end);
	}

	public int getMTotalCnt() {
		return dao.getMTotalCnt();
	}

	public List<CategoryDto> selectCList() {
		return dao.selectCList();
	}

	public int insertM(MealDto meal, List<FoodDto> foods) {
		return dao.insertM(meal, foods);
	}

	public int deleteMeal(int meal_id) {
		return dao.deleteMeal(meal_id);
	}

	public int updateM(MealDto m, List<FoodDto> food) {
		return dao.updateM(m, food);
	}
}
