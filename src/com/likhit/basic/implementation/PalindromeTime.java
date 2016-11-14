package com.likhit.basic.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author GatagatL
 * Micro and his Son
Our programmer friend Micro just taught his son, Micro Junior, how to read a clock. Few days back he also taught him about palindromes. Now as we know that Micro Junior looks for opportunities to trouble his father, so he started asking him questions. He asked him T questions. In each he gave his father a starting time and an ending time and asked the number of times in between which are palindromes (see sample explanation for more clarity) . Now Micro asked for your help to solve this problem.

Input:
The first line consists of T, the number of questions.
Next T lines consist of a starting time S and an ending time E separated by a space. Time is given in 24-hour format without any colons. (See sample input)

Output:
Print the answer for each question in a new line.

Constraints:
1 ≤ T ≤ 1000
It is assured that every time given is valid. Time starts from 0000 to 2359 
S ≤ E

3
0100 0200
1100 1300
1331 1441

1
2
2
 */
public class PalindromeTime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfQuestions = Integer.parseInt(br.readLine());
        List<Integer> palindromeCount = new LinkedList<Integer>();
        DateFormat fmt = new SimpleDateFormat("HHmm");
        fmt.setLenient(false);
        Map<String, Boolean> palindromeMap = new LinkedHashMap<String, Boolean>();
        for(int questionCount = 0; questionCount < numberOfQuestions; questionCount++){
        	String[] time = br.readLine().split(" ");
        	int startTime = Integer.parseInt(time[0]);
        	int endTime = Integer.parseInt(time[1]);        	
        	int numberOfPalindromes = 0;
        	for(int sTime = startTime; sTime <= endTime; sTime++) {
        		String strTime = String.format("%04d", sTime);
        		try {
        			fmt.parse(strTime);
        			if(palindromeMap.containsKey(strTime)) {
        				if(palindromeMap.get(strTime))
        					numberOfPalindromes++;
        			}
        			else { 
        				if(isPalindrome(strTime)) {
        					palindromeMap.put(strTime, true);
        					numberOfPalindromes++;
        				}
        				else {
        					palindromeMap.put(strTime, false);
        				}
            		}
        		}
        		catch(Exception e) {
        			
        		}
        	}
        	palindromeCount.add(numberOfPalindromes);
        }
        Iterator<Integer> itr = palindromeCount.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		return str.equals(sb.reverse().toString());
	}

}
