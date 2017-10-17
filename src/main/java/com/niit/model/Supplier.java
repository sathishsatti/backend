package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {
@Id
int supId;
public int getSupId() {
	return supId;
}
public void setSupId(int supId) {
	this.supId = supId;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}


String supname,supAddress;
public String getSupAddress() {
	return supAddress;
}
public void setSupAddress(String supAddress) {
	this.supAddress = supAddress;
}

}
