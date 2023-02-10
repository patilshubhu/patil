package Advancejava;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortingProgram {
	
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();  //generic way
		
   //1.add the values in arraylist.
		
		al.add("Apple");
		al.add("Chilli");
		al.add("Banana");
		al.add("God");
		al.add("Elephent");
		al.add("Icecream");
		
		System.out.println("arraylist before sorting:-" +al);
	
	//2 assending sorting arraylist
		
		Collections.sort(al);
		
		System.out.println("arraylist after sorting:-" +al);
		
	//3. desending sorting arraylist.
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("arraylist after sorting in desending order:-" +al);
	}

}
