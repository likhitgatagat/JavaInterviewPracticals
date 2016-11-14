package com.likhit.ExecutorFramework;

import java.util.concurrent.TimeUnit;

public class LoopTask1 implements Runnable {

	private static int count = 0;
	private int id;
	
	public LoopTask1() {
		this.id = ++count;
	}
	
	@Override
	public void run() {
		System.out.println("##### TASK <" + id + "> STARTED#####");
		for(int i = 10; i>0; i--) {
			System.out.println("TICK TICK " + i + "for TASK " + id);
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("***** TASK<" + id + "> ENDED*****");
	}

}
