package com.zeluli.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//=========================Event=====================
		AnnotationConfigApplicationContext eventContext = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher publisher = eventContext.getBean(DemoPublisher.class);
		publisher.publish("我是Publisher发布的消息");
		eventContext.close();
	}

}
