package Advancejava;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraypractice {
	
	public static void main(String[] args) {
		
		//1.how to declare the arraylist.
		//common way of declaration
		
		ArrayList sp=new ArrayList();
		
		//generic  way of declaration
		ArrayList<String>all=new ArrayList<String>();
		
		//2.how to add the values inside arraylist.
		
		sp.add(25);
		sp.add("shubhangi");
		sp.add("roopesh");
		sp.add("sanvi");
		sp.add("patil");
	    System.out.println(sp);	
	    
		//3.add values.
		sp.add(3,"india");
		System.out.println(sp);
		
		//4 replace the value particular index.
		sp.set(4,"dublin");
		System.out.println(sp);
		
		//5. remove the value particular index.
		sp.remove(4);
		System.out.println(sp);
		
		//6.check it is empty or not.
		System.out.println(sp.isEmpty());
		
		//7.how many elements are present.
		System.out.println(sp.size());
		
		//8.check the value on particular index.
		System.out.println(sp.indexOf("patil"));
		
		//9.check the contains present or not.
		System.out.println(sp.contains("california"));
		System.out.println(sp.contains("shubhangi"));
		
		System.out.println("=========");
		
		//10.how to read values within the arraylist.
		//for loop.
		for(int i=0;i<sp.size();i++) {
			System.out.println(sp.get(i));
		}
		System.out.println("========");
		//11.advanced for loop.
		for(Object ob:sp) {
			System.out.println(ob);
		}
	}
	}
		
		
		
		
	


