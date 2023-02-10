package Basic;

public class ReverseString {
	public static void main(String[] args) {
		
	
	//how to reverse string in java.
	
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
	 
	 

