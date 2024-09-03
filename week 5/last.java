import java.util.Scanner;
public class last{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter numbers:");
int number1=scanner.nextInt();
int number2=scanner.nextInt();
int lastdigit1=Math.abs(number1)%10;
int lastdigit2=Math.abs(number2)%10;
int sum=lastdigit1+lastdigit2;
System.out.println(sum);
}
}