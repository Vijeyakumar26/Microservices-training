package com.htc.productagg.remotecaller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.productagg.model.Product;

@FeignClient("product-service")
public interface RemoteProductServiceCaller {
	@GetMapping("/api/products/{id}")
	Product getProductById(@PathVariable("id") Long id);

}
	