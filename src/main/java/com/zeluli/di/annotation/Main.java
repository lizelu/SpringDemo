package com.zeluli.di.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//===================依赖注入=============================
		//1、从配置文件加载上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		//2、获取注入的对象
		ControllerBean use = context.getBean(ControllerBean.class);
		
		//3、注入对象的使用
		System.out.println(use.serviceBeanDescription());
		System.out.println(use.componentBeanDescription());
		System.out.println(use.description());
		
		//4、上下文的关闭
		context.close();
	}

}
