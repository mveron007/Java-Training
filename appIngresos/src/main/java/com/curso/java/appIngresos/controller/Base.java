package com.curso.java.appIngresos.controller;

import java.util.HashMap;
import java.util.Map;

public class Base {

	private static HashMap<String, String> myMaps;

	static {
		myMaps=new HashMap<String, String>();
		myMaps.put("Pedro", "1234567");
	}
	

	public static Map<String, String >getMap(){
		return myMaps;
	}
	
	public static void setMap(String name, String password) {
			myMaps.put(name, password);
		
	}
	
//	public static void validatePassword(String password) {
//		if(password > 5) {
//			return password;
//		}
//		return password;
//	}
	
	
//	public static  void setMap(String name, String password){
//		
//		if(myMaps.containsKey(name) && myMaps.containsValue(password) != true)
//			myMaps.put(name, password);
//	}


	
}
