package assignment5;

import java.util.ArrayList;

public class House {
	private ArrayList<Family> familyList;
	private String houseId=" ";
        private String risk;
        private int member;
//constructer
	public House(){
		familyList=new ArrayList<Family>();
	}
	
	
	
	//getter&setter
	public ArrayList<Family> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(ArrayList<Family> familyList) {
		this.familyList = familyList;
	}


	public String getHouseId() {
		return houseId;
	}

        public void setHouseId(String houseId) {
        this.houseId = houseId;
    }


	
        public String getRisk() {
        return risk;
    }

         public void setRisk(String risk) {
            this.risk = risk;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }
	
         
// report risk status according to the totalPoint
	   public String report(int totalPoint){
       if(totalPoint>=20)risk="high";
       else if(totalPoint>=15&totalPoint<20)risk="medium";
       else if(totalPoint>=9&totalPoint<15)risk="low";
       else if(totalPoint<9)risk="very health";
       return risk;
   }
}
