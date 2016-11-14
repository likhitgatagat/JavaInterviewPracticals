package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VasyaArithmeticAnalysis {
	public static Map<Integer, Integer> divisorOutput = new LinkedHashMap<Integer, Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine());
        if(arraySize >=1 && arraySize <= 1000000) {
        	String[] array = br.readLine().split(" ");
            List<BigInteger> output = new LinkedList<BigInteger>();
            int numberOfQueries = Integer.parseInt(br.readLine());
            BigInteger baseTen = BigInteger.valueOf(10);
            BigInteger factor = baseTen.pow(9).add(BigInteger.valueOf(7));
            divisorOutput = calculateDivisors(array);
            if(numberOfQueries >= 1 && numberOfQueries <= 100000) {
            	for(int queryCount = 0; queryCount < numberOfQueries; queryCount++) {
                	String[] queryInputs = br.readLine().split(" ");
                	int l = Integer.parseInt(queryInputs[0]);
                	int r = Integer.parseInt(queryInputs[1]);
                	output.add(calculateQuery(array, l, r).mod(factor));
                }
                Iterator<BigInteger> itr = output.iterator();
                while(itr.hasNext()) {
                	System.out.println(itr.next());
                }
            }
        }
        else {
        	System.err.println("Constraint Violated");
        }
	}
	
	public static BigInteger calculateQuery(String[] array, int l , int r) {
		BigInteger product = new BigInteger("1");
		for(int arrayCount = 0; arrayCount < array.length-1; arrayCount++) {
			int value = Integer.parseInt(array[arrayCount]);
			if(value >= 2 && value <= 10000000) {
				int divisor = divisorOutput.get(value);
				if(divisor > l && divisor <= r) {
					product = product.multiply(BigInteger.valueOf(divisor));
				}
			}
		}
		return product;
	}
	
	public static int calculateDivisor(int num) {
		int biggestDivisor = 1;
		for (int divisor = 2; divisor <= num / 2; divisor++) {
		    if (num % divisor == 0) {
		    	biggestDivisor = divisor;
		    }
		}
		return biggestDivisor;
	}
	
	public static Map<Integer, Integer> calculateDivisors(String[] array) {
		Map<Integer, Integer> divisorOutput = new LinkedHashMap<Integer, Integer>();
		for(int itr = 0 ; itr<array.length-1; itr++) {
			int num = Integer.parseInt(array[itr]);
			if(!divisorOutput.containsKey(num)) {
				int biggestDivisor = 1;
				for (int divisor = 2; divisor <= num / 2; divisor++) {
				    if (num % divisor == 0) {
				    	biggestDivisor = divisor;
				    }
				}
				divisorOutput.put(num, biggestDivisor);
			}
		}
		return divisorOutput;
	}

}

