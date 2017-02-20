package com.zeluli.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		ListService listService = context.getBean(ListService.class);
		String msg = context.getEnvironment().getProperty("os.name") + "系统下的列表命令为" + listService.showListCmd();
		System.out.println(msg);
		context.close();

	}

}
