package com.zeluli.aop.method;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zeluli.aop.method")
@EnableAspectJAutoProxy
public class AopConfig {
}
