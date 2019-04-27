/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author yyneu
 */
public class Product {
    private String productCatalog;
    private String productName;
    private String modelNumber;
    private String vendorName;
    private String description;
    private double basePrice;
    private double ceilingPrice;
    private double floorPrice;
    private String feature;
    private Date createOn;

    public Product() {
        this.createOn=new Date();
    }

    public String getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(String productCatalog) {
        this.productCatalog = productCatalog;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(double ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Date getCreateOn() {
        return createOn;
    }
    
    public  boolean isNumeric(String str){ 
        Pattern pattern = Pattern.compile("[0-9]*"); 
        return pattern.matcher(str).matches();  
} 
  
    public boolean isDouble(String testString)
    {
   if(!testString.contains("."))
   {
    return isNumeric(testString);
   }
   else
   {
    String[] doubleStringPartArray=testString.split("\\.");
    if(doubleStringPartArray.length==2)
    {
     if(isNumeric(doubleStringPartArray[0])&&isNumeric(doubleStringPartArray[0])){
         return true;
     }
     else return false;
    }
    else 
        return false;
    
   }
   }
    
    @Override
    public String toString(){
        return productName;
    }
}
