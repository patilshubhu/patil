package Advancejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
	HashSet<String> h = new HashSet<String>();
	
	h.add("one");
	h.add("two");
	h.add("three");
	h.add("four");
	h.add("one");
	h.add(null);
	h.add("five");
	
	System.out.println("hashset:-" + h);
	System.out.println("====================");
	
	ArrayList<String> a = new ArrayList<String>();
	
	a.add(null);
	a.add("six");
	a.add("seven");
	a.add("eight");
	a.add("nine");
	a.add("ten");
	a.add("one");
	a.add(null);
	System.out.println("Arraylist:-" + a);
	
	System.out.println("===================");
	System.out.println("add all");
	h.addAll(a);
	System.out.println(h);
	
	System.out.println("======================");
	
	System.out.println("Iterator");
	Iterator itr = h.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
