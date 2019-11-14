package com.practice.java.CarApp.controller;

import java.util.List;

//import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.practice.java.CarApp.controller.DB;
import com.practice.java.CarApp.maps.VehiclesRowMapper;

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
	
	

    public  List<Auto> getVehiculos(){

        String sql="select * from vehiculos";
        List<Auto> query = jdbcTemplate.query(sql, new VehiclesRowMapper());
        query.forEach(item->System.out.println(item.getName()));
        return query;
    }
}
