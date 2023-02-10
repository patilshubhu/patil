package Inheritance;

public class Class3 extends Parent1 {
	
	long adhar=342145891;
	long pancard=764155478;
	
	public void c3() {
		System.out.println("adhar card: "+adhar);
		System.out.println("pancard: "+pancard);
		}
	public static void main(String[] args) {
		Class3 ob3=new Class3();
		ob3.p1();
		ob3.c3();
		
			
	}
	

}
