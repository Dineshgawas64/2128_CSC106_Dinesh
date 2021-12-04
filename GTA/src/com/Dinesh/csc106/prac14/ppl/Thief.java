package com.Dinesh.csc106.prac14.ppl;

public class Thief extends Character{
	

	private String speed;

	

	public Thief(String character_name, String character_role,String speed) {
		super();
		this.speed=speed;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}

}
