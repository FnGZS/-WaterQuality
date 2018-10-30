package com.crazyBird.dao.water;

import java.util.List;

import com.crazyBird.dao.water.dataobject.WaterInforInsertDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDO;
import com.crazyBird.dao.water.dataobject.WaterInformationDTO;
import com.crazyBird.dao.water.dataobject.WaterQualityInforDO;

public interface WaterQualityInformationDao {
	//得到水域最近的一次水质数据
	WaterInformationDTO getWaterInformation(WaterQualityInforDO inforDO);
		
	//提交数据
	void insertWaterInformation(List<WaterInforInsertDO> list);
	
	//获得某个参数近10个值
	List<WaterInformationDTO> getWatersParamInformation(WaterQualityInforDO inforDO);
	
	List<WaterInformationDTO> getWatersParamAllInformation(WaterQualityInforDO inforDO);

}
