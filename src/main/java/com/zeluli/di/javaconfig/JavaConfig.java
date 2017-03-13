package com.zeluli.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zeluli.di.javaconfig")
public class JavaConfig {

	@Bean
	public JavaConfigBean createJavaConfigBean() {
		return new JavaConfigBean();
	}
}
