package com.practice.java.CarApp.controller;


//import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


//import com.practice.java.CarApp.controller.DB;

@Service

public class MyService {
	@Autowired
    JdbcTemplate jdbcTemplate;

//	public boolean getAttribute(String brand, Auto car) {
//		return DB.getMap().containsKey(brand) && DB.getMap().containsValue(car);
//	}
//	
//	public void setAttribute(String brand, Auto car) {
//		if (getAttribute(brand, car) != true) {
//			DB.setMap(brand, car);
//		}
//	}
	
	public  List<Auto> getVehicles(){

        String sql="SELECT * FROM autos";
        List<Auto> query = jdbcTemplate.query(sql, new VehiculoRowMapper());
        query.forEach(item->System.out.println(item.getName()));
        return query;
    }
}
