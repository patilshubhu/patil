package Methods;

public class ObjectPractice {
	
	//1.Methods calling from same class
	
	//static method
	
	public static void test1() {
	System.out.println("this is statc method1");}
	public static void test2() {

	System.out.println("this is static method2");}
		
	 //non static method
	 
	 public void test3() {
	 System.out.println("this is non static method1");}
	 
	 public void test4() {
		 System.out.println("this is non static method2");}
	 
	 public static void main(String[] args) {
		
		 //calling static method
		 
		 ObjectPractice.test1();
		 ObjectPractice.test2();
	 
		  
	 //calling non static method
	 
	 ObjectPractice o= new ObjectPractice();
	  
	 o.test3();
	 o.test4();
	 

		 
	 
}

}