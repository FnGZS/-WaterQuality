package com.crazyBird.dao.user.dataobject;

public class UserWaterLoginDO {

	private Long userId;
	private String password;
	private Long jurisdiction;
	private String userName;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(Long jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
