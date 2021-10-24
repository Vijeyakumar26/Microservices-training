package com.htc.clinicservice;

import java.time.LocalDate;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.htc.clinicservice.model.Clinic;
import com.htc.clinicservice.persistence.ClinicServiceRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EntityScan("com.htc.clinicservice.model")
public class ClinicServApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ClinicServApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ClinicServApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}
	@Bean
	  CommandLineRunner initDatabase(ClinicServiceRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Clinic("1", "Ram","Daniel", 32, LocalDate.now())));
	      log.info("Preloading " + repository.save(new Clinic("1", "Krishna","Daniel", 33, LocalDate.now())));
	      log.info("Preloading " + repository.save(new Clinic("3", "Sam","Kumar", 35, LocalDate.now())));
	      
	    };
	  }
}
