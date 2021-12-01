package com.Dinesh.csc106.prac14.ppl;

public class Citizen extends Character{
	
	private String name;
	private String role;
	private String style;
	
	
	public Citizen(String name, String role, String style) {
		super();
		this.name = name;
		this.role = role;
		this.style = style;
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
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	

}
