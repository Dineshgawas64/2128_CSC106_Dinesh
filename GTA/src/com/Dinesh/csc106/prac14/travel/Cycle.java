package com.Dinesh.csc106.prac14.travel;

public class Cycle extends Two_wheel {
	
	private int seat;
	
	public Cycle(String two_wheeler_name, String two_wheeler_role, int seat) {
		super();
		this.seat = seat;
	}
	


	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}






}
