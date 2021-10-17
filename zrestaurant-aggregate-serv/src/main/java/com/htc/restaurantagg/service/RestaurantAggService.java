package com.htc.restaurantagg.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htc.restaurantagg.model.RestaurantAggregate;

@RequestMapping("/default")
public interface RestaurantAggService {
	
	@GetMapping(value="/restaurant-agg/{id}",produces="application/json")
	RestaurantAggregate getRestaurant(@PathVariable Long id);
	
}
