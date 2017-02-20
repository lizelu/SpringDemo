package com.zeluli.first;
import org.springframework.stereotype.Service;

@Service	//指名该类是Spring管理的一个
public class FunctionService {
	public String sayHello(String message) {
		return "Hello " + message;
	}
}
