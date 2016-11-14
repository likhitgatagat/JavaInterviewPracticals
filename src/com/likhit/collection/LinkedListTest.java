package com.likhit.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String args[]) {
		List<String> s = new LinkedList();
		s.add("Likhit");
		s.add("LIKHIUT");
		s.add("Likhit");
		s.add(null);
		s.add(null);
		System.out.println(s);
	}
}
