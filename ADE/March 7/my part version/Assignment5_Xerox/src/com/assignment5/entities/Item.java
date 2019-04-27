/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author kasai
 */
public class Item {
    
    int itemId;
    int salesId;
    int customerId;
    
    int productId;
    int salesPrice;
    int quantity;
    
    String market;

    public Item(int itemId,int salesId, int customerId, int productId, int salesPrice, int quantity, String market) {
        this.itemId = itemId;
        this.salesId = salesId;
        this.customerId = customerId;
        this.productId = productId;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
        this.market = market;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    
    
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }
    
}
