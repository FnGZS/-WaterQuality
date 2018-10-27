package com.crazyBird.service.user;


import com.crazyBird.dao.user.dataobject.UserDO;
import com.crazyBird.dao.user.dataobject.UserLoginDO;
import com.crazyBird.service.base.ResponseDO;


public interface UserAccountService {
	
	ResponseDO<UserDO> getUserLogin(UserLoginDO loginDO);
	
}
