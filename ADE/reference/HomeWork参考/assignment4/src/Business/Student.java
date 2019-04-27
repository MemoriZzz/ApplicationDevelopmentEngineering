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
public class Student {
    private Transcript transcript;
	private String name;
	private String status;// graduate or not
	private String employment;//null or position
	
	private ArrayList<String> salary;
	
	
	
	public Student(){
		transcript=new Transcript();
		
	}
	
	public ArrayList choseCourses(Department department){
		
		ArrayList <CourseOffering>courseAvailble=new ArrayList<CourseOffering>();
		for(DepartmentCourseSchedule departmentCourseSchedule:department.getDepartmentCourseScheduleList()){
			for(CourseOffering courseOffering:departmentCourseSchedule.getCourseOfferingList()){
				courseAvailble.add(courseOffering);
			}
			
		}	
		return courseAvailble;
	}
	
//	public String courseSeat(CourseOffering co){
//		String s="time available is"+co.getTimeAvailable()+"course load is"+co.getSeatNumber();
//		
//		return s;
//		
//	}
//	
	
	public double courseCost(CourseOffering co){
		double i=co.getCourse().getCreditHours()*co.getCourse().getPrice();
		
		return i;
		
	}
	
	//¶àÌ¬£¬ÓÐdepartmentÁËÔÚÐ´£¬ÓÃcourse²éÑ¯
	public String courseSeat(Course course){
		return null;
		
	}
	public int courseCost(Course course){
		return 0;
		
	}
	
	
	//------------------------------------------------------------------------
	

	



	public String getName() {
		return name;
	}

	

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmployment() {
		return employment;
	}

	public void setEmployment(String employment) {
		this.employment = employment;
	}

	public ArrayList<String> getSalary() {
		return salary;
	}

	public void setSalary(ArrayList<String> salary) {
		this.salary = salary;
	} 
	
	
	
	
}
