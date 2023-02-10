package Methods;

public class Calculation {
	
 int x=20;
 int y=40;
 //case-1 method is not accept the parameter and not return values.
	
 public void sum() {
 System.out.println(x+y);
 }
 //case-2 method is not accept the parameter  but return values.
 
 public int sum1() {
 return x+y;	 
 }
 //case-3 method is accept the parameter but not return values.
 
 public void sum2(int a,int b) {
 System.out.println(a+b);
 }
 //case-4  method is accept the parameter and return the values.
 public int sum3(int a,int b) {
	 return a+b;
 }	 
 // System.out.println("============++++============");
 
 //program 2 for difference
 
 int p= 5;
 int q= 5;
 
 //case-1 method is not accept parameter and not return values.
 public void diff() {
 System.out.println(p-q);
 }
 //case-2 method is not accept the parameter but return values.
 public int diff1() {
 return p-q;
 }
 //case -3 method is accept the parameter but not return values.
 public void diff2(int p,int q) {
 System.out.println(p-q);	 
 }
 //case-4 method is accept parameter and return values.
 public int diff3(int p,int q) {
 return p-q;
 }
 
 //program 3 for multiple
 
 //case-1 method is not accept parameter and not return values.
 public void mul() {
 System.out.println(p*q);
 }
 //case-2 method is not accept the parameter but return values.
 public int mul1() {
	 return p*q;
 }
 //case-3 method is accept parameter but not return values.
 public void mul2(int c,int d) {
	 System.out.println(c*d);
 }
 //case-4 method is accept parameter and return values.
 public int mul3(int c,int d) {
 return c*d;	 
 }
 
 //program 4 for division
 
//case-1 method is not accept parameter and not return values.
public void div() {
System.out.println(p/q);
}
//case-2 method is not accept the parameter but return values.
public int div1() {
 return p/q;
}
//case-3 method is accept parameter but not return values.
public void div2(int c,int d) {
	 System.out.println(c/d);
}
//case-4 method is accept parameter and return values.
public int div3(int c,int d) {
return c/d;	 
}
 
 
 
 
 	 
 }

