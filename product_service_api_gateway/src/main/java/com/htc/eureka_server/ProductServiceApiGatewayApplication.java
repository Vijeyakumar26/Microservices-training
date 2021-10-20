package com.htc.eureka_server;

/*
 * @EnableZuulProxy is a superset of @EnableZuulServer .
 * In other words, @EnableZuulProxy contains all filters installed by @EnableZuulServer . 
 * The additional filters in the "proxy" enable routing functionality.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ProductServiceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApiGatewayApplication.class, args);
	}

}
