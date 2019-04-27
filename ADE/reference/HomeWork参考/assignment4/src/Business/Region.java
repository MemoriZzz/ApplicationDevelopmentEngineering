/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author yyneu
 */
public class Region {
    private String regionName;
    private ArrayList<University> universityList;

    public Region() {
        this.universityList = new ArrayList<University>();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ArrayList<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(ArrayList<University> universityList) {
        this.universityList = universityList;
    }
    
}
