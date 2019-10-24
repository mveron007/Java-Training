package com.curso.java.loginapp.controller;



import org.springframework.stereotype.Service;

@Service
public class DummyService {
	
	
	public boolean getAttribute(String name, String password) {
		return DummyBase.getMap().containsKey(name) && DummyBase.getMap().containsValue(password);
	}
	
}
