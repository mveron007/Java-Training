package com.example.handlingformsubmission.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;


import com.example.handlingformsubmission.model.Country;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service

public class CountriesRowMapper implements RowMapper<Country> {
	 @Override
	    public Country mapRow(ResultSet resultSet, int i) throws SQLException {
	        Country country = new Country();
	        country.setName(resultSet.getString("COUNTRY"));
	        country.setCodigo(resultSet.getString("COUNTRY_ISO_CODE"));
	        country.setRegion(resultSet.getString("REGION"));
	        return  country;
	    }
}
