package Advancejava;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
	// 1. how to remove the duplicate elements from arraylist using hashset.
		
		HashSet h = new HashSet();
		
		// adding the elements in hashset
		
	      h.add("shubhangi");
		  h.add("contact");
		  h.add(null);
		  h.add(1234);
		  h.add("patil");
		  
		  System.out.println(" Hashset:-" +h);
		  
		  System.out.println("============================");
		  
        ArrayList ar = new ArrayList();
        
       // adding the elements in arraylist.
        
        ar.add("patil");
        ar.add(12);
        ar.add("shubhangi");
        ar.add("patil");
        ar.add(12);
        ar.add('A');
        
        System.out.println("Arraylist:-" +ar);
        
		System.out.println("====================================");  
		
		h.addAll(ar);
		  
		System.out.println("Remove duplicate element using the hashset:-" +h);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
