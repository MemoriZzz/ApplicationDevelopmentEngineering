/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yyneu
 */
public class assignment4Test {
       ArrayList<Course> courseList;
        ArrayList<CourseOffering> courseOfferingList;
        ArrayList<DepartmentCourseSchedule> departmentCourseScheduleListFall;
        ArrayList<DepartmentCourseSchedule> departmentCourseScheduleListSpring;
        ArrayList<DepartmentCourseCatalog> departmentCourseCatalogListWeb;
        ArrayList<DepartmentCourseCatalog> departmentCourseCatalogListProgram;
        DepartmentCourseCatalog departmentCourseCatalog;
        ArrayList<CourseLoad> courseLoadList;
        ArrayList<Transcript> transcriptList;
        ArrayList<Student> studentList;
        Department department;
        Department department2;
        Department department3;
        Department department4;
        ArrayList<Department> departmentList= new ArrayList<Department>();
        ArrayList<DepartmentAccount> departmentAccountList;
        ArrayList<College> collegeList = new ArrayList<College>();
        ArrayList<College> collegeList2 = new ArrayList<College>();
        University university1;
        University university2;
        University university3;
        University university4;
        ArrayList<University> universityList1 = new ArrayList<University>();
        ArrayList<University> universityList2 = new ArrayList<University>();
        ArrayList<Region> regionList;
        Initialization initial = new Initialization();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        assignment4Test a = new assignment4Test();
        a.run();
   
    }
    
    public void run(){
        courseList = initial.initialzeCourse();
        
        courseLoadList = initial.loadCourseLoad(courseList);
        //System.out.println(courseLoadList.size());
        transcriptList = initial.loadTranscript(courseLoadList);
        //System.out.println(transcriptList.size());
        studentList = initial.loadStudent(transcriptList);
        //System.out.println(studentList.size());
        courseOfferingList = initial.initialzeCourseOffering();
        //System.out.println(courseList.size());
        departmentCourseScheduleListFall = initial.initialzeSchedule("fall", courseOfferingList);
        departmentCourseScheduleListSpring = initial.initialzeSchedule("spring", courseOfferingList);

        departmentCourseCatalogListWeb = initial.initialzeCatalog("web development", courseList);
        departmentCourseCatalogListProgram = initial.initialzeCatalog("program development", courseList);
        department = initial.initialzeDeparatment("information system", departmentCourseScheduleListFall, departmentCourseCatalogListWeb,studentList);
        department3 = initial.initialzeDeparatment("information system", departmentCourseScheduleListSpring, departmentCourseCatalogListWeb,studentList);
        
        department2 = initial.initialzeDeparatment("computer science", departmentCourseScheduleListFall, departmentCourseCatalogListWeb,studentList);
        department4 = initial.initialzeDeparatment("computer science", departmentCourseScheduleListSpring, departmentCourseCatalogListWeb,studentList);
        departmentList.add(department);
        departmentList.add(department2);
        departmentList.add(department3);
        departmentList.add(department4);
        //System.out.println(departmentList.size());
        
        //departmentAccountList = initial.initialzeDeparatmentAccount("good", departmentList);
        collegeList = initial.initialzeCollege("engineering", departmentList);
        collegeList2 = initial.initialzeCollege("science", departmentList);
        //System.out.println(collegeList.size());
        university1 = initial.initialzeUniversity("neu", collegeList);
        university2 = initial.initialzeUniversity("bu",collegeList);
        university3 = initial.initialzeUniversity("nyu",collegeList);
        university4 = initial.initialzeUniversity("columbia",collegeList);
        universityList1.add(university1);
        universityList1.add(university2);
        universityList1.add(university3);
        universityList1.add(university4);
        regionList = initial.initialzeRegion(universityList1);
        
        //System.out.println(regionList.get(0).getRegionName());
   System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.DEPARTMENT LEVEL REPORTS");
        System.out.println("2.COLLEGE LEVEL REPORTS");
        System.out.println("3.UNIVERSITY LEVEL REPORTS");
        System.out.println("4.EDUCATION ECO SYSTEM REPORTS");

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        ArrayList<Department> departmentList=new ArrayList<Department>();
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for department level reports");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.
        
        //*****************************************************************³õÊ¼»¯*****************************
        //*****************************************************************³õÊ¼»¯*****************************
        //*****************************************************************³õÊ¼»¯*****************************
        Report rp=new Report();
        
        
        //*****************************************************************³õÊ¼»¯*****************************
        //*****************************************************************³õÊ¼»¯*****************************
        //*****************************************************************³õÊ¼»¯*****************************
        //*****************************************************************³õÊ¼»¯*****************************
        
        
        
        switch (choice) {
            case 1:
                System.out.println("***************DEPARTMENT LEVEL REPORTS STARTS******************");
                //µØÇø¡úÑ§Ð£¡úÑ§Ôº¡ú²¿ÃÅ
                System.out.println("Please choose your object from a following university(please input number 1-2 to select");
                //ÕâÀïµÄ¶ÔÏóÖ»ÊÇÎªÁËÖ÷²Ëµ¥µÄ²âÊÔ£¬ÄÚÈÝÈ«²¿ÊÇ¿Õ
                //ÎªÁË·½±ãÖ»ÓÐÒ»¸öregionµÄ´óÑ§»á±»ÏÔÊ¾
                Region  region =regionList.get(0);
                for(int i=0;i<region.getUniversityList().size();i++){
                	System.out.println(i+" . "+region.getUniversityList().get(i).getUniversityName());
                }
                //·µ»ØÑ¡ÖÐµÄÖµ£¬È»ºó¶Ô¶ÔÓ¦µ½listÀïÓÃget[i]ÏÔÊ¾
                choice=reader.nextInt();
                for(int i=0;i<region.getUniversityList().get(choice).getCollegeList().size();i++){
                	System.out.println(i+" . "+region.getUniversityList().get(choice).getCollegeList().get(i).getCollegeName());
                }
                System.out.println("Please choose your object from a following college(please input number 1-2 to select");         
                choice=reader.nextInt();                
                College college=region.getUniversityList().get(choice).getCollegeList().get(choice);
                //µ÷ÓÃ·½·¨´ÓcollegeÀïÕÒdept
                ArrayList<Department>deptList=rp.getdeptbyCollege(college);
                System.out.println("Please choose your object from a following department(please input number 1-2 to select");
                for (int i = 0; i < deptList.size(); i++) {
					System.out.println(i+" . "+deptList.get(i).getDepartmentName());
				}
                //·µ»ØÑ¡ÖÐµÄdept
                choice=reader.nextInt();               
                Department dept=deptList.get(choice);
                departmentList.clear();
                //ÒòÎªÕâÀïÖ»ÓÐÒ»¸öËùÓÐ¾ÍÖØÐÂ¿ª¸öÁÐ¼Ó½øÈ¥
                departmentList.add(dept);
                //±¨¸æ¿ªÊ¼±»Í³Ò»·â×°³É·½·¨£¬Ç°ÃæÑ¡µÄÈ«²¿±ä³ÉÄãÃÃµÄdeptList£¬ÔÙ´«²ÎÊý½øÀ´¡£²¿·ÖÓÐÌØÊâÒªÇóµÄÌØÊâ¶Ô´ý
                rp.reportAll(departmentList, "Department");
                System.out.println("***************DEPARTMENT LEVEL REPORT ENDS******************");
                break;
            case 2:
                System.out.println("***************COLLEGE LEVEL REPORTS STARTS******************");
                //µØÇø¡úÑ§Ð£¡úÑ§Ôº
                System.out.println("Please choose your object from a following university(please input number 1-2 to select");
                //ÕâÀïµÄ¶ÔÏóÖ»ÊÇÎªÁËÖ÷²Ëµ¥µÄ²âÊÔ£¬ÄÚÈÝÈ«²¿ÊÇ¿Õ
                //ÎªÁË·½±ãÖ»ÓÐÒ»¸öregionµÄ´óÑ§»á±»ÏÔÊ¾
                Region  region1 =regionList.get(0);
                for(int i=0;i<region1.getUniversityList().size();i++){
                	System.out.println(i+" . "+region1.getUniversityList().get(i).getUniversityName());
                }
                //·µ»ØÑ¡ÖÐµÄÖµ£¬È»ºó¶Ô¶ÔÓ¦µ½listÀïÓÃget[i]ÏÔÊ¾
                choice=reader.nextInt();
                for(int i=0;i<region1.getUniversityList().get(choice).getCollegeList().size();i++){
                	System.out.println(i+" . "+region1.getUniversityList().get(choice).getCollegeList().get(i).getCollegeName());
                }
                System.out.println("Please choose your object from a following college(please input number 1-2 to select");         
                choice=reader.nextInt();                
                College college1=region1.getUniversityList().get(choice).getCollegeList().get(choice);
                //µ÷ÓÃ·½·¨´ÓcollegeÀïÕÒdept
               
                
                
                departmentList.clear();
                departmentList= rp.getdeptbyCollege(college1);
                //±¨¸æ¿ªÊ¼±»Í³Ò»·â×°³É·½·¨£¬Ç°ÃæÑ¡µÄÈ«²¿±ä³ÉÄãÃÃµÄdeptList£¬ÔÙ´«²ÎÊý½øÀ´¡£²¿·ÖÓÐÌØÊâÒªÇóµÄÌØÊâ¶Ô´ý
                rp.reportAll(departmentList, "College");
                System.out.println("***************COLLEGE LEVEL REPORT ENDS******************");
                break;
            case 3:
                System.out.println("***************UNIVERSITY LEVEL REPORTS STARTS******************");
                //µØÇø¡úÑ§Ð£
                System.out.println("Please choose your object from a following university(please input number 1-2 to select");
                //ÕâÀïµÄ¶ÔÏóÖ»ÊÇÎªÁËÖ÷²Ëµ¥µÄ²âÊÔ£¬ÄÚÈÝÈ«²¿ÊÇ¿Õ
                //ÎªÁË·½±ãÖ»ÓÐÒ»¸öregionµÄ´óÑ§»á±»ÏÔÊ¾
                Region  region2 =regionList.get(0);
                for(int i=0;i<region2.getUniversityList().size();i++){
                	System.out.println(i+" . "+region2.getUniversityList().get(i).getUniversityName());
                }
                //·µ»ØÑ¡ÖÐµÄÖµ£¬È»ºó¶Ô¶ÔÓ¦µ½listÀïÓÃget[i]ÏÔÊ¾
                choice=reader.nextInt();
                University university=new University();
                university=region2.getUniversityList().get(choice);
                
                //µ÷ÓÃ·½·¨´ÓuniversityÀïÕÒdept
                
                
                
                departmentList.clear();
                departmentList= rp.getdeptbyUniversity(university);
                //±¨¸æ¿ªÊ¼±»Í³Ò»·â×°³É·½·¨£¬Ç°ÃæÑ¡µÄÈ«²¿±ä³ÉÄãÃÃµÄdeptList£¬ÔÙ´«²ÎÊý½øÀ´¡£²¿·ÖÓÐÌØÊâÒªÇóµÄÌØÊâ¶Ô´ý
                rp.reportAll(departmentList, "university");
                System.out.println("***************UNIVERSITY LEVEL REPORT ENDS******************");
                break;
            case 4:
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS******************");
                //µØÇø
                System.out.println("Please choose your object from a following region(please input number 1-2 to select");
                //ÕâÀïµÄ¶ÔÏóÖ»ÊÇÎªÁËÖ÷²Ëµ¥µÄ²âÊÔ£¬ÄÚÈÝÈ«²¿ÊÇ¿Õ
                //ÎªÁË·½±ãÖ»ÓÐÒ»¸öregionµÄ´óÑ§»á±»ÏÔÊ¾
                //!!!ÕâÀïÓÐ´í£¡£¡£¡£¡ÐèÒªÈ¥È·¶¨region
                //if(==2){
                //	region=
                //}else{}
                Region  region3 =regionList.get(0);
                
                //µ÷ÓÃ·½·¨´ÓregionÀïÕÒdept
               
                departmentList.clear();
                departmentList=  rp.getdeptbyRegion(region3);
                //±¨¸æ¿ªÊ¼±»Í³Ò»·â×°³É·½·¨£¬Ç°ÃæÑ¡µÄÈ«²¿±ä³ÉÄãÃÃµÄdeptList£¬ÔÙ´«²ÎÊý½øÀ´¡£²¿·ÖÓÐÌØÊâÒªÇóµÄÌØÊâ¶Ô´ý
                rp.reportAll(departmentList, "region");
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORT ENDS******************");
                break;
            default:
                System.out.println("INPUT ENTERED IS INCORRECT ASK USER FOR THE INPUT AGAIN EXPLORE WHILE/Do-While loops");
                break;
        }
    }

}
