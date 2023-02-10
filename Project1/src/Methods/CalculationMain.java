package Methods;

public class CalculationMain {
public static void main(String[] args) {
	//case 1.
	Calculation cal=new Calculation();
	cal.sum();
	
	//case 2.
	System.out.println(cal.sum1());
	
	//case 3.
	cal.sum2(60, 30);
	
	//case 4.
	System.out.println(cal.sum3(10,20));
	System.out.println(cal.sum3(20,20));
	
	System.out.println("===================");
	
	//program 2 for difference.
	//case 1
	Calculation cal1=new Calculation();
	cal1.diff();
	//case 2
	System.out.println(cal1.diff1());
	//case 3
	cal1.diff2(50,30);
	//case 4
	System.out.println(cal1.diff3(50, 10));
	
	System.out.println("================");
	//program 3 for multiple.
	//case 1
	Calculation cal2=new Calculation();
	cal2.mul();
	//case 2
	System.out.println(cal2.mul1());
	//case 3
	cal2.mul2(6, 3);
	//case 4
	System.out.println(cal2.mul3(5, 5));
	
	System.out.println("=================");
	//program 4 for division.
	//case 1
	Calculation cal3=new Calculation();
	cal3.div();
	//case 2
	System.out.println(cal3.div1());
	//case 3
	cal3.div2(50, 5);
	//case 4
	System.out.println(cal3.div3(200, 10));
	
}
}
