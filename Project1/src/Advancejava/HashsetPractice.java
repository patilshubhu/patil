package Advancejava;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		// adding the elements inside the hashset.
		
		hs.add('A');
		hs.add(2892);
		hs.add(12.34);
		hs.add(null);
		hs.add("pari");
		
		System.out.println("Hashset:-" +hs);
		
		System.out.println("====================");
		
		System.out.println("Iterator");
		Iterator itr =hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("======================");
		
		//Advance loop
		
		System.out.println("Advance for loop");
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


