/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.regex.Pattern;

/**
 *
 * @author yyneu
 */
public class Resume {
    //requried variables
    private String name;
    private String picture;
    private String address;
    private String affiliation;
    private String careerObjectiveStatement;
    private String education;
    //additional five variables
    private String dob;
    private int age;
    private String sex;//radio
    private String major;
    private float workYear;
    //addition three variables
    private String status;//radio
    private String nationality;//radio
    private String program;//checkbox

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setCareerObjectiveStatement(String careerObjectiveStatement) {
        this.careerObjectiveStatement = careerObjectiveStatement;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setWorkYear(float workYear) {
        this.workYear = workYear;
    }

    public String getPicture() {
        return picture;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getCareerObjectiveStatement() {
        return careerObjectiveStatement;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getMajor() {
        return major;
    }

    public float getWorkYear() {
        return workYear;
    }
     
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    /**
     *
     * @param str
     * @return
     */
    public  boolean isNumeric(String str){ 
        Pattern pattern = Pattern.compile("[0-9]*"); 
        return pattern.matcher(str).matches();  
} 
  
    public boolean isFloat(String testString)
{
   if(!testString.contains("."))
   {
    return isNumeric(testString);
   }
   else
   {
    String[] floatStringPartArray=testString.split("\\.");
    if(floatStringPartArray.length==2)
    {
     if(isNumeric(floatStringPartArray[0])&&isNumeric(floatStringPartArray[0])){
         return true;
     }
     else return false;
    }
    else 
        return false;
    
   }
   }
    @Override
    public String toString()
    {
        return this.dob;
    }
    
}


