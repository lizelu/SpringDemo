package com.zeluli.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public void outputResult() {
		System.out.println("从组合注解获取的Bean");
	}
}
