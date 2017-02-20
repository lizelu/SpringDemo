package com.zeluli.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zeluli.conditional")
public class ConditionalConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService() {
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(OSXCondition.class)
	public ListService OSXListService() {
		return new OSXListService();
	}
}
