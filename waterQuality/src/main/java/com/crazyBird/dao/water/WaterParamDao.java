package com.crazyBird.dao.water;

import java.util.List;

import com.crazyBird.dao.water.dataobject.WaterParamDO;
import com.crazyBird.dao.water.dataobject.WaterQuanlityParamDO;

public interface WaterParamDao {
	//获得多少个参数
		Integer getWatersParamCount();
		//添加参数
		void insertWaterParam(WaterParamDO paramDO);
		//得到参数列表
		List<WaterParamDO> getWaterParam();
		
		//删除水质参数
		
		void deleteWaterParam(Integer id);

		
}
