package com.crazyBird.controller.water;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crazyBird.controller.base.SimpleFlagModel;
import com.crazyBird.controller.water.model.WaterInformationListModel;
import com.crazyBird.controller.water.model.WaterInformationModel;
import com.crazyBird.controller.water.model.WaterParamListItem;
import com.crazyBird.controller.water.model.WaterParamListModel;
import com.crazyBird.controller.water.param.WaterInforParam;
import com.crazyBird.controller.water.param.WaterInformationCreateParam;

@Controller
@RequestMapping("/water")
public class WaterController {
	@Autowired
	private WaterProcess waterProcess;
	//提交检测信息
	@RequestMapping(value = "/createInfor",method = RequestMethod.POST)
	@ResponseBody
	public SimpleFlagModel createWaterInformation(@RequestBody WaterInformationCreateParam param) {
		return waterProcess.createWaterInformation(param);
	}
	/*//获取单个水域最近的一条数据
	@RequestMapping(value = "/getInfor/{id}",method = RequestMethod.GET)
	@ResponseBody
	public WaterInformationModel getWaterInformationById(@PathVariable Integer id) {
		return waterProcess.getWaterInformation(id);
	}*/
	
	//获取多个水域最近的一次数据
	@RequestMapping(value = "/getInfor",method = RequestMethod.GET)
	@ResponseBody
	public WaterInformationListModel getWaterInformation() {
		return waterProcess.getWaterInformation();
		//return waterProcess.getWaterInformation();
	}
	//获取某个水域每个参数近十条的信息
	@RequestMapping(value = "/getInforByWaters/{id}",method = RequestMethod.GET)
	@ResponseBody
	public WaterParamListModel getWaterInformationByWaters(@PathVariable Integer id) {
		return waterProcess.getWaterInformationByWaters(id);
	}
	//
	@RequestMapping(value = "/getInforByParam",method = RequestMethod.POST)
	@ResponseBody
	public WaterParamListItem getWaterInformationByParam(@RequestBody WaterInforParam param) {
		return waterProcess.getWaterInformationByParam(param);
	}
	
}
