/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Workqueue.Workqueue;


/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private Workqueue workqueue;
    public UserAccount() {
      
        workqueue = new Workqueue();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Workqueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(Workqueue workqueue) {
        this.workqueue = workqueue;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

   

    public Employee getEmployee() {
        return employee;
    }

    

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}