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
public class Point {
    private int agePoint;
    private int hdlPoint;
    private int totalCholesterolPoint;
    private int smokePoint;
    private int systolicPoint;
    private int diabetesPoint;
    private int totalPoint;
    private String risk;
    //calculate age point according to the age and gender 
    public int agePoint(int age,String gender){
    if(gender.equals("male")){
                   if(age<20) agePoint = -12;
    else if(age>=20&age<=34)  agePoint = -9;
    else if(age>=35&age<=39)  agePoint = -4;
    else if(age>=40&age<=44)  agePoint = 0;
    else if(age>=45&age<=49)  agePoint = 3;
    else if(age>=50&age<=54)  agePoint = 6;
    else if(age>=55&age<=59)  agePoint = 8;
    else if(age>=60&age<=64)  agePoint = 10;
    else if(age>=65&age<=69)  agePoint = 11;
    else if(age>=70&age<=74)  agePoint = 12;
    else if(age>=75&age<=79)  agePoint = 13;
     }
    else if(gender.equals("female")){
                   if(age<20) agePoint = -10;
    else if(age>=20&age<=34)  agePoint = -7;
    else if(age>=35&age<=39)  agePoint = -3;
    else if(age>=40&age<=44)  agePoint = 0;
    else if(age>=45&age<=49)  agePoint = 3;
    else if(age>=50&age<=54)  agePoint = 6;
    else if(age>=55&age<=59)  agePoint = 8;
    else if(age>=60&age<=64)  agePoint = 10;
    else if(age>=65&age<=69)  agePoint = 12;
    else if(age>=70&age<=74)  agePoint = 14;
    else if(age>=75&age<=79)  agePoint = 16;   
     }
    return agePoint;
    }
     //calculate hdlpoint according to the hdl and gender 
    public int hdlPoint(double hdl,String gender){
        if(gender.equals("male")){
        if(hdl>=60) hdlPoint = -1;
        else if(hdl>=50&hdl<=59) hdlPoint = 0;
        else if(hdl>=40&hdl<=49) hdlPoint = 1;
        else if(hdl<40) hdlPoint = 2;  
        }
        else if(gender.equals("female")){
        if(hdl>=60) hdlPoint = -1;
        else if(hdl>=50&hdl<=59) hdlPoint = 0;
        else if(hdl>=40&hdl<=49) hdlPoint = 1;
        else if(hdl<40) hdlPoint = 2;
        }
        return hdlPoint;
    }
     //calculate age totalCholesterolpoint according to the totalCholesterol,age and gender 
    public int totalCholesterolPoint(double totalCholesterol,int age,String gender){
        if(gender.equals("male")){
        if(totalCholesterol<160){
            if(age<20)totalCholesterolPoint = 0;
            else if(age>=20&age<=39)totalCholesterolPoint = 0;
            else if(age>=40&age<=49)totalCholesterolPoint = 0;
            else if(age>=50&age<=59)totalCholesterolPoint = 0;
            else if(age>=60&age<=69)totalCholesterolPoint = 0;
            else if(age>=70&age<=79)totalCholesterolPoint = 0;
        }
        else if(totalCholesterol>=160&totalCholesterol<200){
            if(age<20)totalCholesterolPoint = 5;
            else if(age>=20&age<=39)totalCholesterolPoint = 4;
            else if(age>=40&age<=49)totalCholesterolPoint = 3;
            else if(age>=50&age<=59)totalCholesterolPoint = 2;
            else if(age>=60&age<=69)totalCholesterolPoint = 1;
            else if(age>=70&age<=79)totalCholesterolPoint = 0;
        }
        else if(totalCholesterol>=200&totalCholesterol<240){
            if(age<20)totalCholesterolPoint = 9;
            else if(age>=20&age<=39)totalCholesterolPoint = 7;
            else if(age>=40&age<=49)totalCholesterolPoint = 5;
            else if(age>=50&age<=59)totalCholesterolPoint = 3;
            else if(age>=60&age<=69)totalCholesterolPoint = 1;
            else if(age>=70&age<=79)totalCholesterolPoint = 0;
        }
        else if(totalCholesterol>=240&totalCholesterol<280){
            if(age<20)totalCholesterolPoint = 12;
            else if(age>=20&age<=39)totalCholesterolPoint = 9;
            else if(age>=40&age<=49)totalCholesterolPoint = 6;
            else if(age>=50&age<=59)totalCholesterolPoint = 4;
            else if(age>=60&age<=69)totalCholesterolPoint = 2;
            else if(age>=70&age<=79)totalCholesterolPoint = 1;
        }
         if(totalCholesterol>=280){
            if(age<20)totalCholesterolPoint = 15;
            else if(age>=20&age<=39)totalCholesterolPoint = 11;
            else if(age>=40&age<=49)totalCholesterolPoint = 8;
            else if(age>=50&age<=59)totalCholesterolPoint = 5;
            else if(age>=60&age<=69)totalCholesterolPoint = 3;
            else if(age>=70&age<=79)totalCholesterolPoint = 1;
        }
        }
        else if(gender.equals("female")){
            if(totalCholesterol<160){
            if(age<20)totalCholesterolPoint = 0;
            else if(age>=20&age<=39)totalCholesterolPoint = 0;
            else if(age>=40&age<=49)totalCholesterolPoint = 0;
            else if(age>=50&age<=59)totalCholesterolPoint = 0;
            else if(age>=60&age<=69)totalCholesterolPoint = 0;
            else if(age>=70&age<=79)totalCholesterolPoint = 0;
        }
        else if(totalCholesterol>=160&totalCholesterol<200){
            if(age<20)totalCholesterolPoint = 5;
            else if(age>=20&age<=39)totalCholesterolPoint = 4;
            else if(age>=40&age<=49)totalCholesterolPoint = 3;
            else if(age>=50&age<=59)totalCholesterolPoint = 2;
            else if(age>=60&age<=69)totalCholesterolPoint = 1;
            else if(age>=70&age<=79)totalCholesterolPoint = 1;
        }
        else if(totalCholesterol>=200&totalCholesterol<240){
            if(age<20)totalCholesterolPoint = 11;
            else if(age>=20&age<=39)totalCholesterolPoint = 8;
            else if(age>=40&age<=49)totalCholesterolPoint = 6;
            else if(age>=50&age<=59)totalCholesterolPoint = 4;
            else if(age>=60&age<=69)totalCholesterolPoint = 2;
            else if(age>=70&age<=79)totalCholesterolPoint = 1;
        }
        else if(totalCholesterol>=240&totalCholesterol<280){
            if(age<20)totalCholesterolPoint = 15;
            else if(age>=20&age<=39)totalCholesterolPoint = 11;
            else if(age>=40&age<=49)totalCholesterolPoint = 8;
            else if(age>=50&age<=59)totalCholesterolPoint = 5;
            else if(age>=60&age<=69)totalCholesterolPoint = 3;
            else if(age>=70&age<=79)totalCholesterolPoint = 2;
        }
         if(totalCholesterol>=280){
            if(age<20)totalCholesterolPoint = 17;
            else if(age>=20&age<=39)totalCholesterolPoint = 13;
            else if(age>=40&age<=49)totalCholesterolPoint = 10;
            else if(age>=50&age<=59)totalCholesterolPoint = 7;
            else if(age>=60&age<=69)totalCholesterolPoint = 4;
            else if(age>=70&age<=79)totalCholesterolPoint = 2;
        }
        }
        return totalCholesterolPoint;
    }
    //calculate smokePoint according to the whether smoke ,age and gender
    public int smokePoint(boolean smoke,int age,String gender){
        if(gender.equals("male")){
        if(smoke==true){
            if(age<20)smokePoint = 12;
            else if(age>=20&age<=39)smokePoint=  8;
            else if(age>=40&age<=49)smokePoint = 5;
            else if(age>=50&age<=59)smokePoint = 3;
            else if(age>=60&age<=69)smokePoint = 1;
            else if(age>=70&age<=79)smokePoint = 1;
        }
        else smokePoint = 0;
        }
        else if(gender.equals("female")){
            if(smoke==true){
            if(age<20)smokePoint = 13;
            else if(age>=20&age<=39)smokePoint= 9 ;
            else if(age>=40&age<=49)smokePoint = 7;
            else if(age>=50&age<=59)smokePoint = 4;
            else if(age>=60&age<=69)smokePoint = 2;
            else if(age>=70&age<=79)smokePoint = 1;
        }
        else smokePoint = 0;
        }
        return smokePoint;
    }
    //calculate diabete point according to whether diabetes and age
     public int diabetesPoint(boolean diabetes,int age){
         if(diabetes=true){
           if(age<=39)diabetesPoint=  3;
            else if(age>=40&age<=59)diabetesPoint=  2;
            else if(age>=60)diabetesPoint = 1;
         }
         else if(diabetes=false)diabetesPoint=0;
         return diabetesPoint;  
     }
    public int systolicPoint(double systolicBloodPressure,boolean treated,String gender){
        if(gender.equals("male")){
        if(treated==true){
            if(systolicBloodPressure<120)systolicPoint = 0;
            else if(systolicBloodPressure>=120&systolicBloodPressure<130)systolicPoint = 1;
            else if(systolicBloodPressure>=130&systolicBloodPressure<140)systolicPoint = 2;
            else if(systolicBloodPressure>=140&systolicBloodPressure<160)systolicPoint = 2;
            else if(systolicBloodPressure>=160)systolicPoint = 3;
        }
        else if(treated==false){
            if(systolicBloodPressure<120)systolicPoint = 0;
            else if(systolicBloodPressure>=120&systolicBloodPressure<130)systolicPoint = 0;
            else if(systolicBloodPressure>=130&systolicBloodPressure<140)systolicPoint = 1;
            else if(systolicBloodPressure>=140&systolicBloodPressure<160)systolicPoint = 1;
            else if(systolicBloodPressure>=160)systolicPoint = 2; 
        }
        }
        else if(gender.equals("female")){
            if(treated==true){
            if(systolicBloodPressure<120)systolicPoint = 0;
            else if(systolicBloodPressure>=120&systolicBloodPressure<130)systolicPoint = 3;
            else if(systolicBloodPressure>=130&systolicBloodPressure<140)systolicPoint = 4;
            else if(systolicBloodPressure>=140&systolicBloodPressure<160)systolicPoint = 5;
            else if(systolicBloodPressure>=160)systolicPoint = 6;
        }
        else if(treated==false){
            if(systolicBloodPressure<120)systolicPoint = 0;
            else if(systolicBloodPressure>=120&systolicBloodPressure<130)systolicPoint = 1;
            else if(systolicBloodPressure>=130&systolicBloodPressure<140)systolicPoint = 2;
            else if(systolicBloodPressure>=140&systolicBloodPressure<160)systolicPoint = 3;
            else if(systolicBloodPressure>=160)systolicPoint = 4; 
        }  
        }
        return systolicPoint;
    }
//calculate total point
   public int totalPoint(int agePoint,int hdlPoint,int totalCholesterolPoint,int smokePoint,int systolicPoint,int diabetesPoint){
       totalPoint=agePoint+hdlPoint+totalCholesterolPoint+smokePoint+systolicPoint+diabetesPoint;
       return totalPoint;
   }
   public String report(int totalPoint){
       if(totalPoint>=19)risk="high";
       else if(totalPoint>=15&totalPoint<19)risk="medium";
       else if(totalPoint>=9&totalPoint<15)risk="low";
       else if(totalPoint<9)risk="very health";
       return risk;
   }
//getter&setter
    public int getAgePoint() {
        return agePoint;
    }

    public void setAgePoint(int agePoint) {
        this.agePoint = agePoint;
    }

    public int getHdlPoint() {
        return hdlPoint;
    }

    public void setHdlPoint(int hdlPoint) {
        this.hdlPoint = hdlPoint;
    }

    public int getTotalCholesterolPoint() {
        return totalCholesterolPoint;
    }

    public void setTotalCholesterolPoint(int totalCholesterolPoint) {
        this.totalCholesterolPoint = totalCholesterolPoint;
    }

    public int getSmokePoint() {
        return smokePoint;
    }

    public void setSmokePoint(int smokePoint) {
        this.smokePoint = smokePoint;
    }

    public int getSystolicPoint() {
        return systolicPoint;
    }

    public void setSystolicPoint(int systolicPoint) {
        this.systolicPoint = systolicPoint;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public int getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setDiabetesPoint(int diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }
   
    
}
