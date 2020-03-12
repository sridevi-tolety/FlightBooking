package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Flight {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String source;
	private String airlinesname;
	private String destination;
	private Date traveldate;
	
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
	public Date gettraveldate() {
		return traveldate;
	}
	public void settraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	
	@Override
	public String toString() {
		return "Flight [id=" + id + ", source=" + source + ", destination=" + destination + ", traveldate=" + traveldate
				+ ", airlinesname=" + airlinesname + "]";
	}
	public Flight(long id, String source, String destination, Date traveldate, String airlinesname) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.traveldate = traveldate;
		this.airlinesname = airlinesname;
	}
	
	public Flight() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getairlinesname() {
		return airlinesname;
	}
	public void setairlinesname(String airlinesname) {
		this.airlinesname = airlinesname;
	}	

}
