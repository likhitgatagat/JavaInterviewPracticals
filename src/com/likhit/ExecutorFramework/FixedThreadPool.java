package com.likhit.ExecutorFramework;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread Started:" + new Date());
		//ExecutorService execService = Executors.newFixedThreadPool(2);
		//ExecutorService execService = Executors.newCachedThreadPool();
		ExecutorService execService = Executors.newSingleThreadScheduledExecutor();
		execService.execute(new LoopTask1());
		execService.execute(new LoopTask1());
		execService.execute(new LoopTask1());
		execService.execute(new LoopTask1());
		execService.shutdown();
		
		try {
			execService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread Ended:" + new Date());
	}

}
