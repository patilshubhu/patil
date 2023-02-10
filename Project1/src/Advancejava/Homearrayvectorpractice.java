package Advancejava;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Homearrayvectorpractice {
	
	public static void main(String[] args) {
		
 //1.declare vector
		
		Vector vec = new Vector();
		
 //2.adding the values
		
		vec.add("Padma");
		vec.add("Rupali");
		vec.add("Shital");
		vec.add("Shubhangi");
		vec.add("Shree");
		System.out.println(vec);
		
 //3. adding the extra values
		
		vec.add("Aai");
		vec.add("Pappa");
		System.out.println(vec);
		
 //4. check the it is empty or not
		
		System.out.println(vec.isEmpty());
		
 //5. remove the value
		vec.remove(4);
		System.out.println(vec);
		System.out.println(vec.remove(4));
		
 //6.check the perticular index
		
		System.out.println(vec.indexOf("Shital"));
		System.out.println(vec.get(2));
		
 //7. how many elements are present.
		
		System.out.println(vec.size());
		
 //8. replace element
		
		vec.set(2, "avanti");
		System.out.println(vec);
		
 //9. check the contains are present or not.
		
		System.out.println(vec.contains( "Pappa"));
		System.out.println(vec.contains("patil"));
		
 //10. check the capacity
		
		System.out.println(vec.capacity());
		
	System.out.println("++++++++++++++++++++++++++++++++");	
	
 //11. how to read the values
		//for loop
		
		for (int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
			
	System.out.println("++++++++++++++++++++++++++++++++");	
	
 // 12. advance loop
			
		for(Object object:vec) {
		System.out.println(object);	
		
	System.out.println("================================");	
	
 //13.iterator
		Iterator itr =vec.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	System.out.println("==============================");
		
 //14.listiterator
		
		ListIterator litr =vec.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());}
		
 //15.reverse 
		
	Collections.reverse(vec);
	System.out.println(vec);

	System.out.println("++++++++++++++++++++++++");
	
 //16.Enumeration
	
	//Enumeration en=vec.elements();
	//while(en.hasMoreElements()) {
	//	System.out.println(en.nextElement());
	}
	
	
		}
		
		}
	}	
	
		
		
	


