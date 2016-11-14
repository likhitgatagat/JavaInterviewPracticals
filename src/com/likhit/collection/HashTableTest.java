package com.likhit.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableTest {
	public static Hashtable<String, String> m = new Hashtable();
	public static void main(String[] args) {
		m.put("Likhit", "Son");
		m.put("Mahavir", "Father");
		m.put("Sunita", "Mother");
		m.put("Son", "Likhit");
		m.put("Komal", "Sister");
		m.put("Komal", "Daughter");
		m.put("Cherry", "Daughter");
		//m.put(null, "Anuja"); Null not allowed in Hashtable
		m.put("Vinayak", "Friend1");
		m.put("Sanket", "Friend2");
		//m.put(null, "Abhijeet"); null not allowed in hash table
		System.out.println(m);

	}

}
