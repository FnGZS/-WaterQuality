package com.crazyBird.service.user;


import com.crazyBird.dao.user.dataobject.AddUserDO;
import com.crazyBird.dao.user.dataobject.UserWaterDO;
import com.crazyBird.dao.user.dataobject.UserWaterLoginDO;
import com.crazyBird.service.base.ResponseDO;

public interface UserWaterService {

	ResponseDO<UserWaterLoginDO> login(UserWaterDO user);

	ResponseDO<Long> addUser(AddUserDO waterUser);

	
}
