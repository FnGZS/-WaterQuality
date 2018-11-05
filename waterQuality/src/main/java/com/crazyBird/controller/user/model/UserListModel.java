package com.crazyBird.controller.user.model;

import java.util.List;

import com.crazyBird.controller.base.AbstractPageFlagModel;

public class UserListModel extends AbstractPageFlagModel{
	private List<UserItem> tags;

	public List<UserItem> getTags() {
		return tags;
	}

	public void setTags(List<UserItem> tags) {
		this.tags = tags;
	}
	
	
}
