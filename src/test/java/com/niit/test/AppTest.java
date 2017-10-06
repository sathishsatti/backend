package com.niit.test;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.dao.UserDAO;
import com.niit.hibernateConfig.DataBaseConfig;

@ComponentScan("com.spring.model")
public class AppTest {


	@SuppressWarnings("unused")
	@Autowired
	private static UserDAO userDAO;
	

@SuppressWarnings("resource")
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.*");
	context.register(DataBaseConfig.class);
	context.refresh();
	
///	user = (User) context.getBean("user");
	userDAO = (UserDAO) context.getBean("userDAO");
}

/*
@org.junit.Test
public void saveUser()
{


	
	
	
	boolean flag=userDAO.saveUser(user);
	assertEquals("createUser", true, flag);

}

*/

}