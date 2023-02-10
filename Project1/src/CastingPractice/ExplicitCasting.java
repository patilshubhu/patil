package CastingPractice;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		// explicit casting
				// double==>float==>long==> int==>  short==>byte
				
				double d1= 75.5;
				float f2=  (float) d1;
				long ll1= (long) f2;
				int in1= (int) ll1;
				short ss= (short) in1;
				byte bb= (byte) ss;
				
				
				System.out.println("The double value is "+ d1);
				System.out.println("The float value is "+ f2);
				System.out.println("The long value is "+ ll1);
				System.out.println("The int value is "+ in1);
				System.out.println("The short value is "+ ss);
				System.out.println("The byte value is "+ bb);
	}

}
