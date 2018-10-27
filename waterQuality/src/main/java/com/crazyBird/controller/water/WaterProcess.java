package com.crazyBird.controller.water;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.crazyBird.controller.base.SimpleFlagModel;
import com.crazyBird.controller.water.model.WaterInformationListItem;
import com.crazyBird.controller.water.model.WaterInformationListModel;
import com.crazyBird.controller.water.model.WaterInformationModel;
import com.crazyBird.controller.water.model.WaterParamItem;
import com.crazyBird.controller.water.model.WaterParamListItem;
import com.crazyBird.controller.water.model.WaterParamListModel;
import com.crazyBird.controller.water.param.WaterInforParam;
import com.crazyBird.controller.water.param.WaterInformationCreateParam;
import com.crazyBird.controller.water.param.WaterInformationItem;
import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;
import com.crazyBird.dao.water.dataobject.WaterQualityInforDO;
import com.crazyBird.model.enums.HttpCodeEnum;
import com.crazyBird.service.water.WaterService;
import com.crazyBird.utils.DateUtil;

@Component
public class WaterProcess {
	@Autowired
	private WaterService waterService;
	public SimpleFlagModel createWaterInformation(WaterInformationCreateParam param) {
		SimpleFlagModel model = new SimpleFlagModel();
		List<WaterInforInsertDO> list = new ArrayList<>();
		for (WaterInformationItem item : param.getList()) {
			WaterInforInsertDO insertDO = new WaterInforInsertDO();
			insertDO.setParamId(item.getParamId());
			insertDO.setParamValue(item.getParamValue());
			insertDO.setWatersId(item.getWaterId());
			list.add(insertDO);
		}
		waterService.insertWaterInformation(list);
		return model;
	}
	public WaterInformationListModel getWaterInformation() {
		WaterInformationListModel model = new WaterInformationListModel();
		int count = waterService.getWatersCount();
		List<WaterInformationListItem> list = new ArrayList<>();
		for (int i = 1; i<=count ; i++) {
			WaterInformationListItem item = getWaterInformation(i);
			list.add(item);
		}
		model.setList(list);
		return model ;	
	}
	public WaterParamListItem getWaterInformationByParam(WaterInforParam param) {
		List<WaterParamItem> list = new ArrayList<>();
		WaterQualityInforDO inforDO = new WaterQualityInforDO();
		inforDO.setWatersId(param.getWatersId());
		inforDO.setParamId(param.getPasramId());
		List<WaterInformationDTO> tags = waterService.getWatersParamInformation(inforDO);
		for (WaterInformationDTO tag : tags) {
			WaterParamItem item = new WaterParamItem();
			item.setAdminId(tag.getAdminId());
			item.setAlarmMax(tag.getAlarmMax());
			item.setAlarmMin(tag.getAlarmMin());
			item.setArea(tag.getArea());
			item.setChinese(tag.getChinese());
			item.setCurvePoints(tag.getCurvePoints());
			item.setEnglish(tag.getEnglish());
			item.setGmtCreate(DateUtil.formatDate(tag.getGmtCreate(), DateUtil.DATE_FORMAT_YMDHMS));
			item.setId(tag.getId());
			item.setLocation(tag.getLocation());
			item.setName(tag.getName());
			item.setParamId(param.getPasramId());
			item.setParam(tag.getParam());
			item.setParamValue(tag.getParamValue());
			item.setScopeMax(tag.getScopeMax());
			item.setScopeMin(tag.getScopeMin());
			item.setUnit(tag.getUnit());
			item.setUse(tag.getUse());
			list.add(item);
		}
		WaterParamListItem paramList = new WaterParamListItem();
		paramList.setItems(list);
		
		return null;
	}
	public WaterParamListModel getWaterInformationByWaters(Integer id) {
		WaterParamListModel model= new WaterParamListModel();
		int count = waterService.getWatersParamCount();
		List<WaterParamListItem> waterList = new ArrayList<>();
		for(int i=1;i<=count;i++) {
			WaterQualityInforDO inforDO = new WaterQualityInforDO();
			inforDO.setWatersId(id);
			inforDO.setParamId(i);
			List<WaterParamItem> list = new ArrayList<>();
			List<WaterInformationDTO> tags = waterService.getWatersParamInformation(inforDO);
			for (WaterInformationDTO tag : tags) {
				WaterParamItem item = new WaterParamItem();
				item.setAdminId(tag.getAdminId());
				item.setAlarmMax(tag.getAlarmMax());
				item.setAlarmMin(tag.getAlarmMin());
				item.setArea(tag.getArea());
				item.setChinese(tag.getChinese());
				item.setCurvePoints(tag.getCurvePoints());
				item.setEnglish(tag.getEnglish());
				item.setGmtCreate(DateUtil.formatDate(tag.getGmtCreate(), DateUtil.DATE_FORMAT_YMDHMS));
				item.setId(tag.getId());
				item.setLocation(tag.getLocation());
				item.setName(tag.getName());
				item.setParamId(i);
				item.setParam(tag.getParam());
				item.setParamValue(tag.getParamValue());
				item.setScopeMax(tag.getScopeMax());
				item.setScopeMin(tag.getScopeMin());
				item.setUnit(tag.getUnit());
				item.setUse(tag.getUse());
				list.add(item);
			}
			WaterParamListItem paramList = new WaterParamListItem();
			paramList.setItems(list);
			waterList.add(paramList);
		}	
		model.setListItems(waterList);
		return model;
		
	}
	public WaterInformationListItem getWaterInformation(Integer id) {
		WaterInformationListItem model = new WaterInformationListItem();
		
		int count = waterService.getWatersParamCount();
		List<WaterInformationModel> list = new ArrayList<>();
		for(int i = 1; i<=count; i++) {
			WaterQualityInforDO inforDO = new WaterQualityInforDO();
			inforDO.setParamId(i);
			inforDO.setWatersId(id);
			WaterInformationDTO dto = waterService.getWaterInformation(inforDO);
			if(dto!=null) {
				WaterInformationModel item = new WaterInformationModel();
				item.setAdminId(dto.getAdminId());
				item.setAlarmMax(dto.getAlarmMax());
				item.setAlarmMin(dto.getAlarmMin());
				item.setArea(dto.getArea());
				item.setChinese(dto.getChinese());
				item.setCurvePoints(dto.getCurvePoints());
				item.setEnglish(dto.getEnglish());
				item.setGmtCreate(DateUtil.formatDate(dto.getGmtCreate(), DateUtil.DATE_FORMAT_YMDHMS));
				item.setId(dto.getId());
				item.setLocation(dto.getLocation());
				item.setName(dto.getName());
				item.setParam(dto.getParam());
				item.setParamValue(dto.getParamValue());
				item.setScopeMax(dto.getScopeMax());
				item.setScopeMin(dto.getScopeMin());
				item.setUnit(dto.getUnit());
				item.setUse(dto.getUse());
				list.add(item);
			}	
		}
		model.setList(list);
		
	/*	if (dto==null) {
			model.setCode(HttpCodeEnum.ERROR.getCode());
			model.setCode("无这片水域信息");
			return model;
		}*/
	
		return model;	
	}
}
