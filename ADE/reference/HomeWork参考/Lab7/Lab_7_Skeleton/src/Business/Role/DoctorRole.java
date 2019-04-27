/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Business business) {
        return new DoctorWorkAreaJPanel(userProcessContainer,userAccount,(DoctorOrganization) organization, business);
    }
    
    @Override
     public String toString()
    {
        return "Doctor";
    }
}
