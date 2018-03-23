package redis;

import redis.model.User;

public interface UserDAO {

	User getUser(long id);
	
	void saveUser(User user);
	
}
