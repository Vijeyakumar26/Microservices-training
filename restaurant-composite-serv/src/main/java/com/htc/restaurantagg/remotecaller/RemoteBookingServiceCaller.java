package com.htc.restaurantagg.remotecaller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.restaurantagg.model.Booking;


/*
 * https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/#hateoas-support
 */

@FeignClient("product-recommendation-service")
//@FeignClient("restaurantbooking")

//@FeignClient("restaurant-booking-service")
//@FeignClient(url="http://localhost:8084/restaurant-booking-service",name="restaurant-booking-service")
@Component
public interface RemoteBookingServiceCaller {
	
//@GetMapping("/booking/search/findByProductId")
@GetMapping("/api/booking/{restaurant_id}")
CollectionModel<Booking> findByRestaurantId(@RequestParam("restaurantId") Long restaurantId);
}
