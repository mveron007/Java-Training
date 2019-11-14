package com.practice.java.CarApp.controller;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.practice.java.CarApp.controller.DB;

@Service

public class MyService {

	public boolean getAttribute(String brand, Auto car) {
		return DB.getMap().containsKey(brand) && DB.getMap().containsValue(car);
	}
	
	public void setAttribute(String brand, Auto car) {
		if (getAttribute(brand, car) != true) {
			DB.setMap(brand, car);
		}
	}
}
