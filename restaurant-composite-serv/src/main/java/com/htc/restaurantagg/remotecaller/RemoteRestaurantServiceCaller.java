package com.htc.restaurantagg.remotecaller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.htc.restaurantagg.model.Restaurant;

@FeignClient("restaurant-service")
//@FeignClient("restaurantserv")
//@FeignClient(url="http://localhost:8084/restaurant-service",name="restaurant-service")
public interface RemoteRestaurantServiceCaller {
	@GetMapping("/api/restaurants/{id}")
	Restaurant getRestaurantById(@PathVariable("id") Long id);


}
	