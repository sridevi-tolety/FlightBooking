package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Flight;
import com.example.demo.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	FlightRepository frepo;

	public List<Flight> getSearchedFlights(String source , String destination) {
		return frepo.findBySource(source , destination);		
	}

	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		List<Flight>  fs = frepo.findAll();
		System.out.println("Size : "+fs.size());
		return fs;
	}

	public List<Flight> getSearchedFlights(String source, String destination, String traveldate) {
		// TODO Auto-generated method stub
		return frepo.findFlights(source , destination , traveldate);
	}
}
