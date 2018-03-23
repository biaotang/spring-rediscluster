package com.develop.redis;

import com.develop.redis.model.User;

public interface UserDAO {

	User getUser(long id);
	
	void saveUser(User user);
	
}
