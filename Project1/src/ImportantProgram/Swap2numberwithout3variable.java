package ImportantProgram;

public class Swap2numberwithout3variable {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		a=a+b;  //a=100+200  a=300
		b=a-b;  //100-200    b=100
		a=a-b;  //300-100    a=200
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	

}
