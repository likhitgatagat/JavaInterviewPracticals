package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class RoyLifeCycle {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDays = Integer.parseInt(br.readLine());
        int codingStreakOnDay = 0;
        int highestCodingStreakOfAllDays = 0;
        if(numberOfDays >= 1 && numberOfDays <= 365) {
	        for(int i = 0; i<numberOfDays; i++) {
	        	String line = br.readLine();
	        	if(line.length() == 1440) {
	        		int tempCount = 0;
	        		for(int j = 0; j<line.length(); j++) {
	        			char activity = line.charAt(j);
	        			if(activity == 'C') {
	        				tempCount++;
	        			}
	        			else {
	        				tempCount = 0;
	        			}
	        			if(codingStreakOnDay < tempCount) {
	    					codingStreakOnDay = tempCount;
	    				}
	        		}
	        		if(highestCodingStreakOfAllDays < codingStreakOnDay) {
	        			highestCodingStreakOfAllDays = codingStreakOnDay;
	        		}
	        		codingStreakOnDay = 0;
	        	}
	        }
	        System.out.println(highestCodingStreakOfAllDays);
        }
        else {
        	System.out.println("Constraint Violated");
        }
       
    }
}
