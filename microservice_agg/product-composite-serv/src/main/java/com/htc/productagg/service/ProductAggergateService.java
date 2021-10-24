package com.htc.productagg.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.productagg.model.ProductAggergate;


@RequestMapping("/default")
public interface ProductAggergateService {

	@GetMapping(value="/product-agg/{productId}",produces="application/json")
	ProductAggergate getProduct(@PathVariable Long productId);
}
