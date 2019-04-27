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
public class Customer {
    
    private int customerId;
    private int itemId;
    private int productId;
    private int salesPrice;
    private String market;

    private List<Item> item;





    public Customer(int customerId, int itemId, int productId, int salesPrice, String market){
        this.customerId = customerId;
        this.itemId = itemId;
        this.productId = productId;
        this.salesPrice = salesPrice;
        this.market = market;
        
        this.item = new ArrayList<>();
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
     public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
        public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }


    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
    
    
    
}
