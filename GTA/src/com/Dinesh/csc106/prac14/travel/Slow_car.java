package com.Dinesh.csc106.prac14.travel;

public class Slow_car extends Four_wheel {
	
	private String name;
	private String role;
	private int seat;
	private int speed;
	
	
	public Slow_car(String name, String role, int seat, int speed) {
		super();
		this.name = name;
		this.role = role;
		this.seat = seat;
		this.speed = speed;
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


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
