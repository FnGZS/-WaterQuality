package com.crazyBird.controller.user.model;

import com.crazyBird.controller.base.AbstractFlagModel;


public class UserModel extends AbstractFlagModel {

	private Long userId;
	private String userName;
	private String loginAccount;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginAccount() {
		return loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	
}
