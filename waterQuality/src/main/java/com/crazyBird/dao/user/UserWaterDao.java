package com.crazyBird.dao.user;

import com.crazyBird.dao.user.dataobject.AddUserDO;
import com.crazyBird.dao.user.dataobject.UserWaterDO;
import com.crazyBird.dao.user.dataobject.UserWaterLoginDO;

public interface UserWaterDao {

	UserWaterLoginDO selet(UserWaterDO user);

	void insert(AddUserDO waterUser);

}
