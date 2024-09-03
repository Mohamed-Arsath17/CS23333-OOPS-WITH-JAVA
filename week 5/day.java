import java.util.Scanner;
class day{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
switch(a){
case "monday":
case "tuesday":
case "wednesday":
case "thursday":
case "friday":
System.out.println("weekday");
break;
case "saturday":
case "sunday":
System.out.println("weekend");
break;
default:
System.out.println("invalid input");
}
}
}
