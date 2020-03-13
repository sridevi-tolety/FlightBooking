package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/searchFlightsByDate/{source}/{destination}/{traveldate}")
	public List<Flight> searchedFlights(@PathVariable String source, @PathVariable String destination ,@PathVariable String traveldate){
		return fservice.getSearchedFlights(source, destination, traveldate);		
	}
	
	@GetMapping("/searchFlights")
	public List<Flight> getFlights(){
		return fservice.getFlights();		
	}
	
	/*@GetMapping("/searchBookingHistory/{airlinesname}/{username}")
	public List<Booking> getBookingHistory(@PathVariable String airlinesname , @PathVariable String username) {		
		return bservice.getBookingHistory(airlinesname , username);
	}*/
	
	@GetMapping("/searchBookingHistory/{username}")
	public List<Booking> getBookingHistory(@PathVariable String username) {		
		return bservice.getBookingHistory(username);
	}
	
	@GetMapping("/searchBookingHistoryByDate/{fromdate}/{todate}/{username}")
	public List<Booking> getBookingHistoryByDate(@PathVariable String fromdate , @PathVariable String todate ,@PathVariable String username) {		
		return bservice.getBookingHistoryByDate(fromdate, todate, username);
	}
	
	@PostMapping("/bookFlight")
	public Booking bookFlight(@RequestBody Booking booking) {
		return bservice.bookFlight(booking);
	}	
	
	@GetMapping("/hi")
	public String sayHi(){
		return "Hi";		
	}
	
	
	//@PostMapping("/bookTravel")  Login required
	
	//@GetMapping("/getHistory/{fromDate}/{toDate}/airlinesName")
	
}
