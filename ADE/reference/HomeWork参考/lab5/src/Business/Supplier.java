/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yyneu
 */
public class Supplier {
   private String supplierName;
   private ProductCatalog productCatalog;
   
   
   
   public Supplier()
   {
       productCatalog = new ProductCatalog();
   }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
   

    public String getSupplierName() {
        return supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
   @Override
   public String toString()
   {
       return supplierName;
   }
}
