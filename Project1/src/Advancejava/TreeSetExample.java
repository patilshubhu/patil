package Advancejava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
	//1 declare the treeset.
		
		TreeSet ts = new TreeSet();
		
	//2. add the elements in treeset.
		
		ts.add("F");
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
	//3.Add the duplicate elements.
		ts.add("A");
		System.out.println(ts);
		
	//4 getting the first values.
		
		System.out.println("first value is:- "+ts.first());
		System.out.println("Last value is:- "+ts.last());
		
	//5 immediate elements.
		
		String val= "C";     //D  //B
		System.out.println("Higher member "+ts.higher(val));
		System.out.println("Lower member "+ts. lower(val));
		
	//6 removing first and last poll.
		
		ts.pollLast();
		System.out.println(ts);
		ts.pollFirst();
		System.out.println(ts);
		
	//7 iterator.
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
