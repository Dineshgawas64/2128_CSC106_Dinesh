package com.Dinesh.csc106.prac14.ppl;

public class Citizen extends Character{
	

	private String style;
	
	
	public Citizen(String character_name, String character_role, String style) {
		super();

		this.style = style;
	}
	
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	

}
