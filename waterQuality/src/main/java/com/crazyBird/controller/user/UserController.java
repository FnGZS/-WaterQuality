package com.crazyBird.controller.user;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crazyBird.controller.user.model.AddUserModel;
import com.crazyBird.controller.user.model.UserListModel;
import com.crazyBird.controller.user.model.UserWaterLoginModel;
import com.crazyBird.controller.user.param.AddUserParam;
import com.crazyBird.controller.user.param.UserWaterParam;
import com.crazyBird.controller.user.param.userListPageParam;

@Controller
@RequestMapping("/userWater")
public class UserController {
	
	@Autowired
	private UserProcess userProcess;
	
	
	/**
	 * 用户列表
	 * @param
	 * @return
	 * **/
	@RequestMapping(value = "/user/list", method = RequestMethod.POST)
	@ResponseBody
	public UserListModel userList(userListPageParam param) throws UnsupportedEncodingException{
		if (StringUtils.isNotBlank(param.getKey())) {
			String key = new String(param.getKey().getBytes("iso-8859-1"), "utf-8");
			param.setKey(key);
		}
		return userProcess.getUserList(param);
	}
	
	/**
	 * 登录
	 * @param
	 * @return
	 * */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public UserWaterLoginModel login(@RequestBody UserWaterParam param) {
	    	return userProcess.login(param);
	}
	
	/**
	 * 添加
	 * @param
	 * @return
	 * **/
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ResponseBody
	public AddUserModel addUser(@RequestBody AddUserParam param) {
		return userProcess.addUser(param);
	}
	
}
