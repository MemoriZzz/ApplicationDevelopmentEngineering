/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yyneu
 */

public class Initialization {
    private String filePath;
    private String name;
    private double creditHours;
    private double price;
    private String degree;
    private String major;
    private String department;
    private String courseCatalogType;
    private int    number;
    private String timeAvailable;
    private String semester;
    private String type;
    private String departmentName;
    private String account;
    private String collegeView;
    private String collegeName;
    private String universityName;
    private String regionName;
  
       
     
    public ArrayList<Course> initialzeCourse(){
    filePath="course.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<Course> list=new ArrayList<Course>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        name=arr[0];
        creditHours=Double.parseDouble(arr[1]);
        price=Double.parseDouble(arr[2]);
        degree=arr[3];
        major=arr[4];
        department=arr[5];
        courseCatalogType=arr[6];
        Course c = new Course();
        c.setName(name);
        c.setCreditHours(creditHours);
        c.setPrice(price);
        c.setDegree(degree);
        c.setMajor(major);
        c.setDepartment(department);
        c.setCourseCatalogType(courseCatalogType);
        c.setCertificate("pass");
        list.add(c);
    }
    br.close();
    return list;
} catch(Exception e){
    e.printStackTrace();
}
    return list;
    }
    
    
    public ArrayList<CourseOffering> initialzeCourseOffering(){
    filePath="courseOffering.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<CourseOffering> list=new ArrayList<CourseOffering>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
     
        number=Integer.parseInt(arr[0]);
        timeAvailable=arr[1];
        name=arr[2];
        creditHours=Double.parseDouble(arr[3]);
        price=Double.parseDouble(arr[4]);
        degree=arr[5];
        major=arr[6];
        department=arr[7];
        courseCatalogType=arr[8];
        semester=arr[9];
        DepartmentCourseSchedule dcs=new DepartmentCourseSchedule();
        CourseOffering co=new CourseOffering();
        Course c = new Course();
        co.setNumber(number);
        co.setTimeAvailable(timeAvailable);
        co.setSemester(semester);
        c.setName(name);
        c.setCreditHours(creditHours);
        c.setPrice(price);
        c.setDegree(degree);
        c.setMajor(major);
        c.setDepartment(department);
        c.setCourseCatalogType(courseCatalogType);
        co.setCourse(c);
        list.add(co);
    }
    br.close();
    return list;
   } catch(Exception e){
    e.printStackTrace();
  }
    return list;
    }
    
    public ArrayList<DepartmentCourseSchedule> initialzeSchedule(String semester,ArrayList<CourseOffering> courseOfferingList){
    filePath="departmentCourseSchedule.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<DepartmentCourseSchedule> list=new ArrayList<DepartmentCourseSchedule>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        this.semester=arr[1];
        this.departmentName=arr[0];
        if(this.semester.equals(semester)){
        DepartmentCourseSchedule dcs=new DepartmentCourseSchedule();
        ArrayList<CourseOffering> newList = new ArrayList<CourseOffering>();
        for(CourseOffering co:courseOfferingList){
            if(co.getSemester().equals(semester))
                newList.add(co);
            
            
        }
        //System.out.println(newList);
        dcs.setCourseOfferingList(newList);
        dcs.setSemester(semester);
        dcs.setDepartmentName(departmentName);
        list.add(dcs);
        //if(this.semester.equals(semester)){
        
        //dcs.setCourseOfferingList(courseOfferingList);
        //dcs.setSemester(semester);
        //list.add(dcs);
        //}
        //else{
            //write new semester to file
        //}
        }
        
    }
    br.close();
    return list;
} catch(Exception e){
    e.printStackTrace();
}
    return list;
    }
    
    public ArrayList<DepartmentCourseCatalog> initialzeCatalog(String type,ArrayList<Course> courseList){
    filePath="departmentCourseCatalog.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<DepartmentCourseCatalog> list=new ArrayList<DepartmentCourseCatalog>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        this.type=arr[1];
        this.departmentName=arr[0];
        if(this.type.equals(type)){
        DepartmentCourseCatalog dcc=new DepartmentCourseCatalog();
         ArrayList<Course> newList = new ArrayList<Course>();
        for(Course co:courseList){
            if(co.getCourseCatalogType().equals(this.type))
                newList.add(co);
        }
        dcc.setCourseList(newList);
        dcc.setCourseCatalogType(type);
        dcc.setDepartmentName(departmentName);
        list.add(dcc);
        }
       // if(this.type.equals(type)){}
        //else{
        //write new type to file
        //}
        
    
     
        
    }
    br.close();
    return list;
}   catch(Exception e){
    e.printStackTrace();
}
    return list;
    }
    
    public Department initialzeDeparatment(String departmentName,ArrayList<DepartmentCourseSchedule> departmentCourseScheduleList, ArrayList<DepartmentCourseCatalog> departmentCourseCatalogList,ArrayList<Student> studentList){
    filePath="department.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    Department d=new Department();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        this.departmentName=arr[0];
        this.account=arr[1];
        this.collegeName=arr[2];
        if(this.departmentName.equals(departmentName)){
       
        ArrayList<DepartmentCourseSchedule> newList = new ArrayList<DepartmentCourseSchedule>();
        for(DepartmentCourseSchedule dcs:departmentCourseScheduleList){
            if(dcs.getDepartmentName().equals(this.departmentName))
                newList.add(dcs);
        }
        
        ArrayList<DepartmentCourseCatalog> newList1 = new ArrayList<DepartmentCourseCatalog>();
        for(DepartmentCourseCatalog dcc:departmentCourseCatalogList){
            if(dcc.getDepartmentName().equals(this.departmentName))
                newList1.add(dcc);
        }
        
        d.setDepartmentName(this.departmentName);
        d.setAccount(account);
        d.setCollegeName(collegeName);
        d.setDepartmentCourseCatalogList(newList1);
        d.setDepartmentCourseScheduleList(newList);
        d.setStudentList(studentList);
        }
        //if(this.departmentName.equals(departmentName)){}
        //else{
        //write new name to file
        //}
      
        
    }
    br.close();
    return d;
} catch(Exception e){
    e.printStackTrace();
}
    return d;
    }
    
     
    public ArrayList<DepartmentAccount> initialzeDeparatmentAccount(String collegeName,ArrayList<Department> departmentList){
    filePath="departmentAccount";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<DepartmentAccount> list=new ArrayList<DepartmentAccount>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
       
        this.account=arr[0];
        this.collegeName=arr[1];
        this.collegeView=arr[2];
        if(this.collegeName.equals(collegeName)){
        DepartmentAccount da=new DepartmentAccount();
        ArrayList<Department> newList = new ArrayList<Department>();
         
        for(Department d:departmentList){
            if(d.getAccount().equals(this.account))
                newList.add(d);
        }
        
        da.setAccount(account);
        da.setCollegeView(collegeView);
        da.setCollegeName(collegeName);
        da.setDepartmentList(newList);
        list.add(da);
        }
        //if(this.collegeView.equals(collegeView)){}
        //else{
            //wrie new account to file
        //}
       
        
    }
    br.close();
    return list;
} catch(Exception e){
    e.printStackTrace();
}
    return list;
    }
    
    public ArrayList<College> initialzeCollege(String collegeName,ArrayList<Department> departmentList){
    filePath="college.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<College> list=new ArrayList<College>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        this.collegeName=arr[0];
        this.universityName=arr[1];
        if(this.collegeName.equals(collegeName)){
       
        ArrayList<Department> newList = new ArrayList<Department>();
        for(Department d:departmentList){
            if(d.getCollegeName().equals(collegeName))
                newList.add(d);
         
        }
        College c=new College();
        c.setCollegeName(collegeName);
        c.setUniversityName(universityName);
        c.setDepartmentList(newList);
        list.add(c);
        }
        //if(this.collegeName.equals(collegeName)){}
        //else{
        //write new name to file 
        //}
       
        
    }
    br.close();
    return list;
} catch(Exception e){
    e.printStackTrace();
}
    return list;
    }
    
    public University initialzeUniversity(String universityName,ArrayList<College> collegeList){
        filePath="university.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    University u=new University();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        this.universityName=arr[0];
        this.regionName=arr[1];
        
        if(this.universityName.equals(universityName)){
        
        ArrayList<College> newList = new ArrayList<College>();
        for(College c:collegeList){
            if(c.getUniversityName().equals(this.universityName))
                newList.add(c);
        }
        u.setUniversityName(universityName);
        u.setRegionName(regionName);
        u.setCollegeList(newList);
       
        }
        //if(this.universityName.equals(universityName)){}
        //else{
            //write new name to file
        //}
        
        
        
    }
    br.close();
    return u;
} catch(Exception e){
    e.printStackTrace();
}
    return u;
    }
    
    public ArrayList<Region> initialzeRegion(ArrayList<University> universityList){
        filePath="region.txt";
    File file = new File(filePath);
    StringBuilder result = new StringBuilder();
    ArrayList<Region> list=new ArrayList<Region>();
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null;
        while((s=br.readLine())!=null){
        String arr[]=s.split(",");
        this.regionName=arr[0];
        Region r=new Region();
        ArrayList<University> newList = new ArrayList<University>();
        for(University u:universityList){
            if(u.getRegionName().equals(this.regionName))
                newList.add(u);
        }
         r.setRegionName(regionName);
         r.setUniversityList(newList);
         list.add(r);
        //if(this.regionName.equals(regionName)){
        //}
        //else{
            //writer new name to file;
        //}
           
           
        
    }
    br.close();
    return list;
} catch(Exception e){
    e.printStackTrace();
}
    return list;
    }
    //courseload
    
    public ArrayList loadCourseLoad(ArrayList<Course>CourseList){
        ArrayList<CourseLoad> CourseLoadList=new ArrayList<CourseLoad>();
        
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("courseLoad.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
              
int i=0;
               while((str = br.readLine()) != null) {
                  i++;
                   String arr[]=str.split(",");
                   //System.out.println(arr[i]+arr[i+1]);
                   CourseLoad cl=new CourseLoad();
                   cl.setCourseLoadId(arr[0]);
                    //System.out.println(cl.getCourseLoadId());
               HashMap<String,Course> grade = new HashMap<String,Course>();
               grade.put(arr[1], CourseList.get(i));
                   cl.setGrade(grade);
                  
                  // cl.setSeatAssignment(arr[i+2]);
                   CourseLoadList.add(cl);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } 
        catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return CourseLoadList;
    }
    
    
    
    public ArrayList loadTranscript(ArrayList<CourseLoad>CourseLoadList){
        ArrayList<Transcript> transcriptList=new ArrayList<Transcript>();
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("Transcript.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   Transcript ts=new Transcript();
                   HashMap<String,CourseLoad> courseLoadList = new HashMap<String,CourseLoad>();
                   courseLoadList.put(arr[0], CourseLoadList.get(i));
                   ts.setCourseLoadList(courseLoadList);
                   transcriptList.add(ts);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return transcriptList;
    }
    public ArrayList loadStudent(ArrayList<Transcript>transcriptList){
        ArrayList<Student> StudentList=new ArrayList<Student>();
         ArrayList<String> salaryList=new ArrayList<String>();
        salaryList.add("1100");
        salaryList.add("2100");
        salaryList.add("3100");
        
        
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("Student.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   Student su=new Student();
                   su.setName(arr[0]);
                   su.setStatus(arr[1]);
                   su.setEmployment(arr[2]);
                   su.setTranscript(transcriptList.get(i));         
                   su.setSalary(salaryList);
                   StudentList.add(su);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return StudentList;
    }
    
    public ArrayList loadStudentAcconut(ArrayList<Student>StudentList,String path){
        ArrayList<StudentAccount> studentAcconutList=new ArrayList<StudentAccount>();
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("C:\\Users\\CAC\\Desktop\\StudentAccount.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   StudentAccount sa=new StudentAccount();
                   
                   sa.setStudentId(Integer.valueOf(arr[i]));
                   sa.setUserName(arr[i+1]);
                   sa.setStudent(StudentList.get(i));
                   sa.setCreditOwned(Integer.valueOf(arr[i+2]));
                   sa.setDollarAmount(Integer.valueOf(arr[i+3]));
                   sa.setStatus(arr[i+4]);
                   
                   studentAcconutList.add(sa);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return StudentList;
    
    }
    
}
