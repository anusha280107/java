import java.util.Scanner;
class Employee
{
public static void main(String [] args){
Scanner g=new Scanner(System.in);
System.out.print("enter your name");
String name=g.nextLine();
System.out.print("age");
int age=g.nextInt();
System.out.print("salary");
float salary=g.nextFloat();
if(age>=25&&age<=50){
 if(salary>=25000){
   System.out.print("Hi"+name +"eligible for loan");}
   }
else{
System.out.print("sorry"+name +"you are not eligible");
}
}
}
