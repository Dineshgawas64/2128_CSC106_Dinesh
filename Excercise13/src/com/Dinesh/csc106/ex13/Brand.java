package com.Dinesh.csc106.ex13;

public class Brand {
	
	private String name;
	private String origin_country;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Brand(String name, String origin_country) {
		super();
		this.name = name;
		this.origin_country = origin_country;
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOrigin_country() {
		return origin_country;
	}



	public void setOrigin_country(String origin_country) {
		this.origin_country = origin_country;
	}

	


}
