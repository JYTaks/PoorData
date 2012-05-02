package com.poordata.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.poordata.dto.domain.User;
import com.poordata.dto.param.UserParam;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public User selectUserInfo(UserParam param) {
		return (User) getSqlSession().selectOne("user.selectUserInfo", param);
	}

	public int selectNicknameCnt(UserParam param) {
		return (Integer) getSqlSession().selectOne("user.selectNicknameCnt", param);
	}

	public int selectEmailCnt(UserParam param) {
		return (Integer) getSqlSession().selectOne("user.selectEmailCnt", param);
	}
}
