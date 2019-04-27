/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rachelwang
 */
public class Vitalsign {
    
    private String date;
    private int rr;
    private int hr;
    private int sbp;
    private double wip;
    private double wik;
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public int getRr() {
        return rr;
    }

    public void setRr(int rr) {
        this.rr = rr;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public double getWip() {
        return wip;
    }

    public void setWip(double wip) {
        this.wip = wip;
    }

    public double getWik() {
        return wik;
    }

    public void setWik(double wik) {
        this.wik = wik;
    }
    
    @Override
    public String toString(){
        return date;
    }

    public boolean rrisNormal(int rr) {
        if(rr>20 || rr<16){
            return false;
        }else {
            return true;}
    }

    public boolean hrisNormal(int hr) {
        
        if(hr>100 || hr<60){
            return false;
        }else {
            return true;}
        
    }

    public boolean sbpisNormal(int sbp) {
        
        if(sbp>140 || sbp<90){
            return false;
        }else {
            return true;}
        
    }



        
    
}
