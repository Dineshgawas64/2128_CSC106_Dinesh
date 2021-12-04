package com.Dinesh.csc106.prac14.travel;
//import com.Dinesh.csc106.prac14.ppl.*;

public abstract class Four_wheel extends Vehicle {
	
	private String four_wheeler_name;
	private String four_wheeler_role;
	private int no_of_seat;
	private int speed;
	
	
	public String getFour_wheeler_name() {
		return four_wheeler_name;
	}
	public void setFour_wheeler_name(String four_wheeler_name) {
		this.four_wheeler_name = four_wheeler_name;
	}
	public String getFour_wheeler_role() {
		return four_wheeler_role;
	}
	public void setFour_wheeler_role(String four_wheeler_role) {
		this.four_wheeler_role = four_wheeler_role;
	}
	public int getNo_of_seat() {
		return no_of_seat;
	}
	public void setNo_of_seat(int no_of_seat) {
		this.no_of_seat = no_of_seat;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	

	

}
