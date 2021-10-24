package com.htc.productagg.remotecaller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.productagg.model.Recommendation;

/*
 * https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/#hateoas-support
 */
@FeignClient("product-recommendation-service")
@Component
public interface RemoteRecommendationServiceCaller {
	
@GetMapping("/recommendation/search/findByProductId")
CollectionModel<Recommendation> findByProductId(@RequestParam("productId") Long productId);
}
