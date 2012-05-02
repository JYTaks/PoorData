package com.poordata.service;

import com.poordata.dto.param.UserParam;

public interface UserService {
	/**
	 * 닉네임 중복 체크
	 * @param param
	 * @return
	 */
	Boolean dupChkNickname(UserParam param);

	/**
	 * 이메일 중복 체크
	 * @param param
	 * @return
	 */
	Boolean dupChkEmail(UserParam param);
}
