package ImportantProgram;

public class ReverseSequenceOfString {
	public static void main(String[] args) {
		
	
	String s = "sanvi is name my";
	String rev ="";
	
	//split method is used
	String[] splitvalue =s.split(" ");
	
	//size is used to counting the number of string in a seq of string
	int size = splitvalue.length;
	for(int i=size-1; i>=0; i--) {
	rev=rev+" "+splitvalue[i];
	}
	System.out.println(rev);
	}
}	
	
	
	


