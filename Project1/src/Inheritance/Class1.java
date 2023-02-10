package Inheritance;

public class Class1 extends Parent1 {
	
	String email="shubhangi222@gmail.com";
	long mobileno=123456789;
	
	public void c1() {
		System.out.println("email:"+email);
		System.out.println("mobileno:"+mobileno);
		
	}
	
	public static void main(String[] args) {
		Class1 ob1=new Class1();
		ob1.p1();
		ob1.c1();
	}
	
	

}
