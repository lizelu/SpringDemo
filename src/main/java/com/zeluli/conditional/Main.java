package com.zeluli.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		ConditinalServiceInteface service = context.getBean(ConditinalServiceInteface.class);
		System.out.println(service.description());
		context.close();
	}
}
