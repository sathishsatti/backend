package com.niit.daoimpl;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.categoryDao;
import com.niit.model.category;

public class CategoryDaoImpl implements categoryDao
{


@Autowired
public boolean addcategory(Category category)
{
return false;	
}
@Autowired
 public List<Category> retrieveCategory()
 {
	 return null;
 }
@Autowired
 public boolean deletecategory(Category category)
 {
 return false;	
 }
public Category getCategory(int catId) {
	// TODO Auto-generated method stub
	return null;
}
public boolean updatecategory(Category category) {
	// TODO Auto-generated method stub
	return false;
}
public boolean addcategory(category category) {
	// TODO Auto-generated method stub
	return false;
}
public List<category> retrievecategory() {
	// TODO Auto-generated method stub
	return null;
}
@Transactional
@Override
public boolean deletecategory(category category) {
	// TODO Auto-generated method stub
	return false;
}
public category getcategory(int catId) {
	// TODO Auto-generated method stub
	return null;
}
public boolean updatecategory(category category) {
	// TODO Auto-generated method stub
	return false;
}
}
