package ImportantProgram;

public class SmallestAndGreatestArray {
	public static void main(String[] args) {
		

  int x[] = {10,3,45,84,-4,-5,75,76};
  int min=x[0];
  int max=x[0];
   for(int i=1;i<x.length;i++) {
	   if(min>x[i]) {
		   min=x[i];
	   }
   }
   for(int j=1;j<x.length;j++) {
	   if(max<x[j]) {
		   max=x[j];
	   }
   }
   System.out.println("smallest Array:- "+min);
   System.out.println("Greatest Array:- "+max);
   
	   }
	   }
   
  
   
   
   
   
   
		

		
		
		
		
		
		
		
		
		
		
	


