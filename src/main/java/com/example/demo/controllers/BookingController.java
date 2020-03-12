package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Booking;
import com.example.demo.models.Flight;
import com.example.demo.service.BookingService;
import com.example.demo.service.FlightService;

@RestController
@RequestMapping("/flightbooking")
public class BookingController {
	
	@Autowired
	FlightService fservice;
	
	@Autowired
	BookingService bservice;
		
	//@GetMapping("/searchFlights/source/destination/travelDate")
	@GetMapping("/searchFlights/{source}/{destination}")
	public List<Flight> getSearchedFlights(@PathVariable String source, @PathVariable String destination){
		return fservice.getSearchedFlights(source, destination);		
	}
	
	@GetMapping("/searchFlights")
	public List<Flight> getFlights(){
		return fservice.getFlights();		
	}
	
	@GetMapping("/searchBookingHistory/{airlinesname}")
	public List<Booking> getBookingHistory(@PathVariable String airlinesname) {		
		return bservice.getBookingHistory(airlinesname);
	}
	
	@GetMapping("/hi")
	public String sayHi(){
		return "Hi";		
	}
	
	
	//@PostMapping("/bookTravel")  Login required
	
	//@GetMapping("/getHistory/{fromDate}/{toDate}/airlinesName")
	
}
