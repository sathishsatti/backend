package com.niit.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;

public class SupplierDaos implements SupplierDao
{

	@Autowired
	public boolean addSupplier(Supplier supplier)
	{
	return false;	
	}
	@Autowired
	 public List<Supplier> retrieveSupplier()
	 {
		 return null;
	 }
	@Autowired
	 public boolean deleteSupplier(Supplier supplier)
	 {
	 return false;	
	 }
	public Supplier getSupplier(int supId) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addsupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<Supplier> retrievesupplier() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean deletesupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
	public Supplier getsupplier(int supId) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean updatesupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
}
