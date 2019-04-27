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
public class Product {
    
    private int productId;
    private int minPrice;
    private List<Item> items;


    public Product(int productId, int minPrice) {
        this.productId = productId;
        this.minPrice = minPrice;
        this.items = new ArrayList<>();
    }




    
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }
    
    
    
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    
    
}
