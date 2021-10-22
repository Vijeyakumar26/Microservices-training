package com.htc.booking;

import java.time.LocalDate;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.htc.booking.entity.Booking;
import com.htc.booking.persistance.IBooking;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class BookingServApplication {
	private static final Logger log = LoggerFactory.getLogger(BookingServApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookingServApplication.class, args);
		new BookingServApplication();
	}
	@Bean
	  CommandLineRunner initDatabase(IBooking repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Booking("1", LocalDate.now(), LocalTime.now(), "1","1", "deva")));
	      log.info("Preloading " + repository.save(new Booking("1", LocalDate.now(), LocalTime.now(), "2","2", "dj")));
	      log.info("Preloading " + repository.save(new Booking("1", LocalDate.now(), LocalTime.now(), "3","3", "vj")));
	      
	    };
	  }
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}
}
