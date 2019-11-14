package com.practice.java.CarApp.controller;


import java.util.HashMap;
import java.util.Map;

public class DB {
	private static HashMap<String, Auto> carShop;
	private String brand;
	
	
	static {
//		Auto vehiculo=new Auto("Gol", "2010");
		carShop=new HashMap<String, Auto>();
		
//		carShop.put("Volkswagen", vehiculo);
	}
	

	public static Map<String, Auto>getMap(){
		return carShop;
	}
	
	public static void setMap(String brand, Auto car) {
		carShop.put(brand, car);
	
}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
