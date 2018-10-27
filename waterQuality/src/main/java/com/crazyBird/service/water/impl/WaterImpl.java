package com.crazyBird.service.water.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.dao.water.WatersDao;
import com.crazyBird.dao.water.WaterParamDao;
import com.crazyBird.dao.water.WaterQualityInformationDao;
import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;
import com.crazyBird.dao.water.dataobject.WaterQualityInforDO;
//import com.crazyBird.dao.water.dateobject.WateInforInsertDO;
//import com.crazyBird.dao.water.dateobject.WaterInformationDTO;
import com.crazyBird.service.water.WaterService;

@Component("WaterService")
public class WaterImpl implements WaterService{
	@Autowired
	private WatersDao watersDao;
	@Autowired
	private WaterParamDao waterParamDao;
	@Autowired
	private WaterQualityInformationDao waterQualityInformationDao;
	@Override
	public WaterInformationDTO getWaterInformation(WaterQualityInforDO inforDO) {
		WaterInformationDTO dto = waterQualityInformationDao.getWaterInformation(inforDO);
		// TODO Auto-generated method stub
		return dto;
	}
	@Override
	public void insertWaterInformation(List<WaterInforInsertDO> inforDo) {
		waterQualityInformationDao.insertWaterInformation(inforDo);	
	}

	@Override
	public Integer getWatersCount() {
		// TODO Auto-generated method stub
		return watersDao.getWatersCount();
	}

	@Override
	public Integer getWatersParamCount() {
		// TODO Auto-generated method stub
		return waterParamDao.getWatersParamCount();
	}
	@Override
	public List<WaterInformationDTO> getWatersParamInformation(WaterQualityInforDO inforDO) {
		// TODO Auto-generated method stub
		return waterQualityInformationDao.getWatersParamInformation(inforDO);
	}
	
}
