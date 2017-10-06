package com.niit.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.categoryDao;
import com.niit.model.category;

public class categoryTest
{
	private static categoryDao categoryDao;

	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ConfigApplnContext=new AnnotationConfigApplicationContext();
		ConfigApplnContext.scan("com.niit");
		ConfigApplnContext.refresh();
		
		categoryDao=(categoryDao)ConfigApplnContext.getBean("categoryDao");
	}

	@Test
	public void addcategoryTest()
	{
		category category=new category();
		category.setCatId(1001);
		category.setCatName("mobile");
		category.setCatDesc("smart mobile");
		
		categoryDao.addcategory(category);
	}
	
	
	
	@Test
	public void updatecategoryTest()
	{
		category category=new category();
		category.setCatId(1001);
		category.setCatName("mobile");
		category.setCatDesc("smart mobile");
		
		categoryDao.addcategory(category);
	}

	
	@Test
	public void retriveCategoryTest()
	{
		List <category> listcategory=categoryDao.retrievecategory();
		assertNotNull("problem in retriving",listcategory);
		this.show(listcategory);	
	}
	
	public void show(List<category> listcategory)
	{
		for(category category:listcategory)
		{
	System.out.println("category iD:"+category.getCatId());
	System.out.println("category name:"+category.getCatName());
		}
	
}
}
