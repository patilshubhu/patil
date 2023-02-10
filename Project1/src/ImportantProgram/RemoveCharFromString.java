package ImportantProgram;

public class RemoveCharFromString {

	  public static void main(String[] args) {
		
		  String s="shu1bha2n3g4i5";
		  
		  for(int i=0; i<s.length(); i++) {
			  for(char j='0'; j<='9'; j++) {
				  if(s.charAt(i)==j) {
					  System.out.print(s.charAt(i));
				  }
			  }
		  }
	}
	
}
	
	
	
	
	
	

