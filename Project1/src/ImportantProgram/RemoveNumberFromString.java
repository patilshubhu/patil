package ImportantProgram;

    public class RemoveNumberFromString {
	
	public static void main(String[] args) {
		String s = "s*a&n3v4i5";
		for(int i=0; i<s.length(); i++) {
	     for(char j='a'; j<='z'; j++) {  
			
	    	 if(s.charAt(i)==j) {
	    		 System.out.print(s.charAt(i));
	    	 }
	     }
	}
	

}
}