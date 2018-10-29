package com.crazyBird.dao.water;

import com.crazyBird.dao.water.dataobject.WaterQuanlityParamDO;

public interface WaterQualityParamDao {
	//添加新的参数相关
	void insertWaterQualityParam(WaterQuanlityParamDO paramDO);
	//更新参数相关
	void updateWaterQualityParam(WaterQuanlityParamDO paramDO);
	//得到某个水质参数的详细参数
	WaterQuanlityParamDO getWaterParamDetail(Integer id);

	//删除水质参数
	
	void deleteWaterQualityParam(Integer id);
}
