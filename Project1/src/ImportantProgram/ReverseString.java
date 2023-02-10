package ImportantProgram;

public class ReverseString {
	
	public static void main(String[] args) {
		
//		String a="shubhangi";
//		String reverse="";
//		int b=a.length();
//		for(int i=b-1;i>=0;i--) {
//			reverse=reverse+a.charAt(i);
//		}
//		System.out.println(reverse);
//		
//		if(a.equals(reverse)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//			
//		}
//	}
//}

	//	System.out.println(=======================);
		
String Original="abcdef";
String reverse = "";
System.out.println(Original);
for(int i=Original.length()-1;i>=0;i--) {
	 

reverse=reverse+Original.charAt(i);}
System.out.println(reverse);

if(Original.equals(reverse)) {
	 System.out.println("the given string is palindrome");
}
else {
	 System.out.println("the given string is not polindrome");
	 
}

}
}


	
	
	
	
	
	

	
	
	




