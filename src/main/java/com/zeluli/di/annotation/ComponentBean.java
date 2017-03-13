package com.zeluli.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {
	public String description() {
		return "@Component----我是组件使用的Bean";
	}
}
