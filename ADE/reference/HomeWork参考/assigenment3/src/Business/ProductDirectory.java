/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Pattern;

/**
 *
 * @author yyneu
 */
public class ProductDirectory {
    public ArrayList<Product> accountList;
    
    public ProductDirectory(){
        this.accountList=new ArrayList<Product>();
    }

    public ArrayList<Product> getAccountlist() {
        return accountList;
    }

    public void setAccountlist(ArrayList<Product> accountlist) {
        this.accountList = accountlist;
    }
    
    public Product addProduct(){
        Product account = new Product();
        accountList.add(account);
        return account;
    }
    
    public void deleterProduct(Product account){
        accountList.remove(account);
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

    public Product searchAccount(String modelNumber){
        for(Product account: accountList){
            if(account.getModelNumber().equals(modelNumber)){
                return account;
            }
        }
        return null;
    }
    
     public ArrayList searchProductNameAccount(String productName){
         ArrayList<Product> list = new ArrayList<Product>();
        for(Product account: accountList){
            if(account.getProductName().equals(productName)){
                list.add(account);
            }
        }
        return list;
    }
     
      public ArrayList searchVendorNameAccount(String vendorName){
        ArrayList<Product> list = new ArrayList<Product>();
        for(Product account: accountList){
            if(account.getVendorName().equals(vendorName)){
                list.add(account);
            }
        }
        return list;
    }
     

       public ArrayList searchKeyWord(String productName){
       ArrayList<Product> list = new ArrayList<Product>();
       for(Product product : accountList){
           if (!(product.getFeature().indexOf(productName)==-1))
           list.add(product);
        }  
       return list;
       }    
       
      public int compare(Product p1, Product p2) {
      return new Double(p1.getFloorPrice()).compareTo(p2.getFloorPrice());
      }
    
       public ArrayList<Product> sortFloorPrice(ArrayList<Product> accountList){
      Collections.sort(accountList, new Comparator(){
          @Override
          public int compare(Object p1, Object p2) {
              return new Double(((Product)p1).getFloorPrice()).compareTo(((Product)p2).getFloorPrice());//To change body of generated methods, choose Tools | Templates.
          }
      }
      );
  return accountList;
       }
       
       public ArrayList search(boolean a, boolean b, boolean c, boolean d, String s){
           ArrayList<Product> list = new ArrayList<Product>();
           list = accountList;
           if(a==true){
            ArrayList<Product> list1 = new ArrayList<Product>();
            for(Product product: list){
            if(product.getProductName().equals(s)){
                list1.add(product);
            }
        }
            list = list1;
       }
       if(b==true){
            ArrayList<Product> list2 = new ArrayList<Product>();
            for(Product product: list){
            if(product.getVendorName().equals(s)){
                list2.add(product);
            }
        }
            list = list2;
       }
       if(c==true){
        ArrayList<Product> list3 = new ArrayList<Product>();
         for(Product product : list){
           if (!(product.getFeature().indexOf(s)==-1))
           list3.add(product);
        } 
         list = list3;
       }
       if(d==true)
       list = sortFloorPrice(list);
       return list;
       }
}
