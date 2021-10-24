package com.htc.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //access swagger ui <project root>/swagger-ui/index.html#/
@EnableWebMvc//To report url handler error we added this 

public class ProductServApplication {
	 private static final Logger log = LoggerFactory.getLogger(ProductServApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductServApplication.class, args);
		new ProductServApplication();
	}

	//Below Data is already loaded in database 
	/*
	 * if youre freshly setting up the application run below method to insert two test data
	 */

//	  @Bean
//	  CommandLineRunner initDatabase(IProduct repository) {
//
//	    return args -> {
//	      log.info("Preloading " + repository.save(new Product("LUX",0.50)));
//	      log.info("Preloading " + repository.save(new Product("Dettol",0.50)));
//	    };
//	  }
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}
}


