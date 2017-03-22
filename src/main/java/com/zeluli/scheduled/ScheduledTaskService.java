package com.zeluli.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	int[] sleepTimes = new int[]{1,2,3,4,5};
	int index = 0;
	//默认任务执行的测试用例
	private void testCase() throws InterruptedException {
		if (index < this.sleepTimes.length) {
			int sleepTime =  sleepTimes[index];
			System.out.print("Start" +sleepTime + ": " +dateFormat.format(new Date()) );
			
			Thread.sleep(sleepTime * 1000);		//以线程休眠来模拟任务的执行时间
			
			System.out.println(" --- End" +sleepTime + ": " +dateFormat.format(new Date()));
			index++;
		} else {
			System.out.println("所有任务重新开始" +dateFormat.format(new Date()));
			index = 0;
		}
	}
	/*
	 * 以3秒固定的频率来执行任务，若上次任务执行时间少于三秒，那么要等到从上次任务开始执行后间隔3秒的时间
	 * 才开始执行下次任务，如果上次任务的执行时间大于3秒，那么就立即执行下次任务
	 */
	//@Scheduled(fixedRate = 3000)
	public void fixedRate() throws InterruptedException {
		this.testCase();
	}
	
	/*
	 * 从上次任务执行结束后，中间间隔三秒的时间来执行下次任务
	 */
	@Scheduled(fixedDelay = 3000)
	public void fixedDelay() throws InterruptedException {
		this.testCase();
	}
	
	//设定3秒执行任务一次，如果上次任务执行的时间不够3秒的倍数，则补成3秒的倍数后再执行下此任务
	@Scheduled(cron = "0/3 * * * * ?")
	public void cornExecution() throws InterruptedException {
		this.testCase();
	}
	
	//秒 分 时 天 月 周 年
	@Scheduled(cron = "11 12 10,12,15 ? * *")
	public void cornExecution1() {
		System.out.println("每天上午10,12,15点12分11秒执行一次" + dateFormat.format(new Date()) + "执行");
	}
	
	//9-17点的0-59间的每分钟的从0秒开始每1秒执行一次
	//@Scheduled(cron = "0/1 0-59 9-17 ? * ?")
	public void cornExecution2() {
		System.out.println("9-17点的0-59间的每分钟的从0秒开始每1秒执行一次" + dateFormat.format(new Date()) + "执行");
	}
	
}
