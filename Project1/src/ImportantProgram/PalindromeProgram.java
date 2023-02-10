package ImportantProgram;

public class PalindromeProgram {
	public static void main(String[] args) {
		
		int num=121;

		int reverse=0;
		for(int i=num;i>0;i=i/10){
		int a= i%10;
		reverse = reverse*10+a;
		}
		System.out.println(reverse);
		if(num==reverse) {
		System.out.println("the given number is palindrome");
		}
		else
		{
		System.out.println("the given number is not palindrome");
		}
	}

}
	



// //  ========================================================= 
//    
//    	int values = 9;
//     for(int a =values; a>=0; a--) {
//    	 System.out.println(a);
// 
//     }
//}
//}
