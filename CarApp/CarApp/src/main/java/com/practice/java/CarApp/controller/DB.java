package com.practice.java.CarApp.controller;


import java.util.HashMap;
import java.util.Map;

public class DB {
	private static HashMap<String, Auto> carShop;
	
	
	static {
		Auto vehiculo=new Auto("Volkswagen","Gol", "2010");
		carShop=new HashMap<String, Auto>();
		
		carShop.put(vehiculo.getBrand(), vehiculo);
	}
	

	public static Map<String, Auto>getMap(){
		return carShop;
	}
	
	public static void setMap(String brand, Auto car) {
		carShop.put(brand, car);
	
}
	
	
	
}
