package com.zeluli.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zeluli.aop.annotation")
@EnableAspectJAutoProxy
public class AopConfig {
}
