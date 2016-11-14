package com.likhit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		List<String> l = new ArrayList();
		l.add("Likhit");
		l.add("Mahavir");
		l.add("Gatagat");
		TreeSet<String> s = new TreeSet(new MyComparator());
		s.add("Likhit");
		s.add("Likhit");
		//s.add(null); Does not allow null in this collection
		s.addAll(l);
		//System.out.println(s.descendingSet());
		System.out.println(s);
		
	}
	

	
	static class MyComparator implements Comparator<String> {
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	}

}
