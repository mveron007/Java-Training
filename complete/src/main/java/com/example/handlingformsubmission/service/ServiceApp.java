package com.example.handlingformsubmission.service;

import com.example.handlingformsubmission.Mappers.AirlinesRowMapper;
import com.example.handlingformsubmission.Mappers.CountriesRowMapper;
import com.example.handlingformsubmission.Mappers.FlightsRowMapper;
import com.example.handlingformsubmission.model.Airline;
import com.example.handlingformsubmission.model.Country;
import com.example.handlingformsubmission.model.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class ServiceApp {

    @Autowired
    JdbcTemplate jdbcTemplate;


    /**
     *
     * @return
     */
    public  List<Airline> getAirlines(){
        String sql="select * from AIRLINES";
        List<Airline> query = jdbcTemplate.query(sql, new AirlinesRowMapper());
        query.forEach(item->System.out.println(item.getAirlineNameShort()));
        return query;
    }


    /**
     *
     * @param shortName
     * @param longName
     * @return
     */
    public Integer getEconomySeatsFromAirlines(String shortName, String longName){
        String query="select * from AIRLINES where AIRLINE=?  and AIRLINE_FULL=? ;";
        List<Airline> airline= jdbcTemplate.query(query,new Object[]{shortName,longName},new AirlinesRowMapper());
        if(!airline.isEmpty()){
            Airline a= airline.get(0);
            return a.getEconomySeat();
        }
        return 0;
    }
    
 // Buscar todos los paises por continente //
    
    public  List<Country> getCountry(String region){
    	String query="select * from COUNTRIES where REGION = ? ;";
    	List<Country> country= jdbcTemplate.query(query,new Object[]{region},new CountriesRowMapper());
  
    	country.forEach(item->System.out.println(item.getName()));
        return country;
    	
    }
    
 // Buscar todos los vuelos entre 2 valores //
 
    public List<Flights> getFlights(Time arrive_time1, Time arrive_time2){
    	
    	String query="select AIRCRAFT from FLIGHTS where ARRIVE_TIME between ? and ?;";
    	List<Flights> flight= jdbcTemplate.query(query,new Object[]{arrive_time1, arrive_time2},new FlightsRowMapper());

    	flight.forEach(item->System.out.println(item.getAircraft()));
        return flight;
    }
    
 // Listar vuelos Air France entre arrive_time X y arrive_time K //
    
  
    
    public List<Flights> getFlightsAfByTime(Time arrive_time1, Time arrive_time2 ){
    	String query="select * from FLIGHTS on (AIRLINE = 'AF') where ARRIVE_TIME between ? and ?;";
    	List<Flights> flight= jdbcTemplate.query(query,new Object[]{arrive_time1, arrive_time2},new FlightsRowMapper());
    	return flight;
    }
    
}
