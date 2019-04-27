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
public class Business {
    
    public static Business business;
    
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    
    private Business(){
        userAccountDirectory=new UserAccountDirectory();
        employeeDirectory=new EmployeeDirectory();
    }
    
    public static Business getInstance(){
        if(business==null){
            business = new Business();
        }
        return business;
    }
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
}
