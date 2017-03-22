package com.zeluli.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zeluli.conditional")
public class ConditionalConfig {
	
	@Bean
	@Conditional(FirstConditional.class) //指定条件类
	public FirstConditionService getFirstConditionalService() {
		return new FirstConditionService();
	}
	
	@Bean
	@Conditional(SecondConditional.class)
	public SecondConditionService getSecondConditionService() {
		return new SecondConditionService();
	}
}
