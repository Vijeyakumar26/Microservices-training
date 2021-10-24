package com.htc.productagg.remotecaller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.productagg.model.Recommendation;

//@FeignClient("product-recommendation-service")
@FeignClient(url="http://localhost:8084/product-recommendation-service",name="product-recommendation-service")
@Component
public interface RemoteRecommendationServiceCaller
{
	@GetMapping("/recommendation/search/findByProductId")
	//@GetMapping("api/recommendations/{recommendationid}")
	CollectionModel<Recommendation> findByProductId(@RequestParam("productId")Long productId);
	
}
