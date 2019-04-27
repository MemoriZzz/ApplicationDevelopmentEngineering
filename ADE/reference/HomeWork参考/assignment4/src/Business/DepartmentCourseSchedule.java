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
public class DepartmentCourseSchedule {
    private String semester;
    private ArrayList<CourseOffering> courseOfferingList ;
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
            
    public DepartmentCourseSchedule() {
        this.courseOfferingList  = new ArrayList<CourseOffering>();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<CourseOffering> getCourseOfferingList() {
        return courseOfferingList;
    }

    public void setCourseOfferingList(ArrayList<CourseOffering> courseOfferingList) {
        this.courseOfferingList = courseOfferingList;
    }

       public CourseOffering addCourseOffering(){
        CourseOffering courseOffering = new CourseOffering();
        courseOfferingList.add(courseOffering);
        return courseOffering;
    }
       
    public void deleterCourseOffering(CourseOffering courseOffering){
        courseOfferingList.remove(courseOffering);
    }
    
      public double getThisSemesterTotalEarningsFromCourse(){
          double earning = 0;
          for(CourseOffering courseOffering:this.courseOfferingList){
              double a = courseOffering.getCourse().getPrice();
              earning = earning+a;
          }
          return earning;
    }
      
    public ArrayList searchCourseOfferingName(String name){
         ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
        for(CourseOffering courseOffering: courseOfferingList){
            if(courseOffering.getCourse().getName().equals(name)){
                list.add(courseOffering);
            }
        }
        return list;
    }
    
    public ArrayList searchCourseOfferingPrice(double price){
         ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
        for(CourseOffering courseOffering: courseOfferingList){
            if(courseOffering.getCourse().getPrice()==price){
                list.add(courseOffering);
            }
        }
        return list;
    }
    
    public ArrayList searchCourseOfferingCreditHours(double creditHours){
         ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
        for(CourseOffering courseOffering: courseOfferingList){
            if(courseOffering.getCourse().getCreditHours()==creditHours){
                list.add(courseOffering);
            }
        }
        return list;
    }
    
    public ArrayList searchCourseOfferingMajor(String major){
         ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
        for(CourseOffering courseOffering: courseOfferingList){
            if(courseOffering.getCourse().getMajor().equals(major)){
                list.add(courseOffering);
            }
        }
        return list;
    }
    
    public ArrayList searchCourseOfferingDegree(String degree){
         ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
        for(CourseOffering courseOffering: courseOfferingList){
            if(courseOffering.getCourse().getDegree().equals(degree)){
                list.add(courseOffering);
            }
        }
        return list;
    }
    
     public ArrayList searchCourseOfferingTimeAvailable(String timeAvailable){
         ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
        for(CourseOffering courseOffering: courseOfferingList){
            if(courseOffering.getTimeAvailable().equals(timeAvailable)){
                list.add(courseOffering);
            }
        }
        return list;
    }
     
  
      
      public ArrayList findCourseOfferedByCriteria(String name, double price, String major, String degree, double creditHours, String timeAvailable){
           ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
           list = this.courseOfferingList;
           if(!name.equals("")){
            ArrayList<CourseOffering> list1 = new ArrayList<CourseOffering>();
            for(CourseOffering courseOffering: list){
            if(courseOffering.getCourse().getName().equals(name)){
                list1.add(courseOffering);
            }
        }
            list = list1;
       }
       if(price!=0){
            ArrayList<CourseOffering> list2 = new ArrayList<CourseOffering>();
            for(CourseOffering courseOffering: list){
            if(courseOffering.getCourse().getPrice()==price){
                list2.add(courseOffering);
            }
        }
            list = list2;
       }
       if(!degree.equals("")){
       ArrayList<CourseOffering> list3 = new ArrayList<CourseOffering>();
            for(CourseOffering courseOffering: list){
            if(courseOffering.getCourse().getDegree().equals(degree)){
                list3.add(courseOffering);
            }
        } 
         list = list3;
       }
       if(!major.equals("")){
       ArrayList<CourseOffering> list4 = new ArrayList<CourseOffering>();
            for(CourseOffering courseOffering: list){
            if(courseOffering.getCourse().getMajor().equals(major)){
                list4.add(courseOffering);
            }
        } 
         list = list4;
       }
        if(creditHours!=0){
       ArrayList<CourseOffering> list5 = new ArrayList<CourseOffering>();
            for(CourseOffering courseOffering: list){
            if(courseOffering.getCourse().getCreditHours()==creditHours){
                list5.add(courseOffering);
            }
        } 
         list = list5;
       }
         if(!timeAvailable.equals("")){
       ArrayList<CourseOffering> list6 = new ArrayList<CourseOffering>();
            for(CourseOffering courseOffering: list){
            if(courseOffering.getTimeAvailable().equals(timeAvailable)){
                list6.add(courseOffering);
            }
        } 
         list = list6;
       }
        
        return list;
       }  
}
