package com.zeluli.di.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerBean {
	@Autowired
	JavaConfigBean javaConfigBean;	// JavaConfigBean的注入点
	
	public String javaConfigBeanDescription() {
		return javaConfigBean.description();
	}
	
	public String description() {
		return "@Controller----我是Controller层使用的Bean";
	}
}
