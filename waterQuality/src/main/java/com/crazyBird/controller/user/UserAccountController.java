package com.crazyBird.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crazyBird.controller.base.SimpleFlagModel;
import com.crazyBird.controller.user.model.UserModel;
import com.crazyBird.controller.user.param.UserLoginParam;
import com.mysql.fabric.xmlrpc.base.Array;




/**
 *
 * @author zhengzc
 *
 */
@Controller
@RequestMapping("/userAccout")
public class UserAccountController {
	@Autowired
	private UserAccountProcess userAccountProcess;
	
	/**
	 * 登陆
	* @param test
	* @return
	*/
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public UserModel login(@RequestBody UserLoginParam param) {
	    	return userAccountProcess.login(param);
	}
	
}
