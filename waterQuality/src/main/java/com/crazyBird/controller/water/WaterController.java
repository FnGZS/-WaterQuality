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
import com.crazyBird.controller.water.model.WaterParamModel;
import com.crazyBird.controller.water.model.WaterQualityParamModel;
import com.crazyBird.controller.water.param.WaterInforParam;
import com.crazyBird.controller.water.param.WaterInformationCreateParam;
import com.crazyBird.controller.water.param.WaterInformationParam;
import com.crazyBird.controller.water.param.WaterQualityAddParam;

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
	//获取多个水域最近的一次数据
	@RequestMapping(value = "/getInfor",method = RequestMethod.GET)
	@ResponseBody
	public WaterInformationListModel getWaterInformation() {
		return waterProcess.getWaterInformation();
		//return waterProcess.getWaterInformation();
	}
	//获取某个水域每个参数近五条的信息
	@RequestMapping(value = "/getInforByWaters/{id}",method = RequestMethod.POST)
	@ResponseBody
	public WaterParamListModel getWaterInformationByWaters(Integer id) {
		return waterProcess.getWaterInformationByWaters(id);
	}
	//获取参数全部信息
	@RequestMapping(value = "/getInforByParam",method = RequestMethod.GET)
	@ResponseBody
	public WaterParamListItem getWaterInformationByParam(WaterInforParam param) {
		return waterProcess.getWaterInformationByParam(param);
	}
	//添加水质参数，设置报警上下限
	@RequestMapping(value = "/addParam",method = RequestMethod.POST)
	@ResponseBody
	public SimpleFlagModel addWaterParam(@RequestBody WaterQualityAddParam param) {	
		return waterProcess.addWaterParam(param);
	}
	//更新水质参数
	@RequestMapping(value = "/updateParam",method = RequestMethod.PUT)
	@ResponseBody
	public SimpleFlagModel updateWaterParam(@RequestBody WaterQualityAddParam param) {
		return waterProcess.updateWaterParam(param);	
	}
	//得到水质参数列表
	@RequestMapping(value = "/getParam",method = RequestMethod.GET)
	@ResponseBody
	public WaterParamModel getWaterParam() {
		return waterProcess.getWaterParam();
	}
	//得到某个水质参数的详细参数
	@RequestMapping(value = "/getParam/{id}",method = RequestMethod.GET)
	@ResponseBody
	public WaterQualityParamModel getWaterParamDetail(@PathVariable Integer id) {
		return waterProcess.getWaterParamDetail(id);
	}
	//删除某个水质参数
	@RequestMapping(value = "/deleteParam/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public SimpleFlagModel deteleWaterParam(@PathVariable Integer id) {
		return waterProcess.deteleWaterParam(id);
	}
	//添加某个水域
	@RequestMapping(value = "/addWater",method = RequestMethod.POST)
	@ResponseBody
	public SimpleFlagModel addWaters(@RequestBody WaterInformationParam param) {
		
		return waterProcess.addWaters(param);
		
	}
	//修改某个水域
	@RequestMapping(value = "/updateWater",method = RequestMethod.PUT)
	@ResponseBody
	public SimpleFlagModel updateWaters(@RequestBody WaterInformationParam param) {
		return waterProcess.updateWaters(param);
		
	}
	//删除某个水域
	@RequestMapping(value = "/deleteWater/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public SimpleFlagModel deleteWaters(@PathVariable Integer id) {
		return waterProcess.deleteWaters(id);
		
	}
	
}
