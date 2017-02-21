package com.zeluli.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 3000)
	public void reportCurrentTime() {
		System.out.println("每隔3秒执行一次" + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "10 49 16 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
	}
	
}
