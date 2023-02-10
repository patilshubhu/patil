package Methods;

public class Statickeyword {
int studentid;
String studentname;
static int studentdept=5;
	
public void display() {
System.out.println(studentid);		
System.out.println(studentname);
System.out.println(studentdept);
}
public static void main(String[] args) {

	Statickeyword sk1=new Statickeyword();  //object create

System.out.println("=====student1======");
sk1.studentid=100;
sk1.studentname="shubhangi";
sk1.display();

System.out.println("======student2=====");

Statickeyword sk2=new Statickeyword();   //object create
sk2.studentid=101;
sk2.studentname="supriya";
sk2.display();

System.out.println("======student3=====");

Statickeyword sk3=new Statickeyword();   //object create
sk3.studentid=102;
sk3.studentname="sagar";
sk3.display();

System.out.println("======student4=====");

Statickeyword sk4=new Statickeyword();   //object create
sk4.studentid=103;
sk4.studentname="sanvi";
sk4.display();

System.out.println("======student5=====");

Statickeyword sk5=new Statickeyword();   //object create
sk5.studentid=104;
sk5.studentname="roopesh";
sk5.display();


}
	

}
