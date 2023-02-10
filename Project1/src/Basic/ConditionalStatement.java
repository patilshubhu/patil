package Basic;


public class ConditionalStatement {
	public static void main(String[] args) {
		// 1.write a program if tv is ON or OFF
		String Button = "ON";
		if (Button == "OFF") {
			System.out.println("tv is ON");
		} else {
			System.out.println("tv is off");
            
			System.out.println("==============");
		}
		// 2.write a program to find small baby of 3 babies.

		int a = 2;
		int b = 3;
		int c = 4;
		if ((a < b) && (b < c)) {
			System.out.println("small baby is" + a);
		} else if ((b < a) && (b < c)) {
			System.out.println("small baby is" + b);
		} else {
			System.out.println("small baby is" + c);
		}

		System.out.println("===============");

		// 3.write a program to find largest of two numbers.

		float num1 = 22.22f;
		double num2 = 33.44;
		if (num1 > num2) {
			System.out.println("Number 1 is largest");
		} else {
			System.out.println("Number 2 is largest");
		}
		System.out.println("=============");

		// 4.programming language java is easy other languages.

		String Language = "c#";
		if (Language == "java") {
			System.out.println("it is easy language");
		} else {
			System.out.println("it is difficult language");
		}
		System.out.println("=================");

		// 5.write a program to find greatest number for given.

		int p = 25;
		int q = 35;
		if (p > q) {
			System.out.println("p is greater than q");
		} else {
			System.out.println("q is greater than p");

		}
		System.out.println("===========");

		// 6.write a program to find number positive or negative.

		int x = -10;
		if (x > 5) {
			System.out.println("given no is positive");
		} else if (x == 5) {
			System.out.println("given number is normal");
		} else {
			System.out.println("given no is negative");
		}
		System.out.println("===============");

		// 7.write a program the number is divisible by 11 and 24.

		int r = 222;
		System.out.println("number is =" + r);
		if (r % 11 == 0 && r % 24 == 0) {
			System.out.println("number is divisible");
		} else

			System.out.println("number is not divisible");
	}
	

}

