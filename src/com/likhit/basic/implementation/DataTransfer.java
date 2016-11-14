package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Data Transfer
Monk works in a company that is into distributed systems and parallel computing. His daily work involves a large number of computers, and now he has the following task at hand :

Given a room consisting of N high performance systems, Monk has been told to transfer information between any 2 systems, lets call them i and j. where i<j. Now, as per the rules of company, to transfer information from system i to j, one needs to transfer the data sequentially via all systems k, such that i≤k≤j. In short, if one needs to transfer the data from machine 1 to 4, the path for the data shall be 1−>2−>3−>4.

Now, Each machine in this room is in one of two possible states, i.e. locked or unlocked. If a machine is in the unlocked state, data can be transferred via this machine, and the same cannot be done for a locked machine. So, in order to for Monk to transfer data between any 2 machines i and j, such that i<j , all machines k, such that i≤k≤j must be unlocked.

Now, Considering Monk's boss randomly picks a pair of machines i and j, such that i<j among all such possible pairs, and the probability of each pair being picked remains the same, Monk wants to know the probability that he shall successfully be able to transfer the data, Can you help him out ?

Input Format :

The first line contains a single integer N denoting the number of systems the room consists of. The next line consists of N space separated integers, where the ith integer denotes the state of the ith machine. This integer is 0 if the machine is unlocked, otherwise its 1.

Output Format :

Print 2 space separated integers, denoting the numerator and denominator of the required fraction respectively. The numerator and denominator should be co-prime.

Constraints : 
1≤N≤1000000
0≤A[i]≤1

Sample Input
5
1 0 0 0 1
Sample Output
3 10
Explanation
Here, it is possible to transfer data between systems (2,3), (3,4) and (2,4) out of all possible pairs where i<j. So the answer is 3/10.
 */
public class DataTransfer {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfSystems = Integer.parseInt(br.readLine());
        String[] sysStatus = br.readLine().split(" ");
        if(numberOfSystems >= 1 && numberOfSystems <= 1000000) {
        	int possiblePairs = 0;
        	if(numberOfSystems == 2) {
        		possiblePairs = 1;
        	}
        	else if(numberOfSystems > 2) {
        		possiblePairs = (factorial(numberOfSystems)/factorial(numberOfSystems - 2))/2;
        	}
	        int possibleTransfer = 0;
	        if(numberOfSystems > 1) {
		        for(int sys = 0; sys < numberOfSystems; sys++) {
		        	if(Integer.parseInt(sysStatus[sys]) == 0) {
		        		for(int sysItr = sys+1; sysItr < numberOfSystems; sysItr++) {
		        			if(Integer.parseInt(sysStatus[sysItr]) == 0) {
		        				possibleTransfer++;
		        			} else {
		        				break;
		        			}
		        		}
		        	}
		        }
	        }
	        System.out.println(possibleTransfer + " " + possiblePairs);
        }
        else {
        	System.err.println("Constraint Violated");
        }
	}
	
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++){    
      		fact=fact*i;    
  		}
  		return fact;
	}
}