package ImportantProgram;

public class LeapYearProgram {
	
	public static void main(String[] args) {
		int year = 2100;
			
	// if the year is divided by 4
			if(year % 4==0) { 
				
	// if the year is century
			if(year % 100==0){
			
	// if year is divided by 400 
	// then it is a leap year
		 if(year % 400==0) {
			System.out.println("leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
		}
	}
}
//     System.out.println("=============================");
//
//	int year = 2012;
//	if(year % 4==0) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("not a leap year");
//	}
//	}
//	}
	

