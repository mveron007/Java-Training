package com.example.handlingformsubmission.model;

import java.sql.Time;

public class Flights {
	private String flight_id;
	private int segment_number;
	private String orig_airport;
	private Time depart_time;
	private String dest_airport;
	private  Time arrive_time;
	private  Time arrive_time1;
	private  Time arrive_time2;
	private  String meal;
	private double flying_time;
	private int miles;
	private String aircraft;
	
	
	public String getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}
	public int getSegment_number() {
		return segment_number;
	}
	public void setSegment_number(int segment_number) {
		this.segment_number = segment_number;
	}
	public Time getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(Time depart_time) {
		this.depart_time = depart_time;
	}
	public Time getArrive_time() {
		return arrive_time;
	}
	public void setArrive_time(Time arrive_time) {
		this.arrive_time = arrive_time;
	}
	public String getOrig_airport() {
		return orig_airport;
	}
	public void setOrig_airport(String orig_airport) {
		this.orig_airport = orig_airport;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getDest_airport() {
		return dest_airport;
	}
	public void setDest_airport(String dest_airport) {
		this.dest_airport = dest_airport;
	}
	public double getFlying_time() {
		return flying_time;
	}
	public void setFlying_time(double flying_time) {
		this.flying_time = flying_time;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	public Time getArrive_time1() {
		return arrive_time1;
	}
	public void setArrive_time1(Time arrive_time1) {
		this.arrive_time1 = arrive_time1;
	}
	public Time getArrive_time2() {
		return arrive_time2;
	}
	public void setArrive_time2(Time arrive_time2) {
		this.arrive_time2 = arrive_time2;
	}
	
	

}
