package com.Dinesh.csc106.prac14.travel;
//import com.Dinesh.csc106.prac14.ppl.*;

public class Bike extends Two_wheel {
	
	private int seats;
	
	public Bike(String two_wheeler_name, String two_wheeler_role, int seats) {
		super();
	
		this.seats = seats;
	}
	
	

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	

}
