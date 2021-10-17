package com.htc.restaurantagg.service;
/*
 * In this class we will consume prodcut-service,prod-review service and prod-recommendation service
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.htc.restaurantagg.model.Restaurant;
import com.htc.restaurantagg.model.RestaurantAggergate;
import com.htc.restaurantagg.remotecaller.RemoteRestaurantServiceCaller;
import com.htc.restaurantagg.remotecaller.RemoteBookingServiceCaller;

@RestController
public class RestaurantAggergateIntegration implements RestaurantAggergateService{

	@Autowired
	private RemoteRestaurantServiceCaller restaurantService;
	@Autowired
	private RemoteBookingServiceCaller bookingService;
	//@GetMapping(value="/product-agg/{productId}",produces="application/json")
	
	@Override
	public RestaurantAggergate getRestaurant(Long restaurantId) {
		// TODO Auto-generated method stub
		RestaurantAggergate proAgg=new RestaurantAggergate();
		Restaurant prod=new Restaurant();
		
		prod=restaurantService.getRestaurantById(restaurantId);
		
		proAgg.setRestaurantId(prod.getId());
		proAgg.setName(prod.getName());
		proAgg.setAddress(prod.getAddress());
		proAgg.setId(prod.getId());
		proAgg.setTableno(prod.getTableno());
		
	//	proAgg.setServiceAddresses(prod.getServiceAddresses());
		
//		List<Recommendation> recommendations=new ArrayList<>();
//		recommendations.addAll(recommendationService.findByProductId(productId).getContent());
//		proAgg.setRecommendations(recommendations);
//		System.out.println(recommendations.get(0));
//		System.out.println(recommendations.size());
		return proAgg;
	}
	
	
	


	
	
}
