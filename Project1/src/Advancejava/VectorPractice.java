package Advancejava;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPractice {
	public static void main(String[] args) {
		
	//1 how to declare the arraylist.
		
	//common way of declaration.
		
		Vector vec = new Vector();
		
	//2. adding the values inside arraylist.
		
		vec.add(20);
		vec.add("shubhangi");
		vec.add("supriya");
		vec.add("swati");
		vec.add("roopali");
		vec.add(94568);
		System.out.println(vec);
		
	//3. adding value in arraylist.
		
		vec.add("swara");
		vec.add("gauri");
		System.out.println(vec);
		
	//4. remove value in arraylist.
		
		vec.remove(5);
		System.out.println(vec);
		
	//5.chect arraylist is empty or not.
		
		System.out.println(vec.isEmpty());
		
	//6.how many elements are present within the arraylist.
		
		System.out.println(vec.size());
		
	//7. check the perticular index.
		
		System.out.println(vec.indexOf("swara"));
		System.out.println(vec.get(5));
		
	//8. check the contains in arraylist.
		
		System.out.println(vec.contains("india"));
		System.out.println(vec.contains("gauri"));
		
	//9.check the capacity arraylist.
		
		System.out.println(vec.capacity());
		
	System.out.println("===========================");
	
	//10. how to read the values within the arraylist.
	
	// loop:- for
	
	 for(int i=0;i<vec.size();i++) {
		 System.out.println(vec.get(i));
	 }
	 System.out.println("++++++++++++++++++++++++++++");
	//11. advanced loop
	 
	 for(Object obj:vec) {
		 System.out.println(obj);
	 }
	 System.out.println("============================");
   //12. iterator.
	 
	 Iterator itr = vec.iterator(); //all implementation class
	 while(itr.hasNext()) {
		 System.out.println(itr.next());}
		 
	System.out.println("++++++++++++++++++++++++++++++");	 
	
	//13. listiterator
		 
		 ListIterator litr=vec.listIterator();  //implementation class of list interface
		 while(litr.hasNext()) {
			 System.out.println(litr.next());
		 }
		 System.out.println("=============================");
	//14. enumeration
		 
		 Enumeration en = vec.elements();
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }
		 System.out.println("+++++++++++++++++++++++++++++++++");
		 
	//15. reverse order
		 
		 Collections.reverse(vec);
		 System.out.println(vec);
		 
		 
	 }
	}


