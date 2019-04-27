/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Jiya
 */
public class ConfigureBusiness {
    
    public static Business configure()
    {
        Business business = Business.getInstance();
        AdminOrganization ao = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(ao);
        
        Employee e = new Employee();
        e.setName("admin");
        UserAccount ua = new UserAccount();
        ua.setEmployee(e);
        ua.setPassword("admin");
        ua.setRole(new AdminRole());
        ua.setUsername("admin");
        
        ao.getEmployeeDirectory().getEmployeeList().add(e);
        ao.getUserAccountDirectory().getUserAccountList().add(ua);
        return business;
    }
}
