package com.curso.java.appIngresos.controller;

public class Ingreso {
	private String name;
	private String password;
	private String lastName;
	private String email;
	
	
	public Ingreso(String name, String password, String lastName, String email) {
		this.name = name;
		this.password = password;
		this.lastName = lastName;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
