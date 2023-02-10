package ImportantProgram;

public class NumberOfDigitCountProgram {

	public static void main(String[] args) {
		
		int num = 703832;
		int count = 0;
		int temp = num;
		while(num>0) {
			num = num/10;
			count = count+1;
		}
		System.out.println("number of digit present in "  +count);
		}
	}

