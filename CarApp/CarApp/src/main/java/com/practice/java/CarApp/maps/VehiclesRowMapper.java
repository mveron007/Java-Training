package com.practice.java.CarApp.maps;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.practice.java.CarApp.controller.Auto;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class VehiclesRowMapper implements RowMapper<Auto> {
	@Override
    public Auto mapRow(ResultSet resultSet, int i) throws SQLException {
        Auto vehiculo = new Auto();
       
        vehiculo.setMarca(resultSet.getString("marca"));
        vehiculo.setModelo(resultSet.getString("modelo"));
        vehiculo.setColor(resultSet.getString("color"));
        vehiculo.setPrecio(resultSet.getString("precio"));
       
        return  vehiculo;
    
    } 
	

}
