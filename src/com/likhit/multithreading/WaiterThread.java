package com.likhit.multithreading;

public class WaiterThread implements Runnable {

	private Message msg = null;
	
	public WaiterThread(Message message) {
		this.msg = message;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " thread started");

		try {
		synchronized(msg) {
				System.out.println(threadName + " waiting for resource");
				msg.setMessage("Message is being set by" + threadName);
				msg.wait();
				System.out.println(threadName + ": after wait message is " + msg.getMessage());;
				msg.setMessage("notified by "+ threadName);
				//msg.notify();
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
