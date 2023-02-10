package Basic;

public class Intreverse {
public static void main(String[] args) {
int values=9;
for(int a=values;a>=0;a--) {
System.out.print(a);}
System.out.println();
System.out.println("===========");

int num=123456789;
int reverse=0;
for(int i=num;i>0;i=i/10) {
int a=i%10;
reverse=reverse*10+a;}
System.out.println(reverse);

}
}
