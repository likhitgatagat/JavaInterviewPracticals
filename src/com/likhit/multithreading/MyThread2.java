package com.likhit.multithreading;

public class MyThread2 implements Runnable {

	private String name;
	
	public MyThread2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + getName());
		try {
		  Thread.sleep(5000);
		  dbProcessing();
		}
		catch(InterruptedException e) {
			
		}

	}
	
	private void dbProcessing() throws InterruptedException {
		System.out.println("Processing Database");
		Thread.sleep(2000);
	}

}
