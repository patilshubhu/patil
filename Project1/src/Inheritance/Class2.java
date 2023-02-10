package Inheritance;

public class Class2 extends Parent1 {
	
	String name="sanvi";
	String relation="doughter";
	
	public void c2() {
		System.out.println("name: "+name);
		System.out.println("relation: "+relation);
	}
	
	public static void main(String[] args) {
		Class2 ob2=new Class2();
		ob2.p1();
		ob2.c2();
		
	}
}
	


