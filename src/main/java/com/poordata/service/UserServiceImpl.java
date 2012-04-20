package com.poordata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poordata.dao.UserDao;
import com.poordata.dto.param.UserParam;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public Boolean dupChkNickname(UserParam param) {
		boolean result = false;
		try {
			int cnt = 0;
			cnt = userDao.selectNicknameCnt(param);

			if (cnt > 0) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
