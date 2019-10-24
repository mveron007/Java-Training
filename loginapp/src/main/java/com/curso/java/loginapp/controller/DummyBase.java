package com.curso.java.loginapp.controller;
import java.util.HashMap;
import java.util.Map;



public class DummyBase {
	private static HashMap<String, String> myMaps;

	static {
		myMaps=new HashMap<String, String>();
		myMaps.put("Pedro", "1234567");
	}
	

	public static Map<String, String >getMap(){
		return myMaps;
	}
	

	

	
	
	
	
}
