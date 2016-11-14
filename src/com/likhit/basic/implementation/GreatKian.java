package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatKian {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int num = Integer.parseInt(br.readLine());
	    String[] numbers = br.readLine().split(" ");
	    long sum1= 0;
	    long sum2 = 0;
	    long sum3 = 0;
	    if(num >= 1 && num <=100000) {
	    	for(int itr = 0; itr<num; itr = itr+3) {
	    		sum1 = sum1 + Integer.parseInt(numbers[itr]);
	    		if(itr+1 < num)
	    			sum2 = sum2 + Integer.parseInt(numbers[itr+1]);
	    		if(itr+2 < num)
	    			sum3 = sum3 + Integer.parseInt(numbers[itr+2]);
	    	}
	    	System.out.print(sum1 + " " + sum2 + " " + sum3);
	    }
	    else {
	    	System.err.println("Constraint Violated");
	    }
	}
}
