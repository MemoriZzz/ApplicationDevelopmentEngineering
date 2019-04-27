package assignment5;

import java.util.ArrayList;

public class Community {
	private ArrayList<House> houseList;
	private String communityId=" ";
	private String risk;
        private int  member;
        //constructer
	public Community(){
		
		houseList=new ArrayList<House>();
		
	}
	
	
	//getter&setter

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
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

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
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
