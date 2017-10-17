package com.niit.test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.config.DBconfig;
import com.niit.dao.UserDAO;
import com.niit.model.User;

@ComponentScan("com.spring.model")


public class AppTest {


	private static final User user = null;
	@Autowired
	private static UserDAO userDAO;
	

@SuppressWarnings("resource")
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.*");
	context.register(DBconfig.class);
	context.refresh();
	
	//user = (User) context.getBean("user");
	userDAO = (UserDAO) context.getBean("userDAO");
}


@org.junit.Test
public void saveUser()
{
	boolean flag=userDAO.saveUser(user);
	assertEquals("createUser", true, flag);

}



}