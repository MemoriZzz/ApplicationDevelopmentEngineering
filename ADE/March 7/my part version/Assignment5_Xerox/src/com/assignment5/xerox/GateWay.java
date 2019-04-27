/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Product;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    DataReader itemReader;
    DataReader productReader;
    AnalysisHelper helper;

    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        itemReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
    }
    
    
    
    public static void main(String args[]) throws IOException{
        GateWay inst = new GateWay();
        inst.readData();

    /* 
        DataGenerator generator = DataGenerator.getInstance();
        
        //Below is the sample for how you can use reader. you might wanna delete it once you understood.
        
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        String[] orderRow;
        printRow(orderReader.getFileHeader());
        while((orderRow = orderReader.getNextRow()) != null){
            printRow(orderRow);
        }
        System.out.println("_____________________________________________________________");
        DataReader productReader = new DataReader(generator.getProductCataloguePath());
        String[] prodRow;
        printRow(productReader.getFileHeader());
        while((prodRow = productReader.getNextRow()) != null){
            printRow(prodRow);
        }
        
    */
    }
    
    
    private void readData() throws IOException{
        String[] row;
        while((row = productReader.getNextRow()) != null){
            generateProduct(row);
        } 
        
        while((row = itemReader.getNextRow()) != null){
            Item item = generateItem(row);
            generateCustomer(row, item);
            
        }
        
        runAnalysis();
    }
    
    private void generateProduct(String[] row){
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        
        Product p = new Product(productId,minPrice);
        DataStore.getInstance().getProduct().put(productId, p);
       

    }
    
    
    private Item generateItem(String[] row){
        int itemId = Integer.parseInt(row[1]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int productId = Integer.parseInt(row[2]);
        int salesPrice = Integer.parseInt(row[6]);
        int quantity = Integer.parseInt(row[3]);
        String market = row[7];
        
        Item i = new Item(itemId, salesId, customerId, productId, salesPrice, quantity, market);
        DataStore.getInstance().getItem().put(itemId, i);
        
        Map<Integer, Product> products = DataStore.getInstance().getProduct();
        if(products.containsKey(productId)){
            products.get(productId).getItems().add(i);
        }
        return i;
        
    }
    
    private void generateCustomer(String[] row, Item item){
        
        int customerId = Integer.parseInt(row[5]);
        int productId = Integer.parseInt(row[2]);
        int salesPrice = Integer.parseInt(row[6]);
        int itemId = Integer.parseInt(row[1]);
        String market = row[7];
        
        Map<Integer, Customer> customers = DataStore.getInstance().getCustomer();
        
        if(customers.containsKey(customerId))
            customers.get(customerId).getItem().add(item);
        else{
            Customer customer = new Customer(customerId, itemId, productId, salesPrice, market);
            customer.getItem().add(item);
            customers.put(customerId, customer);
        }
        
        
    }
    
    private void runAnalysis(){
        
        helper.findPopularProduct();
        
        helper.topCustomer();

        
        
    }
}
