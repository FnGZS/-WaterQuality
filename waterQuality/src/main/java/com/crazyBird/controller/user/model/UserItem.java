package com.crazyBird.controller.user.model;

public class UserItem {

	private Long id;
	private Long jurisdiction;
	private String userName;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
