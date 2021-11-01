package com.Dinesh.csc106.ex13;
import java.util.ArrayList;
import java.util.List;


public class Product {
	
	private String name;
	private Brand Brand;
	private Double Price;
	private List<Category> categories;
	
	public Product() {
		this.name = "";
		this.Price = 0.0;
		this.categories = new ArrayList<>();
		this.Brand = new Brand();
	}
	
	public Product(Brand brand,String name,Double price,List<Category> categories) {
		this.name = name;
		this.Price = price;
		this.categories = categories;
		this.Brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return Brand;
	}

	public void setBrand(Brand brand) {
		Brand = brand;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	
	
	

}
