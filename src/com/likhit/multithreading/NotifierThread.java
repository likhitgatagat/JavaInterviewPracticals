package com.likhit.multithreading;

import java.security.Principal;

public class NotifierThread implements Runnable {

	private Message msg = null;
	
	public NotifierThread(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " Started");
		try {
			Thread.sleep(1);
			synchronized (msg) {
				System.out.println("In notifier class message is: " + msg.getMessage());
					msg.setMessage("notified by "+ threadName);
					msg.notifyAll();
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
