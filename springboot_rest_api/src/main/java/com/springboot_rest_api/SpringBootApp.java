package com.springboot_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootApp extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

	/*protected SpringApplicationBuilder configure(SpringApplicationBuilder appBuilder) {
		return appBuilder.sources(SpringBootApp.class);
	}*/
}
