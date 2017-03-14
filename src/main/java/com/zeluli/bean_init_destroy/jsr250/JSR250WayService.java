package com.zeluli.bean_init_destroy.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class JSR250WayService {

	public JSR250WayService() {
		System.out.println("JSR250WayService构造器");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("在JSR250WayService构造器执行完后调用\n");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JSR250WayService销毁之前调用");
	}

}
