package com.htc.restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.htc.restaurant.entity.Restaurant;
import com.htc.restaurant.presistence.IRestaurant;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;





@EnableSwagger2
@EnableWebMvc
@SpringBootApplication
public class RestaurantservApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RestaurantservApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestaurantservApplication.class, args);
		new RestaurantservApplication();
	}

	
	@Bean
	CommandLineRunner initDatabase(IRestaurant repository) {

		return args -> {
		
			log.info("preloading " + repository.save(new Restaurant(2,"bbq","chennai")));
			log.info("preloading " + repository.save(new Restaurant(4,"dominos","chennai")));
			log.info("preloading " + repository.save(new Restaurant(5,"thalapakatti","tambaram")));

		};
	}
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}
}
