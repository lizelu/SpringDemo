package com.zeluli.aop.annotation;

import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
	@Action
	public void testMethod(){
		System.out.println("\nAnnotationController --- testMethod方法\n");
	}
}
