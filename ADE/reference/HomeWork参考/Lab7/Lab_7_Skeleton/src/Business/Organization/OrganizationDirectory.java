/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization o = null;
        if(type.getValue().equals(Type.Doctor.getValue()))
        {
            o = new DoctorOrganization();
            organizationList.add(o);
        }
        else if(type.getValue().equals(Type.Lab.getValue()))
        {
            o = new LabOrganization();
            organizationList.add(o);
        }
      
        return o;
    }
}
