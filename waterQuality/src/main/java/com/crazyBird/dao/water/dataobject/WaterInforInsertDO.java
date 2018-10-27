package com.crazyBird.dao.water.dataobject;

public class WaterInforInsertDO {
	private Integer paramId;
	public Integer getParamId() {
		return paramId;
	}
	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}
	private Integer watersId;
	private Double paramValue;
	public Integer getWatersId() {
		return watersId;
	}
	public void setWatersId(Integer watersId) {
		this.watersId = watersId;
	}
	public Double getParamValue() {
		return paramValue;
	}
	public void setParamValue(Double paramValue) {
		this.paramValue = paramValue;
	}
}
