package com.zeluli.bean_init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	public JSR250WayService() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		System.out.println("在JSR250WayService构造器执行完后调用");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JSR250WayService销毁之前调用");
	}

}
