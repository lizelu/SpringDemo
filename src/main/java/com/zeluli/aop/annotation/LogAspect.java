package com.zeluli.aop.annotation;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect			//声明为切面
@Component		//声明为组建Bean
public class LogAspect {
	
	@Pointcut("@annotation(com.zeluli.aop.annotation.Action)")		//通过注解声明切点
	public void annotationPointCut(){};
	
	@Before("annotationPointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("LogAspect: before --- AnnotationController的testMethod方法执行前会调用该方法");
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("LogAspect: before ---- 注解拦截方式" + method.getName());
	}
	
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("LogAspect: after --- AnnotationController的testMethod方法执行完毕后会调用该方法");
	}
}
