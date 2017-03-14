package com.zeluli.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//=========================SCOPE===========================
		AnnotationConfigApplicationContext scopeContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		SingletonService singleton1 = scopeContext.getBean(SingletonService.class);
		SingletonService singleton2 = scopeContext.getBean(SingletonService.class);
		System.out.println("singleton1.hashCode = " + singleton1.hashCode());
		System.out.println("singleton2.hashCode = " + singleton2.hashCode());
		
		PrototypeService prototype1 = scopeContext.getBean(PrototypeService.class);
		PrototypeService prototype2 = scopeContext.getBean(PrototypeService.class);
		System.out.println("prototype1.hashCode = " + prototype1.hashCode());
		System.out.println("prototype2.hashCode = " + prototype2.hashCode());
		scopeContext.close();
	}
}
