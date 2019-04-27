/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jiya
 */
public class LabRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Business business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer,userAccount,(LabOrganization)organization, business);
    }
    @Override
     public String toString()
    {
        return "LabRole";
    }
}
