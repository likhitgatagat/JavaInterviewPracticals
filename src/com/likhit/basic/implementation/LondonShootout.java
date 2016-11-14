package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Shootout in London
There is a major shootout going on in London. Gunmen can be encountered in most of the streets 
and only a few of them are safe. Sherlock is given the responsibility to ensure the safety of 
the people by asking them to shift to the nearest safe street.There are N streets on the road. 
The ith street is denoted by the number A[i]. Gunmen do not enter streets that are denoted by 
a prime number i.e. ith street is safe, if A[i] is a prime.

Help Sherlock find the nearest safe street for people trapped in all the N streets i.e. 
print N integers, where the ith integer is the index (1-based) of the nearest safe street. 
The distance between cities i and j is given by |i−j|. For any city j, if there exists no safe city i, 
such that people of city j can move to city i, print −1 for it.

Note :

If there are multiple nearest safe streets, print the one with the lower index.

Input:

The first line contains a single integer N denoting the number of cities. The next line contains N integers, 
where the ith integer denotes A[i] .

Output:
Print the answer on a single line.

Constraints: 1≤N≤5×105
1≤A[i]≤106
*/

public class LondonShootout {
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStreets = Integer.parseInt(br.readLine());
        if(numberOfStreets >=1 && numberOfStreets <= 500000) {
	        String[] streets = br.readLine().split(" ");
	        String[] streetStatus = new String[streets.length];
	        for (int streetIndex = 0; streetIndex < streets.length; streetIndex++) {
	        	boolean isPrime = true;
	        	if(Integer.parseInt(streets[streetIndex]) == 1)
	        		isPrime = false;
	        	if(Integer.parseInt(streets[streetIndex]) == 2)
	        		isPrime = true;
	        	if(Integer.parseInt(streets[streetIndex]) > 2) {
		        	for(int i = 2; i < Integer.parseInt(streets[streetIndex]); i++) {
		        		if(Integer.parseInt(streets[streetIndex]) % i == 0) {
		        			streetStatus[streetIndex] = "N";
		        			isPrime = false;
		        			break;
		        		}
		        	}
	        	}
	        	if(isPrime)
	        		streetStatus[streetIndex] = "Y";
	        	else 
	        		streetStatus[streetIndex] = "N";
	        }
	        StringBuilder nearestSafestStreet = new StringBuilder();
	        for(int streetIndex = 0; streetIndex < streets.length; streetIndex++) {
	        	int nearestSafeStreetDistance = Integer.MAX_VALUE;
	        	int nearestSafeStreetIndex = 0;
	        	if(streetStatus[streetIndex].equals("Y")) {
	        		nearestSafestStreet.append(streets[streetIndex] + " ");
	        	}
	        	else {
	        		for(int itrIndex = 0; itrIndex<streets.length; itrIndex++) {
	        			if(streetStatus[itrIndex].equals("Y")) {
	        				if(nearestSafeStreetDistance >  Math.abs(streetIndex - itrIndex)) {
	        					nearestSafeStreetDistance = Math.abs(streetIndex - itrIndex);
	        					nearestSafeStreetIndex = itrIndex;
	        				}
	        			}
	        		}
	        		if(nearestSafeStreetDistance == Integer.MAX_VALUE) {
	        			nearestSafestStreet.append("-1" + " ");
	        		}
	        		else {
	        			nearestSafestStreet.append(streets[nearestSafeStreetIndex] + " ");
	        		}
	        	}
	        }
	        System.out.print(nearestSafestStreet.deleteCharAt(nearestSafestStreet.length()-1));
        }
    }
}
