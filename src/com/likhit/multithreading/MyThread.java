package com.likhit.multithreading;

public class MyThread extends Thread {
	
	public MyThread() {
		setDaemon(false);
	}

	@Override
	public void run() {
		int count = 0;
		while(count<15) {
			System.out.println("Hello from worker" + count++);
			try {
				sleep(3000);
			}
			catch(InterruptedException e){
				
			}
		}
	}
	
}
