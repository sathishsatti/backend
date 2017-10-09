package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao
{


    @Autowired
    SessionFactory sessionFactory;
    
    @Transactional
	@Override
	public boolean addProduct(Product product) {
		 try
	        {
	            sessionFactory.getCurrentSession().save(product);
	            return true;
	        }
	        catch(Exception e)
	        {
	        return false;
	        }
	}

	@Override
	public boolean deleteProduct(Product product) {
		 try
	        {
	            sessionFactory.getCurrentSession().save(product);
	            return true;
	        }
	        catch(Exception e)
	        {
	        return false;
	        }
	}

	@Override
	public List<Product> retrieveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProduct(int productid) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	
}
