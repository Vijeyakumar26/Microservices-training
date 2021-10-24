package com.htc.patient;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.htc.patient.model.Patient;
import com.htc.patient.persistence.PatientServiceRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EntityScan("com.htc.patient.model")
public class PatientServApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PatientServApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PatientServApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}
	@Bean
	  CommandLineRunner initDatabase(PatientServiceRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Patient("915464567", "Ram","Daniel", 32, "Viral Fever")));
	      log.info("Preloading " + repository.save(new Patient("915665467", "Manoj","Daniel", 39, "Diahorea")));
	      log.info("Preloading " + repository.save(new Patient("815564545", "Kumar","Thomas", 30, "Fracture")));
	      
	    };
	  }

}
