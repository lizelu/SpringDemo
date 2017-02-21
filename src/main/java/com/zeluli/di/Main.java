package com.zeluli.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//===================DI=============================
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		UseFunctionService use = context.getBean(UseFunctionService.class);
		System.out.println(use.sayHello("Spring"));
		context.close();
		
		AnnotationConfigApplicationContext contextSecond = new AnnotationConfigApplicationContext(JavaConfig.class);
		HelloWorldService hello = contextSecond.getBean(HelloWorldService.class);
		hello.sayHello();
		contextSecond.close();
	
		
		
	}
}
