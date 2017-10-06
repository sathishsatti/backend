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
public String getSupaddress() {
	return supaddress;
}
public void setSupaddress(String supaddress) {
	this.supaddress = supaddress;
}
String supname,supaddress;

}
