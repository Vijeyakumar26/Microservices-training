package com.htc.restaurantagg.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.restaurantagg.model.RestaurantAggergate;


@RequestMapping("/default")
public interface RestaurantAggergateService {

	@GetMapping(value="/restaurant-agg/{restaurantId}",produces="application/json")
	RestaurantAggergate getRestaurant(@PathVariable Long restaurantId);
}
