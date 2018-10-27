package com.crazyBird.service.water;

import java.util.List;

import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;
import com.crazyBird.dao.water.dataobject.WaterQualityInforDO;

public interface WaterService {
	WaterInformationDTO getWaterInformation(WaterQualityInforDO inforDO);
	void insertWaterInformation(List<WaterInforInsertDO> inforDo);
	Integer getWatersCount();
	Integer getWatersParamCount();
	List<WaterInformationDTO> getWatersParamInformation(WaterQualityInforDO inforDO);
	
}
