package com.likhit.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> s = new ArrayList();
		s.add("Likhit");
		s.add("LIKHIT");
		s.add("Likhit");
		s.add(null);
		System.out.println(s);
		s.remove("Likhit");
		System.out.println(s);
	}

}
