package com.example.demo.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String source;
	private String destination;
	private Date bookingdate;
	private Date traveldate;
	private long flightid;
	String airlinesname;
	private String username;
	
	@Transient
	private Flight flight;	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public String getAirlinesname() {
		return airlinesname;
	}
	public long getFlightid() {
		return flightid;
	}
	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}
	
	@OneToMany
	@Transient 
	private Set<Passenger> passengers; 
	
	public Set<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Booking(long id, String source, String destination, Date bookingDate, Date travelDate, long flightId) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.bookingdate = bookingDate;
		this.traveldate = travelDate;
		this.flightid = flightId;
	}
	
	public Booking() {}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	 Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	/* String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getAirlinesname() {
		return airlinesname;
	}*/
	public void setAirlinesname(String airlinesname) {
		this.airlinesname = airlinesname;
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingdate=" + bookingdate +  ", username="
				+ username + ", flightid=" + flightid + ", passengers=" + passengers + "]";
	}
	public Booking(long id, Date bookingdate, String airlinesname, String username, long flightid,
			Set<Passenger> passengers) {
		super();
		this.id = id;
		this.bookingdate = bookingdate;		
		this.username = username;
		this.flightid = flightid;
		this.passengers = passengers;
	}
}
