package com.poordata.dao;

import com.poordata.dto.domain.User;
import com.poordata.dto.param.UserParam;

public interface UserDao {

	/**
	 * 사용자 정보 조회
	 * @param param
	 * @return
	 */
	User selectUserInfo(UserParam param);

	/**
	 * 닉네임 카운트 조회 (닉네임 중복 체크)
	 * @param param
	 * @return
	 */
	int selectNicknameCnt(UserParam param);
}
