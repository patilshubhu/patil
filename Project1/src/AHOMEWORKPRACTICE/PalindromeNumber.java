package AHOMEWORKPRACTICE;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int num =121;
		int a=num;
		int reverse=0;
		int reminder;
		while(a!=10);
		{
			reminder = a%10;
			reverse = reverse*10+reminder;
			a=a/ 10;
		}
		if(num==reverse);
		{
			System.out.println(" number is palindrome" +num);
			
		}
		
		System.out.println(" number is not palindrome" +num);
		
	}
		
				
				
	}


