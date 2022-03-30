package com.zensar.messageapi.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * @author Vijay
 * this configuration file is needed for customizing CORS configuration
 * CORS - Cross  Origin Resource Sharing
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer{
	
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
			registry
					.addMapping("/api/**")
					.allowedMethods("GET","DELETE","PUT","POST")
					.allowedOrigins("http://localhost:4200");
	}

}
