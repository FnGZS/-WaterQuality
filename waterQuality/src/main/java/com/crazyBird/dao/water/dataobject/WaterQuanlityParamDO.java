package com.crazyBird.dao.water.dataobject;

import java.util.Date;

public class WaterQuanlityParamDO {
	public Double getAlarmMax() {
		return alarmMax;
	}
	public void setAlarmMax(Double alarmMax) {
		this.alarmMax = alarmMax;
	}
	public Double getAlarmMin() {
		return alarmMin;
	}
	public void setAlarmMin(Double alarmMin) {
		this.alarmMin = alarmMin;
	}
	public String getChinese() {
		return chinese;
	}
	public void setChinese(String chinese) {
		this.chinese = chinese;
	}
	public Integer getCurvePoints() {
		return curvePoints;
	}
	public void setCurvePoints(Integer curvePoints) {
		this.curvePoints = curvePoints;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public Double getScopeMax() {
		return scopeMax;
	}
	public void setScopeMax(Double scopeMax) {
		this.scopeMax = scopeMax;
	}
	public Double getScopeMin() {
		return scopeMin;
	}
	public void setScopeMin(Double scopeMin) {
		this.scopeMin = scopeMin;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}
	private Integer paramId;
	public Integer getParamId() {
		return paramId;
	}
	private Double alarmMax;
	private Double alarmMin;
	private String chinese;
	private Integer curvePoints;
	private String english;
	private Double scopeMax;
	private Double scopeMin;
	private String unit;

}
