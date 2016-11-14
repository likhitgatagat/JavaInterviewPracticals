package com.likhit.collection;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		List<String> s = new Vector();
		s.add("Likhit");
		s.add("Likhit");
		s.add(null);
		s.add(null);
		s.remove(null);
		System.out.println(s);
	}

}
