package com.niit.daoimpl;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDao;
import com.niit.model.category;

@Repository("categoryDao")
public  class CategoryDaoImpl implements CategoryDao
{


    @Autowired
    SessionFactory sessionFactory;

    @Transactional
	@Override
	public boolean addcategory(category category) {
		 try
	        {
	        Session session=sessionFactory.getCurrentSession();
	        session.save(category);
	        return true;
	        }
	        catch(Exception e)
	        {
	        return false;
	        }
	}

	@Override
	public List<category> retrievecategory()
	{
		 Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from Category");
	        List<category> listCategory=query.getResultList();
	        session.close();
	        return listCategory;
	}

	@Override
	public boolean deletecategory(category category) {
		try
        {
        Session session=sessionFactory.getCurrentSession();
        session.delete(category);
        return true;
        }
        catch(Exception e)
        {
        System.out.println("Exception Arised:"+e);  
        return false;
        }
	}

	@Override
	public category getcategory(int catId) {

        Session session=sessionFactory.openSession();
        category category=(category)session.get(category.class,catId);
        session.close();
        return category;
	}
	@Transactional
	@Override
	public boolean updatecategory(category category) {

        try
        {
        sessionFactory.getCurrentSession().saveOrUpdate(category);
        return true;
        }
        catch(Exception e)
        {
        System.out.println("Exception Arised:"+e);
        return false;
        }
	}
    
   
}