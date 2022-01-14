package com.yee.carebank.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yee.carebank.model.dao.AFoodDao;
import com.yee.carebank.model.dao.AMealDao;
import com.yee.carebank.model.dto.CategoryDto;
import com.yee.carebank.model.dto.FoodDto;
import com.yee.carebank.model.dto.MealDto;

@Service
public class AdminBiz {

	@Autowired
	AMealDao dao;

	@Autowired
	AFoodDao fdao;

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

	public List<MealDto> search(String searchType, String keyword, int page) {
		int start = 1, end = 20;

		start = (20 * (page - 1)) + 1;
		end = start + 19;

		switch (searchType) {
		case "name":
			return dao.searchByName(keyword, start, end);
		case "category":
			return dao.searchByCategory(keyword, start, end);
		default:
			return dao.searchAll(keyword, start, end);
		}
	}

	public int getCount(String searchType, String keyword) {
		switch (searchType) {
		case "name":
			return dao.getMealCount(keyword);
		case "category":
			return dao.getCatCount(keyword);
		default:
			return dao.getAllCount(keyword);
		}
	}

	public List<FoodDto> selectFList(int page) {
		int start = 1, end = 20;

		start = (20 * (page - 1)) + 1;
		end = start + 19;

		return fdao.selectFList(start, end);
	}

	public int getFTotalCount() {
		return fdao.getFTotalCount();
	}

	public int deleteFood(int food_id) {
		return fdao.deleteFood(food_id);
	}

	public int insertF(FoodDto food) {
		return fdao.insertFood(food);
	}

	public int checkFName(String foodname) {
		return fdao.checkFName(foodname);
	}

	public FoodDto selectFood(int food_id) {
		return fdao.selectFood(food_id);
	}

	public int updateF(FoodDto food) {
		return fdao.updateF(food);
	}

	public List<FoodDto> searchFood(String keyword, int page) {
		int start = 1, end = 20;

		start = (20 * (page - 1)) + 1;
		end = start + 19;

		return fdao.searchFood(keyword, start, end);
	}

	public int getSearchCntFood(String keyword) {
		return fdao.getSearchCnt(keyword);
	}
}
