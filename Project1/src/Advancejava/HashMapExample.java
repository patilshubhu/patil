package Advancejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		
 //1 declare the hashmap
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
 //2 add the elementd in hashmap
		
		hm.put(101,"ABC");
		hm.put(102, "XYZ");
		hm.put(103, "PQR");
		hm.put(105, "MNP");
		hm.put(104, "LMN");
		System.out.println(hm);

		
  //3 add one more element you have to use next key
		
		hm.put(98, "PQAESDJHB");
		
 //4  modify
		
		hm.put(102, "MNP");
		System.out.println(hm);
		hm.put(103, "ABC");
		System.out.println(hm);
		
 //5 remove the element
		
		hm.remove(102,"XYZ");
		System.out.println();
		
  //6 to read hashmap.
		
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
