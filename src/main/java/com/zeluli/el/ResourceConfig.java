package com.zeluli.el;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zeluli.el")
public class ResourceConfig {
	@Bean
	public ELConfig elConfig(){
		return new ELConfig();
	}
	
	@Bean
	public DemoService demoService(){
		return new DemoService();
	}
}
