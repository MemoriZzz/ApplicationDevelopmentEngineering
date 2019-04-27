/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rachelwang
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDict;
    
    public PatientDirectory(){
        patientDict = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientDict(){
        return patientDict;
    }
    
    public Patient addPatient(){
        Patient p = new Patient();
        patientDict.add(p);
        return p;
    }
    
    public void deletePatient(Patient p){
        patientDict.remove(p);
    }
    //没有search功能
    
}
