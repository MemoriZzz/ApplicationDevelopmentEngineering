/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rachelwang
 */
public class Patient {
    
    private String patientName;
    private String patientId;
    private String birthday;
    private String firstName;
    private String lastName;
    private String pharmacy;
    private String number;
    
    
    
    
    
    private VitalsignCatalog vitalsignCatalog;
    
    public Patient(){
        vitalsignCatalog = new VitalsignCatalog();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public VitalsignCatalog getVitalsignCatalog() {
        return vitalsignCatalog;
    }

    
    @Override
    public String toString(){
        return patientName;
    }

    
}
