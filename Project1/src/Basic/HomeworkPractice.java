package Basic;


public class HomeworkPractice {
	public static void main(String[] args) {
	
		String s="Shubhangi Patil";
		String s1="Sanvi";
		String s2="My Doughter";
	//1.length()
		
		System.out.println("The length is "+ s. length());
		
	//2.UpperCase()
		
		System.out.println("The Uppercase is "+ s1.toUpperCase());
		
	//3.LowerCase()
		
		System.out.println("The LowerCase is "+ s1.toLowerCase());
		
	//4.CharAt particular index.
		
		System.out.println("The Character at 5th index "+ s2.charAt(5));
		
    //5.IndexOf particular char
		
		System.out.println("The index of t is "+ s2.indexOf("t"));
   
	//6.Last index of()
		
		System.out.println("The last index of e is "+ s2.lastIndexOf("e"));
		
	//7.before trim
		
		System.out.println("The string s2 before trimming "+ s2);
		
	//8.after trim
		
		System.out.println("The string s2 after trimming "+ s2);
	
   // String comparision
		String A="College";
		String B="COLLEGE";
		String C="Coll";
		
		//1.equals
		
		System.out.println(A.equals("B"));
		
		//2.equals ignores case
		
		System.out.println(A.equalsIgnoreCase(B));
		
		//3.contains
		
		System.out.println(A.contains("C"));
		
		//4.isEmpty
		
		System.out.println(B.isEmpty());
		
		//5.Concats
		
		System.out.println(B.concat(C));
		
		//6.Startswith
		
		System.out.println(C.startsWith("Coll"));
		
		//7.endswith
		
		System.out.println(A.endsWith("ege"));
		
		//8.replace
		
		String s3 ="abc pqr lmn";
		System.out.println(s3.replace("abc","PATIL"));
		
		System.out.println(s3.replace("pqr", "patil"));
		
		System.out.println(s3.replace("lmn", "patil"));
   
		//9.substring
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,7));
		
		//10.split
		
		String[] words=s3.split(" ");
		for (int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		//string
		
		String p="India";
		String q="America";
		String r="  California";
		
		//LENGTH
		
		System.out.println("length is"+p.length ());
		
		//uppercase
		
		System.out.println("the uppercase is " +q.toUpperCase());
		
		//lowercase
		
		System.out.println("The lowercase is "+r.toLowerCase());
		
		//Charat
		
		System.out.println("4th index char "+p.charAt(4));
		
		 //INDEXOF
		
		System.out.println("the f index "+r.indexOf("f"));
		
		//lastindexof
		
		System.out.println("the last index of i "+p.lastIndexOf("i"));
		
		//trim
		
		System.out.println("the string r before trim "+r);
		System.out.println("the string r after trim " +r.trim());
		
		
	}
}
    	  
      
	

    	  
     
    		  
      
      
      
        
   
	
	
    
     
     
	
	

     
     
    	
	
    				 

	


