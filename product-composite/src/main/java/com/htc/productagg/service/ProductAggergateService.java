package com.htc.productagg.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htc.productagg.model.ProductAggregate;

@RequestMapping("/default")
public interface ProductAggergateService {
	@GetMapping(value="/product-agg/{productId}",produces="application/json")
	ProductAggregate getProduct(@PathVariable Long productId);

}
