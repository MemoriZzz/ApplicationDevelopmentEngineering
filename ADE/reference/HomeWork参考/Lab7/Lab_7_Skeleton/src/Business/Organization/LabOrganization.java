/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class LabOrganization extends Organization{
    
    public LabOrganization()
    {
        super(Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getEmployeeRole() {
         ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new LabRole());
       return roles;
    }
}
