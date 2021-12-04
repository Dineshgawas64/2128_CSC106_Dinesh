package com.everything;

import com.Dinesh.csc106.prac14.travel.*;
import com.Dinesh.csc106.prac14.ppl.*;
import com.Dinesh.csc106.prac14.weapons.*;

public class World {
	
	private static Fast_car mustang;
	private static Slow_car slowcar1;
	private static Player player;
	private static Citizen citizen1;
	private static Police police2;
	private static Pistol pistol;
	private static Police police1;
	private static Bike bike1;
	private static Ak47 ak47;
	
	

	public static Fast_car getMustang() {
		return mustang;
	}

	public static void setMustang(Fast_car mustang) {
		World.mustang = mustang;
	}

	public static Slow_car getSlowcar1() {
		return slowcar1;
	}

	public static void setSlowcar1(Slow_car slowcar1) {
		World.slowcar1 = slowcar1;
	}

	public static Player getPlayer() {
		return player;
	}

	public static void setPlayer(Player player) {
		World.player = player;
	}

	public static Citizen getCitizen1() {
		return citizen1;
	}

	public static void setCitizen1(Citizen citizen1) {
		World.citizen1 = citizen1;
	}

	public static Police getPolice2() {
		return police2;
	}

	public static void setPolice2(Police police2) {
		World.police2 = police2;
	}

	public static Pistol getPistol() {
		return pistol;
	}

	public static void setPistol(Pistol pistol) {
		World.pistol = pistol;
	}

	public static Police getPolice1() {
		return police1;
	}

	public static void setPolice1(Police police1) {
		World.police1 = police1;
	}

	public static Bike getBike1() {
		return bike1;
	}

	public static void setBike1(Bike bike1) {
		World.bike1 = bike1;
	}

	public static Ak47 getAk47() {
		return ak47;
	}

	public static void setAk47(Ak47 ak47) {
		World.ak47 = ak47;
	}
	
	
	
	
	public void start_fast_car(Fast_car fastcar1 , Player Player)
	{ 
		System.out.println(" player is driving  car");
	}
	
	public void start_slow_car(Slow_car slowcar1 , Citizen citizen1)
	{ 
		System.out.println(" Citizen is driving slow car");
	}
	
	public void police_chase(Police po,Fast_car fc,Pistol pi) {
		System.out.println("police is chasing player with a fastcar and shooting alongside");
		
	} 
	
	public void player_counter(Player p,Bike b,Police po,Fast_car fc,Ak47 ak,Pistol pi) {
		
		System.out.println("police is chasing player with a fastcar and shooting alongside and player is running away with bike and shooting");
		
	}
	
}
