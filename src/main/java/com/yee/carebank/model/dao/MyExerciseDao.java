package com.yee.carebank.model.dao;

import java.util.List;
import java.util.Map;

import com.yee.carebank.model.dto.MyExerciseDto;

public interface MyExerciseDao {

	String NAMESPACE="myexercise.";
	
	public List<MyExerciseDto> selectList();
	public int selectOne(Integer user_no);
	public int insert(MyExerciseDto dto);  
	//public int insert(Integer exer_count);
}
