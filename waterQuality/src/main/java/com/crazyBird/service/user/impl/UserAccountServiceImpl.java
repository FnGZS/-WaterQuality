package com.crazyBird.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crazyBird.dao.user.UserLoginDao;
import com.crazyBird.dao.user.dataobject.UserDO;
import com.crazyBird.dao.user.dataobject.UserLoginDO;
import com.crazyBird.service.base.ResponseCode;
import com.crazyBird.service.base.ResponseDO;
import com.crazyBird.service.user.UserAccountService;

/**
 * @author zzc
 *
 */
@Component("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {
	@Autowired
	private UserLoginDao loginDao;
	
	@Override
	public ResponseDO<UserDO> getUserLogin(UserLoginDO loginDO) {
		// TODO Auto-generated method stub
		ResponseDO<UserDO> response = new ResponseDO<>();
		response.setDataResult(loginDao.getLoginAccount(loginDO));
		if(response.getDataResult()==null) {
			response.setCode(ResponseCode.ERROR);
			response.setMessage("账号或密码错误");
		}
		return response;
	}

	
}
