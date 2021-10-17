package com.htc.user;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.htc.user.entity.User;
import com.htc.user.persistence.IUser;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@SpringBootApplication
public class UserServApplication 
{
	private static final Logger log = LoggerFactory.getLogger(UserServApplication.class);

	public static void main(String[] args) 
	{
		SpringApplication.run(UserServApplication.class, args);
		new UserServApplication();
	}

	@Bean
	CommandLineRunner initDatabase(IUser repository) {

		return args -> {
			log.info("Preloading " + repository.save(new User("dj", "tambaram","Chennai", "9789212242")));
			log.info("Preloading " + repository.save(new User("rj", "tambaram east","north Chennai", "7708256801")));
			log.info("Preloading " + repository.save(new User("vj", "tambaram west","south Chennai", "9944001237")));

			
		};
	}
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

}
