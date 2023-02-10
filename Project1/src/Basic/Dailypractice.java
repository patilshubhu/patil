package Basic;

public class Dailypractice {
	
	public static void main(String[] args) {
		String name = "Sanvi";
		System.out.println("Welcome "+ name);
		int size = name.length();
		System.out.print("Reverse Name=");
		for (int i = size; i > 0; i--) {
			System.out.print(name.charAt(i-1));
		}
		System.out.println("");
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
		    i++;	
		}
		
		int index =0;
		int sizeOfNumber = 5;
		for(int x= sizeOfNumber; x>0;x--)
		{
			System.out.println(x);
		}
	}
}
