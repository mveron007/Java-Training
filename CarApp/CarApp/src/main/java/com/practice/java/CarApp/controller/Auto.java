package com.practice.java.CarApp.controller;

public class Auto {
	private String brand;
	private String name;
	private String price;
	private String color;
	
	public Auto(String brand, String name, String price, String color) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
