package com.zeluli.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//========================AOP=============================
		AnnotationConfigApplicationContext aopContext = new AnnotationConfigApplicationContext(AopConfig.class);
		System.out.println("\n\nAOP-TEST");
		//测试注解式切面
		DemoAnnotationService demoAnnotationService = aopContext.getBean(DemoAnnotationService.class);
		demoAnnotationService.add();
		
		System.out.println("\n");
		//测试方法式切面
		DemoMethodService demoMethodService = aopContext.getBean(DemoMethodService.class);
		demoMethodService.add();
		aopContext.close();
	}

}
