package com.htc.restaurantagg.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.restaurantagg.model.Bookings;

@FeignClient("restaurant-booking-service")
@Component
public interface BookingServiceCaller {
	
	@GetMapping("/booking/search/findByRestaurantId")
	CollectionModel<Bookings> findByRestaurantId(@RequestParam("restaurantId") Long restaurantId);
	
}
