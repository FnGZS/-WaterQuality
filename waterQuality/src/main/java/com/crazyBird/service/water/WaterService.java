package com.crazyBird.service.water;

import java.util.List;

import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;
import com.crazyBird.dao.water.dataobject.WaterParamDO;
import com.crazyBird.dao.water.dataobject.WaterQualityInforDO;
import com.crazyBird.dao.water.dataobject.WaterQuanlityParamDO;

public interface WaterService {
	WaterInformationDTO getWaterInformation(WaterQualityInforDO inforDO);
	void insertWaterInformation(List<WaterInforInsertDO> inforDo);
	Integer getWatersCount();
	Integer getWatersParamCount();
	List<WaterInformationDTO> getWatersParamInformation(WaterQualityInforDO inforDO);
	List<WaterInformationDTO> getWatersAllParamInformation(WaterQualityInforDO inforDO);
	void insertWaterQualityParam(WaterQuanlityParamDO paramDO);
	void insertWaterParam(WaterParamDO paramDO);
	void updateWaterQualityParam(WaterQuanlityParamDO paramDO);
	List<WaterParamDO> getWaterParam();
	WaterQuanlityParamDO getWaterParamDetail(Integer id);
	void addWaterInformation(WaterInformationDO infroDO);
	void updateWaterInformation(WaterInformationDO infroDO);
	void deleteWaterInformation(Integer id);
	void deleteWaterParam(Integer id);
	
}
