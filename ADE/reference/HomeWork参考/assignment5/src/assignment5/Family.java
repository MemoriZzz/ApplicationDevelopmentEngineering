package assignment5;

import java.util.ArrayList;

public class Family {
	private ArrayList<Person> personList;
        private int familySize;
	private String familyId=" ";
	//constructer
	public Family(){
		
		personList=new ArrayList<Person>();
		
	}
	
	
	
	
	//getter&setter
	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}


	public String getFamilyId() {
		return familyId;
	}

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }


	
    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }
	
}
