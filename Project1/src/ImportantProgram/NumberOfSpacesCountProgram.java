package ImportantProgram;

public class NumberOfSpacesCountProgram {
	
	public static void main(String[] args) {
		
	   int count = 0;
	   String str = "ab c d";
	    for(int i=0; i<=str.length()-1; i++) {
	    	char str1 = str.charAt(i);
	    	if(str1== ' ') {
	    		count++;
	    	}
	    	}
	    System.out.println(" number of spaces in given string " +count);
	    			
	    }
	
		
		
		
		
		
		
	}


