package com.likhit.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet();
		s.add("Likhit");
		s.add("Likhit");
		s.add("LIKHIT");
		s.add(null);
		s.add(null);
		System.out.println(s);

	}

}
