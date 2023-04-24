package com.ust.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	@Bean(name="helloBean")
	public HelloWorld getBean() {
		return new HelloWorldImpl();
	}
}
