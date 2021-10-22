package com.htc.clinicserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer 
@SpringBootApplication
public class ClinicEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicEurekaServerApplication.class, args);
	}

}
