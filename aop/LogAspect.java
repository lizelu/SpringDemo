package com.zeluli.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect		//通过注解声明一个切面
@Component	//通过此注解让此切面成为Spring容器管理的Bean
public class LogAspect {
	
	//DemoAnnotationService
	@Pointcut("@annotation(com.zeluli.aop.Action)")		//通过注解声明切点
	public void annotationPointCut(){};
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("DemoAnnotationService的Add方法执行完毕后会调用该方法");
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("after ---- 注解拦截方式" + method.getName());
	}
	
	//DemoMethodService
	@Before("execution(* com.zeluli.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("DemoMethodService的Add方法执行完毕前会调用该方法");
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("before ---- 方法式拦截" + method.getName());
	}
	
}
