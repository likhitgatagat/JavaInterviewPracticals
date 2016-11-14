package com.likhit.basic;

public class Test4 {
	public static void main(String[] args) {
		System.out.println(reverse("Shreyas"));
	}
	
	public static String reverse(String orig)
	{
	    char[] s = orig.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    return new String(s);
	}
}
