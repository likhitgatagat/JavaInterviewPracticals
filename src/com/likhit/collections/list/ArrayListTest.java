package com.likhit.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String args[]){
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		//ListIterator Example
		ListIterator<Integer> li = l1.listIterator();
		while(li.hasNext()) {
			Integer temp = li.next();
			System.out.println(temp);
			li.add(temp + 5);
		}
		System.out.println("Current List Size: " + l1.size());
		
		//Iterator example
		Iterator<Integer> i = l1.iterator();
		//l1.add(30); throws ConcurrentModificationException
		while(i.hasNext()) {
			System.out.println(i.next());
			l1.set(0, 11);
		}
		l1.add(29);
		System.out.println("Current List Size: " + l1.size());
		
		//Advance for loop
		for(Integer j : l1) {
			System.out.println(j);
			l1.set(1, 12);
			//l1.add(j + 10); This throws concurrent exception
		}
		System.out.println("Current List Size: " + l1.size());
		//legacy for loop
		for(int k = 0; k < l1.size(); k++) {
			System.out.println(l1.get(k));
			l1.add(l1.size(), l1.get(l1.size()-1) + 1);
			l1.remove(l1.size()-1);
		}
		
		ArrayList<Integer> l2 = (ArrayList<Integer>)l1;
		l2.set(2, 13);
		System.out.println(l1);
		System.out.println(l2);
		
		//forEach with lambda expression, Java 8 concept
		l2.forEach(value->System.out.print(value));
		
		l2.forEach(value -> {
			if(value > 10)
				System.out.println(value);
		});
		
		l2.removeIf(item -> item < 10);
		System.out.println(l2);
		l2.replaceAll(item -> item*item);
		System.out.println(l2);
	}
	
}
