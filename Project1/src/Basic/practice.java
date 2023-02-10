package Basic;

public class practice {
	public static void main(String[] args) {
		
		String original="nayan";
		String reverse="";
		System.out.println(original);
		for(int i=original.length()-1;i>=0;i--){
		reverse=reverse+original.charAt(i);}
		System.out.println(reverse);
		
		if(original.equals(reverse)) {
			System.out.println("given String is palindrome");
		}
		else
	
		System.out.println("given string is not palindrome");
	
		}
	}



