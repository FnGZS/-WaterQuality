package com.crazyBird.controller.water.model;

public class WaterParamItem {
	private Integer id;
	private Integer paramId;
	private Long InforId;
	
	public Long getInforId() {
		return InforId;
	}
	public void setInforId(Long inforId) {
		InforId = inforId;
	}
	public Integer getParamId() {
		return paramId;
	}
	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public Double getParamValue() {
		return paramValue;
	}
	public void setParamValue(Double paramValue) {
		this.paramValue = paramValue;
	}
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

	public String getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String param;
	private Double paramValue;
	private Double alarmMax;
	private Double alarmMin;
	private String chinese;
	private Integer curvePoints;
	private String english;
	private Double scopeMax;
	private Double scopeMin;
	private String unit;
	private String gmtCreate ;
	private Integer adminId;
	private Integer area;
	private String location;
	private String use;
	private String name;

}
