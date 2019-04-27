/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
    private String age;
    private String sex;
    private String major;
    private String workYear;
  
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

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setWorkYear(String workYear) {
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

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getMajor() {
        return major;
    }

    public String getWorkYear() {
        return workYear;
    }
     
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }
}
