package Advancejava;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSortingPractice {
	
	public static void main(String[] args) {
		
	//1 add the values in arrylist
		
		ArrayList<Integer> ai=new ArrayList<Integer>();
		
		ai.add(1234);
		ai.add(546);
		ai.add(789);
		ai.add(1011);
		ai.add(1213);
		ai.add(1415);
		ai.add(1617);
		ai.add(1819);
		
		System.out.println("arraylist before sorting:-" +ai);
		
	//2. sorting assending arraylist.
		
		Collections.sort(ai);
		System.out.println("arraylist after sorting:-" +ai);
		
	//3. sorting desending arraylist.
		
		Collections.sort(ai,Collections.reverseOrder());
		System.out.println("arraylist after sorting in desending order:-" +ai);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
