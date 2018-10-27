package com.crazyBird.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crazyBird.controller.user.model.UserWaterLoginModel;
import com.crazyBird.controller.user.param.UserWaterParam;

@Controller
@RequestMapping("/userWater")
public class UserController {
	
	@Autowired
	private UserProcess userProcess;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public UserWaterLoginModel login(@RequestBody UserWaterParam param) {
	    	return userProcess.login(param);
	}
}
