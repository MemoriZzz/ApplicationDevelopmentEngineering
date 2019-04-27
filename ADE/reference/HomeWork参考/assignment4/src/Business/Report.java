    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author yyneu
 */
public class Report {
    public void reportAll(ArrayList <Department>departmentList,String unitName){
		//²Ëµ¥²¿·Ö
		 System.out.println("Please choose the kind of report your want(please input number 1-9 to select");
         System.out.println("1.Employment report");
         System.out.println("2.Employmentgrowth report");
         System.out.println("3.Gpa report");
         System.out.println("4.Overall Qualification report");
         Scanner reader=new Scanner(System.in);
         
         //´ÓdeptlistÀï»ñÈ¡ÄãÃÃµÄstudent
         ArrayList<Student> StudentList=new ArrayList<Student>();
         StudentList=this.getStudentbyDeptList(departmentList);
         
         int choice2=reader.nextInt();//´æÔÚÓÚ·½·¨ÄÚµÄÄãÃÃscanner
         
         //Ñ¡Ôñ±¨¸æ
         switch (choice2) {
         case 1:
             System.out.println("***************Employment report STARTS******************");
            
             double gpaOfStudent = this.reportEmploymentRate(StudentList);
             System.out.println("GPA of "+departmentList.get(0).getDepartmentName()+" "+unitName+" is " + gpaOfStudent);
             System.out.println("***************Employment report ENDS******************");
             break;
         case 2:
             System.out.println("***************Employmentgrowth report STARTS******************");
             System.out.println("Please input the year you want");
             int yearssss=reader.nextInt();
             this.reportEmploymentGrowth(StudentList, yearssss);
             System.out.println("***************Employmentgrowth report ENDS******************");
             break;
         case 3:
             System.out.println("***************Gpa report STARTS******************");
             this.reportGap(StudentList);
             System.out.println("***************Gpa report ENDS******************");
             break;
         case 4:
             System.out.println("***************Overall Qualification report STARTS******************");
             this.quality(departmentList, unitName);
             System.out.println("***************Overall Qualification report ENDS******************");
             break;
         default:
             System.out.println("INPUT ENTERED IS INCORRECT ");
             break;
     }	
	}
	
	
	
	
	
	
	
	
	
	
	//***************************method to calculate***********************************************************
	//***************************method to calculate***********************************************************
	//***************************method to calculate***********************************************************

	//method to calculate EmploymentRate***********************************************************
	public double reportEmploymentRate(ArrayList<Student> StudentList){
		int countNumber=0;
		int countEmploy=0;
		
		for(Student stu:StudentList){
			if(stu.getStatus().equals("graduate")){
				countNumber++;
				if(!stu.getEmployment().isEmpty()){
					countEmploy++;
				}
			}
		}
		double rate=(double)countEmploy/countNumber;
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(2);
		System.out.println("The percentage is" + nt.format(rate));
		return rate;	
	}
	
	
	//method to calculate Gpa***********************************************************
	public double reportGap(ArrayList<Student> StudentList){
		int countNumber=0;
		int countAll=0;
		
		ArrayList<CourseLoad> CourseLoadlist=new ArrayList<CourseLoad>();
		for(Student stu:StudentList){
			Iterator iter = stu.getTranscript().getCourseLoadList().keySet().iterator();
			while (iter.hasNext()) {
				Object key = iter.next();
				CourseLoad val = stu.getTranscript().getCourseLoadList().get(key);
				CourseLoadlist.add(val);
			}	
		}
		for(CourseLoad courseLoad:CourseLoadlist){
			Iterator iter = courseLoad.getGrade().keySet().iterator();
			while (iter.hasNext()) {
				int key;
                            key = Integer.valueOf((String)iter.next());
				countAll+=key;
			}	
			countNumber=CourseLoadlist.size();
		}
			
	
		double gpa=(double)countAll/countNumber;
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(2);
		System.out.println("The average Gpa is" + gpa);
		return gpa;	
	}
	
	
	//method to calculate EmploymentGrowth***********************************************************
	public void reportEmploymentGrowth(ArrayList<Student>StudentList, int years){
		//years shows up as array.size
		int max =StudentList.get(0).getSalary().size();
		ArrayList<String> all=new ArrayList<String>();
		if(max<years){
			years=max;
                        System.out.println("Only "+max+" years data is available");
		}
		
		for(int k=0;k<years;k++){
			int singleyear = 0;
			for(Student a:StudentList){
				singleyear=singleyear+Integer.valueOf(a.getSalary().get(k));
			}
			all.add(String.valueOf(singleyear));
		}
		
		for(int i=0;i<all.size()-1;i++){
			double growth= (Integer.valueOf(all.get(i+1))-Integer.valueOf(all.get(i)))/(Double.valueOf(all.get(i)));
			System.out.println("The growth of "+(i+2)+" is"+growth*100+"%");
		}
		System.out.println(" ");
	}
	
	
	//method to calculate quality of education(dept based)
	public double quality(ArrayList <Department>departmentList, String unitName){
		//unitNamen is used for output
		int subjectNumber=0;
		int countJob=0;
		int numberCerti=0;
		for(Department dept:departmentList){
			//subject
			subjectNumber=dept.getDepartmentCourseCatalogList().size();
			System.out.println("Subject covered number is "+subjectNumber);
		
			//course for job
			countJob=0;
			for(DepartmentCourseCatalog dcc:dept.getDepartmentCourseCatalogList()){
				if("employment".equals(dcc.getCourseCatalogType())){
					 countJob++;
				}
			}
			System.out.println(" Number for class regarding job interview is "+subjectNumber);
			
			//cetificate
			for(DepartmentCourseCatalog dcc:dept.getDepartmentCourseCatalogList()){
				for(Course course:dcc.getCourseList()){
					if(course.getCertificate()!=null){
						numberCerti++;
					}
				}	
			}
		}
		
		System.out.println("The "+unitName+" offers "+numberCerti+" cetificate(s)");
		//cauculate indicators
		double score=subjectNumber*0.6+countJob*0.2+numberCerti*0.2;
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(2);
		System.out.println("The fianl score is"+ nt.format(score)+"(according to coefficient of 0.6,0.2,0.2)" );
		return score;
	}
	

	
	//***************************method to get needed ArrayList***********************************************************
	//***************************method to get needed ArrayList***********************************************************
	//***************************method to get needed ArrayList***********************************************************
	//***********looking for student**************************************************************************************
	//dept
	public ArrayList <Student>getStudentbyDeptAccount(String dept,DepartmentAccount da){
		ArrayList<Student>StudentList=new ArrayList<Student>();
		Department dep=new Department();
		for(Department deptt:da.getDepartmentList()){
			if(dept.equals(deptt.getDepartmentName())){
				dep=deptt;
			}
		}
		return dep.getStudentList();
	}
	public ArrayList <Student>getStudentbyDeptList(ArrayList <Department>departmentList){
		ArrayList<Student>studentList=new ArrayList<Student>();
		
		for(Department dept:departmentList){
			for(Student s:dept.getStudentList()){
				studentList.add(s);
			}
		}
		return studentList;
	}
	//college
	public ArrayList<Student> getStudentbyCollege(College college){
		ArrayList<Student>StudentListFinal=new ArrayList<Student>();
		
		for(Department dept:college.getDepartmentList()){
			for(Student stu:dept.getStudentList()){
				StudentListFinal.add(stu);
			}
		}
		
		
		return StudentListFinal;
	}
	//university
	public ArrayList<Student> getStudentbyUniversity(University university){
		ArrayList<Student>StudentListFinal=new ArrayList<Student>();
		
		for(College college:university.getCollegeList()){
			for(Department dept:college.getDepartmentList()){
				for(Student stu:dept.getStudentList()){
					StudentListFinal.add(stu);
				}
			}
		}
		return StudentListFinal;
		}
	
	
	//***********looking for dept**************************************************
		//´Ó²Ëµ¥¸ù¾ÝÖ¸ÁîÕÒcollegeµÄ´úÂëÐ´ÄÄÀï£¿
		//Ë¼Â·¶¼ÊÇ±éÀúÕÒ³öÈ«²¿µÄ×îµ×²ã¶ÔÏó£¬È»ºó·µ»ØÁËÍ³Ò»¼ÆËã
	public ArrayList<Department> getdeptbyCollege(College college){
		ArrayList<Department> deptList=new ArrayList<Department>();
		for(Department department:college.getDepartmentList()){
			deptList.add(department);
			
		}
		return deptList;
	}
	
	public ArrayList<Department> getdeptbyUniversity(University university){
		ArrayList<Department> deptList=new ArrayList<Department>();
		
		for(College college: university.getCollegeList()){
			for(Department department:college.getDepartmentList()){
				deptList.add(department);
			}
		}
		return deptList;
	}
	public ArrayList<Department> getdeptbyRegion(Region region){
		ArrayList<Department> deptList=new ArrayList<Department>();
		for(University university:region.getUniversityList()){
			for(College college: university.getCollegeList()){
				for(Department department:college.getDepartmentList()){
					deptList.add(department);
				}
			}
		}
		return deptList;
	}
	
	
	
	
}
