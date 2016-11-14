package com.likhit.multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private final BlockingQueue sharedQueue;
	public Producer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				sharedQueue.put(i);
			}
			catch(InterruptedException e) {
				System.out.println("Exception caught");
			}
		}

	}

}
