package com.crazyBird.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.controller.user.model.UserWaterLoginModel;
import com.crazyBird.controller.user.param.UserWaterParam;
import com.crazyBird.dao.user.dataobject.UserWaterDO;
import com.crazyBird.dao.user.dataobject.UserWaterLoginDO;
import com.crazyBird.model.enums.HttpCodeEnum;
import com.crazyBird.service.user.UserWaterService;
import com.crazyBird.service.base.ResponseDO;

@Component
public class UserProcess {

	@Autowired
	private UserWaterService userWaterService;
	
	public UserWaterLoginModel login(UserWaterParam param) {
		UserWaterLoginModel model = new UserWaterLoginModel();
		UserWaterDO user = new UserWaterDO();
		user.setUserId(param.getUserId());
		user.setPassword(param.getPassword());
		ResponseDO<UserWaterLoginDO> result = userWaterService.login(user);
		if(!result.isSuccess()) {
			model.setCode(HttpCodeEnum.ERROR.getCode());
			model.setMessage(result.getMessage());
		}
		UserWaterLoginDO waterUser = result.getDataResult();
		model.setMessage(result.getMessage());
		model.setUserName(waterUser.getUserName());
		model.setJurisdiction(waterUser.getJurisdiction());
		return model;
	}

}
