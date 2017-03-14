package com.zeluli.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		DemoELService demoELService = context.getBean(DemoELService.class);
		demoELService.outputResource();
		context.close();
	}
}
