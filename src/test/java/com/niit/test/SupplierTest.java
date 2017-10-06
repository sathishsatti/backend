package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;

public class SupplierTest
{

	private static SupplierDao supplierDao;

	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ConfigApplnContext=new AnnotationConfigApplicationContext();
		ConfigApplnContext.scan("com.niit");
		ConfigApplnContext.refresh();
		
		supplierDao=(SupplierDao)ConfigApplnContext.getBean("SupplierDao");
	}

	@Test
	public void addcategoryTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupId(1001);
		supplier.setSupname("mobile");
		supplier.setSupaddress("smart mobile");
		
		supplierDao.addSupplier(supplier);
	}
	
	
	
	@Test
	public void updatesupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupId(1001);
		supplier.setSupname("mobile");
		supplier.setSupaddress("smart mobile");
		
		supplierDao.addSupplier(supplier);
	}

	
	@Test
	public void retrivesupplierTest()
	{
		List <Supplier> listsupplier=supplierDao.retrieveSupplier();
		assertNotNull("problem in retriving",listsupplier);
		this.show(listsupplier);	
	}
	
	public void show(List<Supplier> listsupplier)
	{
		for(Supplier supplier:listsupplier)
		{
	System.out.println("supplier iD:"+supplier.getSupId());
	System.out.println("supplier name:"+supplier.getSupname());
		}
	
}
}
