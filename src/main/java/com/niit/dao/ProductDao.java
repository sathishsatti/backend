package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao
{
public boolean addProduct (Product product);
public boolean deleteProduct(Product product);
public List<Product>retrieveProduct();
public boolean updateProduct(Product product);
public Product getProduct(int productid);
public Product getItem(int id);

	
	
}
