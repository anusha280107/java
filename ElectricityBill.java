import java.util.Scanner;
public class ElectricityBill{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int consumerNo;
String consumerName;
int prevReading;
int currReading;
String type;
int units;
double billAmount=0;
System.out.print("Enter consumer number:");
consumerNo=sc.nextInt();
sc.nextLine();
System.out.print("Enter consumer name:");
consumerName=sc.nextLine();
System.out.print("Enter previous month reading:");
prevReading=sc.nextInt();
System.out.print("Enter current month reading:");
currReading=sc.nextInt();
sc.nextLine();
System.out.print("Enter connection type(domestic or commercial)");
type=sc.nextLine();
units=currReading-prevReading;
if(type.equalsIgnoreCase("domestic"))
{
 if(units<=100){
billAmount=units*1;
}
 else if(units<=200){
billAmount=100*1+(units-100)*2.5;
} else if(units<=500){
billAmount=100*1+100*2.5+(units-200)*4;
} else{
billAmount=100*1+100*2.5+300*4+(units-500)*6;
}}else if(type.equalsIgnoreCase("commercial")){
 if(units<=100){
billAmount=units*2;
} else if(units<=200){
billAmount=100*2+100*4.5+(units-200)*6;
} else{
billAmount=100*2+100*4.5+300*6+(units-500)*7;
}
}else{
System.out.println("Invalid connection type:");
}
System.out.println("\n--Electricity bill--");
System.out.println("Consumer number:"+consumerNo);
System.out.println("Consumer name:"+consumerName);
System.out.println("Connection type:"+type);
System.out.println("previous reading:"+prevReading);
System.out.println("current reading"+currReading);
System.out.println("units consumed:"+units);
System.out.println("Total bill amount:Rs."+billAmount);
}}
