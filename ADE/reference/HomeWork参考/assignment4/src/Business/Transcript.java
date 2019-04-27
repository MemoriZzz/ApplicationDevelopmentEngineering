package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Transcript {
	private HashMap<String,CourseLoad> CourseLoadList ;
	
	

	public HashMap<String, CourseLoad> getCourseLoadList() {
		return CourseLoadList;
	}

	public void setCourseLoadList(HashMap<String, CourseLoad> courseLoadList) {
		CourseLoadList = courseLoadList;
	}
	
	public ArrayList loadCourseList(){
		ArrayList <CourseLoad>getCourseload=new ArrayList<CourseLoad>();
		
		for (Entry<String, CourseLoad> entry : this.CourseLoadList.entrySet()) {
		    getCourseload.add(entry.getValue());
		   }
		return getCourseload;
		
	}
	
	public CourseLoad loadCourseListbySe(String semester){
		
		return CourseLoadList.get(semester);
	}

	
}
