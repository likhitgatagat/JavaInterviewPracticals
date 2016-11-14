package com.likhit.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add("Vinayak");
		al.add(26);
		
		LinkedList l1 = new LinkedList();
		l1.add(27);
		l1.add(1, "Likhit Gatagat");
		l1.addAll(1, al);
		l1.addFirst("SQS");
		l1.addLast("India");
		System.out.println(l1.element());
		System.out.println(l1.getLast());
		System.out.println(l1.getFirst());
				
		ListIterator li = l1.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
			l1.set(1, "Bagal");
		}
		
		
		Iterator di = l1.descendingIterator();
		while(di.hasNext()) {
			System.out.println(di.next());
		}
		System.out.println(l1);
	}
}
