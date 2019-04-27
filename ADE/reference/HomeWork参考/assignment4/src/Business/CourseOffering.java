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
public class CourseOffering {
        private int number;
        private Course course;
	private String  timeAvailable;
	private ArrayList<Seat> seatList;
        private String semester;

    public CourseOffering() {
        this.seatList = new ArrayList<Seat>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTimeAvailable() {
        return timeAvailable;
    }

    public void setTimeAvailable(String timeAvailable) {
        this.timeAvailable = timeAvailable;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }


        
}
