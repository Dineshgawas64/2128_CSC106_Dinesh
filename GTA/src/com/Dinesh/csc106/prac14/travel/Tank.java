package com.Dinesh.csc106.prac14.travel;

public class Tank extends Other_vehicle {
	
	private String name;
	private String role;
	
	
	public Tank(String name, String role) {
		super();
		this.name = name;
		this.role = role;
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



	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	
	

}
