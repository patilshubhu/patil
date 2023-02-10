package Constructors;

public class student {
int rollno;
String name;
char grade;
student(int rn,String nm,char gr){

rollno=rn;
name=nm;
grade=gr;
}

public void display() {

System.out.println("The student roll number is:-"+ rollno);
System.out.println("The student name is:-"+ name);
System.out.println("The studeng grade is:-"+ grade);
}
	
}



