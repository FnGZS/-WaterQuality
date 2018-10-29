package com.crazyBird.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.dao.user.UserWaterDao;
import com.crazyBird.dao.user.dataobject.AddUserDO;
import com.crazyBird.dao.user.dataobject.UserWaterDO;
import com.crazyBird.dao.user.dataobject.UserWaterLoginDO;
import com.crazyBird.service.base.ResponseCode;
import com.crazyBird.service.base.ResponseDO;
import com.crazyBird.service.user.UserWaterService;

@Component("UserWaterService")
public class UserWaterServiceImpl implements UserWaterService {

	@Autowired
	private UserWaterDao userWaterDao;
	
	@Override
	public ResponseDO<UserWaterLoginDO> login(UserWaterDO user) {
		ResponseDO<UserWaterLoginDO> response = new ResponseDO<>();
		UserWaterLoginDO userWater = userWaterDao.selet(user);
		if(userWater != null) {
			response.setDataResult(userWater);
			response.setMessage("登录成功");
			return response;
		}
		response.setCode(ResponseCode.ERROR);
		response.setMessage("登录失败");
		return response;
	}

	@Override
	public ResponseDO<Long> addUser(AddUserDO waterUser) {
		ResponseDO<Long> response = new ResponseDO<>();
		UserWaterDO user = new UserWaterDO();
		user.setUserName(waterUser.getUserName());
		user.setPassword(waterUser.getPassword());
		UserWaterLoginDO userWater = userWaterDao.selet(user);
		if(userWater == null) {		
			userWaterDao.insert(waterUser);
			response.setDataResult((long) 1);
			return response;
		}
		response.setCode(ResponseCode.ERROR);
		response.setMessage("账号已存在");
		return response;
	}

}
