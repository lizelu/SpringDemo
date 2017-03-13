package com.zeluli.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerBean {
	@Autowired
	ServiceBean serviceBean;
	
	@Autowired
	ComponentBean componentBean;
	
	public String serviceBeanDescription() {
		return serviceBean.description();
	}
	
	public String componentBeanDescription() {
		return componentBean.description();
	}
	
	public String description() {
		return "@Controller----我是Controller层使用的Bean";
	}
}
