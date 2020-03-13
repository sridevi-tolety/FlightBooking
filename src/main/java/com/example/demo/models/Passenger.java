package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;	
	private Date dob;	
	private long bookingid;		
	
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Passenger(long id, String name, String age, Date dob, long bookingid) {
		super();
		this.id = id;
		this.name = name;		
		this.dob = dob;
		this.bookingid = bookingid;
	}
	public Passenger() {}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", dob=" + dob + ", bookingid=" + bookingid
				+ "]";
	}
		
}
