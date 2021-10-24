package com.htc.productagg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.htc.productagg.model.Product;
import com.htc.productagg.model.ProductAggregate;
import com.htc.productagg.model.Recommendation;
import com.htc.productagg.remotecaller.RemoteProductServiceCaller;
import com.htc.productagg.remotecaller.RemoteRecommendationServiceCaller;

@RestController
public class ProductAggregateIntegration implements ProductAggergateService{
	
	@Autowired
	private RemoteProductServiceCaller productService;
	@Autowired
	private RemoteRecommendationServiceCaller recommendationService;

	@Override
	public ProductAggregate getProduct(Long productId) {
		ProductAggregate proAgg = new ProductAggregate();
		Product prod = new Product();
		
		prod = productService.getProductById(productId);
		proAgg.setProductId(prod.getId());
		proAgg.setName(prod.getName());
		
//		List<Recommendation> recommendations = new ArrayList<>();
//		recommendations.addAll(recommendationService.findByProductId(productId).getContent());
//		proAgg.setRecommendations(recommendations);
//		System.out.println(recommendations.get(0));
//		System.out.println(recommendations.size());
		
		return proAgg;
	}

}
