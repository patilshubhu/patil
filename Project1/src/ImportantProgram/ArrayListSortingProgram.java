package ImportantProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingProgram {
	
	public static void main(String[] args) {
		 ArrayList <String> s = new ArrayList<String>();
		 
		 s.add("shubhangi");
		 s.add("amit");
		 s.add("sagar");
		 s.add("roopesh");
		 s.add("supriya");
		 s.add("pari");
		 s.add("viransh");
		 
		 System.out.println("Before Sorting:-" +s);
		 
		 Collections.sort(s);
		 System.out.println("ascendimg Order:-" +s);
		 
		 Collections.sort(s,Collections.reverseOrder());
		 System.out.println("Descending Order:-" +s);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
