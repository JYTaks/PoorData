package com.poordata.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poordata.controller.WebController;
import com.poordata.dao.UserDao;
import com.poordata.dto.param.UserParam;

@Service("UserService")
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(WebController.class);

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
			log.error("ERR, {}", e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
