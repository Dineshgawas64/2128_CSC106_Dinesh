package com.Dinesh.csc106.prac14.ppl;

public class Doctor extends Character {
	
	private String uniform;
	
	
	
	public Doctor(String character_name, String character_role, String uniform) {
		super();
		this.uniform = uniform;
	}
	public String getUniform() {
		return uniform;
	}
	public void setUniform(String uniform) {
		this.uniform = uniform;
	}

}
