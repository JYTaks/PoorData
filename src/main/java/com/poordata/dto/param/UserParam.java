package com.poordata.dto.param;

public class UserParam extends BaseParam {

	private String email;
	private String pwd;

	// 회원가입
	private String joinEmail;
	private String joinPwd;
	private String joinNickname;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getJoinEmail() {
		return joinEmail;
	}

	public void setJoinEmail(String joinEmail) {
		this.joinEmail = joinEmail;
	}

	public String getJoinPwd() {
		return joinPwd;
	}

	public void setJoinPwd(String joinPwd) {
		this.joinPwd = joinPwd;
	}

	public String getJoinNickname() {
		return joinNickname;
	}

	public void setJoinNickname(String joinNickname) {
		this.joinNickname = joinNickname;
	}

}
