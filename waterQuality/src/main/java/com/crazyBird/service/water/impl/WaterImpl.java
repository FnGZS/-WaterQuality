package com.crazyBird.service.water.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.dao.water.WatersDao;
import com.crazyBird.dao.water.WaterParamDao;
import com.crazyBird.dao.water.WaterQualityInformationDao;
import com.crazyBird.dao.water.WaterQualityParamDao;
import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;
import com.crazyBird.dao.water.dataobject.WaterParamDO;
import com.crazyBird.dao.water.dataobject.WaterQualityInforDO;
import com.crazyBird.dao.water.dataobject.WaterQuanlityParamDO;
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
	@Autowired
	private WaterQualityParamDao waterQualityParamDao;
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
	@Override
	public void insertWaterQualityParam(WaterQuanlityParamDO paramDO) {
		// TODO Auto-generated method stub
		waterQualityParamDao.insertWaterQualityParam(paramDO);
	}
	@Override
	public void insertWaterParam(WaterParamDO paramDO) {
		// TODO Auto-generated method stub
		waterParamDao.insertWaterParam(paramDO);
	}
	@Override
	public void updateWaterQualityParam(WaterQuanlityParamDO paramDO) {
		waterQualityParamDao.updateWaterQualityParam(paramDO);
		
	}
	@Override
	public List<WaterParamDO> getWaterParam() {
		// TODO Auto-generated method stub
		return waterParamDao.getWaterParam();
	}
	@Override
	public WaterQuanlityParamDO getWaterParamDetail(Integer id) {
		// TODO Auto-generated method stub
		return waterQualityParamDao.getWaterParamDetail(id);
	}
	
	@Override
	public void deleteWaterParam(Integer id) {
		waterParamDao.deleteWaterParam(id);
		waterQualityParamDao.deleteWaterQualityParam(id);
		
	}
	@Override
	public void addWaterInformation(WaterInformationDO infroDO) {
		watersDao.addWaterInformation(infroDO);
		
		
		
	}
	@Override
	public void updateWaterInformation(WaterInformationDO infroDO) {
		watersDao.updateWaterInformation(infroDO);
		
	}
	@Override
	public void deleteWaterInformation(Integer id) {
		watersDao.deleteWaterInformation(id);
		
	}
	@Override
	public List<WaterInformationDTO> getWatersAllParamInformation(WaterQualityInforDO inforDO) {
		// TODO Auto-generated method stub
		return waterQualityInformationDao.getWatersParamAllInformation(inforDO);
	}
	
}
