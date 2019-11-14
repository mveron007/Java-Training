package com.practice.java.CarApp.controller;



import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class VehiculoRowMapper implements RowMapper<Auto> {
    @Override
    public Auto mapRow(ResultSet resultSet, int i) throws SQLException {
        Auto vehiculo = new Auto( null, null, 0);
        
        vehiculo.setName(resultSet.getString("Brand"));
        vehiculo.setBrand(resultSet.getString("Name"));
        vehiculo.setPrice(resultSet.getDouble("Price"));
       
        return  vehiculo;
    }
}
