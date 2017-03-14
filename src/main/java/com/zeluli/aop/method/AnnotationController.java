package com.zeluli.aop.method;

import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
	public void testMethod(){
		System.out.println("\nAnnotationController --- testMethod方法\n");
	}
}
