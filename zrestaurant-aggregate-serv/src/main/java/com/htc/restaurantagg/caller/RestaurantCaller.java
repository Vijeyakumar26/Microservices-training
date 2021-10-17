package com.htc.restaurantagg.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.restaurantagg.model.Restaurant;

@FeignClient("restaurant-serv")
public interface RestaurantCaller {
	
	@GetMapping("/api/restaurents/{id}")
	Restaurant getRestaurentById(@PathVariable Long id);
	
}
