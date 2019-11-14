package com.practice.java.CarApp.controller;

public class Auto {
	private String brand;
	private String name;
	private double price;

	
	public Auto( String name, String brand, double price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	

}
