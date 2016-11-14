package com.likhit.multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private final BlockingQueue sharedQueue;
	
	public Consumer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(sharedQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
