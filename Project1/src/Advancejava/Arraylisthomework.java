package Advancejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylisthomework {
	
	public static void main(String[] args) {
		
		//1. declare the arraylist
		
		ArrayList sr=new ArrayList();
		ArrayList sr1=new ArrayList();
		//2.how to declare values inside arrays
	
		 sr.add(10);
		 sr.add("velocity");
		 sr.add('A');
		 sr.add(23456);
		 System.out.println(sr);
		 
		 //3.chect it is empty or not
		 
		 System.out.println(sr.isEmpty());
		 System.out.println(sr1.isEmpty());
		 
		 for(int i=0;i<sr.size();i++) {
			 System.out.println(sr.get(i));}
		 
		System.out.println("=========");
		
		//4.check the contains.
			 
			 System.out.println(sr.contains("velocity"));
			 System.out.println(sr.contains("supriya"));
		
		//5.remove the value in arraylist.
			 sr.remove(1);
			 System.out.println(sr);
			 
		//6.add the extra value in array.
			 sr.add(0,"home");
			 
		System.out.println("=================");
		
 //7.iterator
		
		//declaring the iterator.
		//for any class in collection
		Iterator itr=sr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	System.out.println("*************");	
//8. listiterator
	
//is for only list interface classes.
ListIterator litr=sr.listIterator()	;	
while (litr.hasNext()) {
	System.out.println(litr.next());
}
//9.reverse the arraylist.

Collections.reverse(sr);
System.out.println(sr);
	}

	}				 


				 
			 
	 
	


