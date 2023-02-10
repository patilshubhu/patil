package ImportantProgram;

public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		
		String s = "my@name$is%sanvi^*";
		s=s.replaceAll("[^a-zA-Z0-9]", " ");  //not equal^
		System.out.println(s);
	}

}
