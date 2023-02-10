package ImportantProgram;

public class ArmStrongNoProgram {
	public static void main(String[] args) {
		
		int a = 153;      //1*1*1 + 5*5*5 + 3*3*3 //153
		int temp = a;
		int r;
		int sum = 0;
		while(a>0) {
			r = a%10;
			a=a/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}	
		
	}

}
     
       
       
       
       
       
       
	   