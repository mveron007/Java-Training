package com.curso.java.appIngresos.controller;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.curso.java.appIngresos.controller.Base;

@Service
public class MyService {

	public boolean getAttribute(String name, String password) {
		return Base.getMap().containsKey(name) && Base.getMap().containsValue(password);
	}
	
	public void setAttribute(String name, String password) {
		
		if (getAttribute(name, password) != true) {
			Base.setMap(name, password);
			
		}	

	}
}