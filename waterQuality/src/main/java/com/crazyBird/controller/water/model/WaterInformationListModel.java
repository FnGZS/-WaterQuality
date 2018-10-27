package com.crazyBird.controller.water.model;

import java.util.List;

import com.crazyBird.controller.base.AbstractFlagModel;

public class WaterInformationListModel extends AbstractFlagModel {
	private List<WaterInformationListItem> list;

	public List<WaterInformationListItem> getList() {
		return list;
	}

	public void setList(List<WaterInformationListItem> list) {
		this.list = list;
	}

	
	
}
