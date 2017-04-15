package com.peizhengxing.chapter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				         .apiInfo(apiInfo())
				         .select()
				         .apis(RequestHandlerSelectors.basePackage("com.peizhengxing.chapter1.controller"))
				         .paths(PathSelectors.any())
				         .build();
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				   .title("测试spring boot swagger2")
				   .description("主要模仿spring boot 是如何工作的")
				   .termsOfServiceUrl("http://localhost:1111")
				   .contact("callback")
				   .version("v1.0")
				   .build();
	}
}
