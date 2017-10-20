package com.niit.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;

@Repository("SupplierDao")
public class SupplierDaoimpl implements SupplierDao
{

		@Autowired
	    SessionFactory sessionFactory;
	@Transactional
	@Override
	public boolean addSupplier(Supplier supplier)
	{
		try
        {
            sessionFactory.getCurrentSession().save(supplier);
            return true;
        }
        catch(Exception e)
        {
        return false;
        }
	}

	@Override
	public List<Supplier> retrieveSupplier() 
	{
		Session session=sessionFactory.openSession();
        Query query=session.createQuery("from Supplier");
        List<Supplier> listsupplier=query.list();
        session.close();
        return listsupplier;
	}

	@Override
	public boolean deleteSupplier(Supplier supplier) 
	{
		try
        {
        Session session=sessionFactory.getCurrentSession();
        session.delete(supplier);
        return true;
        }
        catch(Exception e)
        {
        System.out.println("Exception Arised:"+e);  
        return false;
        }
	}

	@Override
	public Supplier getSupplier(int supplierId)
	{
		 Session session=sessionFactory.openSession();
	        Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
	        session.close();
	        return supplier;
	}
	@Transactional
	@Override
	public boolean updateSupplier(Supplier supplier)
	{
		try
        {
        sessionFactory.getCurrentSession().saveOrUpdate(supplier);
        return true;
        }
        catch(Exception e)
        {
        System.out.println("Exception Arised:"+e);
        return false;
        }
	}

	
	
}
