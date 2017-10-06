package com.niit.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDAO;
import com.niit.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory SessionFactory;
	
	public UserDAOImpl(SessionFactory SessionFactory) {
	this.SessionFactory=SessionFactory;
	}

	public boolean saveUser(User user) {
	
		
		Session session=SessionFactory.openSession();
		session.saveOrUpdate(user);
		Transaction tx=session.beginTransaction();
		tx.commit();
	    return true;
	}

}
