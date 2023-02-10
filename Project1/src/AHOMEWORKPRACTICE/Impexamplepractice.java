package AHOMEWORKPRACTICE;

public class Impexamplepractice {
	public static void main(String[] args) {
//1	pattern practice
		
		for(int a=1; a<=6; a++) {
			for(int b=1; b<=a; b++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("==============================");
//2 pattern practice
		
		for(int a=1; a<=6; a++) {
			for(int b=6; b>=a; b-- ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("====================================");
//3 pattern
		
		for(int a=1; a<=5; a++) {
			for(int b=5; b>=a; b--) {
	
			System.out.print(" ");}
		for(int c=1; c<=a; c++) {
			System.out.print(" *");}
			System.out.println(" ");
		}	
		
		System.out.println("==============================");
 //4 Reverse no 2326
	 //while loop	
	int	n= 2326;
	int a=0;
	int b;
	while(n>0) {
		b= n%10;
		a=a*10+b;
		n=n/10;
	}
	System.out.println(a);
//	System.out.println("=============================");	
	
  //5 reverse string
    
    String name = "shubhangi";
    int length = name.length();
   String reverse = "";
  System.out.println(name);
   for(int i=length-1;i>0;i--)	{
   reverse = reverse + name.charAt(i);
    }
    	System.out.println(reverse);
    	
    	if(name.equals(reverse)) {
    	System.out.println("given string is palindrome");
	}
	else
	{
	System.out.println("given string is not palindrome");
	}
    	System.out.println("===================================");
    	
   
    //6 odd even number.
    	
    	int i = 90;
    	if(i%2==0)
    	{
    		System.out.println("number is even");
    	}
    	
    	else
    		
    	{
    		System.out.println("number is odd");
    		
    	}
    	int f = 95;
    	if(f%2==0)
    	{
    		System.out.println("number is even");
    	}
    	else
    	{
    		System.out.println("number is odd");
    	}
	
    System.out.println("==================================");		
  	
    //7 print even & odd number inbetween upto 30
    
   
    
    	
    
	}
}

 
    
     
    
    
	
	
			
		
		
			
		
		
	
	
		
		
		
		
		
		
		
	


