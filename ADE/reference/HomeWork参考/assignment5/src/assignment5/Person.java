package assignment5;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author yyneu
 */
public class Person {
	private String personalID;
	private String name;
	private int age;
	private String gender;
	private double totalCholesterol;
	private double	hdlCholesterol;
	private boolean smoker;
	private boolean diabetes;
	private int systolicBloodPressure;
	private boolean treated; 
        private ArrayList<VitalSigns> vitalSignsList;
        private Point point;
	private String label;
    //constructer
    public Person() {
        this.vitalSignsList = new ArrayList<VitalSigns>();
    }
	
	
        //according to the age set the lable
        public void doLabel(){
            if(this.age<20){
                label="child";
            }else if(this.age>=20&&this.age<=65){
                 label="parent";
            }else{
                 label="grandparent";
            }
        }
	
	
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public double getTotalCholesterol() {
		return totalCholesterol;
	}

	public void setTotalCholesterol(double totalCholesterol) {
		this.totalCholesterol = totalCholesterol;
	}

	

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }
	
	

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isTreated() {
        return treated;
    }

    public void setTreated(boolean treated) {
        this.treated = treated;
    }
	

	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

    public double getHdlCholesterol() {
        return hdlCholesterol;
    }

    public void setHdlCholesterol(double hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }

    public void setVitalSignsList(ArrayList<VitalSigns> vitalSignsList) {
        this.vitalSignsList = vitalSignsList;
    }
	
	
}
