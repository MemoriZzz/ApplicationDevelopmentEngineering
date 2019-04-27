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
public class DepartmentAccount {
    private String account;
    private ArrayList<Department> departmentList;
    private String collegeView;
    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public DepartmentAccount() {
        this.departmentList = departmentList;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public String getCollegeView() {
        return collegeView;
    }

    public void setCollegeView(String collegeView) {
        this.collegeView = collegeView;
    }
    
    public double calculateTotalEarningsAllDepartment(){
        double TotalEarningSemester=0;
        for(Department department:departmentList){
         for(DepartmentCourseSchedule courseSchedule:department.getDepartmentCourseScheduleList()){
           double a = courseSchedule.getThisSemesterTotalEarningsFromCourse();
           TotalEarningSemester = TotalEarningSemester+a; 
         }
        }
        return TotalEarningSemester;
    }
    public double calculateTotalEarningsBySemester(String semester){
        double TotalEarningSemester=0;
        for(Department department:departmentList){
        for(DepartmentCourseSchedule courseSchedule:department.getDepartmentCourseScheduleList()){
            if(courseSchedule.getSemester().equals(semester)){
           double a = courseSchedule.getThisSemesterTotalEarningsFromCourse();
           TotalEarningSemester = TotalEarningSemester+a;
            }
        }
        }
        return TotalEarningSemester;
    }
    
}
