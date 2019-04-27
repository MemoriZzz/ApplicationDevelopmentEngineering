/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author yyneu
 */
public class ConfigureBusiness {
    
    public static Business initializeBusiness(){
        Business business = Business.getInstance();
        //Create admin as Employee
        
        Employee e = business.getEmployeeDirectory().AddEmployee();
        e.setFirstName("admin");
        e.setLastName("");
        e.setOrganization("NEU");
        
        //Create user account for admin
        UserAccount ua=business.getUserAccountDirectory().addUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(e);
        ua.setRole(UserAccount.ADMIN_ROLE);
        ua.setIsActive(true);
        
        return business;
    }
    
}
