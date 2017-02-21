package com.zeluli.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}

	@Bean
	public HelloWorldService helloWorldService(){
		return new HelloWorldService(helloWorld());
	}
}
