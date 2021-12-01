package com.Dinesh.csc106.prac14.travel;

public class Cycle extends Two_wheel {
	
	private String name;
	private String role;
	private int seat;
	
	public Cycle(String name, String role, int seat) {
		super();
		this.name = name;
		this.role = role;
		this.seat = seat;
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

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}




}
