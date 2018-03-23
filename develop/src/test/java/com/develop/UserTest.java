package com.develop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.develop.redis.UserDAO;
import com.develop.redis.model.User;

/**
 * Unit test for simple App.
 */
public class UserTest {
	
    @Test
    public void userInfo(){
    	ApplicationContext ac = new ClassPathXmlApplicationContext(new ClassPathResource("/application-context.xml").getPath());
    	UserDAO userDAO = (UserDAO)ac.getBean("userDAO");
    	User user1 = new User();
    	user1.setId(1);
    	user1.setName("chuanpu");
    	userDAO.saveUser(user1);
    	User user2 = userDAO.getUser(1);
    	System.out.println(user2.getName());
    }
    
}
