package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;
import com.niit.model.Supplier;

@Ignore
public class SupplierTest
{/*

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

	@Ignore
	  @Test
	    public void addSupplierTest()
	    {
	        Supplier supplier=new Supplier();
	        supplier.setSupId(1001);
	        supplier.setSupname("Desktop");
	        supplier.setSupAddress("all kinds of desktops ");
	         
	        assertTrue(supplierDao.addSupplier(supplier));
	    }
	     
	    @Ignore
	    @Test
	    public void updateSupplierTest()
	    {
	        Supplier supplier=new Supplier();
	        supplier.setSupId(1001);
	        supplier.setSupname("JMShirt");
	        supplier.setSupAddress("John Miller Shirt with Best Price");
	         
	        assertTrue(supplierDao.updateSupplier(supplier));
	    }
	   @Ignore
	    @Test
	    public void deleteSupplierTest()
	    {
	        Supplier supplier=new Supplier();
	        supplier.setSupId(1001);
	        assertTrue(supplierDao.deleteSupplier(supplier));
	    }
	   
	  
	@Ignore
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
	
}*/
}
