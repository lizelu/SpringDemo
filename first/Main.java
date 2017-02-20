package com.zeluli.first;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zeluli.aop.AopConfig;
import com.zeluli.aop.DemoAnnotationService;
import com.zeluli.aop.DemoMethodService;
import com.zeluli.bean_init_destroy.BeanWayService;
import com.zeluli.bean_init_destroy.JSR250WayService;
import com.zeluli.bean_init_destroy.PrePostConfig;
import com.zeluli.el.ELConfig;
import com.zeluli.el.ResourceConfig;
import com.zeluli.event.DemoPublisher;
import com.zeluli.event.EventConfig;
import com.zeluli.profile.DemoProfileBean;
import com.zeluli.profile.ProfileConfig;
import com.zeluli.scope.DemoPrototypeService;
import com.zeluli.scope.DemoSingletonService;
import com.zeluli.scope.ScopeConfig;

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
		
		
		
		//=========================SCOPE===========================
		AnnotationConfigApplicationContext scopeContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService singleton1 = scopeContext.getBean(DemoSingletonService.class);
		DemoSingletonService singleton2 = scopeContext.getBean(DemoSingletonService.class);
		System.out.println("singleton1 与 singleton2是否相等" + singleton1.equals(singleton2));
		
		DemoPrototypeService prototype1 = scopeContext.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototype2 = scopeContext.getBean(DemoPrototypeService.class);
		System.out.println("prototype1 与 prototype2是否相等" + prototype1.equals(prototype2));
		scopeContext.close();
		
		
		
		//==========================EL===============================
		AnnotationConfigApplicationContext elContext = new AnnotationConfigApplicationContext(ResourceConfig.class);
		ELConfig config = elContext.getBean(ELConfig.class);
		config.outputResource();
		elContext.close();
		
		//------------------------Bean Init and Destroy----------------------------
		AnnotationConfigApplicationContext preContext = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWayService beanWayService = preContext.getBean(BeanWayService.class);
		JSR250WayService jsrService = preContext.getBean(JSR250WayService.class);
		preContext.close();
		
		
		//========================Profile===============================
		AnnotationConfigApplicationContext profileContext = new AnnotationConfigApplicationContext();
		profileContext.register(ProfileConfig.class);
		profileContext.getEnvironment().setActiveProfiles("product");
		profileContext.refresh();
		
		DemoProfileBean productBean = profileContext.getBean(DemoProfileBean.class);
		System.out.println(productBean.getContent());
		
		profileContext.close();
		
		
		//=========================Event=====================
		AnnotationConfigApplicationContext eventContext = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher publisher = eventContext.getBean(DemoPublisher.class);
		publisher.publish("我是发布的消息");
		eventContext.close();
		
		
		
	}
}
