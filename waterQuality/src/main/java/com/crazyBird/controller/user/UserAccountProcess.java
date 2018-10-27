package com.crazyBird.controller.user;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.controller.user.model.UserModel;
import com.crazyBird.controller.user.param.UserLoginParam;
import com.crazyBird.dao.user.dataobject.UserDO;
import com.crazyBird.dao.user.dataobject.UserLoginDO;
import com.crazyBird.model.enums.HttpCodeEnum;
import com.crazyBird.service.base.ResponseDO;
import com.crazyBird.service.user.UserAccountService;
@Component
public class UserAccountProcess {
	@Autowired
	private UserAccountService userAccountService;
	public UserModel login(UserLoginParam param) {
		UserModel model = new UserModel();
		if(StringUtils.isBlank(param.getLoginAccount())||StringUtils.isBlank(param.getPassword())) {
			model.setCode(HttpCodeEnum.ERROR.getCode());
			model.setCode("账号或密码不能为空");
			return model;
		}
		UserLoginDO loginDO = new UserLoginDO();
		loginDO.setLoginAccount(param.getLoginAccount());
		loginDO.setPassword(param.getPassword());
		ResponseDO<UserDO> response = userAccountService.getUserLogin(loginDO);
		if(!response.isSuccess()) {
			model.setCode(HttpCodeEnum.ERROR.getCode());
			model.setMessage(response.getMessage());
		}
		else {
			model.setUserId(response.getDataResult().getId());
			model.setUserName(response.getDataResult().getUserName());
			model.setLoginAccount(response.getDataResult().getLoginAccount());
		}
		 return model;
	}
}
