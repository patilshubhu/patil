package Advancejava;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
	public static void main(String[] args) {
		
 //1.creating linked hashset.
		
		LinkedHashSet lhs = new LinkedHashSet();
		
 //2. TO add the elements.
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		lhs.add(1);
		
 //3. try to add the duplicates
		lhs.add("A");
		lhs.add("E");
		
		System.out.println(lhs);
		
		System.out.println("the size is:- "+lhs.size());
		System.out.println("check the present element:- "+lhs.contains("A"));
		lhs.remove("E");
		System.out.println(lhs);
		System.out.println(lhs.remove(1));
		System.out.println(lhs);
		System.out.println(lhs.remove("Z"));
		System.out.println(lhs);
		
 //4 iterator
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
