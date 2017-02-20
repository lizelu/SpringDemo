package com.zeluli.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//=========================SCOPE===========================
		AnnotationConfigApplicationContext scopeContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService singleton1 = scopeContext.getBean(DemoSingletonService.class);
		DemoSingletonService singleton2 = scopeContext.getBean(DemoSingletonService.class);
		System.out.println("singleton1 与 singleton2是否相等" + singleton1.equals(singleton2));
		
		DemoPrototypeService prototype1 = scopeContext.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototype2 = scopeContext.getBean(DemoPrototypeService.class);
		System.out.println("prototype1 与 prototype2是否相等" + prototype1.equals(prototype2));
		scopeContext.close();

	}

}
