package com.swagger_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;


@SpringBootApplication
//@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemoApplication.class, args);
		
	}
	
//	@Bean
//	public Docket swaggerApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//			      .select() 
//			      .apis(RequestHandlerSelectors.any())
//			      .paths(PathSelectors.ant("/api/v1/*"))
//			      .build();
//	}

	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/v1/*"))
				.apis(RequestHandlerSelectors.basePackage("com.swagger_demo"))
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
	return new ApiInfo(
			"1234", "Course API", "1.0", "free to use", new springfox.documentation.service.Contact("blah1","","blah3@gmail.com"), "apiLicense", "", Collections.emptyList());
	}

}
