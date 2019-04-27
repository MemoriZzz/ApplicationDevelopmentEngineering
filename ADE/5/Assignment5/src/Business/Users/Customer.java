/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */


    
    

public class Customer extends User implements Comparable<Supplier>{
    
    private ProductDirectory directory;
    
    private Date createOn;
    
    
    
    public Date getCreateOn() {
        return createOn;
    }
    
    
    public Customer(String password, String userName) {
        
        
        
        super(password, userName, "Customer");
        directory = new ProductDirectory();
    }

    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Supplier o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}

