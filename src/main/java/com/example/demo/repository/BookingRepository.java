package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking , Long>{
	
	@Query(value = "select * from booking where airlinesname = ?1 and username = ?2" , nativeQuery=true)
	List<Booking> findByAirlines(String airlnesname , String username);
	
	@Query(value = "select * from booking where traveldate between ?1 and ?2 and username = ?3" , nativeQuery=true)
	List<Booking> findByDateRange(String fromdate, String todate, String username);
	
	@Query(value = "select * from booking where username = ?1" , nativeQuery=true)
	List<Booking> findByUsername(String username);

}
