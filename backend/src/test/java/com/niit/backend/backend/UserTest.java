package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.UserDao;
import com.niit.backend.model.User;

public class UserTest {
	
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
        UserDao userDao = (UserDao) context.getBean("userDaoimpl");
        User user = (User) context.getBean("user");
      user.setEmail("jithu108@gmail.com");
      user.setName("jithu");
      user.setPassword("jithu");
      user.setMobile("9600292813");
      user.setRole("ROLE_USER");
      user.setAddress("chennai");
      user.setZipCode(629158);
     user.setEnabled(true);
    userDao.saveorupdate(user);
    
        
		 System.out.println( "Details are created successfully");
	}

}
