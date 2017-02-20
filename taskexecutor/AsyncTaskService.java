package com.zeluli.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("异步执行任务：" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("异步执行任务+1: " + (i + 1));
	}
}
