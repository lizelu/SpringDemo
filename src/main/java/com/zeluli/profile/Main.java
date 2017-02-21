package com.zeluli.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//========================Profile===============================
		AnnotationConfigApplicationContext profileContext = new AnnotationConfigApplicationContext();
		profileContext.register(ProfileConfig.class);
		profileContext.getEnvironment().setActiveProfiles("product");
		profileContext.refresh();
		
		DemoProfileBean productBean = profileContext.getBean(DemoProfileBean.class);
		System.out.println(productBean.getContent());
		
		profileContext.close();
	}

}
