package com.niit.dao;
import java.util.List;
import com.niit.model.category;

public interface categoryDao
{
	public boolean addcategory(category category);
	public List<category>retrievecategory();
	public boolean deletecategory(category category);
	public category getcategory(int catId);
	public boolean updatecategory(category category);
}


