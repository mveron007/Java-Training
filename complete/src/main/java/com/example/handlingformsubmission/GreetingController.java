package com.example.handlingformsubmission;

import com.example.handlingformsubmission.model.Airline;
import com.example.handlingformsubmission.model.Country;
import com.example.handlingformsubmission.model.Flights;
import com.example.handlingformsubmission.service.ServiceApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @Autowired
    ServiceApp serviceApp;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }


    @GetMapping("/airlines")
    public String airlinesForm(Model model) {
        model.addAttribute("airlines", serviceApp.getAirlines().iterator());
        return "airlines";
    }

    @GetMapping("/seats")
    public String airlinesSeats(Model model) {
        model.addAttribute("airline", new Airline());
        return "airlineForm";
    }
    
    @GetMapping("/search")
    public String countryRegion(Model model) {
    	model.addAttribute("country", new Country());
    	return "search";
    }
    
    @GetMapping("/searchAir")
    public String aircraftForm(Model model) {
    	model.addAttribute("flights", new Flights());
    	
    	return "searchAir";
    }

    
    @PostMapping("/seat")
    public String seatSubmit(@ModelAttribute Airline airline) {
        airline.setEconomySeat(serviceApp.getEconomySeatsFromAirlines(airline.getAirlineNameShort(),airline.getAirlineNameLong()));
        return "airlineFormResult";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        serviceApp.getAirlines();
        return "result";
    }
    
    @PostMapping("/search")
    public String countrySubmit(Model model, Country country) {
        model.addAttribute("resultado", serviceApp.getCountry(country.getRegion()));
        return "result2";
    }
    
    @PostMapping("/searchAir")
    public String aircraftSubmit(Model model, Flights flights) {
        model.addAttribute("aircrafts", serviceApp.getFlights(flights.getArrive_time1(), flights.getArrive_time2()));
        return "result2air";
    }

}
