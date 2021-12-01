package com.Dinesh.csc106.prac14.ppl;

public class Player extends Character {
	
	private String player_name;
	private String skin_colour;
	private String hair_style;
	private String clothing;

	
	
	public Player(String player_name, String skin_colour, String hair_style, String clothing) {
		super();
		this.player_name = player_name;
		this.skin_colour = skin_colour;
		this.hair_style = hair_style;
		this.clothing = clothing;
	}
	
	
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getSkin_colour() {
		return skin_colour;
	}
	public void setSkin_colour(String skin_colour) {
		this.skin_colour = skin_colour;
	}
	public String getHair_style() {
		return hair_style;
	}
	public void setHair_style(String hair_style) {
		this.hair_style = hair_style;
	}
	public String getClothing() {
		return clothing;
	}
	public void setClothing(String clothing) {
		this.clothing = clothing;
	}
	
}
