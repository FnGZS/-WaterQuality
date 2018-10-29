package com.crazyBird.dao.water;

import java.util.List;

import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;



public interface WatersDao {
	//获得水域数
	Integer getWatersCount();	
	
	void addWaterInformation(WaterInformationDO infroDO);
	void updateWaterInformation(WaterInformationDO infroDO);
	void deleteWaterInformation(Integer id);
		
}