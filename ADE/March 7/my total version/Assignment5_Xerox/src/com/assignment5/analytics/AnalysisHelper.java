/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author rachelwang
 */
public class AnalysisHelper {
    
    public void findPopularProduct(){
        
        System.out.println("Top 5 popular product___________________________________");
        
        Map<Integer, Integer> productId_productNum = new HashMap<>();
        Map<Integer, Item> item = DataStore.getInstance().getItem();

        for(Item i: item.values()){
            productId_productNum.put(i.getProductId(), (productId_productNum.get(i.getProductId())==null?1:productId_productNum.get(i.getProductId())+1));
        }
        
        // hashmap按照value排序
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(productId_productNum.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});

        for(int i = 0; i<5; i++){
            System.out.println("product id is "+list.get(i).getKey()+","+"sum of this product is "+list.get(i).getValue());
        }

    }
    
    public void topCustomer(){ //in certain market
        
        System.out.println("\n\n\nTop customer int certian markets___________________________________");
        
        Map<Integer, Integer> customerId_customerSpend = new HashMap<>();
        Map<Integer, Item> item = DataStore.getInstance().getItem();
        Map<Integer, Integer> productId_minPrice = new HashMap<>();
        Map<Integer, Product> product = DataStore.getInstance().getProduct();
        
        for(Product p: product.values()){
            productId_minPrice.put(p.getProductId(), p.getMinPrice());
            
        }
        
        String[] marketArr = {"education","financial","retail","pharmaceutical","software","realestate"};
      
        for(String str: marketArr){
            for(Item i: item.values()){
                if(i.getMarket().equals(str)) {

            customerId_customerSpend.put(i.getCustomerId(), (customerId_customerSpend.get(i.getCustomerId())==null?(i.getSalesPrice())*(i.getQuantity()-productId_minPrice.get(i.getProductId()))
                    :(i.getSalesPrice()-productId_minPrice.get(i.getProductId()))*(i.getQuantity())+customerId_customerSpend.get(i.getCustomerId())));

        }   

        }
            
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(customerId_customerSpend.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});
                
            for(int j = 0; j<1; j++){
            System.out.println("in market "+str+" ,the best customer id is "+list.get(j).getKey()+","+"total spend of this customer is $"+list.get(j).getValue());
             
            }

        }

    }
    
    public void topFiveCustomer(){ //overall
        
        System.out.println("\n\n\nOur top 5 customers___________________________________");
        Map<Integer, Integer> customerId_customerSpend = new HashMap<>();
        Map<Integer, Item> item = DataStore.getInstance().getItem();
        
        
        for(Item i: item.values()){
            customerId_customerSpend.put(i.getCustomerId(), (customerId_customerSpend.get(i.getCustomerId())==null?(i.getSalesPrice())*(i.getQuantity())
                    :(i.getSalesPrice())*(i.getQuantity())+customerId_customerSpend.get(i.getCustomerId())));
            }
        
        
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(customerId_customerSpend.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});

        
        for(int i = 0; i<5; i++){
            System.out.println("customer id is "+list.get(i).getKey()+","+"total spend of this customer is $"+list.get(i).getValue());
        }
        
        
        
        
    }
    
    public void topThreeSalesPerson(){
        System.out.println("\n\n\nOur top 3 sales person___________________________________");
        Map<Integer, Integer> salesId_salesEarn = new HashMap<>();
        Map<Integer, Item> item = DataStore.getInstance().getItem();
        
        
        for(Item i: item.values()){
            
            salesId_salesEarn.put(i.getSalesId(), (salesId_salesEarn.get(i.getSalesId())==null?(i.getSalesPrice())*(i.getQuantity())
                    :(i.getSalesPrice())*(i.getQuantity())+salesId_salesEarn.get(i.getSalesId())));
            }
        
        
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(salesId_salesEarn.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});

        
        for(int i = 0; i<3; i++){
            System.out.println("salesPerson's id is "+list.get(i).getKey()+","+"total earn of this salesPerson is $"+list.get(i).getValue());
        }
        
        
    }
    
    public void totalRevenueForTheYear(){
        System.out.println("\n\n\nTotal revenue for this year___________________________________");
        Map<Integer, Item> item = DataStore.getInstance().getItem();
        int sum=0;
        for(Item i:item.values()){
            sum = sum+(i.getSalesPrice())*(i.getQuantity());
        }
        System.out.println("total revenue: $" +sum);
        
        
    }
    
    public void totalRevenueByMarket(){
        System.out.println("\n\n\nTotal revenue by market___________________________________");
        Map<Integer, Item> item = DataStore.getInstance().getItem();
        int sum=0;
        for(Item i:item.values()){
            if(i.getMarket().equals("education")){//判断部门 "education","financial","retail","pharmaceutical","software","realestate"
                sum = sum+(i.getSalesPrice())*(i.getQuantity());
            }
        }
        System.out.println("total revenue for this market is $"+sum);
    }
    
    
    
}
