/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Workqueue.Workqueue;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public abstract class Organization {
    private static int count = 0;
    private int organizationId;
    private String name;
    private Workqueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    public abstract ArrayList<Role> getEmployeeRole();
    
    public enum Type{
            Admin("Admin Organization"){},
            Doctor("Doctor Organization"){},
            Lab("Lab Organization"){};
            private String value;
            private Type(String value){
                this.value = value;
            }

        public String getValue() {
            return value;
        }
        
            
    }
    
    public Organization(String name)
    {
        count++;
        organizationId = count;
        workQueue = new Workqueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        this.name = name;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workqueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(Workqueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    @Override
    public String toString()
    {
        return name;
    }
    
}
