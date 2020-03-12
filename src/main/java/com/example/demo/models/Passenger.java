package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String age;
	private Date dob;
	
	private long bookingId;
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	public Passenger(long id, String name, String age, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}	
}
