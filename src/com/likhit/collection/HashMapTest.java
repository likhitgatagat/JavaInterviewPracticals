package com.likhit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static HashMap<String, String> m = new HashMap();
	public static void main(String[] args) {
		myPut("Likhit", "Son");
		myPut("Mahavir", "Father");
		myPut("Sunita", "Mother");
		myPut("Son", "Likhit");
		myPut("Komal", "Sister");
		myPut("Komal", "Daughter");
		myPut("Cherry", "Daughter");
		myPut(null, "Anuja");
		myPut("Vinayak", "Friend1");
		myPut("Sanket", "Friend2");
		myPut(null, "Abhijeet");
		System.out.println(m.get(null));
	
		Set<Entry<String, String>> s = m.entrySet();
		List<Entry<String, String>> l = new ArrayList(s);
		Collections.sort(l, new Comparator<Entry<String, String>>() {
			public int compare(Entry<String, String> e1, Entry<String, String> e2) {
				return (e1.getValue()).compareTo(e2.getValue());
			}
		}
				);
		for(Entry<String, String> lObj: l) {
			System.out.print(lObj + " ");
		}
	}
	
	public static void myPut(String key, String value) {
		if(!m.containsValue(value)) {
			m.put(key, value);
		}
	}

}
