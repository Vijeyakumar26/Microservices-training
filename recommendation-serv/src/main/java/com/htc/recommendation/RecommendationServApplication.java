package com.htc.recommendation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.htc.recommendation.entity.Recommendation;
import com.htc.recommendation.presistence.IRecommendation;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 //access swagger ui <project root>/swagger-ui/index.html#/
@EnableWebMvc//To report url handler error we added this 
@SpringBootApplication
public class RecommendationServApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RecommendationServApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecommendationServApplication.class, args);
	}
	
	
	  @Bean
	  CommandLineRunner initDatabase(IRecommendation repository) {

	    return args -> {
//	      log.info("Preloading " + repository.save(new Recommendation()));
	
		  log.info("Preloading " + repository.save(new Recommendation(1,"aut1",5,"cont1")));
		  log.info("Preloading " + repository.save(new Recommendation(2,"aut2",15,"cont3")));
	    		
	    };
	  }
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

}
