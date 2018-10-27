package com.crazyBird.controller.user.model;

import com.crazyBird.controller.base.AbstractFlagModel;

public class UserWaterLoginModel extends AbstractFlagModel{

	private Long jurisdiction;
	private String userName;
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
