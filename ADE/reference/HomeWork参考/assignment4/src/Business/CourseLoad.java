package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CourseLoad {
    private String CourseLoadId;
	private SeatAssignment seatAssignment ;
	private HashMap<String,Course>Grade;     //grade and course name;
        
	public SeatAssignment getSeatAssignment() {
		return seatAssignment;
	}
	public void setSeatAssignment(SeatAssignment seatAssignment) {
		this.seatAssignment = seatAssignment;
	}
	public HashMap<String, Course> getGrade() {
		return Grade;
	}
	public void setGrade(HashMap<String, Course> grade) {
		Grade = grade;
	}
	
	
	//����getter&setter
	
	public void CourseLoad (){
		seatAssignment=new SeatAssignment();
		Grade=new HashMap<String, Course>();
	}
	
	public double calculateSemesterCost(){
		double i=seatAssignment.getCourssPrice();
		return i;
	} 
	
	public ArrayList getCourseComplete(){
		ArrayList <String>getCourseComplete=new ArrayList<String>();
		
		for (Entry<String, Course> entry : this.Grade.entrySet()) {
		    String value = entry.getValue().getName();
		    getCourseComplete.add(value);
		   }
		return getCourseComplete;
	}

    public String getCourseLoadId() {
        return CourseLoadId;
    }

    public void setCourseLoadId(String CourseLoadId) {
        this.CourseLoadId = CourseLoadId;
    }

        
	
}
