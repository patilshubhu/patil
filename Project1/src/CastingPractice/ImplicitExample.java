package CastingPractice;

public class ImplicitExample {

	public static void main(String[] args) {
	 //lower to higher
		
	//byte ==>short ==>int ==>long ==>float ==>double
		
		int a= 10;
		System.out.println(a);
		double d=a;
		System.out.println(d);
		double db=10.5;
		System.out.println(db);
		int in=(int)db;
		System.out.println(in);
		double db1=10.363782976;
		System.out.println(db1);
		float f=(float)db1;
		System.out.println(f);
		
	System.out.println("================");	
	//implicit casting.
		
		byte i =50;
		short j=i;
		int k=j;
		float f1=1;
		double dd=f1;
		
		System.out.println("THE BYTE VALUE IS "+ i);
		System.out.println("THE SHORT VALUE IS "+ j);
		System.out.println("THE INT VALUE IS "+ k);
		System.out.println("THE LONG VALUE IS "+ 1);
		System.out.println("THE FLOAT VALUE IS "+ f1);
		System.out.println("THE DOUBLE VALUE IS "+ dd);
		
		
		
		
		
		
		
		
		
		
		
	}
}
