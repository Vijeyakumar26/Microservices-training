package com.htc.restaurantagg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.htc.restaurantagg.caller.BookingServiceCaller;
import com.htc.restaurantagg.caller.RestaurantCaller;
import com.htc.restaurantagg.caller.UserServiceCaller;
import com.htc.restaurantagg.model.Bookings;
import com.htc.restaurantagg.model.Restaurant;
import com.htc.restaurantagg.model.RestaurantAggregate;
import com.htc.restaurantagg.model.Users;

@RestController
public class RestaurantAggServiceInegration implements RestaurantAggService {
	
	@Autowired
	private RestaurantCaller rc;
	
	@Autowired
	private BookingServiceCaller bsc;
	
	@Autowired
	private UserServiceCaller usc;
	
	@Override
	public RestaurantAggregate getRestaurant(Long id) {
		
		RestaurantAggregate ra = new RestaurantAggregate();
		Restaurant r = new Restaurant();
		r = rc.getRestaurentById(id);
		
		ra.setRestaurantId(r.getRestaurentId());
		ra.setName(r.getName());
		ra.setAddress(r.getAddress());
		ra.setTables(r.getTables());
		
		List<Bookings> bookings = new ArrayList<>();
		bookings.addAll(bsc.findByRestaurantId(id).getContent());

		ra.setBookings(bookings);
		
		List<Users> users = new ArrayList<>();
		for(Bookings booking:bookings) {
			users.addAll(usc.findByUserId(booking.getUserId()).getContent());
		}
		System.out.println(users);
		ra.setUsers(users);
		
		return ra;
	}

}
