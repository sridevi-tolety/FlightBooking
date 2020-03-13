package com.example.demo.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger , Long >{
	
	@Query(value = "select * from passenger where bookingid = ?1" , nativeQuery=true)
	Set<Passenger> findByBookingId(long bookingId);

}
