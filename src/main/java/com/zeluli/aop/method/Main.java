package com.zeluli.aop.method;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext aopContext = new AnnotationConfigApplicationContext(AopConfig.class);
		AnnotationController controller = aopContext.getBean(AnnotationController.class);
		controller.testMethod();
		aopContext.close();
	}
}
