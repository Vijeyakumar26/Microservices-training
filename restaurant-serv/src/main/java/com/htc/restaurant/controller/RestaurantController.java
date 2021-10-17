package com.htc.restaurant.controller;

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

import com.htc.restaurant.entity.Restaurant;
import com.htc.restaurant.presistence.IRestaurant;



@RestController
@RequestMapping("/api")
public class RestaurantController {
	
	private IRestaurant repo;

	@GetMapping("/restaurants")
	List<Restaurant> getAllRestaurants()
	{
		return repo.findAll();	 
	}

	@GetMapping("/restaurants/{id}")
	Restaurant getRestaurant(@PathVariable Long id)
	{
		Restaurant rev = null;
		rev = repo.findById(id).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return rev;
	}

	@PostMapping("/restaurants")
	Restaurant createRestaurant(@RequestBody Restaurant restaurant)
	{
		return repo.save(restaurant);
	}

	@DeleteMapping("/restaurants/{id}")  
	void deleteRestaurant(@PathVariable Long id)   
	{  
		repo.deleteById(id);  
	}

	@PutMapping("/restaurants/{id}")
	Restaurant updateRestaurant(@PathVariable Long id ,@RequestBody Restaurant restaurant)
	{
		Restaurant p = null;
		p = repo.findById(id).get();
		
		p.setName(restaurant.getName());
		p.setAddress(restaurant.getAddress());

		return repo.save(p);
	} 

	@Autowired
	public void setRepo(IRestaurant repo) {
		this.repo = repo;
	}


}
