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
public class DepartmentCourseCatalog {
    private ArrayList<Course> courseList ;
    private String CourseCatalogType;
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public DepartmentCourseCatalog() {
        this.courseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public String getCourseCatalogType() {
        return CourseCatalogType;
    }

    public void setCourseCatalogType(String CourseCatalogType) {
        this.CourseCatalogType = CourseCatalogType;
    }
    
    public Course addCourse(){
        Course course = new Course();
        courseList.add(course);
        return course;
    }
    public void deleterCourse(Course course){
        courseList.remove(course);
    }
    public ArrayList searchCourseName(String name){
         ArrayList<Course> list = new ArrayList<Course>();
        for(Course course: courseList){
            if(course.getName().equals(name)){
                list.add(course);
            }
        }
        return list;
    }
     public ArrayList searchCoursePrice(double price){
         ArrayList<Course> list = new ArrayList<Course>();
        for(Course course: courseList){
            if(course.getPrice()==price){
                list.add(course);
            }
        }
        return list;
    }
      public ArrayList searchCourseMajor(String major){
         ArrayList<Course> list = new ArrayList<Course>();
        for(Course course: courseList){
            if(course.getMajor().equals(major)){
                list.add(course);
            }
        }
        return list;
    }
       public ArrayList searchCourseDegree(String degree){
         ArrayList<Course> list = new ArrayList<Course>();
        for(Course course: courseList){
            if(course.getDegree().equals(degree)){
                list.add(course);
            }
        }
        return list;
    }
        public ArrayList searchCourseCreditHours(double creditHours){
         ArrayList<Course> list = new ArrayList<Course>();
        for(Course course: courseList){
            if(course.getCreditHours()==creditHours){
                list.add(course);
            }
        }
        return list;
    }
        public ArrayList findCourseByCriteria(String name, double price, String major, String degree, double creditHours){
           ArrayList<Course> list = new ArrayList<Course>();
           list = this.courseList;
           if(!name.equals("")){
            ArrayList<Course> list1 = new ArrayList<Course>();
            for(Course course: list){
            if(course.getName().equals(name)){
                list1.add(course);
            }
        }
            list = list1;
       }
       if(price!=0){
            ArrayList<Course> list2 = new ArrayList<Course>();
            for(Course course: list){
            if(course.getPrice()==price){
                list2.add(course);
            }
        }
            list = list2;
       }
       if(!degree.equals("")){
       ArrayList<Course> list3 = new ArrayList<Course>();
            for(Course course: list){
            if(course.getDegree().equals(degree)){
                list3.add(course);
            }
        } 
         list = list3;
       }
       if(!major.equals("")){
       ArrayList<Course> list4 = new ArrayList<Course>();
            for(Course course: list){
            if(course.getMajor().equals(major)){
                list4.add(course);
            }
        } 
         list = list4;
       }
        if(creditHours!=0){
       ArrayList<Course> list5 = new ArrayList<Course>();
            for(Course course: list){
            if(course.getCreditHours()==creditHours){
                list5.add(course);
            }
        } 
         list = list5;
       }
        return list;
       }
        }
        
