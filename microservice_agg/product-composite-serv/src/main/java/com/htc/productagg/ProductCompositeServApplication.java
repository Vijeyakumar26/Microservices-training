package com.htc.productagg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.htc.productagg.service.util.ServiceClients;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients("com.htc.productagg.remotecaller")
@EnableSwagger2
public class ProductCompositeServApplication {
	@Autowired
	private  ServiceClients client;
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProductCompositeServApplication.class, args);
		
//		ProductCompositeServApplication pcsa=new ProductCompositeServApplication();
//		System.out.println("test url"+pcsa.getClient().getProductServiceURL());
	}

	public ServiceClients getClient() {
		return client;
	}

	public void setClient(ServiceClients client) {
		this.client = client;
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

}
