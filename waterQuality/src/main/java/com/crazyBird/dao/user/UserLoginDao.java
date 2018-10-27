package com.crazyBird.dao.user;


import com.crazyBird.dao.user.dataobject.UserDO;
import com.crazyBird.dao.user.dataobject.UserLoginDO;
import com.crazyBird.service.base.ResponseDO;


public interface UserLoginDao {
	UserDO getLoginAccount(UserLoginDO userLoginDO);
}
