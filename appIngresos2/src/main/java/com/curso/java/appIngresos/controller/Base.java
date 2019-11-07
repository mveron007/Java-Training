package com.curso.java.appIngresos.controller;

import java.util.HashMap;
import java.util.Map;

public class Base {

	private static HashMap<String, Ingreso> myMaps;
	

	static {
		myMaps=new HashMap<String, Ingreso>();
		Ingreso objeto=new Ingreso("Pedro", "1234567", "Perez", "pp@gmail.com");
		myMaps.put(objeto.getPassword(), objeto);
	}
	

	public static Map<String, Ingreso >getMap(){
		return myMaps;
	}
	
	public static void setMap(String name, Ingreso newObject) {
			myMaps.put(name, newObject);
		
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
