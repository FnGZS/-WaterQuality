package com.crazyBird.controller.water.model;

import java.util.List;

import com.crazyBird.controller.base.AbstractFlagModel;

public class WaterParamModel extends AbstractFlagModel{
	private List<WaterParamSimpleItem> list;

	public List<WaterParamSimpleItem> getList() {
		return list;
	}

	public void setList(List<WaterParamSimpleItem> list) {
		this.list = list;
	}
	
}
