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
public class Department {
   private String departmentName; 
   private ArrayList<DepartmentCourseCatalog> departmentCourseCatalogList;
   private ArrayList<DepartmentCourseSchedule> departmentCourseScheduleList;
   private ArrayList<Student> studentList;
   private String account;
   private String collegeName;


    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

 

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

   
    public Department() {
        this.departmentCourseCatalogList = new ArrayList<DepartmentCourseCatalog>();
        this.departmentCourseScheduleList = new ArrayList<DepartmentCourseSchedule>();
        this.studentList = new ArrayList<Student>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<DepartmentCourseCatalog> getDepartmentCourseCatalogList() {
        return departmentCourseCatalogList;
    }

    public void setDepartmentCourseCatalogList(ArrayList<DepartmentCourseCatalog> departmentCourseCatalogList) {
        this.departmentCourseCatalogList = departmentCourseCatalogList;
    }

    public ArrayList<DepartmentCourseSchedule> getDepartmentCourseScheduleList() {
        return departmentCourseScheduleList;
    }

    public void setDepartmentCourseScheduleList(ArrayList<DepartmentCourseSchedule> departmentCourseScheduleList) {
        this.departmentCourseScheduleList = departmentCourseScheduleList;
    }

    public DepartmentCourseSchedule getCourseScheduleBySemester(String semster){
        for(DepartmentCourseSchedule departmentCourseSchedule:departmentCourseScheduleList){
            if(departmentCourseSchedule.getSemester().equals(semster)){
               return departmentCourseSchedule;
            }
        }
        return null;
    } 
    
     public DepartmentCourseCatalog getCourseCatalogByType(String type){
        for(DepartmentCourseCatalog departmentCourseCatalog:departmentCourseCatalogList){
            if(departmentCourseCatalog.getCourseCatalogType().equals(type)){
               return departmentCourseCatalog;
            }
        }
        return null;
    }
     
      public DepartmentCourseSchedule addDepartmentCourseSchedule(String semester){
        DepartmentCourseSchedule departmentCourseSchedule = new DepartmentCourseSchedule();
        departmentCourseSchedule.setSemester(semester);
        departmentCourseScheduleList.add(departmentCourseSchedule);
        return departmentCourseSchedule;
    }
       
    public ArrayList<DepartmentCourseSchedule> deleteDepartmentCourseSchedule(String semester){
        for(DepartmentCourseSchedule departmentCourseSchedule:departmentCourseScheduleList){
            if(departmentCourseSchedule.getSemester().equals(semester)){
            departmentCourseScheduleList.remove(departmentCourseSchedule);
            }
        }
        return departmentCourseScheduleList;
    }
    
     public DepartmentCourseCatalog addDepartmentCourseCatalog(String type){
        DepartmentCourseCatalog departmentCourseCatalog = new DepartmentCourseCatalog();
        departmentCourseCatalog.setCourseCatalogType(type);
        departmentCourseCatalogList.add(departmentCourseCatalog);
        return departmentCourseCatalog;
    }
       
    public ArrayList<DepartmentCourseCatalog> deleterDepartmentCourseCatalog(String type){
        for(DepartmentCourseCatalog departmentCourseCatalog:departmentCourseCatalogList){
            if(departmentCourseCatalog.getCourseCatalogType().equals(type)){
            departmentCourseCatalogList.remove(departmentCourseCatalog);
            }
        }
        return departmentCourseCatalogList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

   
}
