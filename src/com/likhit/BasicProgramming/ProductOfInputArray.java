package com.likhit.BasicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class ProductOfInputArray {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int arraySize = Integer.parseInt(line1);
        String[] array = br.readLine().split(" ");
        BigInteger baseTen = BigInteger.valueOf(10);
        BigInteger factor = baseTen.pow(9).add(BigInteger.valueOf(7));
        BigInteger answer = BigInteger.valueOf(1);
        if(arraySize != array.length) {
        	System.out.println("Input array size " + arraySize + " and actual array size " + array.length + "  mismatch");
        }
        else {
        	for(int i=0; i<array.length; i++) {
        		answer = answer.multiply(new BigInteger(array[i])).mod(factor);
        	}
        	System.out.println(answer);
    	}
        br.close();
    }
    	
}
