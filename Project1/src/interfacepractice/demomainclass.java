package interfacepractice;

public class demomainclass implements demo1,demo {

	
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		
		
	}
  public static void main(String[] args) {
	demomainclass dm=new demomainclass();
	dm.m1();
}
	
}