package Advancejava;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("padama");
		ll.add("roopali");
		ll.add("shital");
		ll.add("shree");
		
		System.out.println("Lnkedlist:-" +ll);
		
		System.out.println("===================");
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=====================");
		
		//getfirst,getlast & add first,add last & remove first,remove last.
		
		System.out.println("The first element is " + ll.getFirst());
        System.out.println("The last element is " + ll.getLast());
        
        System.out.println("==========================");
        
        ll.addFirst("patil");
        ll.addLast("family");
        System.out.println("addfirst & addlast");
        System.out.println(ll);
        
        System.out.println("=========================");
        
        ll.removeFirst();
        ll.removeLast();
        System.out.println("removefirst & removelast");
        System.out.println(ll);
        
        
	}

}
