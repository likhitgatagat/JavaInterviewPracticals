package com.likhit.automic;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicIntegers {

	private AtomicInteger counter = new AtomicInteger();

	public int getNextUniqueIndex() {
	    return counter.addAndGet(1);
	}
	
	public static void main(String[] args) {
		AutomicIntegers ai = new AutomicIntegers();
		System.out.println(ai.getNextUniqueIndex());
		System.out.println(ai.getNextUniqueIndex());
		System.out.println(ai.getNextUniqueIndex());
	}

}
