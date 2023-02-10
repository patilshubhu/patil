package Methods;

public class Studentdata {
	//=========non static keyword=========
	int studentid;
	String studentname;
	int studentdept;

	public void display() {
	System.out.println(studentid);
	System.out.println(studentname);	
	System.out.println(studentdept);
	}
    public static void main(String[] args) {
    System.out.println("====student1======"); 	
	Studentdata sd1=new Studentdata();  //object create
	sd1.studentid=10;
	sd1.studentname="shital";
	sd1.studentdept=2;
	sd1.display();
	
    System.out.println("====student2======"); 	
	Studentdata sd2=new Studentdata();  //object create
	sd2.studentid=20;
	sd2.studentname="swati";
	sd2.studentdept=3;
	sd2.display();
	
	System.out.println("====student3======"); 	
	Studentdata sd3=new Studentdata();  //object create
	sd3.studentid=30;
	sd3.studentname="shweta";
	sd3.studentdept=4;
	sd3.display();

	 System.out.println("====student4======"); 	
	 Studentdata sd4=new Studentdata();  //object create
	 sd4.studentid=40;
	 sd4.studentname="supriya";
	 sd4.studentdept=5;
	 sd4.display();
	 
	  System.out.println("====student5======"); 	
		Studentdata sd5=new Studentdata();  //object create
		sd5.studentid=110;
		sd5.studentname="pihu";
		sd5.studentdept=20;
		sd5.display();
		
		
		
    

	

	}	

}
