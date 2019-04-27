/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rachelwang
 */
public class DataStore {
    
    private static DataStore dataStore;


    

    private Map<Integer, SalesPerson> salesPerson;
    private Map<Integer, Customer> customer;
    private Map<Integer, Order> orders;
    
    private Map<Integer, Product> product;
    private Map<Integer, Item> item;

    
    
    
    public DataStore() {
        this.customer = new HashMap<>();
        this.item = new HashMap<>();
        this.orders = new HashMap<>();
        this.product = new HashMap<>();
        this.salesPerson = new HashMap<>();
               
    }
    
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
        
    }
    
    
    
    
    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, SalesPerson> getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(Map<Integer, SalesPerson> salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Map<Integer, Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Map<Integer, Customer> customer) {
        this.customer = customer;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Product> getProduct() {
        return product;
    }

    public void setProduct(Map<Integer, Product> product) {
        this.product = product;
    }

    public Map<Integer, Item> getItem() {
        return item;
    }

    public void setItem(Map<Integer, Item> item) {
        this.item = item;
    }

    
}
