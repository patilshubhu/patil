package Basic;

public class LoopDemo {

	public static void main(String[] args) {
		String name = "Sanvi";
		String res = "";
		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			res = res + name.charAt(i);

		}
		System.out.print(res);
		System.out.println("");
		int size = 5;
		for(int i = size; i>0;i--)
		{
			System.out.println(i);
		}
		
		
	

		
	}

}
