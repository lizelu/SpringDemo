package com.zeluli.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.zeluli.profile")
public class ProfileConfig {
	@Bean
	@Profile("develop")
	public DemoProfileBean developDemoProfile() {
		return new DemoProfileBean("开发环境：10.3.45.33");
	}
	
	@Bean
	@Profile("product")
	public DemoProfileBean productDemoProfile() {
		return new DemoProfileBean("生产环境:10.23.5.146");
	}
}
