package com.crazyBird.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.controller.user.model.AddUserModel;
import com.crazyBird.controller.user.model.UserListModel;
import com.crazyBird.controller.user.model.UserWaterLoginModel;
import com.crazyBird.controller.user.param.AddUserParam;
import com.crazyBird.controller.user.param.UserWaterParam;
import com.crazyBird.controller.user.param.userListPageParam;
import com.crazyBird.dao.user.dataobject.AddUserDO;
import com.crazyBird.dao.user.dataobject.UserWaterDO;
import com.crazyBird.dao.user.dataobject.UserWaterLoginDO;
import com.crazyBird.model.enums.HttpCodeEnum;
import com.crazyBird.service.user.UserWaterService;
import com.crazyBird.utils.PageUtils;
import com.crazyBird.service.base.ResponseDO;

@Component
public class UserProcess {

	@Autowired
	private UserWaterService userWaterService;
	
	public UserWaterLoginModel login(UserWaterParam param) {
		UserWaterLoginModel model = new UserWaterLoginModel();
		UserWaterDO user = new UserWaterDO();
		user.setUserName(param.getUserName());
		user.setPassword(param.getPassword());
		ResponseDO<UserWaterLoginDO> result = userWaterService.login(user);
		if(!result.isSuccess()) {
			model.setCode(HttpCodeEnum.ERROR.getCode());
			model.setMessage(result.getMessage());
		}
		UserWaterLoginDO waterUser = result.getDataResult();
		model.setUserID(waterUser.getUserId());
		model.setMessage(result.getMessage());
		model.setUserName(waterUser.getUserName());
		model.setJurisdiction(waterUser.getJurisdiction());
		return model;
	}

	public AddUserModel addUser(AddUserParam param) {
		AddUserModel model = new AddUserModel();
		AddUserDO waterUser = new AddUserDO();
		waterUser.setUserName(param.getUserName());
		waterUser.setPassword(param.getPassword());
		waterUser.setJurisdiction(param.getJurisdiction());
		ResponseDO<Long> result = userWaterService.addUser(waterUser);
		if(!result.isSuccess()) {
			model.setCode(HttpCodeEnum.ERROR.getCode());
			model.setMessage(result.getMessage());
			return model;
		}
		model.setResult(result.getDataResult());
		model.setMessage("添加成功");
		return model;
	}

	public UserListModel getUserList(userListPageParam param) {
		UserListModel model = new UserListModel();
		PageUtils.resetPageParam(param);
		return model;
	}

}
