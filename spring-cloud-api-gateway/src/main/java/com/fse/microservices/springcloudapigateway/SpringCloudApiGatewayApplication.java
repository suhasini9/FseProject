package com.fse.microservices.springcloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiGatewayApplication.class, args);
	}

//	 @Bean
//	   public WebMvcConfigurer corsConfigurer() {
//	      return new WebMvcConfigurerAdapter() {
//	         @Override
//	         public void addCorsMappings(CorsRegistry registry) {
//	            registry.addMapping("/*").allowedOrigins("http://localhost:4200");
//	         }
//	      };
//	   }
	 
}
