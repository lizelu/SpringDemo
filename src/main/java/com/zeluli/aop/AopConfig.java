package com.zeluli.aop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan("com.zeluli.aop")
@EnableAspectJAutoProxy		//使用该注解开启Spring对AspectJ代理的支持
public class AopConfig {
}
