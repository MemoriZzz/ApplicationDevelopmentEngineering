/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author yyneu
 */
public class EmployeeDirectory {
         private ArrayList<Employee> employeeList;
         public EmployeeDirectory(){
             employeeList= new ArrayList<Employee>();
         }
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
         
   public Employee AddEmployee(){
       Employee e = new Employee();
       employeeList.add(e);
       return e;
       
   }      
   public void deleteEmployee(Employee e){
       employeeList.remove(e);
   }      
         
}
