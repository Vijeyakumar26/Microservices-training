package com.htc.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.booking.entity.Booking;
import com.htc.booking.persistance.IBooking;




@RestController
@RequestMapping("/api")
public class BookingController {
	
	private IBooking booking_repo;
	@Autowired
	public void setBooking_repo(IBooking booking_repo) {
		this.booking_repo = booking_repo;
	}
	
	@GetMapping("/bookings")
	List<Booking> getBookingAll()
	{
		return booking_repo.findAll();	 
		
	}
	@GetMapping("/booking/{restaurant_id}")
	Booking getBooking(@PathVariable Long restaurant_id) {
		Booking booking = null;
		booking = booking_repo.findById(restaurant_id).get();
		return booking;
	}
	@PostMapping("/booking")
	Booking createBooking(@RequestBody Booking booking) {
    	return booking_repo.save(booking);
    }
	
	@DeleteMapping("/booking/{restaurant_id}")
	void deleteBooking(@PathVariable Long restaurant_id) {
		booking_repo.deleteById(restaurant_id);
	}
	
	@PutMapping("/booking/{restaurant_id}")
	Booking updateBooking(@PathVariable Long restaurant_id,@RequestBody Booking booking) {
		Booking update_booking = null;
		update_booking = booking_repo.findById(restaurant_id).get();
		update_booking.setTableId(booking.getTableId());
		update_booking.setName(booking.getName());
		update_booking.setId(booking.getId());
		return booking_repo.save(update_booking);
	}
	

}
