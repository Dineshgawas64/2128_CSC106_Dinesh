package com.Dinesh.csc106.prac14.travel;
import com.Dinesh.csc106.prac14.ppl.*;

public class Bike extends Two_wheel {
	
	private String name;
	private String role;
	private int seats;
	
	public Bike(String name, String role, int seats) {
		super();
		this.name = name;
		this.role = role;
		this.seats = seats;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}


	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}


	

}
