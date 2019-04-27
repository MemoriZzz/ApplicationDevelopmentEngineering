
package Business;

import java.util.ArrayList;

public class StudentAccount {
        private int studentId;
	private Student student;
	private String userName;
	private double dollarAmount;
	private double creditOwned;
	private String status;//re or not
	
	
	
	public StudentAccount(){
		this.student=new Student();
	}
	public double getPaidTotals(String semester){
		double i=student.getTranscript().getCourseLoadList().get(semester).calculateSemesterCost();
		return i;
		
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public double getDollarAmount() {
		return dollarAmount;
	}

	public void setDollarAmount(double dollarAmount) {
		this.dollarAmount = dollarAmount;
	}

	public double getCreditOwned() {
		return creditOwned;
	}

	public void setCreditOwned(double creditOwned) {
		this.creditOwned = creditOwned;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

        public int getStudentId() {
          return studentId;
         }

        public void setStudentId(int studentId) {
           this.studentId = studentId;
          }   
	
}
