package com.zeluli.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=========================Awear=======================
		AnnotationConfigApplicationContext awearContext = new AnnotationConfigApplicationContext(AwearConfig.class);
		AwareService aware = awearContext.getBean(AwareService.class);
		aware.outputResult();
		awearContext.close();
	}

}
