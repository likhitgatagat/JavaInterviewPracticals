package com.likhit.basic.implementation;

/*
 As a beginner to the programming, Mishki came to Hackerearth platform, to become a better programmer. 
 She solved some problems and felt very confident. Later being a fan of Hackerearth, she gave a problem to her friends to solve. 
 They will be given a string containing only lower case characters (a-z), and they need to find that by using the characters of the given string, 
 how many times they can print "hackerearth"(without quotes). As they are new to programming world, please help them.

Input: The first line will consists of one integer N denoting the length of string. 
Next line will contain the string Str containing only lower case characters.

Output:
Print one integer, denoting the number of times her friends can print "hackerearth" (without quotes).

Constraints:
1≤N≤106
Each character of string Str will be in range [a,z]
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class PrintHackearth {
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strLength = Integer.parseInt(br.readLine());
        String str = br.readLine();
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        Set<Character> charSet = new HashSet<Character>();
        charSet.add('h');
        charSet.add('a');
        charSet.add('c');
        charSet.add('k');
        charSet.add('e');
        charSet.add('r');
        charSet.add('t');
        if(strLength >= 1 && strLength <= 1000000) {
	        for(int strItr = 0; strItr<str.length(); strItr++) {
	        	Character c = str.charAt(strItr);
	        	if(charSet.contains(c)) {
		        	if(charCount.containsKey(c)) {
		        		charCount.put(c, charCount.get(c) + 1);
		        	}
		        	else {
		        		charCount.put(c, 1);
		        	}
	        	}
	        }
	        int numberOfHackerearth = Integer.MAX_VALUE;
	        if(charCount.size() != 7) {
	        	numberOfHackerearth = 0;
	        }
	        else {
		        Iterator<Character> charCountItr = charCount.keySet().iterator();
		        while(charCountItr.hasNext()) {
		        	Character currentChar = charCountItr.next();
		        	int currentCharCount = 0;
		        	int count = charCount.get(currentChar);
		        	switch(currentChar) {
		        		case 'h': currentCharCount = count/2;
		        			break;
		        		case 'a': currentCharCount = count/2;
		        			break;
		        		case 'c': currentCharCount = count/1;
	        				break;
		        		case 'k': currentCharCount = count/1;
	        				break;
		        		case 'e': currentCharCount = count/2;
	        				break;
		        		case 'r': currentCharCount = count/2;
	        				break;
		        		case 't': currentCharCount = count/1;
	        				break;
		                default: break;
		        	}
		        	if(charCount.containsKey(currentChar) && currentCharCount < numberOfHackerearth) {
	    				numberOfHackerearth = currentCharCount;
	    			}
		        }
	        }
	        System.out.println(numberOfHackerearth);
        }
        else {
        	System.err.println("Contraint Violated");
        }
    }
}
