package com.curso.java.appIngresos.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.curso.java.appIngresos.controller.Base;

@Service
public class MyService {
	Map<String, Ingreso> DB = Base.getMap();
	
	
	public boolean getAttribute( String password) {
		return Base.getMap().containsKey(password);
	}
	
	
	
	
	public boolean search(String name) {
		
		return (DB.containsKey(name));
	
	}
}