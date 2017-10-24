package com.niit.model;
 
import javax.persistence.*;

import org.springframework.stereotype.Component;
 
@Entity
@Component
public class Category 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int catId;
     
    String catName,catDesc;
 
    public int getCatId() {
        return catId;
    }
 
    public void setCatId(int catId) {
        this.catId = catId;
    }
 
    public String getCatName() {
        return catName;
    }
 
    public void setCatName(String catName) {
        this.catName = catName;
    }
 
    public String getCatDesc() {
        return catDesc;
    }
 
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }
     
     
}