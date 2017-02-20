package com.zeluli.first;
import com.zeluli.first.HelloWorld;

public class HelloWorldService {
	HelloWorld helloWorld;
	
	public HelloWorldService(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	public void sayHello() {
		this.helloWorld.sayHello();
	}
}
