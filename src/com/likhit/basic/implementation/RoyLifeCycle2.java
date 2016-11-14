package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class RoyLifeCycle2{
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDays = Integer.parseInt(br.readLine());
        int codingStreakOnDay = 0;
        int highestCodingStreakOfAllDays = 0;
        int previousDayEodCodingStreak = 0;
        int consecutiveCodingStreak = 0;
        int highestConsecutiveCodingStreak = 0;
        boolean isFirstActivityCoding = false;
        boolean islastActivityCoding = false;
        boolean isCodingStreakInterrupted = false;
        if(numberOfDays >= 1 && numberOfDays <= 365) {
	        for(int i = 0; i<numberOfDays; i++) {
	        	String line = br.readLine();
	        	if(line.length() > 0) {
	        		int tempCount = 0;
	        		for(int j = 0; j<line.length(); j++) {
	        			char activity = line.charAt(j);
	        			if(activity == 'C') {
	        				tempCount++;
	        				if(j==0)
	        					isFirstActivityCoding = true;
	        				if(j==(line.length()-1))
	        					islastActivityCoding = true;
	        			}
	        			else {
	        				isCodingStreakInterrupted = true;
	        				tempCount = 0;
	        				if(isFirstActivityCoding)
	        					isFirstActivityCoding = false;
	        			}
	        			if(isFirstActivityCoding) {
        					consecutiveCodingStreak = tempCount + previousDayEodCodingStreak;
        				}
        				if(codingStreakOnDay < tempCount) {
	    					codingStreakOnDay = tempCount;
	    				}
        				if(islastActivityCoding) {
        					if(!isCodingStreakInterrupted) {
        						previousDayEodCodingStreak =  previousDayEodCodingStreak + tempCount;
        					}
        					else {
        						previousDayEodCodingStreak =   tempCount;
        						isCodingStreakInterrupted = false;
        					}
        					islastActivityCoding = false;
        				}
	        		}
	        		if(highestCodingStreakOfAllDays < codingStreakOnDay) {
	        			highestCodingStreakOfAllDays = codingStreakOnDay;
	        		}
	        		if(highestConsecutiveCodingStreak < consecutiveCodingStreak) {
	        			highestConsecutiveCodingStreak = consecutiveCodingStreak;
	        		}
	        		codingStreakOnDay = 0;
	        		consecutiveCodingStreak = 0;
	        	}
	        }
	        if(highestConsecutiveCodingStreak < highestCodingStreakOfAllDays) {
	        	highestConsecutiveCodingStreak = highestCodingStreakOfAllDays;
	        }
	        System.out.println(highestCodingStreakOfAllDays + " " + highestConsecutiveCodingStreak);
        }
        else {
        	System.out.println("Constraint Violated");
        }
       
    }
}
