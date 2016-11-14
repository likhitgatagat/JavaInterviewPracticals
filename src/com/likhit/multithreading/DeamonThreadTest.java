package com.likhit.multithreading;

public class DeamonThreadTest {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		Thread mt1 = new Thread(new MyThread2("anaya"));
		mt1.start();
		mt.start();
		try {
			Thread.sleep(10000);
			mt1.join();
		}
		catch(InterruptedException e){
			
		}
		finally{
			System.out.println("Exitng main method.....");
		}
	}
}
