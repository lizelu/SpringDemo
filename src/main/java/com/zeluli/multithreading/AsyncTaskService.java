package com.zeluli.multithreading;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	@Async	//声明异步执行的方法
	public void executeAsyncTask1(Integer i) {
		System.out.println("线程ID: " + Thread.currentThread().getId() + " Integer: "+ i);
	}
}
