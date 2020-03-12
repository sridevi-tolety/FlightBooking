package com.example.demo.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String source;
	private String destination;
	private Date bookingdate;
	private Date traveldate;
	private String flightid;
	private String airlinesname;
	
	
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
	
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", source=" + source + ", destination=" + destination + ", bookingDate="
				+ bookingdate + ", travelDate=" + traveldate + ", flightId=" + flightid + "]";
	}
	public Booking(long id, String source, String destination, Date bookingDate, Date travelDate, String flightId) {
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
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getAirlinesname() {
		return airlinesname;
	}
	public void setAirlinesname(String airlinesname) {
		this.airlinesname = airlinesname;
	}
}
