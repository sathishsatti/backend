package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDao;
import com.niit.model.category;

public class categoryTest
{
	private static CategoryDao categoryDao;

	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ConfigApplnContext=new AnnotationConfigApplicationContext();
		ConfigApplnContext.scan("com.niit.*");
		ConfigApplnContext.refresh();
		System.out.println("getting DAO instance");
		categoryDao=(CategoryDao)ConfigApplnContext.getBean("categoryDao");
	}

	@Test
	public void addcategoryTest()
	{
		category category=new category();
		category.setCatId(1001);
		category.setCatName("mobile");
		category.setCatDesc("smart mobile");
		
		assertTrue(categoryDao.addcategory(category));
	}
	
	
	
}
