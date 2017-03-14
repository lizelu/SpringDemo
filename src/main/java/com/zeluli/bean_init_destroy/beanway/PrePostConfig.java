package com.zeluli.bean_init_destroy.beanway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zeluli.bean_init_destroy.beanway")
public class PrePostConfig {
	@Bean(initMethod="init",destroyMethod="destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
}
