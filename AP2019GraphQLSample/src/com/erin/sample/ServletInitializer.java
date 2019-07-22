package com.erin.sample;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		
		System.out.println("-------Spring init----------------");
		
		return builder.sources(GraphQlTestApplication.class);
	}

}
