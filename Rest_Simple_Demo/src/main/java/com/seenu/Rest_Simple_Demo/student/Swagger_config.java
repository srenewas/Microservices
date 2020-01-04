package com.seenu.Rest_Simple_Demo.student;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger_config {
	
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2); //http://localhost:8080/v2/api-docs     http://localhost:8080/swagger-ui.html
		
	}

}
