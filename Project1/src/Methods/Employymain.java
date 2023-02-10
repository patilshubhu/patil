package Methods;

public class Employymain {
	
public static void main(String[] args) {
Employee emp1=new Employee(); //object create
emp1.empid=10;
emp1.empname="sanvi";
emp1.empsal=500;
emp1.empdpt=2;
emp1.empjob="developer";
emp1.display();

System.out.println("==========================");

Employee emp2=new Employee();
emp2.empid=15;
emp2.empname="shubhangi";
emp2.empsal=900;
emp2.empdpt=5;
emp2.empjob="tester";
emp2.display();

System.out.println("==========================");
Employee emp3=new Employee();
emp3.empid=5;
emp3.empname="supriya";
emp3.empsal=1100;
emp3.empdpt=15;
emp3.empjob="manager";
emp3.display();


}
}


