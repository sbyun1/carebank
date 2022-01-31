package com.yee.carebank.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yee.carebank.model.dao.PreferenceDao;
import com.yee.carebank.model.dto.PreferenceDto;
import com.yee.carebank.model.dto.UserDto;

@Service
public class PreferenceBiz {

	@Autowired
	private PreferenceDao preferdao;
	
	public List<PreferenceDto> selectAll(int user_no){
		return preferdao.selectAll(user_no);
	}
	
	public int setprefer(List<Integer> subcat_id, int user_no) {
		return preferdao.setprefer(subcat_id, user_no);
	}

	public List<PreferenceDto> allCat() {
		return preferdao.allCat();
	}
}
