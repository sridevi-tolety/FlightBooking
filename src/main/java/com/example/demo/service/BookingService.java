package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Booking;
import com.example.demo.models.Passenger;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.PassengerRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository brepo;	
	
	@Autowired
	PassengerRepository prepo;
	
	public List<Booking> getBookingHistory(String airlinesname, String username) {
		List<Booking> bookings =  brepo.findByAirlines(airlinesname , username);
		List<Booking> bookingWithPass = new ArrayList();
		for(int i=0;i<bookings.size();i++) {
			Booking book1 = bookings.get(i);
			Set<Passenger> passengers = prepo.findByBookingId(book1.getId());
			book1.setPassengers(passengers);
			bookingWithPass.add(book1);
		}
		return bookings;
	}
	
	public List<Booking> getBookingHistoryByDate(String fromdate, String todate, String username) {
		List<Booking> bookings =  brepo.findByDateRange(fromdate, todate, username);
		return bookings;
	}

	public Booking bookFlight(Booking booking) {
		// TODO Auto-generated method stub
		Booking book = brepo.save(booking);
		System.out.println("Pass :::"+booking.getPassengers());
		int passCount = booking.getPassengers().size();
		Set<Passenger> pass = booking.getPassengers();
		Iterator<Passenger> iterator = pass.iterator();

		while(iterator.hasNext()){
		  Passenger passElem = iterator.next();
		  passElem.setBookingid(book.getId());
		  prepo.save(passElem);
		}		
		return book;
	}	
}
