package com.htc.review;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.htc.review.entity.Review;
import com.htc.review.persistence.IReview;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2 	//access swagger ui <project root>/swagger-ui/index.html#/
@EnableWebMvc	//To report url handler error we added this 
public class ReviewServApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ReviewServApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ReviewServApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(IReview repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Review(1,"LUX","ss","ss")));
			log.info("Preloading " + repository.save(new Review(2,"Himalayan","ss","ss")));
		};
	}
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

}
