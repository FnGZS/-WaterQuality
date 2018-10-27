package com.crazyBird.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.dao.user.UserWaterDao;
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

}
