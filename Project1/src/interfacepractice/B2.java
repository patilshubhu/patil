package interfacepractice;


	public  class  B2 extends B1 implements sample1,sample2 {

		
		public void m3() {
			System.out.println("sample2");
						
		}

		
		public void m4(int a, int b) {
		System.out.println(a+b);	
		}

		
		public void m1() {
		
		System.out.println("sample1");	
		}

		
		public void m2() {
			
		System.out.println("sample1 method2");	
		}

		
		public void m5() {
			System.out.println("abstract class");
			
			
		}
		public static void main(String[] args) {
			B2 ob = new B2();
			ob.m1();
			ob.m2();
			ob.m3();
			ob.m4(10, 15);
			ob.m5();
		}
	}
	
