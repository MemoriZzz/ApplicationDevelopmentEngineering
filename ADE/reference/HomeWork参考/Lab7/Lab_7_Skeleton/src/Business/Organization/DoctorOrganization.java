/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class DoctorOrganization extends Organization {
    
    public DoctorOrganization()
    {
        super(Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getEmployeeRole() {
          ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new DoctorRole());
       return roles;
    }
}
