package Constructors;

public class Class3 extends Class2{
	String name="pooja";
	String college="vtu";
	int id=122;
	
	public void cl3() {
		System.out.println("my friend is "+name);
		System.out.println("my college name is "+college);
		System.out.println("my id o is "+id);
		
	}
public static void main(String[] args) {
	Class3 cl=new Class3();  //object
	cl.cl1();
	cl.cl2();
	cl.cl3();
	
}
}
