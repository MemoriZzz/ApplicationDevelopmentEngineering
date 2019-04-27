/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author yyneu
 */
public class VitalSigns {
       private String timestamp;
    private int heartbeat;
    private String vitalSignsID;
    private double totalCholesterol;
    private double hdlCholesterol;
    private int systolicBloodPressure;
//getter&setter
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        this.heartbeat = heartbeat;
    }

    public String getVitalSignsID() {
        return vitalSignsID;
    }

    public void setVitalSignsID(String vitalSignsID) {
        this.vitalSignsID = vitalSignsID;
    }

    public double getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public double getHdlCholesterol() {
        return hdlCholesterol;
    }

    public void setHdlCholesterol(double hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }
    
        
        
}
