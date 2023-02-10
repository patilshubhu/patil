package interfacepractice;

 
public class samplemain implements sample2,sample1{

	
	public void m1() {
	System.out.println("my friend is supriya");	
	}

	
	public void m2() {
	System.out.println("we r doing mock");	
	}

	
	public void m3() {
	System.out.println("in velocity");	
	}

	
	public void m4() {
	System.out.println("velocity branch in pune");
	}

	
	public void m5() {
	System.out.println("software testing class");	
	}	
	public static void main(String[] args) {
		samplemain sm=new samplemain();
		sm.m1();
		sm.m2();
		sm.m3();
		sm.m4();
		sm.m5();
		
	}


	@Override
	public void m4(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	}

	