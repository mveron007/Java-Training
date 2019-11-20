package com.example.handlingformsubmission.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.handlingformsubmission.model.Flights;

@Service
public class FlightsRowMapper implements RowMapper<Flights> {
	
	@Override
	public Flights mapRow(ResultSet resultSet, int i) throws SQLException {
        Flights flights = new Flights();
        flights.setFlight_id(resultSet.getString("FLIGHT_ID"));
        flights.setSegment_number(resultSet.getInt("COUNTRY_ISO_CODE"));
        flights.setOrig_airport(resultSet.getString("ORIG_AIRPORT"));
        flights.setDepart_time(resultSet.getTime("DEPART_TIME"));
        flights.setDest_airport(resultSet.getString("DEST_AIRPORT"));
        flights.setArrive_time(resultSet.getTime("ARRIVE_TIME"));
        flights.setMeal(resultSet.getString("MEAL"));
        flights.setFlying_time(resultSet.getDouble("FLYING_TIME"));
        flights.setMiles(resultSet.getInt("MILES"));
        flights.setAircraft(resultSet.getString("AIRCRAFT"));
        return  flights;
    }

}
