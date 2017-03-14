package com.zeluli.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void testProfile(String environment){
		AnnotationConfigApplicationContext profileContext = new AnnotationConfigApplicationContext();
		profileContext.register(ProfileConfig.class);
		profileContext.getEnvironment().setActiveProfiles(environment);
		profileContext.refresh();
		
		DemoProfileBean productBean = profileContext.getBean(DemoProfileBean.class);
		System.out.println(productBean.getContent());
		
		profileContext.close();
	}
	
	public static void main(String[] args) {
		testProfile("product");
		testProfile("develop");
	}
	
	

}
