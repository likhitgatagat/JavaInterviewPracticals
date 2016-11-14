package com.likhit.innterview;

public class ArrayTest {
	
	public static void main(String[] args) {
		final int[] a = {1, 2, 3};
		int b[] = {4,5,6};
		//a = b; not possible as a is final
		a[0] = 5;
		System.out.println(a[0]);
	}

}
