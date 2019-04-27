package Business;

import java.util.ArrayList;

public class SeatAssignment {
	private ArrayList<Seat>seatList;
	//courseoffered that u choose

	public ArrayList<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(ArrayList<Seat> seatList) {
		this.seatList = seatList;
	}
	
	public SeatAssignment(){
		seatList=new ArrayList<Seat>();
		
	}
	
	
	public double getCourssPrice (){
		double price=0;
		for(Seat seat:seatList){
			price+=seat.getCourseOffering().getCourse().getPrice()*seat.getCourseOffering().getCourse().getCreditHours();
		}
		return price;
	}
	
	
}
