package com.zeluli.first;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired			//实体Bean注入点
	FunctionService functionService;
	
	public String sayHello(String message) {
		return functionService.sayHello(message);
	}
}
