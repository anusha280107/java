import java.util.Scanner;
interface Stack{
void push(String item);
String pop();
boolean isEmpty();
}
class ArrayStack implements Stack{
String[] Stack=new String[100];
int top=-1;
public void push(String item){
Stack[1+top]=item;
}
public String pop(){
if(!isEmpty()){
return Stack[top--];
}
return"";
}
public boolean isEmpty(){
return top==-1;
}}
class TextEditor{
String text="";
Stack undoStack=new ArrayStack();
public void type(String newText){
undoStack.push(text);
text+=newText;
}
public void delete(int count){
if(count<=text.length()){
undoStack.push(text);
text=text.substring(0,text.length()-count);
}
else{
System.out.println("cannot delete more char then textcan");
}}
public void undo(){
if(!underStack.isEmpty()){
text=undoStack.pop();
}else{
System.out.println("nothing to undo");
}}
public void show(){
System.out.println("current text:"+text);
}}
public class Stackarray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
TextEditor editor=new TextEditor();
while(true){
System.out.println("\n---Text Editor---");
System.out.println("1. type text");
System.out.println("2.delete char");
System.out.println("3.undo");
System.out.println("4.show text");
System.out.println("5.exit");
System.out.println("choose an option:");
int choice=sc.nextInt();
sc.nextLine();
Switch(choice){
case 1:
System.out.println("enter text:");
String input=sc.nextLine();
editor.type(input);
break;
case 2:
System.out.println("enter no of char to delete:");
int count=sc.nextInt();
editor.delete(count);
break;
case 3:
editor.undo();
break;
case 4:
editor.show();
break;
case 5:
System.out.println("Exiting text editor..");
return;
default:
System.out.println("invalid choice try again");
}
}
}
}

 
