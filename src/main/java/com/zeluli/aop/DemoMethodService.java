package com.zeluli.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
	public void add() {
		System.out.println("DemoMethodService.add");
	}
}
