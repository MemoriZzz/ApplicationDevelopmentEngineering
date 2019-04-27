/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
public class SalesPerson {
    
    private int salesId;
    private List<Item> item;

    public SalesPerson(int salesId) {
        this.salesId = salesId;
        this.item = new ArrayList<>();
    }
    
    

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
    
    
    
}
