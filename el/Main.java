package com.zeluli.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//==========================EL===============================
		AnnotationConfigApplicationContext elContext = new AnnotationConfigApplicationContext(ResourceConfig.class);
		ELConfig config = elContext.getBean(ELConfig.class);
		config.outputResource();
		elContext.close();

	}

}
