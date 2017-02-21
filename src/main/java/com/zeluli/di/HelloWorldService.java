package com.zeluli.di;
import com.zeluli.di.HelloWorld;

public class HelloWorldService {
	HelloWorld helloWorld;
	
	public HelloWorldService(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	public void sayHello() {
		this.helloWorld.sayHello();
	}
}
