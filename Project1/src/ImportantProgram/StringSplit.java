package ImportantProgram;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String s= "I Love India";
		String word[]=s.split(" ");
		
		for(int i=0; i<=word.length-1; i++) {
			System.out.println(word[i]+"="+word[i].length());
		}
		
		
	}

}
