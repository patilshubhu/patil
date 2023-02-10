package Constructors;

public class Child extends Parent {
	public void p2(String x,int y) {
		System.out.println("student name is "+x);
		System.out.println("student roll no is "+y);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.p1("Shubhangi",1500,'D');
		c.p2("sanvi", 101);
		
	}

}
